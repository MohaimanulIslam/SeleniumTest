package first.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase {
	
	public void rome() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.rome2rio.com/");
		
		WebElement element =  driver.findElement(By.className("js-open-login"));
		element.click();
		
		element = driver.findElement(By.id("form_login-email"));
		element.sendKeys("marazislam8@gmail.com");
		
		element = driver.findElement(By.id("form_login-password"));
		element.sendKeys("TestCase0101");
		
		element = driver.findElement(By.id("form_login-submit"));
		element.click();
		
	}
	
	public void romelogEmail() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://accounts.google.com/o/oauth2/auth/identifier?redirect_uri=https%3A%2F%2Fwww.rome2rio.com%2Fgoogle-sign-in&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=736771455123-ttjjkfnroislf3r41m0ct2hhc1f8deh1.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fwww.rome2rio.com&fetch_basic_profile=true&gsiwebsdk=2&flowName=GeneralOAuthFlow");
		
		WebElement element =  driver.findElement(By.id("identifierId"));
		element.sendKeys("marazislam8@gmail.com");
		
		element = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		element.click();
//		
//		element = driver.findElement(By.id("google-sign-in"));
//		element.click();
		
		
	}
	
	
	public void romeSignUp() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.rome2rio.com/");
		
		WebElement element =  driver.findElement(By.className("js-open-login"));
		element.click();
		
		element =  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[4]/div[1]/div[2]/a[1]"));
		element.click();
		
		element  = driver.findElement(By.id("form_register-email"));
		element.sendKeys("marazislam8@gmail.com");
		
		element  = driver.findElement(By.id("form_register-name"));
		element.sendKeys("Maraz");
		
		element  = driver.findElement(By.id("form_register-password"));
		element.sendKeys("TestCase0101");
		
		element  = driver.findElement(By.id("form_register-password2"));
		element.sendKeys("TestCase0101");
		
		element  = driver.findElement(By.id("form_register-submit"));
		element.click();
		
		
		
	}
	
	public void romeTrans() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.rome2rio.com/map/Dhaka/The-Louvre");
		
		
	}
	
	public void romTickets() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.rome2rio.com/");
		
		WebElement ticket = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[1]/ul/li[1]"));
		ticket.click();
		
	}
	
	public void romHotels() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.rome2rio.com/");
		
		WebElement hotel = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[1]/ul/li[2]"));
		hotel.click();
		
		WebElement element =  driver.findElement(By.className("js-open-login"));
		element.click();
		
		element =  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[4]/div[1]/div[2]/a[1]"));
		element.click();
		
		element  = driver.findElement(By.id("form_register-email"));
		element.sendKeys("marazislam8@gmail.com");
		
		element  = driver.findElement(By.id("form_register-name"));
		element.sendKeys("Maraz");
		
		element  = driver.findElement(By.id("form_register-password"));
		element.sendKeys("TestCase0101");
		
		element  = driver.findElement(By.id("form_register-password2"));
		element.sendKeys("TestCase0101");
		
		element  = driver.findElement(By.xpath("//*[@id=\"form_register-submit\"]"));
		element.click();
		
	}
	
public void romCarHire() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.rome2rio.com/");
		
		WebElement car = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[1]/ul/li[3]"));
		car.click();
		
		WebElement element =  driver.findElement(By.className("js-open-login"));
		element.click();
		
		element =  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[4]/div[1]/div[2]/a[1]"));
		element.click();
		
		element  = driver.findElement(By.id("form_register-email"));
		element.sendKeys("marazislam8@gmail.com");
		
		element  = driver.findElement(By.id("form_register-name"));
		element.sendKeys("Maraz");
		
		element  = driver.findElement(By.id("form_register-password"));
		element.sendKeys("TestCase0101");
		
		element  = driver.findElement(By.id("form_register-password2"));
		element.sendKeys("TestCase0101");
		
		element  = driver.findElement(By.xpath("//*[@id=\"form_register-submit\"]"));
		element.click();
		
	}

}
