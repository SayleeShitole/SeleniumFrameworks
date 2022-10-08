package com.qa.testLayer;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;

public class HomePageTestCase extends HomePage{

	@Parameters({"name","txt1","txt2"})
	@Test
	public void excuteTestCases(String name,String txt1, String txt2) throws InterruptedException
	{
		HomePage home=new HomePage();
		home.listTheDropDown(name);
		home.ListTheElement();
		home.clickOnReviewLink();
		home.selectTheOverallRating();
		home.entertheRandomTextInTitleOfYoureview(txt1);
		home.entertheRandomTextInYoureview(txt2);
		home.clickOnHotelsRatings();
		home.selectTheCheckBox();
		
	}
}
