package com.udemy.class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver extend -> Methods close get
        //Firefox - FrirefoxDriver -> methods close get
        //Safari - SaariDriver -> methods close get
        //WebDriver close get
        //WebDriver methods + class methods

        //chromediver.exe -> Chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //webdriver.chrome.driver -> value of path
        WebDriver driver = new ChromeDriver();



        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        driver.close();
//        driver.quit();

    }
}
