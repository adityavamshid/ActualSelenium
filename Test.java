package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\SeleniumJavaProject\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.com/");
		System.out.println("Browser opened successfully");
		chrome.findElement(By.name("q")).sendKeys("selenium");
		
		chrome.findElement(By.className("gNO89b")).click();
		System.out.println(chrome.getCurrentUrl());
		System.out.println(chrome.getTitle());
		chrome.navigate().refresh();
		chrome.get("https://www.yahoo.com/");
		chrome.navigate().back();
		chrome.navigate().forward();
		chrome.quit();
		
		
		
		
		

		
		
		
		
		

	}

}
