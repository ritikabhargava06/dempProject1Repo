package com.example.sampleFramework.demoProject1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {

		System.setProperty("wedriver.chrome.driver", "Users/ritika/Downloads/chromedriver-mac-arm64");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		///Users/ritika/Downloads/chromedriver-mac-x64
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("www.AutomationTalks.com");
		System.out.print("Test1 title is: "+driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("www.AutomationTalks.com");
		System.out.print("Test1 title is: "+driver.getTitle());
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("www.AutomationTalks.com");
		System.out.print("Test1 title is: "+driver.getTitle());
	}
	
	@AfterMethod
	public void Quit() {
		driver.quit();
	}

}
