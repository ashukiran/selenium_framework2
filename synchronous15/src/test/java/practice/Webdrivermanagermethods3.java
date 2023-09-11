package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Webdrivermanagermethods3 {

	public static void main(String[] args) throws Throwable  {
		//empty browser launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//********launching the application in chrome*****************//
		driver.get("https://www.flipkart.com/");
		 //driver.get("https://www.amazon.com/");
		 //driver.get("https://www.facebook.com/");
		 
 //**************************************//
		// String data=driver.getTitle();//method 1
	   //  System.out.println(data);//current title of application
	     
//**********************************//
		// String data1=driver.getCurrentUrl();//method 2
		// System.out.println(data1);//getting current url
		 
 //*********************************//
		// String data2=driver.getPageSource();//method 3
		// System.out.println(data2);//getting source code 
		 
//*********************************//
		 
   // driver.manage().window().maximize();//maximize the screen
   // Thread.sleep(2000);
    //driver.manage().window().minimize();-->for 3rd version not available
		 
//*************alternate option for maximize********************//
	//	 Thread.sleep(2000);
	//	org.openqa.selenium.WebDriver.Options opti=driver.manage();
	//	Window win=opti.window();
	//	win.maximize();
//*****************6th method****************
		// driver.navigate().to("https://www.flipkart.com/");//launching the application
		// Thread.sleep(2000);
		 //back to the browser
		// driver.navigate().back();
		// Thread.sleep(2000);
		 //again moving forward
		 //driver.navigate().forward();
		 //Thread.sleep(2000);
		 //refreshing the page
		 //driver.navigate().refresh();
		//driver.close();
		//driver.quit();
		
	}

}
