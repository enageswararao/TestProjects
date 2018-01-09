package SampleProjectForGIT.GITSampleProjectTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest {

	
	@BeforeTest public void init(){
		System.out.println("Before Test methods is init () ...");
	}

	@Test public void tc_001_TestCase1(){
		System.out.println("tc_001 TestCase1.......");
	}
	
	@Test public void tc_002_TestCase2(){
		System.out.println("tc_002 TestCase2.......");
	}
	@Test public void tc_003_TestCase3(){
		System.out.println("tc_002 TestCase2.......");
	}
	
	@Test public void tc_003_TestCase3(){
		System.out.println("tc_003 TestCase3.......");
	}
	@AfterTest public void close(){
		System.out.println("@AfterTest Close.......");
	}
}
