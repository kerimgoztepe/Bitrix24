package com.Bitrix.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAbc {
    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
}
