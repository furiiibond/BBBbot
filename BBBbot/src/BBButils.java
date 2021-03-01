import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BBButils {
	
	 private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  
public BBButils() {
		super();
		init();
	    connect("LAPIERRE J-C");
		// TODO Auto-generated constructor stub
	}

public void sondage() {

	    
	    while (true) {
			while(driver.findElements(By.xpath("//div[@id=\'app\']/main/div/div/div[2]/div/button/span")).size()==0) {
				
			}
		    try {
				driver.findElement(By.xpath("//div[@id=\'app\']/main/div/div/div[2]/div/button/span")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

private void connect(String login) {
	driver.get("https://meet.univ-grenoble-alpes.fr/b/syl-yjh-gc6");
	driver.manage().window().setSize(new Dimension(1612, 871));
	driver.findElement(By.id("_b_syl-yjh-gc6_join_name")).sendKeys(login);
	driver.findElement(By.cssSelector(".btn-primary")).click();
	{
		while(driver.findElements(By.cssSelector(".icon-bbb-listen")).size()==0) {
			
		}
	  WebElement element = driver.findElement(By.cssSelector(".icon-bbb-listen"));
	  Actions builder = new Actions(driver);
	  builder.moveToElement(element).perform();
	}
	driver.findElement(By.cssSelector(".icon-bbb-listen")).click();
}

private void init() {
	driver = new ChromeDriver();
	js = (JavascriptExecutor) driver;
	vars = new HashMap<String, Object>();
}
}


