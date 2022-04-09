package vijay.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLangProp(String language)
	{
		System.out.println("lang is :"+ language);
		
		prop= new Properties();
		try {
		switch(language.toLowerCase())
		{
		case "english" :
			ip= new FileInputStream("./Configuration\\lang.eng.properties");
			break;
		case "french" :
			ip= new FileInputStream("./Configuration\\lang.fran.properties");
			break;
		case "russian" :
			ip= new FileInputStream("./Configuration\\lang.rus.properties");
			break;
			default : System.out.println("language is not matched");
				break;
		}
		prop.load(ip);
		} catch(Exception e) {
			
		}
		return prop;
	}
	
	
}
