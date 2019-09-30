package JavaMaven.MavenApps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class GoogleTest {

	static WebDriver driver;
	static Actions builder;

	@BeforeMethod
	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		builder = new Actions(driver);
	}

	@Test
	public void Search() {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Maven");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		//builder.sendKeys(Keys.ENTER);
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='pauaa]")).isDisplayed());
	}

}
