package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsers {

	public static void main(String[] args) {
		//3.141.59//
		//*case 1:
		//launching the blank browser
		//WebDriver driver=new ChromeDriver();
		//launching the application
       //driver.get("https://www.flipkart.com/");
	   //driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Brand_Exact_Desktop&utm_source=bing");
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		//*case 3
      //launching the application in chrome//
	WebDriverManager.chromedriver().setup();//
	WebDriver driver=new ChromeDriver();//launching the empty browser
	driver.get("https://www.flipkart.com/");
	//*************************************************
	//****launching the application in edge*****
	//WebDriverManager.edgedriver().setup();
	//WebDriver driver=new EdgeDriver();
//	driver.get("https://www.flipkart.com/");
	
	}

}
