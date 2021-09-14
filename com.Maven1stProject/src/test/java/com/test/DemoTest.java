package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	WebDriver driver;
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\61435\\Documents\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Downloaded%20Programs/Selenium/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");

		
	}

}
