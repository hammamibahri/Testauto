package com.example.PracticeAutomation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.exemple.practiceautomation.po.ClickEventsPage;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;

public class ClickEvents {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	ClickEventsPage clickEvents;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		baseUrl = "https://practice-automation.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		clickEvents = new ClickEventsPage(driver);
	}

	@Test
	public void testClickEvents() throws Exception {
		driver.get("https://practice-automation.com/click-events/");
		try {
			WebElement element = driver.findElement(By.xpath("//*[@id=\"top-wrap\"]/section/div/h1"));
			assertEquals("Click Events", element.getText());

			element = driver.findElement(By.xpath("//*[@id=\"top-wrap\"]/section/div/nav"));
			assertEquals("Home", driver.findElement(By.linkText("Home")).getText());
			
			
			
			
			
			clickEvents.getBtnCat().click();

			WebElement btn = driver
					.findElement(By.xpath("//*[@id=\"post-3145\"]/div/div[3]/div/div/div/div[1]/button"));
			btn.click();
			
			
			
			
			element = driver.findElement(By.id("demo"));
			assertEquals("Meow!", element.getText());
			
			
			
			
			
			
			
			
			
			
			
			
			
		

			btn = driver.findElement(By.xpath("//*[@id=\"post-3145\"]/div/div[3]/div/div/div/div[2]/button"));
			btn.click();
			element = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
			assertEquals("Woof!", element.getText());

			btn = driver.findElement(By.xpath("//b[normalize-space()='Cow']"));
			btn.click();
			element = driver.findElement(By.xpath("//h2[@id='demo']"));
			assertEquals("Moo!", element.getText());

			btn = driver.findElement(By.xpath("//button[@onclick='pigSound()']"));
			btn.click();
			element = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
			assertEquals("Oink!", element.getText());

		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
