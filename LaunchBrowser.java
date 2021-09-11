package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manages the driver
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/main");
       String title=driver.getTitle();
       System.out.println("Title" +title);
       
     WebElement username=  driver.findElement(By.id("username"));
     username.sendKeys("demosalesmanager");
       
     WebElement password=  driver.findElement(By.id("password"));
     password.sendKeys("crmsfa");
     
     WebElement submit = driver.findElement(By.className("decorativeSubmit"));
     submit.click();
     
     WebElement cliclLink = driver.findElement(By.linkText("CRM/SFA"));
    cliclLink.click();
     
       driver.close();
	}

}
