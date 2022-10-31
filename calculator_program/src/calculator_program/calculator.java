package calculator_program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField display;
	private JButton btnNum7;
	private JButton btnNum1;
	private JButton btnNum4;
	private JButton btnNum0;
	private JButton btnModule;
	private JButton btnClear;
	private JButton btnPlus;
	private JButton btnNum8;
	private JButton btnNum9;
	private JButton btnMinus;
	private JButton btnNum5;
	private JButton btnNum6;
	private JButton btnTimes;
	private JButton btnNum2;
	private JButton btnNum3;
	private JButton btnDivide;
	private JButton btnDecimal;
	private JButton btnPlusMinus;
	private JButton btnEquals;

	String operands, answer;
	double firstNum, secondNum, result; 
	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		  try {
	            //here you can put the selected theme class name in JTattoo
	            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(69, 69, 69));
		frame.setBounds(100, 100, 283, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setFont(new Font("Tahoma", Font.BOLD, 18));
		display.setBounds(20, 16, 229, 80);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton btnDelete = new JButton("\uF0D5");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String delete = null;
				
				if(display.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(display.getText());
					strB.deleteCharAt(display.getText().length() - 1);
					delete = strB.toString();
					display.setText(delete);
				}
			}
		});
		btnDelete.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnDelete.setBounds(20, 113, 58, 47);
		frame.getContentPane().add(btnDelete);
		
		btnNum7 = new JButton("7");
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum7.getText();
				display.setText(inputNum);
			}
		});
		btnNum7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum7.setBounds(20, 159, 58, 47);
		frame.getContentPane().add(btnNum7);
		
		btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum1.getText();
				display.setText(inputNum);
			}
		});
		btnNum1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum1.setBounds(20, 251, 58, 47);
		frame.getContentPane().add(btnNum1);
		
		btnNum4 = new JButton("4");
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum4.getText();
				display.setText(inputNum);
			}
		});
		btnNum4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum4.setBounds(20, 205, 58, 47);
		frame.getContentPane().add(btnNum4);
		
		btnNum0 = new JButton("0");
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum0.getText();
				display.setText(inputNum);
			}
		});
		btnNum0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum0.setBounds(20, 297, 58, 47);
		frame.getContentPane().add(btnNum0);
		
		btnModule = new JButton("%");
		btnModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText("");
				operands = "%";
			}
		});
		btnModule.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnModule.setBounds(134, 113, 58, 47);
		frame.getContentPane().add(btnModule);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(null);
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(77, 113, 58, 47);
		frame.getContentPane().add(btnClear);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText("");
				operands = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(191, 113, 58, 47);
		frame.getContentPane().add(btnPlus);
		
		btnNum8 = new JButton("8");
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum8.getText();
				display.setText(inputNum);
			}
		});
		btnNum8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum8.setBounds(77, 159, 58, 47);
		frame.getContentPane().add(btnNum8);
		
		btnNum9 = new JButton("9");
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum9.getText();
				display.setText(inputNum);
			}
		});
		btnNum9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum9.setBounds(134, 159, 58, 47);
		frame.getContentPane().add(btnNum9);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText("");
				operands = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(191, 159, 58, 47);
		frame.getContentPane().add(btnMinus);
		
		btnNum5 = new JButton("5");
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum5.getText();
				display.setText(inputNum);
			}
		});
		btnNum5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum5.setBounds(77, 205, 58, 47);
		frame.getContentPane().add(btnNum5);
		
		btnNum6 = new JButton("6");
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum6.getText();
				display.setText(inputNum);
			}
		});
		btnNum6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum6.setBounds(134, 205, 58, 47);
		frame.getContentPane().add(btnNum6);
		
		btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText("");
				operands = "*";
			}
		});
		btnTimes.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTimes.setBounds(191, 205, 58, 47);
		frame.getContentPane().add(btnTimes);
		
		btnNum2 = new JButton("2");
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum2.getText();
				display.setText(inputNum);
			}
		});
		btnNum2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum2.setBounds(77, 251, 58, 47);
		frame.getContentPane().add(btnNum2);
		
		btnNum3 = new JButton("3");
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputNum = display.getText() + btnNum3.getText();
				display.setText(inputNum);
			}
		});
		btnNum3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNum3.setBounds(134, 251, 58, 47);
		frame.getContentPane().add(btnNum3);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(display.getText());
				display.setText("");
				operands = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(191, 251, 58, 47);
		frame.getContentPane().add(btnDivide);
		
		btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! display.getText().contains(" . "))
					display.setText(display.getText() + btnDecimal.getText());
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDecimal.setBounds(77, 297, 58, 47);
		frame.getContentPane().add(btnDecimal);
		
		btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(display.getText()));
				ops = ops * (-1);
				display.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlusMinus.setBounds(134, 297, 58, 47);
		frame.getContentPane().add(btnPlusMinus);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(display.getText());
				if(operands == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if(operands == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if(operands == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if(operands == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if(operands == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
					
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(191, 297, 58, 47);
		frame.getContentPane().add(btnEquals);
	}
}
