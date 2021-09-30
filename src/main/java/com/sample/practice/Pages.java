package com.sample.practice;

public class Pages {
    public static HomePage homePage() {
        return new HomePage();
    }

    public static DownloadPage downloadPage() {
        return new DownloadPage();
    }

    public static void close() {
        Browser.close();
    }
}