package pagepackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationclass {
WebDriver driver;
@FindBy(id="utitle")
WebElement krecname;
@FindBy(id="umail")
WebElement krecemail;
@FindBy(id="memberpass")
WebElement krecpassword;
@FindBy(id="repass")
WebElement confmpassword;
@FindBy(id="umobile")
WebElement mobile;
@FindBy(xpath="//input[@id='sub_regbutton']")
WebElement createaccclick;
@FindBy(xpath="//input[@id='sub_logbtn']")
WebElement loginbutton;

public Registrationclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void dropdownvalue()
{
	Select val=new Select(driver.findElement(By.xpath("//select[@id='listowner']")));
			val.selectByValue("builder");
}
public void setvlues(String name,String email,String pswd, String cpswd,String phonenumber)
{
	krecname.sendKeys(name);
	krecemail.sendKeys(email);
	krecpassword.sendKeys(pswd);
	confmpassword.sendKeys(cpswd);
	mobile.sendKeys(phonenumber);
	
	
}
public void click()
{
	createaccclick.click();
	
}
public void screenshot() throws IOException
{
	WebElement ele=driver.findElement(By.xpath("//img[@alt='Kerala Property']"));
	File src=ele.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("./Screenshot/home.png"));
}
public void Titleverification()
{
	String actualtitle=driver.getTitle();
	String exptitle="keralaproperty";
	if(actualtitle.equals(exptitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}

}

