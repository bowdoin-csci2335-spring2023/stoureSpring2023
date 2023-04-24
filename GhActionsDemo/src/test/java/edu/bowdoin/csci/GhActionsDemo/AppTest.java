package edu.bowdoin.csci.GhActionsDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		App myApp = new App();
		Assertions.assertNotNull(myApp.sayHello("James"));
	}
}
