package test;

import org.testng.annotations.Test;

public class Test1 {

	@Test(groups = {"sanity"})
	public void method1()
	{
		System.out.println("Inside method1");
	}
	@Test(groups = {"Regression"})
	public void method2()
	{
		System.out.println("Inside method2");
	}
}
