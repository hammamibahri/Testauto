package com.exemple.practiceautomation.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickEventsPage extends PageObject {

	public ClickEventsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\\\"post-3145\\\"]/div/div[3]/div/div/div/div[1]/button") 
	private WebElement btnCat;

	public WebElement getBtnCat() {
		return btnCat;
	}

	public void setBtnCat(WebElement btnCat) {
		this.btnCat = btnCat;
	}















}


