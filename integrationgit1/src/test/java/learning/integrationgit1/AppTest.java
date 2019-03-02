package learning.integrationgit1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    protected WebDriver driver;
    public void sampleCheck() throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	String eTitle = "Meet Gurr99";
    	String aTitle = ""; 
    	
    	driver.get("http://www.guru99.com");
    	driver.manage().window().maximize();
    	aTitle = driver.getTitle();
    	
    	if(aTitle.contentEquals(eTitle))
    		System.out.println("Test passed");
    		else
    			System.out.println("Test Failed");
    	
    	System.out.println("Test is over");
    	System.out.println("6876");
    	driver.close();   	
    	
    }
}
