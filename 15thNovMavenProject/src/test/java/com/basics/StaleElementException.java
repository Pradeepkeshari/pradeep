package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException
{
	

	    static
		{
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			System.out.println("start of java code");
			WebDriver driver= new ChromeDriver();	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://localhost:8888/");
			
			 WebElement untbx = driver.findElement(By.name("user_name"));
			 driver.navigate().refresh();
			 
			untbx.sendKeys("admin");
			
			 
			 
			System.out.println("end of java code");
		}

}
