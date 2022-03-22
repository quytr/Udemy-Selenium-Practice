package com.udemy.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class EdgeDemo {

    public static void main(String[] args) {
        //Microsoft Edge Launch
        //webdriver.edge.driver
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
        driver.close();
        driver.quit();
    }
}
