package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("inside before test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("inside before method");
	}
	
	@Test
	public void method1()
	{
		System.out.println("Inside method1");
	}
	@Test
	public void method2()
	{
		System.out.println("Inside method2");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("inside after method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("inside after Test");
	}
	
}
