package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firstselenium {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver= new ChromeDriver();
		
		WebDriver driver=new EdgeDriver();
		
		/*driver.get("https://demo.opencart.com.gr/");
		boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		driver.findElement(By.linkText("Tablets")).click();
		Thread.sleep(7000);
		String actual_title=driver.getTitle();*/
		
//	System.out.println(actual_title);
	//System.out.println(logodisplaystatus);
	//	List<WebElement> headerlinks=driver.findElements(By.className("list-inline"));
		
	//System.out.println("number of headerlinks:" +headerlinks.size());

	
	List<WebElement> images=driver.findElements(By.tagName("img"));
	System.out.println("number of images:"+images.size());
	driver.close();
	}

}
