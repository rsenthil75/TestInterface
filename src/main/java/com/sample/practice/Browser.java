package com.sample.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class Browser {

    static WebDriver driver = new ChromeDriver();


    public static void open(String url) {
        driver.get(url);
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }


}
