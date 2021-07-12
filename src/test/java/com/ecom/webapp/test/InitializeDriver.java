package com.ecom.webapp.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {
	
	final static String driverPath ="drivers\\windows\\chromedriver.exe";
	static WebDriver driver;
	
	// init selenium web driver
	public static void init() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// set a runtime driver
		RuntimeDriver.setDriver(driver);		
	}
}
