package vijay.Utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	
	
public WebDriver initDriver(String browserName, Properties prop)	
{
	System.out.println("browser name is :"+ browserName);
	
	switch(browserName.toLowerCase())
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		break;
	case "safari":
		WebDriverManager.safaridriver().setup();
		driver= new SafariDriver();
		break;
		
	 default : System.out.println("please pass the right browser");
		break;
		
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	return driver;
	
	

}
	
}
