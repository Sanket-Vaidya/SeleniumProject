package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Restaurant {
	
	WebDriverWait wait;
	
	@FindBy(xpath="(//div[@class='_1HEuF'])[1]")
	private WebElement firstRestaurant;
	
	
	
	public Restaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		
	}
	
	public void clickRestaurant() {
		wait.until(ExpectedConditions.visibilityOf(firstRestaurant));
		firstRestaurant.click();
	}
	

}
