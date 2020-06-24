package samResturant;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class SamResturant {

	private JFrame frame;
	private JTextField txtChiken;
	private JTextField txtChickennMatooke;
	private JTextField txtBeans;
	private JTextField txtMuwogo;
	private JTextField textField_4;
	private JTextField txtCalculator;
	private JTextField txtReciept;
	private JTextField txtQty;
	private JTextField txtCConverter;
	
	double[] i = new double[5];
	

	double US_dollar = 2500;
	double Kenya  = 500;
	double Rwanda = 100;
	double Burundi = 200;
	double Tanzania = 300;
	protected JButton btnConvert;
	private JTextField txtCConvert;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SamResturant window = new SamResturant();
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
	public SamResturant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 955, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(55, 85, 331, 246);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChicken = new JLabel("Chicken");
		lblChicken.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblChicken.setBounds(10, 32, 78, 14);
		panel.add(lblChicken);
		
		JLabel lblChickenNMattoke = new JLabel("Chicken n Matooke");
		lblChickenNMattoke.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblChickenNMattoke.setBounds(10, 67, 145, 14);
		panel.add(lblChickenNMattoke);
		
		JLabel lblBeans = new JLabel("Beans");
		lblBeans.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblBeans.setBounds(10, 103, 78, 14);
		panel.add(lblBeans);
		
		JLabel lblMuwogo = new JLabel("Muwogo");
		lblMuwogo.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMuwogo.setBounds(10, 128, 78, 21);
		panel.add(lblMuwogo);
		
		txtChiken = new JTextField();
		txtChiken.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtChiken.setBounds(164, 29, 136, 20);
		panel.add(txtChiken);
		txtChiken.setColumns(10);
		
		txtChickennMatooke = new JTextField();
		txtChickennMatooke.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtChickennMatooke.setColumns(10);
		txtChickennMatooke.setBounds(164, 64, 136, 20);
		panel.add(txtChickennMatooke);
		
		txtBeans = new JTextField();
		txtBeans.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtBeans.setColumns(10);
		txtBeans.setBounds(164, 100, 136, 20);
		panel.add(txtBeans);
		
		txtMuwogo = new JTextField();
		txtMuwogo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtMuwogo.setColumns(10);
		txtMuwogo.setBounds(164, 128, 136, 20);
		panel.add(txtMuwogo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Home delivery");
		chckbxNewCheckBox.setBounds(20, 216, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDrinks.setBounds(20, 162, 87, 14);
		panel.add(lblDrinks);
		
		JComboBox cmbDrinks = new JComboBox();
		cmbDrinks.setBounds(10, 187, 159, 22);
		panel.add(cmbDrinks);
		cmbDrinks.addItem("Fanta");
		cmbDrinks.addItem("Stoney");
		cmbDrinks.addItem("Pepsi");
		cmbDrinks.addItem("Coke");
		cmbDrinks.addItem("Juice");
		cmbDrinks.setSelectedItem(null);
		
		JLabel lblNewLabel = new JLabel("QTY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(208, 162, 48, 14);
		panel.add(lblNewLabel);
		
		txtQty = new JTextField();
		txtQty.setBounds(190, 188, 131, 20);
		panel.add(txtQty);
		txtQty.setColumns(10);
		
		JCheckBox cTax = new JCheckBox("Tax");
		cTax.setBounds(203, 216, 97, 23);
		panel.add(cTax);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(396, 85, 230, 246);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox cmbCConveter = new JComboBox();
		cmbCConveter.setBounds(33, 75, 159, 22);
		panel_1.add(cmbCConveter);
		
		cmbCConveter.addItem("US_dollar");
		cmbCConveter.addItem("Kenya");
		cmbCConveter.addItem("Tanzania");
		cmbCConveter.addItem("Rwanda");
		cmbCConveter.addItem("Burundi");
		cmbCConveter.setSelectedItem(null);
		
		txtCConverter = new JTextField();
		txtCConverter.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtCConverter.setColumns(10);
		txtCConverter.setBounds(33, 108, 159, 43);
		panel_1.add(txtCConverter);
		
		JLabel lblCconvet = new JLabel("");
		lblCconvet.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCconvet.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCconvet.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCconvet.setBounds(33, 170, 159, 20);
		panel_1.add(lblCconvet);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCConverter.setText(null);
				lblCconvet.setText(null);
				
				
				
			}
		});
		btnClose.setBounds(10, 212, 89, 23);
		panel_1.add(btnClose);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double UgShs= Double.parseDouble(txtCConverter.getText());
				
				if(cmbCConveter.getSelectedItem().equals("US_dollar")) {
					String cConvert = String.format("%.2f", UgShs*US_dollar);
					lblCconvet.setText(cConvert);
				}
					if(cmbCConveter.getSelectedItem().equals("Kenya")) {
						String cConvert = String.format("%.2f", UgShs*Kenya);
						lblCconvet.setText(cConvert);
					}
					
					if(cmbCConveter.getSelectedItem().equals("Tanzania")) {	
						String cConvert = String.format("%.2f", UgShs*Tanzania);
						lblCconvet.setText(cConvert);
					}
					
					if(cmbCConveter.getSelectedItem().equals("Rwanda")) {
						String cConvert = String.format("%.2f", UgShs*Rwanda);
						lblCconvet.setText(cConvert);
					}
					
					if(cmbCConveter.getSelectedItem().equals("Burundi")) {
						String cConvert = String.format("%.2f", UgShs*Burundi);
						lblCconvet.setText(cConvert);
					}
					
					
					
					
					
					
				
				
	
			
				
				
				
				
				
			}
		});
		btnConvert.setBounds(131, 212, 89, 23);
		panel_1.add(btnConvert);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCurrencyConverter.setBounds(41, 25, 159, 39);
		panel_1.add(lblCurrencyConverter);
		cmbDrinks.addItem("Choose one");
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1.setBounds(396, 342, 230, 119);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTax.setBounds(10, 22, 89, 14);
		panel_1_1.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSubTotal.setBounds(10, 57, 102, 14);
		panel_1_1.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotal.setBounds(10, 93, 89, 14);
		panel_1_1.add(lblTotal);
		
		JLabel lbltotal = new JLabel("");
		lbltotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbltotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbltotal.setBounds(100, 87, 120, 20);
		panel_1_1.add(lbltotal);
		
		JLabel lblSubtotal = new JLabel("");
		lblSubtotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblSubtotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblSubtotal.setBounds(100, 57, 120, 20);
		panel_1_1.add(lblSubtotal);
		
		JLabel lbltax = new JLabel("");
		lbltax.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltax.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lbltax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbltax.setBounds(100, 22, 120, 20);
		panel_1_1.add(lbltax);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_2.setBounds(55, 342, 331, 119);
		frame.getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblCostofDrinks = new JLabel("Cost of Drinks");
		lblCostofDrinks.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCostofDrinks.setBounds(10, 23, 117, 14);
		panel_1_2.add(lblCostofDrinks);
		
		JLabel lblCostofMeal = new JLabel("Cost of Meal");
		lblCostofMeal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCostofMeal.setBounds(10, 58, 145, 14);
		panel_1_2.add(lblCostofMeal);
		
		JLabel lblcostOfdelivery = new JLabel("Cost of delivery");
		lblcostOfdelivery.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblcostOfdelivery.setBounds(10, 94, 127, 14);
		panel_1_2.add(lblcostOfdelivery);
		
		JLabel lblCOD = new JLabel("");
		lblCOD.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCOD.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCOD.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCOD.setBounds(165, 25, 120, 20);
		panel_1_2.add(lblCOD);
		
		JLabel lblCostofMeals = new JLabel("");
		lblCostofMeals.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostofMeals.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCostofMeals.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostofMeals.setBounds(165, 52, 120, 20);
		panel_1_2.add(lblCostofMeals);
		
		JLabel lblCostfDelivery = new JLabel("");
		lblCostfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCostfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblCostfDelivery.setBounds(165, 88, 120, 20);
		panel_1_2.add(lblCostfDelivery);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1_1.setBounds(55, 472, 865, 86);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(522, 35, 89, 23);
		panel_1_1_1.add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChiken.setText(null);
				txtMuwogo.setText(null);
				txtChickennMatooke.setText(null);
				txtBeans.setText(null);
				txtQty.setText(null);
				txtCConverter.setText(null);
				txtReciept.setText(null);
				lblCOD.setText(null);
				lblCostofMeals.setText(null);
				lblCostfDelivery.setText(null);
				lbltax.setText(null);
				lblSubtotal.setText(null);
				lbltotal.setText(null);
				lblCconvet.setText(null);
				  
			}
		});
		btnReset.setBounds(353, 35, 89, 23);
		panel_1_1_1.add(btnReset);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double QTY = Double.parseDouble(txtChiken.getText());
				double QTY1 = Double.parseDouble(txtChickennMatooke.getText());
				double QTY2 = Double.parseDouble(txtBeans.getText());
				double QTY3 = Double.parseDouble(txtMuwogo.getText());
				
				
			}
		});
		btnReciept.setBounds(200, 35, 89, 23);
		panel_1_1_1.add(btnReciept);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 double Chicken = Double.parseDouble(txtChiken.getText()); 
				 double iChicken = 3000;
				 double Chiken;
				 Chiken = (Chicken*iChicken);
				 String pMeal = String.format("%.2f", Chiken);
				 lblCostofMeals.setText(pMeal);
				 
				 double ChickennMatooke = Double.parseDouble(txtChickennMatooke.getText());
				 double iChickennMatooke = 5000;
				 ChickennMatooke = (ChickennMatooke * iChickennMatooke);
				 String cMeal = String.format("%.2f", ChickennMatooke);
				 lblCostofMeals.setText(cMeal);
				 
				 double Muwogo = Double.parseDouble(txtMuwogo.getText());
				 double iMuwogo = 1000;
				 Muwogo = (Muwogo*iMuwogo);
				 String muwo = String.format("%.2f", Muwogo);
				 lblCostofMeals.setText(muwo);
				 
				 double Beans = Double.parseDouble(txtBeans.getText());
				 double iBeans = 2500;
				 Beans =(Beans * iBeans);
				 String beans = String.format("%.2f",Beans);
				 lblCostofMeals.setText(beans);
				 
				 //.............................................Delivery..................................................//
				 double iDelivery = 1500;
				 if(chckbxNewCheckBox.isSelected()) {
					 String pDelivery = String.format("%.2f", iDelivery);
					 lblCostfDelivery.setText(pDelivery);
			 
				 }
				 else {
					 lblCostfDelivery.setText("0");
				 }
				 
				 //...........................................Drinks....................................................
				 
				 double Drinks = Double.parseDouble(txtQty.getText());
				 double Fanta=1000* Drinks;
				 double Coke = 1500 * Drinks;
				 double Stoney = 2000* Drinks;
				 double Pepsi = 500 * Drinks;
				 double Juice = 5000 * Drinks;
				 
				 if(cmbDrinks.getSelectedItem().equals("Fanta")) {
					 String fanta = String.format("%.2f",Fanta);
					 lblCOD.setText(fanta);
					 
				 }
				 if(cmbDrinks.getSelectedItem().equals("Coke")) {
					 
					 String coke = String.format("%.2f",Coke);
					 lblCOD.setText(coke);
					 
				 }
				 if(cmbDrinks.getSelectedItem().equals("Stoney")) {
					 
					 String stoney = String.format("%.2f",Stoney);
					 lblCOD.setText(stoney);
				 }
				 if(cmbDrinks.getSelectedItem().equals("Pepsi")) {
					 
					 String pepsi = String.format("%.2f", Pepsi);
					 lblCOD.setText(pepsi);
					 
				 }
				 
				 if(cmbDrinks.getSelectedItem().equals("Juice")) {
					 
					String juice = String.format("%.2f", Juice);
					lblCOD.setText(juice);
					}
				if(cmbDrinks.getSelectedItem().equals("Select a Drink")) {
					lblCOD.setText("0");
					
				}
				 
			//...................................... TaxRate.............................................
			
				double cTotal1 = Double.parseDouble(lblCOD.getText());
				double cTotal2 = Double.parseDouble(lblCostofMeals.getText());
				double cTotal3 = Double.parseDouble(lblCostfDelivery.getText());
				double AllTotal = (cTotal1 +cTotal2+cTotal3)/100;
				if(cTax.isSelected()) {
					
					String iTotal = String.format("%.2f",AllTotal);
					lbltax.setText(iTotal);
					
				}
			
	//..................................................Total.................................................
				
				double cTotal4 = Double.parseDouble(lblTax.getText());
				
				double Subtotal = (cTotal1 + cTotal2 +cTotal3);
				String subtotal = String.format(".2f",Subtotal);
				lblSubtotal.setText(subtotal);
				
				double allTotal = (cTotal1 + cTotal2 +cTotal3);
				String ialltotal = String.format(".2f",allTotal);
				lbltotal.setText(ialltotal);
				
				
				String iTaxTotal = String.format(".2f",Subtotal);
				cTax.setText(subtotal);
				 
				 
				 
				 
				 
			}
		});
		btnTotal.setBounds(49, 35, 89, 23);
		panel_1_1_1.add(btnTotal);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(694, -112, 247, 48);
		frame.getContentPane().add(textField_4);
		
		JButton btn9_1 = new JButton("9");
		btn9_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn9_1.setBounds(694, -53, 61, 49);
		frame.getContentPane().add(btn9_1);
		
		JButton btn8_1 = new JButton("8");
		btn8_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn8_1.setBounds(756, -53, 61, 49);
		frame.getContentPane().add(btn8_1);
		
		JButton btn7_1 = new JButton("7");
		btn7_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn7_1.setBounds(818, -53, 61, 49);
		frame.getContentPane().add(btn7_1);
		
		JButton btnAdd_1 = new JButton("+");
		btnAdd_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnAdd_1.setBounds(880, -53, 61, 49);
		frame.getContentPane().add(btnAdd_1);
		
		JLabel lblLoanManagementSystem = new JLabel("SAM RESTURANT SYSTEM");
		lblLoanManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblLoanManagementSystem.setBounds(80, 21, 779, 53);
		frame.getContentPane().add(lblLoanManagementSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(630, 85, 299, 373);
		frame.getContentPane().add(panel_2);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 276, 354);
		panel_2.add(tabbedPane);
		
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("calculator", null, panel_3, null);
		panel_3.setLayout(null);
		
		txtCalculator = new JTextField();
		txtCalculator.setColumns(10);
		txtCalculator.setBounds(0, 11, 247, 48);
		panel_3.add(txtCalculator);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn9.setBounds(0, 70, 61, 49);
		panel_3.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn8.setBounds(62, 70, 61, 49);
		panel_3.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn7.setBounds(124, 70, 61, 49);
		panel_3.add(btn7);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnAdd.setBounds(186, 70, 61, 49);
		panel_3.add(btnAdd);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn6.setBounds(0, 119, 61, 49);
		panel_3.add(btn6);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn4.setBounds(124, 119, 61, 49);
		panel_3.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn5.setBounds(62, 119, 61, 49);
		panel_3.add(btn5);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSubtraction.setBounds(186, 119, 61, 49);
		panel_3.add(btnSubtraction);
		
		JButton btnMultipulication = new JButton("*");
		btnMultipulication.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnMultipulication.setBounds(186, 168, 61, 49);
		panel_3.add(btnMultipulication);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn1.setBounds(124, 168, 61, 49);
		panel_3.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn2.setBounds(62, 168, 61, 49);
		panel_3.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn3.setBounds(0, 168, 61, 49);
		panel_3.add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btn0.setBounds(0, 217, 61, 49);
		panel_3.add(btn0);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDivision.setBounds(62, 217, 61, 49);
		panel_3.add(btnDivision);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnEquals.setBounds(124, 217, 61, 49);
		panel_3.add(btnEquals);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnClear.setBounds(186, 217, 61, 49);
		panel_3.add(btnClear);
		
		JButton btnPM = new JButton("+-");
		btnPM.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnPM.setBounds(186, 261, 61, 49);
		panel_3.add(btnPM);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDot.setBounds(124, 261, 61, 49);
		panel_3.add(btnDot);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBackspace.setBounds(62, 261, 61, 49);
		panel_3.add(btnBackspace);
		
		JButton btnNewButton_16 = new JButton("%");
		btnNewButton_16.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_16.setBounds(0, 261, 61, 49);
		panel_3.add(btnNewButton_16);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Reciept", null, panel_4, null);
		panel_4.setLayout(null);
		
		txtReciept = new JTextField();
		txtReciept.setBounds(10, 11, 251, 304);
		panel_4.add(txtReciept);
		txtReciept.setColumns(10);
	}
}
