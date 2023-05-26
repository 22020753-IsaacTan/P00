import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * isaac, 26 May 2023 11:34:51 am
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * isaac, 26 May 2023 11:34:51 am
 */

public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		System.out.println("check");
	}
	@Test
	public void testAdd() {
		int a = 1;
		int b = 1;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 2;
		assertEquals (expected, actual);
		}
	@Test
	public void testSubtract() {
		int a = 4;
		int b = 1;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3;
		assertEquals (expected, actual);
		}
	

	@Test
	public void testMultiply() {
		int a = 4;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 8;
		assertEquals (expected, actual);
		}
	@Test
	public void testDivide() {
		int a = 3;
		int b = 3;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 1;
		assertEquals (expected, actual);
		}




}
