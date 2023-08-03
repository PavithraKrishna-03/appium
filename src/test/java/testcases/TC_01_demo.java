package testcases;

import org.testng.annotations.Test;

import appium_driver.Appium_setup;
import pageObject.Calculator;


public class TC_01_demo extends Appium_setup {
	
	@Test
	public void test5() throws Exception
	{
		Thread.sleep(5000);
		new Calculator(driver).splash();
	}

}
