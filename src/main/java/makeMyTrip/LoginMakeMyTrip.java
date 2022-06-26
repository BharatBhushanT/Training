package makeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginMakeMyTrip extends BasePageUtils{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQjwuMuRBhCJARIsAHXdnqNU9W7SA7PFZkLyvcXhbXR0NAW0ztcqdo88ZbNg7EjDnRodcUoI70UaAlYYEALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=Cj0KCQjwuMuRBhCJARIsAHXdnqNU9W7SA7PFZkLyvcXhbXR0NAW0ztcqdo88ZbNg7EjDnRodcUoI70UaAlYYEALw_wcB:G:s");
		
		LoginTestCase();
		
		driver.quit();
		
		
		
		
	}
	
	//Login sceanrio
	public static void LoginTestCase() throws InterruptedException {
		String login_Button_xpath = "(//ul)[1]/li[2]";
		waitForElement(login_Button_xpath, 10);
		WebElement loginButton = driver.findElement(By.xpath(login_Button_xpath));
		loginButton.click();
		Actions actions = new Actions(driver);
		//actions.moveToElement(loginButton).click().build().perform();
		
		//loginButton.click();
		Thread.sleep(5000);
				
		/*
		 * String loginWithMobile_xpath = "//label[text()='Login with Phone/Email']";
		 * waitForElement(loginWithMobile_xpath, 5); WebElement loginWithMobileButton =
		 * driver.findElement(By.xpath(loginWithMobile_xpath));
		 * 
		 * //Actions actions = new Actions(driver);
		 * actions.moveToElement(loginWithMobileButton).click().build().perform();
		 */
		

		//loginWithMobileButton.click();
		
		
	}

}
