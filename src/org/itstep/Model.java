package org.itstep;

import java.util.Scanner;

public class Model {
	private String word;
	private double number;

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Model(String word, double number) {
		super();
		this.word = word;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(String word) {
		if (word.equals("Mariia")) { // Èìÿ ñòóäåíòà
			String correctWord = word;
			return correctWord;
		} else {
			return null;
		}
	}

	public double inputWordByScaner2(double number) {
		if (number == 6.3) {
			double correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, double number) {
		return word1 + " " + number;
	}
}