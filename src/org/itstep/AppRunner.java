package org.itstep;

import org.itstep.Controller;
import org.itstep.Model;
import org.itstep.View;

public class AppRunner {

	public static void main(String[] args) {
		String word = "Mariia";   // Èìÿ ñòóäåíòà
		double number = 6.3;	// Çíà÷åíèå èç äèàïàçîíà(ïî íîìåðó ïðîãðàìû)
		Model model = new Model();
		model.setWord(word);
		model.setNumber(number);
		View view = new View();
		Controller controller = new Controller(view, model);
		
		controller.enteringSentence();

	}

}