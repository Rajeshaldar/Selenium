//script for open and close multiple browser
package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndCloseMultiBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		//for chrome
		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
		
		//for firefox
		String key1 = "webdriver.gecko.driver";
		String value2 = "./softwares/geckodriver.exe";
		System.setProperty(key1, value2);
		
		FirefoxDriver driver2 = new FirefoxDriver();
		Thread.sleep(3000);
		driver2.quit();
	}

}
