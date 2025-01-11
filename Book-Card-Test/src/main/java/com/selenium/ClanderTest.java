package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClanderTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-practice.netlify.app/calendar");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.id("range-date-calendar"));
        element.click();
        List<WebElement> date = driver.findElements(By.xpath("(//table[@class='table-condensed'])[1]//tbody//tr//td"));
        System.out.println(date.size());
        date.get(6).click();
        List<WebElement> dats=driver.findElements(By.xpath("(//table[@class='table-condensed'])[1]//tbody//tr//td"));
        dats.get(14).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
        driver.findElement(By.id("calendar")).click();
        List<WebElement> pickDate = driver.findElements(By.xpath("(//table[@class='table-condensed'])[1]//tbody//tr//td"));
        pickDate.get(11).click();



    }
}
