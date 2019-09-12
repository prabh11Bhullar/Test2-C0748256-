import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {

	  final String CHROMEDRIVER_LOCATION = "/Users/satwinderbhullar/Downloads/chromedriver";
	  
	  final String URL_TO_TEST = "http://blazedemo.com/";
	  WebDriver driver;
	@Before
	public void setUp() throws Exception {
		//Setup Selenium
    	
	     System.setProperty("webdriver.chrome.driver",CHROMEDRIVER_LOCATION);
	                
	     driver = new ChromeDriver();
	                
	     //Go to website
	     
	     driver.get(URL_TO_TEST);
	}

	@After
	public void tearDown() throws Exception {
//      // Close the browser
//      Thread.sleep(2000);
//      driver.close();
	}

	@Test
	public void test1() {
		
		//get the dropdownlist
		
      WebElement checkbox = driver.findElement(By.className("form-inline"));
		
	}

}
