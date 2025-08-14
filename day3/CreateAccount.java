package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {
	
	public static void main(String[] args) {
		
	
				ChromeDriver driver=new ChromeDriver();
				
				//load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//maximize the window
				driver.manage().window().maximize();
				//enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//enter the password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//click on login
				driver.findElement(By.className("decorativeSubmit")).click();
				//click crmsfa
				driver.findElement(By.partialLinkText("SFA")).click();
				//click Accounts
				driver.findElement(By.linkText("Accounts")).click();
				//click Create Account
				driver.findElement(By.linkText("Create Account")).click();
				//Enter an account name
				driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
				//Enter a Description
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				//Enter a Number of Employees
				driver.findElement(By.id("numberEmployees")).sendKeys("10");
				//Enter a Site Name
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				//Click the Create Account
				driver.findElement(By.className("smallSubmit")).click();
				//To display Title
				String title = driver.getTitle();
				System.out.println(title);
				//Close the Browser window
				driver.close();
				
				
	
	}

		

	}

