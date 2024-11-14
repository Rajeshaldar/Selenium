//script to launch Firefox browser
package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
	public static void main(String[] args) {
		String key = "webdriver.gecko.driver";
		String value ="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();
	}
}
