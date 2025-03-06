package com.exemple.practiceautomation.po;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinksPage extends PageObject {

	public BrokenLinksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\"top-wrap\"]/section/div/h1") 
	private WebElement brokenLinksTitle;
	
	
	@FindBy(xpath = "//*[@id=\"top-wrap\"]/section/div/nav/span/span[1]/a") 
	private WebElement homeText;
	
	
	@FindBy(xpath = "//*[@id=\"post-1267\"]/div/figure/table/tbody/tr/td[2]") 
	private WebElement QuatrecentsQuatres;
	
	@FindBy(xpath = "//*[@id=\"post-1267\"]/div/figure/table/tbody/tr/td[1]") 
	private WebElement Missinpagetext;
	
	
	

	public WebElement getBrokenLinksTitle() {
		return brokenLinksTitle;
	}

	public void setBrokenLinksTitle(WebElement brokenLinksTitle) {
		this.brokenLinksTitle = brokenLinksTitle;
	}

	public WebElement getHomeText() {
		return homeText;
	}

	public void setHomeText(WebElement homeText) {
		this.homeText = homeText;
	}

	public WebElement getQuatrecentsQuatres() {
		return QuatrecentsQuatres;
	}

	public void setQuatrecentsQuatres(WebElement quatrecentsQuatres) {
		QuatrecentsQuatres = quatrecentsQuatres;
	}

	public WebElement getMissinpagetext() {
		return Missinpagetext;
	}

	public void setMissinpagetext(WebElement missinpagetext) {
		Missinpagetext = missinpagetext;
	}
	
	
	
	
	
	
	
	
	

}
