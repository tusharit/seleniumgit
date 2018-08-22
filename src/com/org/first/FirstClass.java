package com.org.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {
	
	//public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");//
				
		
	
	
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.facebook.com/");
	
		
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		
		WebElement username=driver1.findElement(By.id("email"));
		username.sendKeys("tusharmaske16@gmail.com");
		
	    WebElement Password = 	driver1.findElement(By.id("pass"));
		Password.sendKeys("software@eng");
		
	    WebElement loginButton = driver1.findElement(By.id("u_0_2"));
	    loginButton.click();
	
	
		 
		 
		driver1.quit();
	
		
		
		
	}
	
	
}
