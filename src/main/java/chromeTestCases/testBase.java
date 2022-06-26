package chromeTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testBase {

	public static WebDriver driver;

	public static String switchToFrameForElement(String xpath) throws InterruptedException {

		System.out.println("In GoToFrames Method Start");
		String frameNameone = null;
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for (int i = 0; i < frames.size(); i++) {
			System.out.println(frames.get(i).getAttribute("id"));
			String frameNametwo = frames.get(i).getAttribute("id");
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.switchTo().frame(frameNametwo);
			try {
				if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
					System.out.println("Element" + xpath + "is present in the frame :" + frameNametwo);
					frameNameone = frameNametwo;
					break;
				}
			} catch (Exception e) {
				System.out.println("Element is not present inside the frame :" + xpath);
				driver.switchTo().defaultContent();
			}
		}
		System.out.println("In GoToFrames Method End");
		return frameNameone;
	}
	
	public static void waitForElement(String xpath, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

}
