package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class firstTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://bookcart.azurewebsites.net/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[5]")));
//        element.click();
        driver.findElement(By.xpath("(//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[1]")).click();

    }
}