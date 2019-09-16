package test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class testHello {

	adder a = new adder();
	
//	public static void test1() {
//		hello h = new hello();
//	}
//
//	public static void testAdder() {
//
//		adder a = new adder();
//		int result = a.add(3, 5);
//		
//		assertresult asrt = new assertresult();
//		
//		asrt.assertResult(result,7);
//	}
//
//	public static void main(String[] args) {
//		testAdder();
//		
//	}
	@Test
	public void test11() {
		
		int result = a.add(3, 5);
		System.out.print(result);
//		assertEquals(8,result);
		
	}

	
}
