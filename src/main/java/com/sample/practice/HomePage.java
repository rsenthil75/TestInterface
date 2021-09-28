package com.sample.practice;

public class HomePage {


    public void goTo(String url) {
        Browser.goTo(url);
    }

    public String getTitle() {
        return Browser.getTitle();
    }


    public void close() {
        Browser.close();
    }
}
