package com.techfundas.demoframework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchResultsPage {
	
	@FindBy(xpath ="//*[@id='center_column']/ul/li/div/div[2]/h5/a")
	private WebElement _txtSearchResult;
	
	public void validateSearchResult(String AssertText){
		Assert.assertEquals(_txtSearchResult.getText().contains(AssertText), AssertText);
	}

}
