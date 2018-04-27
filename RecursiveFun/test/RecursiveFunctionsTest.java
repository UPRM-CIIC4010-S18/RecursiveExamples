import static org.junit.Assert.*;

import org.junit.Test;

public class RecursiveFunctionsTest {

	@Test
	public void testFactorial() {
		assertEquals(1, RecursiveFunctions.factorial(0));
		assertEquals(1, RecursiveFunctions.factorial(1));
		assertEquals(24, RecursiveFunctions.factorial(4));
		assertEquals(120, RecursiveFunctions.factorial(5));
		//assertEquals(1, RecursiveFunctions.factorial(50));
	}
	
	@Test
	public void testPalindrome() {
		assertTrue(RecursiveFunctions.isPalindrome(""));
		assertTrue(RecursiveFunctions.isPalindrome("B"));
		assertTrue(RecursiveFunctions.isPalindrome("radar"));
		assertFalse(RecursiveFunctions.isPalindrome("Bienve"));
	}
	
	@Test
	public void testFibonacci() {
		assertEquals(0, RecursiveFunctions.fibonacci(0));
		assertEquals(1, RecursiveFunctions.fibonacci(1));
		assertEquals(2, RecursiveFunctions.fibonacci(3));
		assertEquals(55, RecursiveFunctions.fibonacci(10));
		//assertEquals(0, RecursiveFunctions.fibonacci(50));		
	}
	
	@Test
	public void testFibonacci2() {
		assertEquals(0, RecursiveFunctions.fibonacci(0, 1, 0));
		assertEquals(1, RecursiveFunctions.fibonacci(1, 1, 0));
		assertEquals(2, RecursiveFunctions.fibonacci(3, 1, 0));
		assertEquals(55, RecursiveFunctions.fibonacci(10, 1, 0));
		assertEquals(12586269025L, RecursiveFunctions.fibonacci(50, 1, 0));		
	}
	
	@Test
	public void testFibonacci3() {
		assertEquals(0, RecursiveFunctions.fiboIter(0));
		assertEquals(1, RecursiveFunctions.fiboIter(1));
		assertEquals(2, RecursiveFunctions.fiboIter(3));
		assertEquals(55, RecursiveFunctions.fiboIter(10));
		assertEquals(12586269025L, RecursiveFunctions.fiboIter(50));		
	}
	

	
//	@Test
//	public void testPalindrome2() {
//		assertTrue(RecursiveFunctions.isPalindrome("",0,-1));
//		assertTrue(RecursiveFunctions.isPalindrome("B",0, 0));
//		assertTrue(RecursiveFunctions.isPalindrome("radar", 0, 4));
//		assertFalse(RecursiveFunctions.isPalindrome("Bienve"));
//	}

}
