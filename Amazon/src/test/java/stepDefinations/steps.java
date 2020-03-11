package stepDefinations;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class steps {
	
	public WebDriver driver;
	public LoginPage lp;
	public static Logger logger;
	
	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		logger = Logger.getLogger("Amazon");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		

	}

	@When("user opens URL {string}")
	public void user_opens_URL(String url) throws InterruptedException {
			driver.get(url);
			Thread.sleep(1000);
			logger.info("Page Loaded");
			lp.clickSignin();
	}

	@When("User Enters Email as {string}")
	public void user_Enters_Email_as(String Eml) throws InterruptedException {
		logger.info("Entering Email Page");
		lp.setEmail(Eml);
		Thread.sleep(1000);
		lp.clickCont();
		
	}

	@When("User Enters Password as {string}")
	public void user_Enters_Password_as(String Pwd) throws InterruptedException {
		logger.info("Entering Password Page");
		byte[] decodedString = Base64.decodeBase64(Pwd);
		lp.setPassword(new String(decodedString));
		Thread.sleep(1000);
		lp.clickSbmt();

	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String Title) throws InterruptedException {
		logger.info("Title Verified");
		Thread.sleep(3000);
		String Exptitle = driver.getTitle();
		System.out.println("Title is :"+Exptitle);
		if (Exptitle.equalsIgnoreCase(Title))
		{
			System.out.println(Title);
			System.out.println(Exptitle);
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
//		if (driver.getPageSource().contains(Title))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		

	}

	@Then("User Clicks Sign out")
	public void user_Clicks_Sign_out() throws InterruptedException {
		logger.info("Sign out");
		//lp.clickSignOut();
		
	}

	@Then("Close Browser")
	public void close_Browser() {
		logger.info("Driver Closed");
		driver.quit();

	}

}
