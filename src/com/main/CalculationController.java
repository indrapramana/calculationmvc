package com.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationController {
	
	private CalculationView theView;
	private CalculationModel theModel;
	
	public CalculationController(CalculationView theView, CalculationModel theModel) {
		this.theModel = theModel;
		this.theView = theView;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int firstNumber = 0, secondNumber = 0;	
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getCalculationValue());
			} catch(NumberFormatException e) {
				theView.displayErrorMessage("You need two integers");
			}
		}
		
	}
}
