package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    
	    WebElement leadsTab = driver.findElement(By.linkText("Leads"));
	    leadsTab.click();
	    WebElement clickLeadTab = driver.findElement(By.linkText("Create Lead"));
	    clickLeadTab.click();
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramiapriya");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Paulraj");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nirmal");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Justin");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("40000");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
	    
	    
	    driver.findElement(By.className("smallSubmit")).click();
		   
	    

	}

}
