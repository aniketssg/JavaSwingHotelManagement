package com.swing.HotelManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Hotel {

	private JFrame frame;
	private JTextField textField;
	double f1;
	double f2;
	double res;
	String ans;
	String operations;
	private JTextField txtBreakfast;
	private JTextField txtLunch;
	private JTextField txtDinner;
	private JTextField txtDrinks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1625, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel receiptCalPanel = new JPanel();
		receiptCalPanel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		receiptCalPanel.setBounds(26, 81, 477, 654);
		frame.getContentPane().add(receiptCalPanel);
		receiptCalPanel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 457, 634);
		receiptCalPanel.add(tabbedPane);
		
		JPanel panelCalculator = new JPanel();
		tabbedPane.addTab("Calculator", null, panelCalculator, null);
		panelCalculator.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 50));
		textField.setColumns(10);
		textField.setBounds(10, 10, 432, 79);
		panelCalculator.add(textField);
		
		//////////////////////////COLUMN 1///////////////////////////////
		
		/////////////////////////////////////////////////////////////////
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b7.getText();
				textField.setText(val);
				
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 50));
		b7.setBounds(10, 93, 108, 126);
		panelCalculator.add(b7);
		
/////////////////////////////////////////////////////////////////
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b4.getText();
				textField.setText(val);
				
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 50));
		b4.setBounds(10, 219, 108, 126);
		panelCalculator.add(b4);
		
/////////////////////////////////////////////////////////////////
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b1.getText();
				textField.setText(val);
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 50));
		b1.setBounds(10, 345, 108, 126);
		panelCalculator.add(b1);
		
/////////////////////////////////////////////////////////////////
		
		JButton bclear = new JButton("C");
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
			}
		});
		bclear.setFont(new Font("Tahoma", Font.BOLD, 50));
		bclear.setBounds(10, 471, 108, 126);
		panelCalculator.add(bclear);
		
		////////////////////////////////COLUMN 2/////////////////////////
		
/////////////////////////////////////////////////////////////////
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b0.getText();
				textField.setText(val);
				
			}
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 50));
		b0.setBounds(118, 471, 108, 126);
		panelCalculator.add(b0);
		
/////////////////////////////////////////////////////////////////
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b2.getText();
				textField.setText(val);
				
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 50));
		b2.setBounds(118, 345, 108, 126);
		panelCalculator.add(b2);
		
/////////////////////////////////////////////////////////////////
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b5.getText();
				textField.setText(val);
				
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 50));
		b5.setBounds(118, 219, 108, 126);
		panelCalculator.add(b5);
		
/////////////////////////////////////////////////////////////////
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b8.getText();
				textField.setText(val);
				
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 50));
		b8.setBounds(118, 93, 108, 126);
		panelCalculator.add(b8);
		
		///////////////////////COLUMN 3//////////////////////////////////////
		
/////////////////////////////////////////////////////////////////
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b9.getText();
				textField.setText(val);
				
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 50));
		b9.setBounds(226, 93, 108, 126);
		panelCalculator.add(b9);
		
/////////////////////////////////////////////////////////////////
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b6.getText();
				textField.setText(val);
				
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 50));
		b6.setBounds(226, 219, 108, 126);
		panelCalculator.add(b6);
		
/////////////////////////////////////////////////////////////////
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String val = textField.getText() + b3.getText();
				textField.setText(val);
				
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 50));
		b3.setBounds(226, 345, 108, 126);
		panelCalculator.add(b3);
		
