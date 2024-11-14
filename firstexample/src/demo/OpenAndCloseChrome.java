//script for open and close chrome
package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseChrome {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value ="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
	}

}