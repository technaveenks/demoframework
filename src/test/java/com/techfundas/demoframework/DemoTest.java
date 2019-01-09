package com.techfundas.demoframework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	private static final Logger log = LogManager.getLogger(DemoTest.class);
	
	@Test
	public void validateLaunch(){
		log.info("Log started");
		
		//Comments Added
		//String path = 
		String env = "winChromePath";
		String winChromePath="C:/Program Files (x86)/Jenkins/workspace/AutomationDemo/src/test/java/resources/chromedriver.exe";
		String linuxChromePath = "C:/Users/Hp/Appium_Demo/demoframework/src/test/java/resources/chromedriver";
		
		if(env.equals("winChromePath")){
		System.setProperty("webdriver.chrome.driver", winChromePath);
		}else{
		System.setProperty("webdriver.chrome.driver", linuxChromePath);	
		}
		
		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		System.out.println("Chrome Browser Launched");
		
	}
		
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
