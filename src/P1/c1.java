package P1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) throws InterruptedException {
						// TODO Auto-generated method stub
						System.setProperty("webdriver.chrome.driver", "C:/Users/mssil/eclipse-workspace/J1/lib1/chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						driver.get("http://qatechhub.com");
						System.out.println("Hi");
						System.out.println("Hello text");
						driver.close();
					}

				}



