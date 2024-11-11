package testpackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.Loginclass;
import pagepackage.Registrationclass;

public class Testclass {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/register/");
	}
	@Test
	public void test1() throws InterruptedException, IOException
	{
		Registrationclass objr=new Registrationclass(driver);
		objr.dropdownvalue();
		objr.setvlues("Liny joy v","linyjoy24@gmail.com","Ishaan@21","Ishaan@21","9745446681");
		objr.click();
		objr.screenshot();
		objr.Titleverification();
		Thread.sleep(4000);
		Loginclass objl=new Loginclass(driver);
		objl.setvalueslogin("linyjoy24@gmail.com","Ishaan@21");
		objl.loginbuttonclick();
		objl.close();
		
	}

}