package com.sample.practice;

public class DownloadPage {

    public void open(String url) {
        Browser.open(url);
    }

    public String getTitle() {
        return Browser.getTitle();
    }

    public void close() {
        Browser.close();
    }
}
