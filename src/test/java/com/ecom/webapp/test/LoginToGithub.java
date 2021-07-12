package com.ecom.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToGithub {
	
	public static void userLogin() {
		String siteURl = "https://github.com/login";
		WebDriver driver = RuntimeDriver.getDriver();
		driver.get(siteURl);
		
		// enter user info
		driver.findElement(By.id("login_field")).sendKeys(LoginCredentials.username);
		driver.findElement(By.id("password")).sendKeys(LoginCredentials.password);
		
		// submit login
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).submit();
	}
}
