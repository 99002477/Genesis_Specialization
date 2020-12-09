package iosa;

import java.util.function.Function;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
      
public class IosA {

  public static void main(String[] args) throws MalformedURLException, InterruptedException {
    
      DesiredCapabilities caps = new DesiredCapabilities();
      
      // Set your access credentia ls
      caps.setCapability("browserstack.user", "shandhiyavs1");
      caps.setCapability("browserstack.key", "s4yjcY9AjB9PWo4qdgTR");
      
      // Set URL of the application under test
      caps.setCapability("app", "bs://8b4d8d262cfa5e2c656c89b3c5c50e9e68431dc3");
      
      // Specify device and os_version for testing
      caps.setCapability("device", "Google Pixel 3");
      caps.setCapability("os_version", "9.0");
        
      // Set other BrowserStack capabilities
      caps.setCapability("project", "First Java Project");
      caps.setCapability("build", "Java Android");
      caps.setCapability("name", "first_test");
        
      
      // Initialise the remote Webdriver using BrowserStack remote URL
      // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
            new URL("http://hub.browserstack.com/wd/hub"), caps);
        

      /* Write your Custom code here */
        
        
      // Invoke driver.quit() after the test is done to indicate that the test is completed.
      driver.quit();
    
    }
      
      
  }
   