package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondclass {
   public static void main(String[] args) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://google.com");
	   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
	   if(allInputElements.size() != 0) 
	   {
		   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
			
	   }
   }
}