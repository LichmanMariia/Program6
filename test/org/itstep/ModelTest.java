package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	@Test
	public void testInputWordByScaner1() {
		
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScaner1(word);
		assertEquals("Mariia", result);
	}

	@Test
	public void testInputWordByScaner11() {
		
		Model model = new Model();
		String word = "Vasiliy";
		String result = model.inputWordByScaner1(word);
		assertNull(result);
	}
	
	@Test
	public void testInputWordByScaner2() {
		
		Model model = new Model();
		double number = 6.3;
		double result = model.inputWordByScaner2(number);
		assertEquals(6, result, 3);
		
	}
	
	@Test
	public void testInputWordByScaner21() {
		
		Model model = new Model();
		double number = 6.2;
		double result = model.inputWordByScaner2(number);
		assertEquals(0, result, 0);
		
	}
	
	@Test
	public void testInputWordByScaner22() {
		
		Model model = new Model();
		double number = 7.4;
		double result = model.inputWordByScaner2(number);
		assertEquals(0, result, 0);
		
	}

	@Test
	public void testWriteSentence() {
		Model model = new Model();
		String word = "Mariia";
		double number = 6.3;
		String result = model.writeSentence(word, number);
		assertEquals("Mariia " + 6.3, result);
		
	}

}
