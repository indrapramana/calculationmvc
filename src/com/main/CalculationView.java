package com.main;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculationView extends JFrame {
	
	private JTextField firstnumber = new JTextField(10);
	private JTextField secondnumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("x");
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculationView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 100);
		
		calcPanel.add(firstnumber);
		calcPanel.add(secondnumber);
		calcPanel.add(additionLabel);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstnumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondnumber.getText());
	}
	
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton) {
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
}
