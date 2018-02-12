package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loggi {
	static String url;
	static String uname;
	static String pwd;
	static String subbtn;
	static String fromstn;
	static String tostn;
	static String jnydate;
	static String bookbtn;
	static String trn3a;
	static String link;
	static String psngr1name;
	static String psngr1age;
	static String psngr1g;
	static String psngr1bp;
	static String jlink;
	@Test
	  public void a() {
		  Properties props= new Properties();
		  try {
			props.load(new FileInputStream("C:\\Users\\Dilip\\eclipse-workspace\\SeleniumProject\\src\\Utilities\\object.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   url=props.getProperty("url");
		    uname=props.getProperty("unametext");
		    pwd=props.getProperty("upwdtext");
		    subbtn=props.getProperty("subbtn");
		    fromstn=props.getProperty("fromstn");
		    tostn=props.getProperty("tostn");
		    jnydate=props.getProperty("jnydate");
		    bookbtn=props.getProperty("bookbtn");
		    trn3a=props.getProperty("trn3a");
		    link=props.getProperty("link");
		    psngr1name=props.getProperty("psngr1name");
		    psngr1age=props.getProperty("psngr1age");
		    psngr1g=props.getProperty("psngr1g");
		    psngr1bp=props.getProperty("psngr1bp");
		    jlink=props.getProperty("jlink");
		}  	
	
  /*@Test
  public String f() {
	  Properties props= new Properties();
	  try {
		props.load(new FileInputStream("C:\\Users\\Dilip\\eclipse-workspace\\SeleniumProject\\src\\Utilities\\object.properties"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return url=props.getProperty("url");
	   uname=props.getProperty("unametext");
	    pwd=props.getProperty("upwdtext");
	}  */
	
	/* Execution code starts here*/
	WebDriver driver;
	
	 @Test
	  public void b() throws InterruptedException {
		 
		  System.setProperty("chromedriver", "G:\\neeedHDDtobackup\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  driver.findElement(By.id(uname)).sendKeys("dilipduke");;
		  driver.findElement(By.name(pwd)).sendKeys("Duke@123");
		  Thread.sleep(8000);
		  driver.findElement(By.id(subbtn)).click();
		  driver.findElement(By.id(fromstn)).sendKeys("CHENNAI CENTRAL - MAS");
		  driver.findElement(By.id(tostn)).sendKeys("HYDERABAD DECAN - HYB");
		  driver.findElement(By.id(jnydate)).sendKeys("12-12-2017");
		  driver.findElement(By.id(bookbtn)).click();
		  driver.findElement(By.xpath(trn3a)).click();
		  Thread.sleep(5000);
		  driver.findElement(By.linkText(link)).click();
		  driver.findElement(By.xpath(psngr1name)).sendKeys("testing");
		  driver.findElement(By.xpath(psngr1age)).sendKeys("24");
		  driver.findElement(By.xpath(psngr1g)).click();
		  driver.findElement(By.xpath(psngr1bp)).click();
		  driver.findElement(By.linkText(jlink)).click();
		  
		  
	
  }
}

