package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginclass {
WebDriver driver;
@FindBy(id="ulogin")
WebElement username;
@FindBy(id="upass")
WebElement password;
@FindBy(xpath="/html/body/div[3]/div/div/div/form/input[@id='sub_logbtn']")
WebElement loginbutton;

public Loginclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void setvalueslogin(String user,String pass)
{
	username.sendKeys(user);
	password.sendKeys(pass);
}
public void loginbuttonclick()
{
	loginbutton.click();
}
public void close()
{
	driver.close();
}
}
