package selenium;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;



	public class Webdriver {

		public static void main(String[] args) {

			String browser = "chrome";
			WebDriver driver = null;

			if (browser.equals("chrome")) {
				System.setProperty("webDriver.chrome.driver","D:\\Workspace\\SeleniumJavaProject\\chromedriver");
				driver = new ChromeDriver();
			}
			if (browser.equals("Firefox")) {
				System.setProperty("webDriver.chrome.driver","D:\\Workspace\\SeleniumJavaProject\\geckodriver");
				driver = new FirefoxDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("Browser Open Successfully");

			driver.findElement(By.name("q")).sendKeys("Selenium Training");
			driver.findElement(By.className("gNO89b")).click();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate().refresh();
			driver.get("https://www.yahoo.com/");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.navigate().back();
			driver.navigate().forward();
			driver.quit();
		}

	
}

	