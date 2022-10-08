package com.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class TestBase {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MaKsys\\Documents\\Velocity\\Selenium\\BroswersWebdrivers\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
					
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.tripadvisor.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	
//	@AfterMethod
//	public void closeSession() throws InterruptedException
//	{
//		Thread.sleep(9000);
//		driver.close();
//		
//	}
}
