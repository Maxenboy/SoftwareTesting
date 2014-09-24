package lab2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * TriangleTest for testing the Triangle class.
 * This template is used in the exercise phase 1.
 * Students should add relevant unit test cases related to the Triangle 
 * class to this class.
 */
public class NextDateTest extends TestCase
{
	private NextDate date;

	/**
	 * Constructs a test case with the given name.
	 */
	public NextDateTest(String name)
	{
		super(name);
	}

	/** 
	 * Initializes common objects. The JUnit framework automatically invokes 
	 * this method before each test is run.
	 */
	protected void setUp()
	{
		date = new NextDate(1, 1, 2);
	}

	/**
	 * Cleanup method. The JUnit framework automatically invokes
	 * this method after each test is run.
	 */
	protected void tearDown()
	{
		date = null;
	}
	
	/**
	 * Test whether the triangle specified in the fixture (setUp) 
	 * is right-angled. 	
	 */
	
	public void test1(){
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(1, 0, 2012));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(0, 0, 2012));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(13, 0, 2012));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(1, 0, 1800));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(1, 0, 2022));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(13, 0, 1800));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(13, 0, 2022));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(0, 0, 1800));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(0, 0, 2022));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(0, 1, 2012));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(13, 1, 2012));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(1, 1, 1800));
		assertEquals("Should return 'invalid Input Date'","invalid Input Date",date.run(1, 1, 2022));
		
	}
	
	public void test2(){
		assertEquals("Should return '3/13/2012'","3/13/2012",date.run(3, 12, 2012));
	}
	public void test3(){
		assertEquals("Should return '4/1/2012'","4/1/2012",date.run(3, 31, 2012));
	}
	public void test4(){
		assertEquals("Should return '4/30/2012'","4/30/2012",date.run(4, 29, 2012));
	}
	public void test5(){
		assertEquals("Should return '5/1/2012'","5/1/2012",date.run(4, 30, 2012));
	}
	public void test6(){
		assertEquals("Should return 'Invalid Input Date'","Invalid Input Date",date.run(4, 31, 2012));
	}
	public void test7(){
		assertEquals("Should return '12/31/2012'","12/31/2012",date.run(12, 30, 2012));
	}
	public void test8(){
		assertEquals("Should return 'Invalid Next Year'","Invalid Next Year",date.run(12, 31, 2021));
	}
	public void test9(){
		assertEquals("Should return '1/1/2013'","1/1/2013",date.run(12, 31, 2012));
	}
	public void test10(){
		assertEquals("Should return '2/28/2012'","2/28/2012",date.run(2, 27, 2012));
	}
	public void test11(){
		assertEquals("Should return '2/29/2012'","2/29/2012",date.run(2, 28, 2012));
	}
	public void test12(){
		assertEquals("Should return '3/1/2013'","3/1/2013",date.run(2, 28, 2013));
	}
	public void test13(){
		assertEquals("Should return '3/1/2012'","3/1/2012",date.run(2, 29, 2012));
	}
	public void test14(){
		assertEquals("Should return 'Invalid Input Date'","Invalid Input Date",date.run(2, 29, 2013));
	}
	public void test15(){
		assertEquals("Should return 'Invalid Input Date'","Invalid Input Date",date.run(2, 30, 2013));
	}
	public void test16(){
		assertEquals("Should return '7/31/2012'","7/31/2012",date.run(7, 30, 2012));
	}
	
	


	/**
	 * Creates a test suite. You can use this if you have a hierarchy of 
	 * suites where a suite higher in the hierarchy can have 
	 * suite.addTest(TriangleTest.suite())
	 * @return a test suite 
	 */
	public static Test suite()
	{
		TestSuite suite = new TestSuite(NextDateTest.class);
		return suite;
	}

	/**
	 * Main function for starting the TestRunner.
	 * @param args no parameters required.
	 */
	public static void main(String args[])
	{
		String[] testCaseName = { NextDateTest.class.getName()};

		// chooses the userinterface

		// junit.textui.TestRunner.main(testCaseName);
		// junit.awtui.TestRunner.main(testCaseName);
		// junit.swingui.TestRunner.main(testCaseName);
	}
}