/////////////////////////////////////////////////////////////////
		
		JButton beq = new JButton("=");
		beq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
				f2 = Double.parseDouble(textField.getText());
				
				if(operations == "+") {
					res = f1 + f2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(operations == "-") {
					res = f1 - f2;
					ans = String.format("%.2f",res);
					textField.setText(ans);
				}
				else if (operations == "*") {
					res = f1 * f2;
					ans = String.format("%.2f",res);
					textField.setText(ans);
				}
				else {
					res = f1 / f2;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				
			}
		});
		beq.setFont(new Font("Tahoma", Font.BOLD, 50));
		beq.setBounds(226, 471, 108, 126);
		panelCalculator.add(beq);
		
		//////////////////////////////COLUMN 4/////////////////////////////////
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
				
			}
		});
		bdiv.setFont(new Font("Tahoma", Font.BOLD, 50));
		bdiv.setBounds(334, 471, 108, 126);
		panelCalculator.add(bdiv);
		
         ////////////////////////////////////////////////////////////////////////////////////
		
		JButton bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				
			}
		});
		bmul.setFont(new Font("Tahoma", Font.BOLD, 50));
		bmul.setBounds(334, 345, 108, 126);
		panelCalculator.add(bmul);
		
        ////////////////////////////////////////////////////////////////////////////////
		
		JButton bsub = new JButton("-");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				
			}
		});
		bsub.setFont(new Font("Tahoma", Font.BOLD, 50));
		bsub.setBounds(334, 219, 108, 126);
		panelCalculator.add(bsub);
		
