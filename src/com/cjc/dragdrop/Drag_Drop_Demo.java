package com.cjc.dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//1 update grm git to eclp
		System.setProperty("webdriver.chrome.driver", "E:\\soft\\chrome_new\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		WebElement draggable=driver.findElement(By.id("dragdiv"));
		Actions  action= new Actions(driver);
		action.dragAndDropBy(draggable, 100,0).build().perform();
		
		JavascriptExecutor javascript=(JavascriptExecutor)driver;
		javascript.executeScript("alert('The element is moved to 100 pixcels in x direction');");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		new Actions(driver).dragAndDropBy(draggable, 0,100).build().perform();
		
		javascript.executeScript("alert('The element is moved to 100 pixcels in y direction');");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		Actions  action1= new Actions(driver);
		Action draganddropby=action1.dragAndDropBy(draggable, -100,-100).build();
		draganddropby.perform();
		
		javascript.executeScript("alert('The element is moved to 100 pixcels in x & y direction');");
	    Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(4000);
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
