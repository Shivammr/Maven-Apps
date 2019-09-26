package JavaMaven.MavenApps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Google {

	static WebDriver driver;

	/*
	 * @BeforeSuite public void browser() {
	 * System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
	 * + "\\BrowserDrivers\\chromedriver.exe"); driver = new ChromeDriver(); }
	 */

	@Test
	public void Search() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Maven");
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Apache Maven']")).isDisplayed());
	}

}
