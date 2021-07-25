package finaledureka.pro.certpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://100.27.0.255:8085");
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		driver.findElement(By.id("About Us")).click();
		String test = driver.findElement(By.id("PID-ab2-pg")).getText();
		String test2 = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry.";
		boolean a = test2.equals(test);
		driver.close();
		System.out.println("########Test Successful#####");
	}

}
