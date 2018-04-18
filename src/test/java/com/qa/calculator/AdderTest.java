package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

	private Adder adder = new Adder();

	@Test
	public void test() {
		int expected = 4;
		int actual = adder.add(2, 2);
		Assert.assertEquals(expected, actual);
	}

}
