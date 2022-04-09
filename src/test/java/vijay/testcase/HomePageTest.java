package vijay.testcase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import vijay.Pageobject.HomePage;
import vijay.Utilities.ConfigurationReader;
import vijay.Utilities.DriverFactory;

public class HomePageTest {
DriverFactory df;
ConfigurationReader cp;
Properties prop;
WebDriver driver;
HomePage homepage;

@BeforeTest
public void setUp()
{
	cp= new ConfigurationReader();
	prop=cp.initLangProp("english");
	df= new DriverFactory();
	driver=df.initDriver("chrome", prop);
	homepage= new HomePage(driver);
}

@Test
public void headerTest()
{
	Assert.assertTrue(homepage.getHeaderExist(prop.getProperty("header")));
}
@Test
public void contactTest()
{
	Assert.assertTrue(homepage.getContactExist(prop.getProperty("contact")));
}

@AfterTest
public void tearDown()
{
	driver.quit();
}

}
