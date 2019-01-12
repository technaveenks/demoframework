package com.techfundas.demoframework.test;

import javax.naming.directory.SearchResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.techfundas.demoframework.pages.HomePage;
import com.techfundas.demoframework.pages.SearchResultsPage;

public class DemoTest {
	WebDriver driver;
	private static final Logger log = LogManager.getLogger(DemoTest.class);
	HomePage hPage;
	SearchResultsPage sResultsPage;

	@Test
	public void validateSearch() {
		sResultsPage = hPage.enterSearchText("T Shirt");
		sResultsPage.validateSearchResult("T Shirt");

	}

	@Test
	public void validateLaunch() {
		log.info("Log started");
		System.out.println("Chrome Browser Launched");

	}

	@BeforeClass
	public void setup() {
		String env = "winChromePath";
		String winChromePath = "C:/Program Files (x86)/Jenkins/workspace/AutomationDemo/src/test/java/resources/chromedriver.exe";
		String linuxChromePath = "C:/Users/Hp/Appium_Demo/demoframework/src/test/java/resources/chromedriver";

		if (env.equals("winChromePath")) {
			System.setProperty("webdriver.chrome.driver", winChromePath);
		} else {
			System.setProperty("webdriver.chrome.driver", linuxChromePath);
		}

		driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
