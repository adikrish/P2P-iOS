package com.freecharge.automation.P2P_iOS;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.freecharge.automation.base.Base;

public class UserLogin extends Base {

	@Test
	public void LaunchApp() throws InterruptedException {

		System.out.println("Here...");

		// WebDriverWait wait = new WebDriverWait(driver,10000);

		WebElement pageIndicator = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPageIndicator[1]"));

		if (pageIndicator.isDisplayed()) {
			System.out.println("Found page indicator...");
		}

		//driver.context("NATIVE_APP");
		//TimeUnit.SECONDS.sleep(3);
		driver.swipe(337, 420, 70, 420, 2000);
		
		//TimeUnit.SECONDS.sleep(3);
		
		
		System.out.println("Swipe ???");
		
		
		
	        //WebElement element = driver.findElement(By.xpath("//window[1]/tableview[2]"));

//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	        HashMap<String, String> scrollObject = new HashMap<String, String>();
//
//	        scrollObject.put("direction", "left");
//
//
//	        scrollObject.put("element", ((RemoteWebElement) pageIndicator).getId());
//
//	        js.executeScript("mobile: scroll", scrollObject);
//	        
//	   
		
		
		
	
          
          
          
          
	        
	}

}
