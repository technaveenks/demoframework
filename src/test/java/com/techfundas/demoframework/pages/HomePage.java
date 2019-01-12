package com.techfundas.demoframework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="search_query_top")
	private WebElement _txtSearch;
		
	public SearchResultsPage enterSearchText(String SearchTxt){
		_txtSearch.sendKeys(SearchTxt + Keys.ENTER);
		return new SearchResultsPage();
	}

	
	
}
