package org.acme;

import org.junit.Test;

public class MyTest {
	@Test public void aTest(){
		System.out.println(System.getProperties());

		System.out.println(System.getenv());
	}
}