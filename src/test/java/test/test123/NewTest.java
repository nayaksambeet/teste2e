package test.test123;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.setCapability("browserVersion", "100");
		// chromeOptions.setCapability("platformName", "Windows");
		// Showing a test name instead of the session id in the Grid UI
		chromeOptions.setCapability("se:name", "My simple test");
		// Other type of metadata can be seen in the Grid UI by clicking on the
		// session info or via GraphQL
		chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), chromeOptions);
			//WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();

	}

	@Test
	public void f2() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.setCapability("browserVersion", "100");
		// chromeOptions.setCapability("platformName", "Windows");
		// Showing a test name instead of the session id in the Grid UI
		chromeOptions.setCapability("se:name", "My simple test");
		// Other type of metadata can be seen in the Grid UI by clicking on the
		// session info or via GraphQL
		chromeOptions.setCapability("se:sampleMetadata", "Sample metadata value");
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), chromeOptions);
			
			//WebDriverManager.chromedriver().setup();
			//driver=new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();

	}
}
