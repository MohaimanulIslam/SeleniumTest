package first.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TestCaseF {
	
	public void flickrHome() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.flickr.com/");
		
		WebElement ele = driver.findElement(By.className("gn-title"));
		ele.click();
		
		ele = driver.findElement(By.id("login-email"));
		ele.sendKeys("marazislam8@gmail.com");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();
		
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
		ele.sendKeys("TestCase0101");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();
		
	}
	
	
	public void flicLogbyMail() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://identity.flickr.com/login?redir=https%3A%2F%2Fwww.flickr.com%2F");
		
		WebElement ele = driver.findElement(By.id("login-email"));
		ele.sendKeys("marazislam8@gmail.com");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();
		
		
		ele = driver.findElement(By.id("login-password"));
		ele.sendKeys("TestCase0101");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();
		
		
	}
	
	public void flicSignUp() {
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://identity.flickr.com/sign-up");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"sign-up-first-name\"]"));
		ele.sendKeys("Maraz");
		
		ele = driver.findElement(By.id("sign-up-last-name"));
		ele.sendKeys("Islam");
		
		ele = driver.findElement(By.id("sign-up-age"));
		ele.sendKeys("20");
		
		ele = driver.findElement(By.id("sign-up-email"));
		ele.sendKeys("marazislam8@gmail.com");
		
		ele = driver.findElement(By.xpath("//*[@id=\"sign-up-password\"]"));
		ele.sendKeys("TestCase0101");
		
//		ele = driver.findElement(By.id("sign-up-recaptcha"));
//		ele.click();
		
//		WebElement iframeSwitch = driver.findElement(By.xpath("//*[@id=\"sign-up-recaptcha\"]/div/iframe"));
//		driver.switchTo().frame(iframeSwitch);
//		driver.findElement(By.xpath("//*[@id=\"sign-up-recaptcha\"]/div/div/div/iframe")).click();
		
		ele = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button"));
		ele.click();
		
	}

	public void flcrUpPhoto() {
		
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.flickr.com/photos/upload/");
		
		WebElement ele = driver.findElement(By.id("login-email"));
		ele.sendKeys("marazislam8@gmail.com");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();

		
		ele = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
		ele.sendKeys("TestCase0101");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();
		
		WebElement chosePhoto = driver.findElement(By.id("choose-photos-and-videos"));
		chosePhoto.sendKeys("C:\\Users\\S.M.Mohaimanul Islam\\Pictures\\Saved Pictures\\index.jpg");
		
		WebElement upbtn = driver.findElement(By.id("action-publish"));
		upbtn.click();
		
		WebElement uplode = driver.findElement(By.id("confirm-publish"));
		uplode.click();
		
		
	}
	
	public void flcrMail() {
			
			
			WebDriver driver = Base.getDriver();
			
			driver.get("https://www.flickr.com/mail");
			
			WebElement ele = driver.findElement(By.id("login-email"));
			ele.sendKeys("marazislam8@gmail.com");
			
			ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
			ele.click();

			
			ele = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
			ele.sendKeys("TestCase0101");
			
			ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
			ele.click();
			
			
			ele = driver.findElement(By.xpath("//*[@id=\"yui_3_16_0_1_1638948516020_603\"]"));
			ele.click();
			
		
	}
	
	public void flcrSetting() {
		
		
		WebDriver driver = Base.getDriver();
		
		driver.get("https://flickr.com/account");
		
		WebElement ele = driver.findElement(By.id("login-email"));
		ele.sendKeys("marazislam8@gmail.com");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();

		
		ele = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
		ele.sendKeys("TestCase0101");
		
		ele = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		ele.click();
		
		
		ele = driver.findElement(By.cssSelector("#yui_3_16_0_1_1638956436226_1547"));
		ele.click();
		
	
}
	
}
