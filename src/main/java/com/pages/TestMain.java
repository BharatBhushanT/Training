package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMain {

	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/community/50029/how-handle-multiple-keyboard-keys-using-selenium-webdriver");
		
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("d").keyUp(Keys.CONTROL).perform();
	
	}
}
