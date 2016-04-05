package com.freecharge.automation.base;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSDriver;

public class Base {

	protected static AppiumDriver<WebElement> driver = null;

	
	@BeforeClass
	public void init() {

		File appDir = new File("/Users/adithya/Desktop");
		File app = new File(appDir, "FreeCharge.app");

		//DesiredCapabilities capabilities = DesiredCapabilities.iphone();     // easier way to set
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "iPhone");
		capabilities.setCapability("deviceName", "iPhone 6");
//		capabilities.setCapability(CapabilityType.VERSION, "8.4");
		capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
		//capabilities.setCapability(SwipeElementDirection, "true");
//		capabilities.setCapability("sendKeyStrategy", "grouped");
		capabilities.setCapability("autoAcceptAlerts", true);
		capabilities.setCapability("app", app.getAbsolutePath());

		System.out.println("Desired capabilities are set and that are : " + capabilities);

		try {

			URL appiumURL = new URL(Constants.appiumHubURL);
			driver = new IOSDriver<WebElement>(appiumURL, capabilities);

			System.out.println("driver initialized and launched");

		} catch (Exception e) {
			System.out.println("**** Exception caught ****");
			e.printStackTrace();
		}

	}
	
	
	//@AfterClass
	public void terminate()
	{
		System.out.println("terminated...");
		driver.quit();
	}

}
