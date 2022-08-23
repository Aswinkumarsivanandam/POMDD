package com.Credor.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.InputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Credor.qa.utilities.test;

public class TestBase {
	static Properties prop = new Properties();

	static WebDriver driver;
//	public static Properties prop;
	
	public static void main (String[] args) throws IOException{
				getproperties();}
	
private static void getproperties() {
		// TODO Auto-generated method stub
	String projectPath = System.getProperty("user.dir");
			try {
				FileInputStream ip = new FileInputStream(projectPath+"/src/main/java/com/Credor/qa/config/config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(prop.getProperty("browser"));
			System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();


	}
/*
String projectPath = System.getProperty("user.dir";)
FileInputStream ip = new FileInputStream("F:\\Workspace\\POMbase\\POMDD\\src\\main\\java\\com\\"
				+ "Credor\\qa\\config\\config.properties");

prop.load(ip);
	
System.out.println(prop.getProperty("browser"));
String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}
		/*String browsername = prop.getProperty("browser");
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","F:\\Workspace\\POMbase\\POMDD\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
			else if(prop.getProperty("browser").equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/Driver");
				WebDriver driver = new FirefoxDriver();
		}
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Time_Page_Load,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Time_Implicit_Wait, TimeUnit.SECONDS);*/
		//driver.get(prop.getProperty("url"));*/
		
		/*
		
		public static void initialization(){
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "F:\\Workspace\\POMbase\\POMDD\\Driver\\chromedriver.exe");	
				driver = new ChromeDriver(); 
			}
			else if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
				driver = new FirefoxDriver(); 
			}
	
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
}
