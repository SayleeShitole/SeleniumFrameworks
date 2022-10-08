package com.qa.pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{

	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@aria-label='Search'])[2]")
	private WebElement search;
	public void listTheDropDown(String element)
	{
		search.sendKeys(element);
	}
	
	@FindBy(xpath="//div[@id='typeahead_results']/a")
	private List<WebElement> list;
	public void ListTheElement() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			Thread.sleep(4000);
			String list1 = list.get(i).getText();
			System.out.println(list1);
			if(list1.startsWith("Club Mahindra"))
			{
				Thread.sleep(5000);
				list.get(i).click();
				//driver.findElement(By.xpath("//div[@id='typeahead_results']/a")).click();
				break;
			}
		}
	}
	
	@FindBy(xpath="(//span[@class='biGQs _P ttuOS'])[1]")
	private WebElement review;
	public void clickOnReviewLink()
	{
		review.click();
	}
	
	@FindBy(id ="bubble_rating")
	private WebElement rating1;
	public void selectTheOverallRating() throws InterruptedException
	{
		
		Actions act= new Actions(driver);
		act.moveToElement(rating1,50,0).click().build().perform();
		
	}
	
	
	@FindBy(xpath="//input[@id='ReviewTitle']")
	private WebElement text1;
	public void entertheRandomTextInTitleOfYoureview(String txt1) throws InterruptedException
	{
		
		text1.sendKeys(txt1);
		Thread.sleep(3000);
	}
	

	@FindBy(xpath="//textarea[@id='ReviewText']")
	private WebElement text2;
	public void entertheRandomTextInYoureview(String txt2) throws InterruptedException
	{
		
		text2.sendKeys(txt2);
		Thread.sleep(3000);
	}
	
	@FindBy(xpath="//div[@class='ratingBubbleTable']/div")
	private List<WebElement> serivce_ratings;
//	@FindBy(xpath="//span[@id='qid14_bubbles']']")
//	private WebElement cleanliness_ratings;
//	@FindBy(xpath="//span[@id='qid190_bubbles']")
//	private WebElement sleep_quality_ratings;
	public void clickOnHotelsRatings() throws InterruptedException
	{
		Actions act=new Actions(driver);
//		act.moveToElement(serivce_ratings, 50, 0).click().build().perform();
//		Thread.sleep(2000);
//		act.moveToElement(cleanliness_ratings, 50, 0).click().build().perform();
//		Thread.sleep(2000);
//		act.moveToElement(sleep_quality_ratings, 50, 0).click().build().perform();
//		Thread.sleep(2000);
		for(int i=0;i<serivce_ratings.size();i++)
		{
			String str=serivce_ratings.get(i).getText();
			System.out.println(str);
			if(str.contains("Service"))
			{
			act.moveToElement(serivce_ratings.get(i), 50, 0).click().build().perform();
			
			}
			else if(str.contains("Cleanliness"))
			{
				act.moveToElement(serivce_ratings.get(i), 50, 0).click().build().perform();
				
			}
			else if(str.contains("Rooms"))
			{
				act.moveToElement(serivce_ratings.get(i), 50, 0).click().build().perform();
				
			}
			else if(str.contains("Location"))
			{
				act.moveToElement(serivce_ratings.get(i), 50, 0).click().build().perform();
				
			}
			else if(str.contains("Value"))
			{
				act.moveToElement(serivce_ratings.get(i), 50, 0).click().build().perform();
				
			}
			else if(str.contains("Sleep Quality"))
			{
				act.moveToElement(serivce_ratings.get(i), 50, 0).click().build().perform();
				
				
			}
//			else
//			{
//				System.out.println("Element is not present ");
//			}
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='noFraud']")
	private WebElement checkbox;
	public void selectTheCheckBox()
	{
		
		checkbox.click();
	}
	
	
	
	
}
