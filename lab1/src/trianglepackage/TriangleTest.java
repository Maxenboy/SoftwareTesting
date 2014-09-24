package trianglepackage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * TriangleTest for testing the Triangle class.
 * This template is used in the exercise phase 1.
 * Students should add relevant unit test cases related to the Triangle 
 * class to this class.
 */
public class TriangleTest extends TestCase
{
	private Triangle Triangle;

	/**
	 * Constructs a test case with the given name.
	 */
	public TriangleTest(String name)
	{
		super(name);
	}

	/** 
	 * Initializes common objects. The JUnit framework automatically invokes 
	 * this method before each test is run.
	 */
	protected void setUp()
	{
		Triangle = new Triangle(1, 1, 2);
	}

	/**
	 * Cleanup method. The JUnit framework automatically invokes
	 * this method after each test is run.
	 */
	protected void tearDown()
	{
		Triangle = null;
	}
	
	/**
	 * Test whether the triangle specified in the fixture (setUp) 
	 * is right-angled. 	
	 */
	
	public void testEC1(){
		assertTrue("Should return true for a equilateral triangle", Triangle.isEquilateral());
		assertEquals("Should return 'equilateral'","equilateral", Triangle.classify());
	}
	public void testEC2(){
		assertFalse("Should return false for a equilateral triangle", Triangle.isEquilateral());
	}
	public void testEC3(){
		assertTrue("Should return true for a isosceles triangle", Triangle.isIsosceles());
		assertEquals("Should return 'isosceles'","isosceles", Triangle.classify());
	}
	public void testEC4(){
		assertFalse("Should return false for a isosceles triangle", Triangle.isIsosceles());
	}
	public void testEC5(){
		assertTrue("Should return true for a right-angled triangle", Triangle.isRightAngled());
		assertEquals("Should return 'right-angled'", "right-angled", Triangle.classify());
	}
	public void testEC6(){
		assertFalse("Should return false for a right-angled triangle", Triangle.isRightAngled());
	}
	public void testEC7(){
		assertTrue("Should return true for a scalene,right-angled triangle", Triangle.isScalene());
		assertFalse("Should return false for a scalene,right-angled triangle",Triangle.isRightAngled());
		assertEquals("Should return 'scalene'", "scalene", Triangle.classify());
	}
	public void testEC8(){
		assertTrue("Should return true for a scalene,right-angled triangle", Triangle.isScalene());
		assertTrue("Should return true for a scalene,right-angled triangle",Triangle.isRightAngled());
		assertEquals("Should return 'scalene'", "scalene", Triangle.classify());
	}
	public void testEC9(){
		assertFalse("Should return false for a scalene triangle", Triangle.isScalene());
	}
	public void testEC10(){
		assertTrue("Should return true for a impossible triangle", Triangle.isImpossible());
		assertEquals("Should return 'impossible'", "impossible", Triangle.classify());
	}
	public void testEC11(){
		assertFalse("Should return false for a impossible triangle", Triangle.isImpossible());
	}
	


	/**
	 * Creates a test suite. You can use this if you have a hierarchy of 
	 * suites where a suite higher in the hierarchy can have 
	 * suite.addTest(TriangleTest.suite())
	 * @return a test suite 
	 */
	public static Test suite()
	{
		TestSuite suite = new TestSuite(TriangleTest.class);
		return suite;
	}

	/**
	 * Main function for starting the TestRunner.
	 * @param args no parameters required.
	 */
	public static void main(String args[])
	{
		String[] testCaseName = { TriangleTest.class.getName()};

		// chooses the userinterface

		// junit.textui.TestRunner.main(testCaseName);
		// junit.awtui.TestRunner.main(testCaseName);
		// junit.swingui.TestRunner.main(testCaseName);
	}
}
