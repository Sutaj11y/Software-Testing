package Script;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Methods {
	public static void open(WebDriver driver){
		driver.get("https://testffc.nimapinfotech.com/auth/login");
	}
	public static void email(WebDriver driver,String Email) {
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(Email);
	}
	public static void password(WebDriver driver,String Password) {
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(Password);
	}

	public static void login(WebDriver driver) {
		driver.findElement(By.xpath("//button[@id='kt_login_signin_submit']")).click();
	}
	
	public static void validation(WebDriver driver) {
		String t=driver.findElement(By.xpath("//span[normalize-space()='My Customers']")).getText();
		
	    if(t.equals("My Customers")) {
	    	 System.out.print("You are logged in successfully.\n");
	     }else {
	    	 System.out.print("failed");
	     }
	    
	}
	public static void Name(WebDriver driver, String Lname) {
		driver.findElement(By.xpath("//input[@data-placeholder='Lead/Customer Name']")).sendKeys(Lname);
	}
	public static void s(WebDriver driver) {
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
	}
	// unable to find xpath of punchin because it was clicked already, so below method will not work and throw error 
	public static void punchin(WebDriver driver) {
		driver.findElement(By.xpath("//span[normalize-space()='Punch In']")).click();
	}
}
