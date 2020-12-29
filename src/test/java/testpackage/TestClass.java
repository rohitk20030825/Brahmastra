package testpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {

	
	@BeforeTest
	public void initiate() {
		System.out.println("This is going to initiate the project");
	}
	
	@Test
	public void testMethod1()
	{
		System.out.println("Hello World Program");
	}
	
	
	@AfterTest
	public void cleanup() {
		System.out.println("This is going to clean up the residue");
	}
	
}
