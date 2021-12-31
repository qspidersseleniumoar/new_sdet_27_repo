package com.ccrm.contacttest;

import java.awt.dnd.DragGestureEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ConatctTest {
	@Test(groups = "SmokeTest")
	public void createConatctTest() {
		System.out.println("execute conatctTest");
		WebDriver driver = null;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		System.out.println("Browser====>"+BROWSER);
		System.out.println("ENV URL====>"+URL);
	}
	
	@Test(groups = "RegressionTest")
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

}
