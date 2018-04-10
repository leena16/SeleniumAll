import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//driver.switchTo().frame("IF1");
		string str=driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div[1]/p[2]/span/em")).getText();
		


		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		for( int i=0;i<=size;i++) {
			driver.switchTo().frame(i);
			if()
		}
		
	}

}
