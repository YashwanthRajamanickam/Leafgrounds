package SeleniumJAVA;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();
		WebElement position = driver.findElement(By.id("position"));
		Point xyPoint = position.getLocation();
		int x = xyPoint.getX();
		int y = xyPoint.getY();
		System.out.println("XPOINT IS" + x);
		System.out.println("Ypoint is" + y);
		WebElement colour = driver.findElement(By.id("color"));
		System.out.println(colour.getCssValue("background-color"));
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println(height);
		System.out.println(width);

	}
}