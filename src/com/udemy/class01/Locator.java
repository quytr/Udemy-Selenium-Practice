package com.udemy.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Locator {
    public static void main(String[] args) throws InterruptedException {

        //implicit wait --- 2s time out
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //to pause for 2 seconds
        //apply this line after creating a driver object
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //something to show

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //id
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        //name
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        //classname
        driver.findElement(By.className("submit")).click();
        //css selector 1st way
        //getText() --> to wrap the text
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        //link text
        driver.findElement(By.linkText("Forgot your password?")).click();
        //pause 1 second
        //to wait for it's stable
        Thread.sleep(1000);
        //xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Johnny");
        //css selector 2nd way customize
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john213@y.com");
        //xpath --> .clear() -> to clear the email box
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        //css selector
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john213@yahoo.com");
        //xpath parent to child
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123-456-7898");
        //class name
        driver.findElement(By.className("reset-pwd-btn")).click();
        //css selector parent to child
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        //go to log in
        //xpath parent to child / custom xpath / index
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);

        //log in
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        //css selector regular expression
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        //xpath regular expression
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();












    }
}
