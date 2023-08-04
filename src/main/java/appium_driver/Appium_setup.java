package appium_driver;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

//import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Appium_setup {
	
	public static AppiumDriver<MobileElement> driver;
	
	@BeforeSuite
	public  AppiumDriver<MobileElement> setup() {
		try {

		/*	dprop = new Properties();
			input = new FileInputStream("config.properties");
			dprop.load(input); */
			DesiredCapabilities c = new DesiredCapabilities();
			
		/*	c.setCapability("deviceName", "SM-E236B/DS");
			c.setCapability("udid", "RZCTA0ZLSSJ");
			System.out.println("launchingggg111......");
		//	c.setCapability("deviceName", "OPPO A54");
		//	c.setCapability("udid", "UCTG99E67DG6BAT8");
			c.setCapability("platformName", "Android");
			c.setCapability("platformVersion", "13");
			c.setCapability("autoGrantPermissions", "true");
		  //  c.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		    c.setCapability("adbExecTimeout", 50000);
		    c.setCapability("NewCommandTimeout", 50000); 
		 //   c.setCapability("showChromedriverLog", true);
			c.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			System.out.println("launchingggg......");
		//	c.setCapability("appActivity", "in.loanfront.android.splash.SplashActivity");		
			URL u = new URL("http://127.0.1.1:4723/wd/hub");
			System.out.println("launchingggg333......");
			driver = new AndroidDriver<MobileElement>(u, c);	
			System.out.println("App is getting launch");
			//	Report_Details.method_Screenshot("Splash screen", Report_Details.takeScreenShot());
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);  
			
			//ph_number1=dprop.getProperty("MOB"); */
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
		
	}

}
