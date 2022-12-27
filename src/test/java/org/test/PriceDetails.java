package org.test;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceDetails {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\Locators\\\\Browser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement txtuser=driver.findElement(By.xpath(""));
		
		int li=Integer.parseInt(s);
		System.out.println(li);
		
		List<String> product=new LinkedList<String>();
		product.add("Iphone 11");
		product.add("Iphone 12");
		product.add("Iphone 13");
		product.add("Iphone 14");
		
		List<Integer> price=new LinkedList<>();
		price.add(60000);
		price.add(90000);
		price.add(70000);
		price.add(80000);
		System.out.println(price);
		
		//ascending
		// collection.sort(price);
	//	System.out.println(price);
		//reverse
		Collections.reverse(price);
		System.out.println(price);
		Collections.checkedSortedMap(price, Collections. reverseOrder());
		System.out.println(price);
		
		System.out.println(Collections.max(price));
		System.out.println(Collections.min(price));
	
		for(int i=0;i<price.size();i++);
		System.out.println(product.get(i)+"===="+price.get(i));
	}
			
	}
	
}