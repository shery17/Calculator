import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUICalculator implements ActionListener{
	
	int sum = 0;
	String operation;
	String displayString = "";
	JTextArea displayBox = new JTextArea();
	
	public static void main(String[] args) {
		
		GUICalculator calculator = new GUICalculator();
		calculator.GUI();
	}
	
	private void GUI()
	{
		JFrame frame = new JFrame();
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,420);
		frame.setLayout(new BorderLayout());
		
		JPanel numberPanel = new JPanel();
		JPanel displayPanel = new JPanel();
		
		frame.add(numberPanel, BorderLayout.CENTER);
		frame.add(displayPanel, BorderLayout.NORTH);
		
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton equalButton = new JButton("=");
		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		JButton multiplyButton = new JButton("x");
		JButton divideButton = new JButton("/");
		JButton clearButton = new JButton("Clear");
		
		setFont(button0);
		setFont(button1);
		setFont(button2);
		setFont(button3);
		setFont(button4);
		setFont(button5);
		setFont(button6);
		setFont(button7);
		setFont(button8);
		setFont(button9);
		setFont(equalButton);
		setFont(plusButton);
		setFont(minusButton);
		setFont(multiplyButton);
		setFont(divideButton);
		setFont(clearButton);
		displayBox.setFont(new Font("Arial", Font.PLAIN, 40));
		
		
		numberPanel.setLayout(new GridLayout(4,4));
		numberPanel.add(button1);
		numberPanel.add(button2);
		numberPanel.add(button3);
		numberPanel.add(button4);
		numberPanel.add(button5);
		numberPanel.add(button6);
		numberPanel.add(button7);
		numberPanel.add(button8);
		numberPanel.add(button9);
		numberPanel.add(button0);
		numberPanel.add(plusButton);
		numberPanel.add(minusButton);
		numberPanel.add(multiplyButton);
		numberPanel.add(divideButton);
		numberPanel.add(equalButton);
		numberPanel.add(clearButton);
		
		displayPanel.add(displayBox);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "1";
				updateDisplay();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "2";
				updateDisplay();
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "3";
				updateDisplay();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "4";
				updateDisplay();
			}
		});
		
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "5";
				updateDisplay();
			}
		});
		
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "6";
				updateDisplay();
			}
		});
		
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "7";
				updateDisplay();
			}
		});
		
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "8";
				updateDisplay();
			}
		});
		
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "9";
				updateDisplay();
			}
		});
		
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = displayString + "0";
				updateDisplay();
			}
		});
		
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = Integer.parseInt(displayString);
				displayString = "";
				operation = "+";
				displayBox.setText(operation);
				
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = Integer.parseInt(displayString);
				displayString = "";
				operation = "-";
				displayBox.setText(operation);
				
			}
		});
		
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = Integer.parseInt(displayString);
				displayString = "";
				operation = "x";
				displayBox.setText(operation);
				
			}
		});
		
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = Integer.parseInt(displayString);
				displayString = "";
				operation = "/";
				displayBox.setText(operation);
				
			}
		});
		
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayString = "";
				operation = "";
				updateDisplay();
				
			}
		});
		
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(operation)
				{
				case "+":
					int secondNumber = Integer.parseInt(displayString);
					sum = sum + secondNumber;
					displayString = sum + "";
					updateDisplay();
					break;					
				case "-":
					int secondNumber2 = Integer.parseInt(displayString);
					sum = sum - secondNumber2;
					displayString = sum + "";
					updateDisplay();
					break;
				case "x":
					int secondNumber3 = Integer.parseInt(displayString);
					sum = sum * secondNumber3;
					displayString = sum + "";
					updateDisplay();
					break;
				case "/":
					int secondNumber4 = Integer.parseInt(displayString);
					sum = sum / secondNumber4;
					displayString = sum + "";
					updateDisplay();
					break;
				}			
			}
		});
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	private void updateDisplay()
	{
		displayBox.setText(displayString);
	}
	
	private void setFont(JButton button)
	{
		button.setFont(new Font("Arial", Font.PLAIN, 20));
	}

}