/////////////////////////////////////////////////////////////////
		
		JButton badd = new JButton("+");
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		badd.setFont(new Font("Tahoma", Font.BOLD, 50));
		badd.setBounds(334, 93, 108, 126);
		panelCalculator.add(badd);
		
		///////////////////////CALCULATOR ENDS////////////////////////////////
		
		///////////////////////////////RECEIPT////////////////////////////////
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextArea txtAreaReceipt = new JTextArea();
		txtAreaReceipt.setBounds(0, 0, 452, 607);
		panel_4.add(txtAreaReceipt);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 457, 634);
		receiptCalPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panelTotalBill = new JPanel();
		panelTotalBill.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelTotalBill.setBounds(523, 426, 983, 309);
		frame.getContentPane().add(panelTotalBill);
		panelTotalBill.setLayout(null);
		
		//////////////////////////////COSTING AND TOTALS SECTION//////////////////
		
		JLabel lblTMeal = new JLabel("TOTAL COST OF MEAL");
		lblTMeal.setForeground(new Color(128, 0, 255));
		lblTMeal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTMeal.setBounds(23, 28, 204, 30);
		panelTotalBill.add(lblTMeal);
		
		JLabel lblTDrinks = new JLabel("TOTAL COST OF DRINK");
		lblTDrinks.setForeground(new Color(128, 0, 255));
		lblTDrinks.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTDrinks.setBounds(23, 98, 204, 30);
		panelTotalBill.add(lblTDrinks);
		
		JLabel lblTDelivery = new JLabel("COST OF DELIVERY");
		lblTDelivery.setForeground(new Color(128, 0, 255));
		lblTDelivery.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTDelivery.setBounds(23, 168, 204, 30);
		panelTotalBill.add(lblTDelivery);
		
		JLabel lblTRoom = new JLabel("COST OF ROOM");
		lblTRoom.setForeground(new Color(128, 0, 255));
		lblTRoom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTRoom.setBounds(23, 238, 204, 30);
		panelTotalBill.add(lblTRoom);
		
		JLabel lblTMealVal = new JLabel("");
		lblTMealVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblTMealVal.setBounds(237, 28, 235, 38);
		panelTotalBill.add(lblTMealVal);
		
		JLabel lblTDrinksVal = new JLabel("");
		lblTDrinksVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblTDrinksVal.setBounds(237, 98, 235, 38);
		panelTotalBill.add(lblTDrinksVal);
		
		JLabel lblTDeliveryVal = new JLabel("");
		lblTDeliveryVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblTDeliveryVal.setBounds(237, 168, 235, 38);
		panelTotalBill.add(lblTDeliveryVal);
		
		JLabel lblTRoomVal = new JLabel("");
		lblTRoomVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblTRoomVal.setBounds(237, 238, 235, 38);
		panelTotalBill.add(lblTRoomVal);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(529, 10, 2, 289);
		panelTotalBill.add(separator_2);
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setForeground(new Color(128, 0, 255));
		lblTax.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTax.setBounds(560, 62, 119, 30);
		panelTotalBill.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("SUB TOTAL");
		lblSubTotal.setForeground(new Color(128, 0, 255));
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblSubTotal.setBounds(560, 137, 119, 30);
		panelTotalBill.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setForeground(new Color(128, 0, 255));
		lblTotal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblTotal.setBounds(560, 212, 119, 30);
		panelTotalBill.add(lblTotal);
		
		JLabel lblTaxVal = new JLabel("");
		lblTaxVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblTaxVal.setBounds(694, 62, 235, 38);
		panelTotalBill.add(lblTaxVal);
		
		JLabel lblSubTotalVal = new JLabel("");
		lblSubTotalVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblSubTotalVal.setBounds(694, 137, 235, 38);
		panelTotalBill.add(lblSubTotalVal);
		
		JLabel lblTotalVal = new JLabel("");
		lblTotalVal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblTotalVal.setBounds(694, 212, 235, 38);
		panelTotalBill.add(lblTotalVal);
		
		JPanel panelMenuCurrency = new JPanel();
		panelMenuCurrency.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panelMenuCurrency.setBounds(523, 81, 983, 324);
		frame.getContentPane().add(panelMenuCurrency);
		panelMenuCurrency.setLayout(null);
		
		/////////////////////////////MEAL////////////////////////////////////
		
		JLabel lblMeal = new JLabel("MEAL");
		lblMeal.setForeground(new Color(128, 0, 255));
		lblMeal.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblMeal.setBounds(35, 25, 119, 30);
		panelMenuCurrency.add(lblMeal);
		
		/////////////////////////////QUANTITY/////////////////////////////////
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setForeground(new Color(128, 0, 255));
		lblQuantity.setBackground(new Color(240, 240, 240));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblQuantity.setBounds(187, 25, 119, 30);
		panelMenuCurrency.add(lblQuantity);
		
		/////////////////////////PRICE///////////////////////////////////////////
		
		JLabel lblPrice = new JLabel("PRICE ($)");
		lblPrice.setForeground(new Color(128, 0, 255));
		lblPrice.setBackground(new Color(240, 240, 240));
		lblPrice.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPrice.setBounds(366, 25, 119, 30);
		panelMenuCurrency.add(lblPrice);
		
		////////////////////////////////BREAKFAST////////////////////////////////
		
		JLabel lblBreakfast = new JLabel("Breakfast");
		lblBreakfast.setForeground(new Color(128, 0, 255));
		lblBreakfast.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblBreakfast.setBounds(35, 65, 119, 30);
		panelMenuCurrency.add(lblBreakfast);
		
		//////////////////////////////LUNCH///////////////////////////////////////
		
		JLabel lblLunch = new JLabel("Lunch");
		lblLunch.setForeground(new Color(128, 0, 255));
		lblLunch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblLunch.setBounds(35, 105, 119, 30);
		panelMenuCurrency.add(lblLunch);
		
		///////////////////////////////DINNER///////////////////////////////////////
		
		JLabel lblDinner = new JLabel("Dinner");
		lblDinner.setForeground(new Color(128, 0, 255));
		lblDinner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblDinner.setBounds(35, 145, 119, 30);
		panelMenuCurrency.add(lblDinner);
		
		////////////////////////////CURRENCY CONVERTOR///////////////////////////////////////////////////////
		
		JLabel lblCurr = new JLabel("CURRENCY CONVERTER");
		lblCurr.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurr.setForeground(new Color(128, 0, 255));
		lblCurr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCurr.setBounds(579, 25, 353, 30);
		panelMenuCurrency.add(lblCurr);
		
		//////////////////////////////////COUNTRY COMBOBOX////////////////////////////
				
		JComboBox cbCountry = new JComboBox();
		cbCountry.setForeground(new Color(128, 0, 0));
		cbCountry.setFont(new Font("Tahoma", Font.BOLD, 20));
		cbCountry.setModel(new DefaultComboBoxModel(new String[] {"COUNTRY", "India", "USA", "Japan", "China", "Russia", "Indonesia"}));
		cbCountry.setBounds(623, 72, 270, 38);
		panelMenuCurrency.add(cbCountry);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		
		
		JLabel lblCurrConvert = new JLabel("");
		lblCurrConvert.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblCurrConvert.setBounds(638, 160, 235, 38);
		panelMenuCurrency.add(lblCurrConvert);

		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double dollar = Double.parseDouble(lblTotalVal.getText());
				
				if(cbCountry.getSelectedItem().equals("India")) {
					
					String ruppee = String.format("%.2f Ruppee", dollar * 83.45);
					lblCurrConvert.setText(ruppee);
					
				}
				
				if(cbCountry.getSelectedItem().equals("USA")) {
					
					String doll = String.format("%.2f Dollar", dollar);
					lblCurrConvert.setText(doll);
					
				}
				if(cbCountry.getSelectedItem().equals("Japan")) {
					
					String yen = String.format("%.2f Yen", dollar * 151.71);
					lblCurrConvert.setText(yen);
					
				}
				
				if(cbCountry.getSelectedItem().equals("China")) {
					
					String yuan = String.format("%.2f Yuan", dollar * 7.24);
					lblCurrConvert.setText(yuan);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Russia")) {
					
					String ruble = String.format("%.2f Ruble", dollar * 92.48);
					lblCurrConvert.setText(ruble);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Indonesia")) {
					
					String rupiah = String.format("%.2f Rupiah", dollar * 15896.70);
					lblCurrConvert.setText(rupiah);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Country")) {
					
					lblCurrConvert.setText(null);
				}
				

				
			}
		});
		btnConvert.setForeground(Color.WHITE);
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnConvert.setBackground(Color.BLACK);
		btnConvert.setBounds(618, 262, 138, 30);
		panelMenuCurrency.add(btnConvert);
		
		JButton btnResetCurr = new JButton("RESET");
		btnResetCurr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cbCountry.setSelectedItem("Country");
				lblCurrConvert.setText(null);
				
			}
		});
		btnResetCurr.setForeground(Color.WHITE);
		btnResetCurr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResetCurr.setBackground(Color.BLACK);
		btnResetCurr.setBounds(755, 262, 138, 30);
		panelMenuCurrency.add(btnResetCurr);
		
		///////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////PRICING FOR THE VALUABLES//////////
		
		JLabel lblPriceBreakfast = new JLabel("10$");
		lblPriceBreakfast.setForeground(new Color(128, 0, 255));
		lblPriceBreakfast.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPriceBreakfast.setBounds(366, 65, 119, 30);
		panelMenuCurrency.add(lblPriceBreakfast);
		
		JLabel lblPriceLunch = new JLabel("15$");
		lblPriceLunch.setForeground(new Color(128, 0, 255));
		lblPriceLunch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPriceLunch.setBounds(366, 105, 119, 30);
		panelMenuCurrency.add(lblPriceLunch);
		
		JLabel lblPriceDinner = new JLabel("20$");
		lblPriceDinner.setForeground(new Color(128, 0, 255));
		lblPriceDinner.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblPriceDinner.setBounds(366, 145, 119, 30);
		panelMenuCurrency.add(lblPriceDinner);
		
		///////////////////////////////FOR THE QUANTITY OF THR VARIOUS THINGS///////////
		
		txtBreakfast = new JTextField();
		txtBreakfast.setBounds(187, 65, 96, 30);
		panelMenuCurrency.add(txtBreakfast);
		txtBreakfast.setColumns(10);
		
		txtLunch = new JTextField();
		txtLunch.setColumns(10);
		txtLunch.setBounds(187, 108, 96, 30);
		panelMenuCurrency.add(txtLunch);
		
		txtDinner = new JTextField();
		txtDinner.setColumns(10);
		txtDinner.setBounds(187, 148, 96, 30);
		panelMenuCurrency.add(txtDinner);
		
		txtDrinks = new JTextField();
		txtDrinks.setColumns(10);
		txtDrinks.setBounds(187, 197, 96, 30);
		panelMenuCurrency.add(txtDrinks);
		
		//////////////////////////SELECTION OF THE SOFT DRINKS//////////////////////////
		
		JComboBox cbDrinks = new JComboBox();
		cbDrinks.setForeground(new Color(128, 0, 0));
		cbDrinks.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		cbDrinks.setModel(new DefaultComboBoxModel(new String[] {"Soft Drinks", "Pepsi", "Sprite", "Dew", "Coke", "Water"}));
		cbDrinks.setBounds(35, 199, 119, 28);
		panelMenuCurrency.add(cbDrinks);
		
		
		////////////////////////////////////VERTICAL SEPERATOR////////////////////////////
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(528, 10, 2, 304);
		panelMenuCurrency.add(separator);
		
		//////////////////////////////////////////////////////////////////////////////////
		
		//////////////////////////DELIVERY CHECKBOX////////////////////////////////
		
		JCheckBox checkDelivery = new JCheckBox("DELIVERY");
		checkDelivery.setForeground(new Color(128, 0, 255));
		checkDelivery.setBounds(133, 282, 93, 21);
		panelMenuCurrency.add(checkDelivery);
		
		////////////////////////////////////////////////////////////////////////////
		
		
		JLabel lblPriceDrinks = new JLabel("-");
		lblPriceDrinks.setForeground(new Color(128, 0, 255));
		lblPriceDrinks.setFont(new Font("Tahoma", Font.PLAIN, 47));
		lblPriceDrinks.setBounds(366, 197, 57, 30);
		panelMenuCurrency.add(lblPriceDrinks);
		
		////////////////////////HORIZONTAL SEPERATOR/////////////////////////////////////
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 237, 520, 2);
		panelMenuCurrency.add(separator_1);
		
		/////////////////////////////////////////////////////////////////////////////////
		
		/////////ROOMS SELECTION AND THE CHECKBOXES WITH SUBMIT AND RESET BUTTON/////////////
		
		JComboBox cbRoom = new JComboBox();
		cbRoom.setForeground(new Color(128, 0, 0));
		cbRoom.setModel(new DefaultComboBoxModel(new String[] {"Room Type", "Deluxe", "Normal", "Primary", "Dorm"}));
		cbRoom.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		cbRoom.setBounds(35, 246, 119, 30);
		panelMenuCurrency.add(cbRoom);
		
		JCheckBox checkTax = new JCheckBox("TAX");
		checkTax.setForeground(new Color(128, 0, 255));
		checkTax.setBounds(35, 282, 93, 21);
		panelMenuCurrency.add(checkTax);
		
		
		///////////TOTAL VALUE FOR THE BILL//////////////////
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBreakfast.setText(null);
				txtLunch.setText(null);
				txtDinner.setText(null);
				cbDrinks.setSelectedItem("Soft Drinks");
				cbRoom.setSelectedItem("Room Type");
				checkTax.setSelected(false);
				checkDelivery.setSelected(false);
				cbCountry.setSelectedItem("Country");
				lblCurrConvert.setText(null);
				lblTMealVal.setText(null);
				lblTDrinksVal.setText(null);
				lblTRoomVal.setText(null);
				lblTDeliveryVal.setText(null);
				lblSubTotalVal.setText(null);
				lblTotalVal.setText(null);
				lblTaxVal.setText(null);
				txtDrinks.setText(null);
				
				
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(0, 0, 0));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(400, 273, 118, 30);
		panelMenuCurrency.add(btnReset);
		
		
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				////////////////////////DRINKS TOTAL////////////////////
				
				double Drinks = Double.parseDouble(txtDrinks.getText());
				double Pepsi = 0, Sprite = 0, Coke = 0, Dew = 0, Water = 0;
				
				
				if(cbDrinks.getSelectedItem().equals("Pepsi")) {
					
					Pepsi = 1.5 * Drinks;
					String valPepsi = String.format("%.2f", Pepsi);
					lblTDrinksVal.setText(valPepsi);
					
				}
				
				if(cbDrinks.getSelectedItem().equals("Sprite")) {
					
					Sprite = 1.25 * Drinks;
					String valSprite = String.format("%.2f", Sprite);
					lblTDrinksVal.setText(valSprite);
					
				}
				
				if(cbDrinks.getSelectedItem().equals("Dew")) {
					
					Dew = 1.75 * Drinks;
					String valDew = String.format("%.2f", Dew);
					lblTDrinksVal.setText(valDew);
					
				}
				
				if(cbDrinks.getSelectedItem().equals("Coke")) {
					
					Coke = 1.00 * Drinks;
					String valCoke = String.format("%.2f", Coke);
					lblTDrinksVal.setText(valCoke);
					
				}
				
				if(cbDrinks.getSelectedItem().equals("Water")) {
					
					Water = 0.5 * Drinks;
					String valWater = String.format("%.2f", Water);
					lblTDrinksVal.setText(valWater);
					
				}
				
				if(cbDrinks.getSelectedItem().equals("Soft Drinks")) {
					
					lblTDrinksVal.setText("0.00");
					
				}
				
				/////////////////////////////////////////////////////
				
				/////////////////////MEAL TOTAL//////////////////////

				
				double Breakfast = Double.parseDouble(txtBreakfast.getText());
				double valBreakfast = 10.00;
				double totBreakfast;
				totBreakfast = (Breakfast * valBreakfast);
				String finBreakfast = String.format("%.2f", totBreakfast);
				lblTMealVal.setText(finBreakfast);
				
				
				double Lunch = Double.parseDouble(txtLunch.getText());
				double valLunch = 15.00;
				double totLunch;
				totLunch = (Lunch * valLunch);
				String finLunch = String.format("%.2f", totLunch + totBreakfast);
				lblTMealVal.setText(finLunch);
				
				
				double Dinner = Double.parseDouble(txtDinner.getText());
				double valDinner = 20.00;
				double totDinner;
				totDinner = (Dinner * valDinner);
				String finDinner = String.format("%.2f", totDinner + totLunch + totBreakfast);
				lblTMealVal.setText(finDinner);
				
				////////////////////////////////////////////////////////////////////////////////
				
				////////////////////////DELIVERY TOTAL//////////////////////////////////////////
				
				double vDelivery = 7.50;
				if(checkDelivery.isSelected()) {
					
					String totDelivery = String.format("%.2f", vDelivery);
					lblTDeliveryVal.setText(totDelivery);
					
				}
				else {
					
					lblTDeliveryVal.setText("0.00");
					
				}
				
				////////////////////////////////////////////////////////////////////////////////////
				
				/////////////////////TOTAL OF ROOMS///////////////////////////////////////
				
				double Deluxe = 80.00;
				double Normal = 60.00;
				double Primary = 35.00;
				double Dorm = 15.00;
				double totRoom = 0.00;
				
				if(cbRoom.getSelectedItem().equals("Deluxe")) {
					
					totRoom += Deluxe;
					String totDeluxe = String.format("%.2f", Deluxe);
					lblTRoomVal.setText(totDeluxe);
					
				}
				
				if(cbRoom.getSelectedItem().equals("Normal")) {
					
					totRoom += Normal;
					String totNormal = String.format("%.2f", Normal);
					lblTRoomVal.setText(totNormal);
					
				}
				
				if(cbRoom.getSelectedItem().equals("Primary")) {
					
					totRoom += Primary;
					String totPrimary = String.format("%.2f", Primary);
					lblTRoomVal.setText(totPrimary);
					
				}
				
				if(cbRoom.getSelectedItem().equals("Dorm")) {
					
					totRoom += Dorm;
					String totDorm = String.format("%.2f", Dorm);
					lblTRoomVal.setText(totDorm);
					
				}
				
				if(cbRoom.getSelectedItem().equals("Room Type")) {
					
					lblTRoomVal.setText("0.00");
					
				}
				
				///////////////////////////////////////////////////////////////////////
				
				////////////////////////////TOTAL FOR TAXES////////////////////////////
				
				double MealTax = Double.parseDouble(lblTMealVal.getText());
				double DrinksTax  = Double.parseDouble(lblTDrinksVal.getText());
				double RoomTax = Double.parseDouble(lblTRoomVal.getText());
				
				double totTax = ((MealTax + DrinksTax + RoomTax)*15)/100 ;
				
				if(checkTax.isSelected()) {
					
					String valtax = String.format("%.2f", totTax);
					lblTaxVal.setText(valtax);
					
				}
				else {
					
					lblTaxVal.setText("0.00");
					
				}
				
				///////////////////////////////////////////////////////////////////////
				
				/////////////////////////SUBTOTAL/////////////////////////////////////
				
				double subTot = totRoom + vDelivery + totDinner + totBreakfast + totLunch + Dew + Pepsi +
						Coke + Sprite + Water;
				
				String valSubTotal = String.format("%.2f", subTot);
				lblSubTotalVal.setText(valSubTotal);
				
				//////////////////////////////////////////////////////////////////////
				
				double totVal = subTot + totTax;
				
				String totBill = String.format("%.2f", totVal);
				lblTotalVal.setText(totBill);
				
				
			}
		});
		
		
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(0, 0, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBounds(283, 273, 118, 30);
		panelMenuCurrency.add(btnSubmit);
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
		
	
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setBackground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 29, 1480, 48);
		frame.getContentPane().add(lblNewLabel);
		
		//////////////////////////MENU BAR//////////////////////////////////////////////
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(17, -24, 1140, 22);
		frame.getContentPane().add(menuBar);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 1530, 33);
		frame.getContentPane().add(menuBar_1);
		
		
		
		JMenu mnNewMenu = new JMenu("FILE");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar_1.add(mnNewMenu);
		
		
		
		JMenu mnNewMenu_5 = new JMenu("NEW");
		mnNewMenu.add(mnNewMenu_5);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("RECEIPT");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Invoice1 = Double.parseDouble(txtBreakfast.getText());
				double Invoice2 = Double.parseDouble(txtLunch.getText());
				double Invoice3 = Double.parseDouble(txtDinner.getText());
				double Invoice4 = Double.parseDouble(txtDrinks.getText());
				
				txtAreaReceipt.append("\t\nHotel Receipt:\n"
						+ "\nBreakFast ::\t\t" +Invoice1
						+ "\nLunch     ::\t\t" +Invoice2
						+ "\nDinner    ::\t\t" +Invoice3
						+ "\nSoft Drink::\t\t" +Invoice4
						+ "\nTOTAL     ::\t\t" +lblTotalVal.getText()
						+ "\n\nThank You and Visit Again");
				
			}
		});
		mnNewMenu_5.add(mntmNewMenuItem);
		
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("RESET");
		mnNewMenu_5.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBreakfast.setText(null);
				txtLunch.setText(null);
				txtDinner.setText(null);
				cbDrinks.setSelectedItem("Soft Drinks");
				cbRoom.setSelectedItem("Room Type");
				checkTax.setSelected(false);
				checkDelivery.setSelected(false);
				cbCountry.setSelectedItem("Country");
				lblCurrConvert.setText(null);
				lblTMealVal.setText(null);
				lblTDrinksVal.setText(null);
				lblTRoomVal.setText(null);
				lblTDeliveryVal.setText(null);
				lblSubTotalVal.setText(null);
				lblTotalVal.setText(null);
				lblTaxVal.setText(null);
				txtDrinks.setText(null);
				
				
			}
		});
		
		
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("CONVERT");
		mnNewMenu.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double dollar = Double.parseDouble(lblTotalVal.getText());
				
				if(cbCountry.getSelectedItem().equals("India")) {
					
					String ruppee = String.format("%.2f Ruppee", dollar * 83.45);
					lblCurrConvert.setText(ruppee);
					
				}
				
				if(cbCountry.getSelectedItem().equals("USA")) {
					
					String doll = String.format("%.2f Dollar", dollar);
					lblCurrConvert.setText(doll);
					
				}
				if(cbCountry.getSelectedItem().equals("Japan")) {
					
					String yen = String.format("%.2f Yen", dollar * 151.71);
					lblCurrConvert.setText(yen);
					
				}
				
				if(cbCountry.getSelectedItem().equals("China")) {
					
					String yuan = String.format("%.2f Yuan", dollar * 7.24);
					lblCurrConvert.setText(yuan);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Russia")) {
					
					String ruble = String.format("%.2f Ruble", dollar * 92.48);
					lblCurrConvert.setText(ruble);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Indonesia")) {
					
					String rupiah = String.format("%.2f Rupiah", dollar * 15896.70);
					lblCurrConvert.setText(rupiah);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Country")) {
					
					lblCurrConvert.setText(null);
				}
				
				JOptionPane.showMessageDialog(null, lblCurrConvert);
				
			}
		});
		
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("TOTAL");
		mnNewMenu.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, lblTotalVal);
				
			}
		});
		
		
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("RECEIPT");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Invoice1 = Double.parseDouble(txtBreakfast.getText());
				double Invoice2 = Double.parseDouble(txtLunch.getText());
				double Invoice3 = Double.parseDouble(txtDinner.getText());
				double Invoice4 = Double.parseDouble(txtDrinks.getText());
				
				txtAreaReceipt.append("\t\nHotel Receipt:\n"
						+ "\nBreakFast ::\t\t" +Invoice1
						+ "\nLunch     ::\t\t" +Invoice2
						+ "\nDinner    ::\t\t" +Invoice3
						+ "\nSoft Drink::\t\t" +Invoice4
						+ "\nTOTAL     ::\t\t" +lblTotalVal.getText()
						+ "\n\nThank You and Visit Again");
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("EXIT");
		mntmNewMenuItem_5.setForeground(new Color(255, 0, 0));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		}
		);
		mnNewMenu.add(mntmNewMenuItem_5);
		
		
		
		JMenu mnNewMenu_1 = new JMenu("CONVERT");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar_1.add(mnNewMenu_1);
		mnNewMenu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double dollar = Double.parseDouble(lblTotalVal.getText());
				
				if(cbCountry.getSelectedItem().equals("India")) {
					
					String ruppee = String.format("%.2f Ruppee", dollar * 83.45);
					lblCurrConvert.setText(ruppee);
					
				}
				
				if(cbCountry.getSelectedItem().equals("USA")) {
					
					String doll = String.format("%.2f Dollar", dollar);
					lblCurrConvert.setText(doll);
					
				}
				if(cbCountry.getSelectedItem().equals("Japan")) {
					
					String yen = String.format("%.2f Yen", dollar * 151.71);
					lblCurrConvert.setText(yen);
					
				}
				
				if(cbCountry.getSelectedItem().equals("China")) {
					
					String yuan = String.format("%.2f Yuan", dollar * 7.24);
					lblCurrConvert.setText(yuan);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Russia")) {
					
					String ruble = String.format("%.2f Ruble", dollar * 92.48);
					lblCurrConvert.setText(ruble);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Indonesia")) {
					
					String rupiah = String.format("%.2f Rupiah", dollar * 15896.70);
					lblCurrConvert.setText(rupiah);
					
				}
				
				if(cbCountry.getSelectedItem().equals("Country")) {
					
					lblCurrConvert.setText(null);
				}
				
				JOptionPane.showMessageDialog(null, lblCurrConvert);
				
			}
		});
		
		
		
		JMenu mnNewMenu_2 = new JMenu("TOTAL");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar_1.add(mnNewMenu_2);
		mnNewMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, lblTotalVal);
				
			}
		});

		
		JMenu mnNewMenu_3 = new JMenu("RECEIPT");
		mnNewMenu_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Invoice1 = Double.parseDouble(txtBreakfast.getText());
				double Invoice2 = Double.parseDouble(txtLunch.getText());
				double Invoice3 = Double.parseDouble(txtDinner.getText());
				double Invoice4 = Double.parseDouble(txtDrinks.getText());
				
				txtAreaReceipt.append("\t\nHotel Receipt:\n"
						+ "\nBreakFast ::\t\t" +Invoice1
						+ "\nLunch     ::\t\t" +Invoice2
						+ "\nDinner    ::\t\t" +Invoice3
						+ "\nSoft Drink::\t\t" +Invoice4
						+ "\nTOTAL     ::\t\t" +lblTotalVal.getText()
						+ "\n\nThank You and Visit Again");
				
				
			}
		});
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar_1.add(mnNewMenu_3);
		
		
		
		JMenu mnNewMenu_4 = new JMenu("EXIT");
		mnNewMenu_4.setForeground(new Color(255, 0, 0));
		mnNewMenu_4.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent e) {
				
				System.exit(0);
				
			}
			
			@Override
			public void menuDeselected(MenuEvent e) {
				
				System.exit(0);
				
			}
			
			@Override
			public void menuCanceled(MenuEvent e) {
				
				System.exit(0);
				
			}
		});
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar_1.add(mnNewMenu_4);
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////
	}
}
