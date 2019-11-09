package org.cts.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Poo\\Desktop\\project\\projeect\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	

	   WebElement ms= driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
	   Actions art=new Actions(driver);
	   art.moveToElement(ms).perform();

}
	}
