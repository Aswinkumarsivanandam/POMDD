package com.Credor.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class veggies {

	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chromedriver", "User.dir");
		WebDriverManager.chromedriver().driverVersion("104.0.5112.81").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.print(driver.findElement(By.cssSelector("h4[class='product-name']")).getText());
		String Rupees =driver.findElement(By.tagName("p")).getText(); 
		System.out.println(" Rs"+" "+ Rupees);
		driver.findElement(By.linkText("+")).click();
		driver.findElement(By.linkText("+")).click();
		String Quantity =driver.findElement(By.xpath("//input[@class='quantity']")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println("Quantity is "+" "+ Quantity);
		driver.close();
		
		
		

	}

}
