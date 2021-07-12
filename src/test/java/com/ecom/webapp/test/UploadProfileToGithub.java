package com.ecom.webapp.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class UploadProfileToGithub {

	WebDriver driver;
	
	@BeforeEach
	void setUp() throws Exception {
		InitializeDriver.init();
		driver = RuntimeDriver.getDriver();
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.close();
	}

	@Test
	@DisplayName("Test For Upload Profile Picture to Github")
	void testForUploadProfilePicturetoGithub() throws IOException, InterruptedException {
		// 1. login 
		LoginToGithub.userLogin();
		
		// 2. navigate to profile page
		String profileURL = "https://github.com/settings/profile";
		driver.get(profileURL);
		Thread.sleep(2000);
		
		//3 . click upload profile add profile image
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary/div")).click();
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		Thread.sleep(2000);
		
		// 4. run / execute windows automation 
		Runtime.getRuntime().exec("AutoIT\\upload-profile.exe");
		Thread.sleep(2000);
		
		// 5 . submit profile
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		Thread.sleep(3000);
		
	}

}
