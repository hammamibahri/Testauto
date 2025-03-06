package com.example.PracticeAutomation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.exemple.practiceautomation.po.BrokenLinksPage;

public class BrokenLinks {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  BrokenLinksPage brokenLinks;
  JavascriptExecutor js;
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
	  brokenLinks = new BrokenLinksPage(driver);
	  }

   /* System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;*/
  

  /*@Test
  public void testBrokenLinks() throws Exception {
    driver.get("https://practice-automation.com/broken-links/");
    //driver.findElement(By.linkText("Broken Links")).click();
    driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1")).click();
    try {
      assertEquals("Broken Links", driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Home", driver.findElement(By.linkText("Home")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//article[@id='post-1267']/div/p")).click();
    try {
      assertEquals("broken link", driver.findElement(By.linkText("broken link")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//article[@id='post-1267']/div/p[3]")).click();
    try {
      assertEquals("In this case, clicking the link will return a response code of 404 (Not Found). You could write an automated test that checks for the expected response code of 200.", driver.findElement(By.xpath("//article[@id='post-1267']/div/p[3]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/thead/tr/th")).click();
    try {
      assertEquals("Name", driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/thead/tr/th")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/tbody/tr/td")).click();
    driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/tbody/tr/td")).click();
    driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/tbody/tr/td")).click();
    try {
      assertEquals("missing-page.html", driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/tbody/tr/td")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/thead/tr/th[2]")).click();
    try {
      assertEquals("Status", driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/thead/tr/th[2]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/tbody/tr/td[2]")).click();
    try {
      assertEquals("404", driver.findElement(By.xpath("//article[@id='post-1267']/div/figure/table/tbody/tr/td[2]")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }*/
  @Test
  public void testBrokenLinks() throws Exception {
    driver.get("https://practice-automation.com/broken-links/");
    
    try {
    	
    	assertEquals("Broken Links", brokenLinks.getBrokenLinksTitle().getText());
    	assertEquals("Home", brokenLinks.getHomeText().getText());
    	assertEquals("404", brokenLinks.getQuatrecentsQuatres().getText());
    	assertEquals("missing-page.html", brokenLinks.getMissinpagetext().getText());
   
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    	
    	//Broken links: Titre de la page
    //   WebElement element=driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1"));
   //    assertEquals("Broken Links", element.getText());
       
    //   element=driver.findElement(By.xpath("//*[@id=\"top-wrap\"]/section/div/nav/span/span[1]/a"));
   //    assertEquals("Home", element.getText());
       
   //    element=driver.findElement(By.xpath("//*[@id=\"post-1267\"]/div/figure/table/tbody/tr/td[2]"));
    //   assertEquals("404", element.getText());
       
    //   element=driver.findElement(By.xpath("//*[@id=\"post-1267\"]/div/figure/table/tbody/tr/td[1]"));
    //   assertEquals("missing-page.html", element.getText());
       
 
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
