package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testclass {
	public static void main (String[]args) {
	System.setProperty("webdriver.gecko.driver","D:\\Tessting\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	String Url="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
	driver.get(Url);
	

	
	WebElement firstname=driver.findElement(By.id("firstName"));
	firstname.sendKeys("ahmed");
	
	WebElement lastname=driver.findElement(By.id("lastName"));
	lastname.sendKeys("yasser");
	
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("ahmed"+"yasser"+(int)(Math.random()*100));
	
	WebElement password=driver.findElement(By.name("Passwd"));
	password.sendKeys("ahmed404@22");
	
	WebElement confpassword=driver.findElement(By.name("ConfirmPasswd"));
	confpassword.sendKeys("ahmed404@22");
	
	WebElement showpswd=driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
	showpswd.click();
	
	//WebElement nextbtn=driver.findElement(By.className("VfPpkd-vQzf8d"));
	//nextbtn.click();
	
	
	 
	}
}
