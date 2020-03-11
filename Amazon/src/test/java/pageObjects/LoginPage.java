package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
@FindBy(id= "nav-link-accountList")
@CacheLookup
WebElement strSignin;

@FindBy(id= "ap_email")
@CacheLookup
WebElement strEml;

@FindBy(id= "ap_password")
@CacheLookup
WebElement strPwd;

@FindBy(id= "continue")
@CacheLookup
WebElement strCont;

@FindBy(id= "signInSubmit")
@CacheLookup
WebElement strSbmt;

@FindBy(xpath= "//*[@id='nav-hamburger-menu']/i")
@CacheLookup
WebElement strMenu;

@FindBy(id= "//*[@id='hmenu-content']/ul[34]/li[44]/a/div")
@CacheLookup
WebElement strSignOut;


public void clickSignin() {
	strSignin.click();
	}
public void setEmail(String Eml) {
	strEml.clear();
	strEml.sendKeys(Eml);
	}
public void clickCont() {
	strCont.click();
	}
public void setPassword(String Pwd) {
	strPwd.clear();
	strPwd.sendKeys(Pwd);
	}
public void clickSbmt() {
	strSbmt.click();
	}
public void clickSignOut() throws InterruptedException {
	strMenu.click();
	Thread.sleep(2000);
	strSignOut.click();
	}
}
