package com.main;

public class App {

	public static void main(String[] args) {
		
		CalculationView theView = new CalculationView();
		CalculationModel theModel = new CalculationModel();
		
		CalculationController theController = new CalculationController(theView, theModel);
		
		theView.setLocationRelativeTo(null);
		theView.setVisible(true);
	}

}
