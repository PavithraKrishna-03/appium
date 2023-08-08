package pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import appium_driver.Appium_setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Calculator extends Appium_setup{
	
	public Calculator (AppiumDriver<?> driver) throws InterruptedException {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		

	   //  this.driver = (AppiumDriver<MobileElement>) driver;

	}  

	/* @AndroidFindBy(xpath = "//android.widget.Button[@text='9']")
	public MobileElement nine;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='+']")
	public MobileElement plus;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
	public MobileElement one;    */
	
	
	public MobileElement nine = driver.findElement(By.xpath("//android.widget.Button[@text='9']"));
	public MobileElement plus = driver.findElement(By.xpath("//android.widget.Button[@text='+']"));

	public MobileElement one = driver.findElement(By.xpath("//android.widget.Button[@text='1']"));

	
	public void splash() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		nine.click();
		Thread.sleep(2000);
		plus.click();
		Thread.sleep(2000);
		one.click();
	
	} 
}
