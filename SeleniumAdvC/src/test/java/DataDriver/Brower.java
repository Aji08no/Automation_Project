package DataDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Brower {

	public static void main(String[] args) {
	  
//		WebDriver driver;
//		driver=WebDriverManager.chromedriver().create();
		
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--remote-allow-origins=*");
	      options.addArguments("--no-sandbox");
	      options.addArguments("--disable-dev-shm-usage");
		driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
	
		
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path+"./Drivers/chromedriver/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		
//		System.setProperty("webdriver.chrome.driver", "E:/AJI/Selenium/chromedriver_win32/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		

	}

}
