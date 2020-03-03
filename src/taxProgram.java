import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class taxProgram extends JFrame {

	private JPanel contentPane;
	private JTextField txtGrossPay;
	private JTextField txtDependents;
	private JTextField txtGrossPayR;
	private JTextField txtFedTax;
	private JTextField txtSSTax;
	private JTextField txtMedTax;
	private JTextField txtNetPay;
	private JComboBox  cmbMS;
	private JComboBox  cmbPP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					taxProgram frame = new taxProgram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public taxProgram() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrosspay = new JLabel("Gross Pay");//This is the label in the GUI for Gross Pay.
		lblGrosspay.setBounds(12, 48, 56, 16);
		contentPane.add(lblGrosspay);
		
		JLabel lblDependents = new JLabel("Dependents");//This is the label in the GUI for Dependents.
		lblDependents.setBounds(12, 97, 83, 16);
		contentPane.add(lblDependents);
		
		JLabel lblMaritalStatus = new JLabel("Marital Status");//This is the label in the GUI for Marital Status.
		lblMaritalStatus.setBounds(12, 149, 83, 16);
		contentPane.add(lblMaritalStatus);
		
		JLabel lblPayPeriod = new JLabel("Pay Period");//This is the label in the GUI for Pay Period.
		lblPayPeriod.setBounds(12, 208, 83, 16);
		contentPane.add(lblPayPeriod);
		
		txtGrossPay = new JTextField();//This is the textbox where the user inputs Gross Pay.
		txtGrossPay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGrossPay.setText("0.00");//Will default to 0.00 value when nothing is inputted by user.
		txtGrossPay.setBounds(128, 45, 116, 22);
		contentPane.add(txtGrossPay);
		txtGrossPay.setColumns(10);
		
		txtDependents = new JTextField();//This is the textbox where the user inputs Dependents.
		txtDependents.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDependents.setText("0");//Will default to 0 value when nothing is inputted by user.
		txtDependents.setBounds(128, 94, 116, 22);
		contentPane.add(txtDependents);
		txtDependents.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate"); //Calculate button when pressed by the user is going to execute the calculate funciton.
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate(); //Calculate function is where all the math equations are taking place.
			}
		});
		btnCalculate.setBounds(92, 307, 97, 34);
		contentPane.add(btnCalculate);
		
		JLabel lblGPR = new JLabel("Gross Pay");//This is the label in the GUI for Gross Pay Results on the right side.
		lblGPR.setBounds(483, 48, 56, 16);
		contentPane.add(lblGPR);
		
		JLabel lblFedTax = new JLabel("Federal Tax");//This is the label in the GUI for Federal Tax.
		lblFedTax.setBounds(483, 97, 83, 16);
		contentPane.add(lblFedTax);
		
		JLabel lblSSTax = new JLabel("Soc.Sec. Tax");//This is the label in the GUI for Social Security Tax.
		lblSSTax.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSSTax.setBounds(483, 149, 75, 16);
		contentPane.add(lblSSTax);
		
		JLabel lblMedTax = new JLabel("Medicare Tax");//This is the label in the GUI for Medicare Tax.
		lblMedTax.setBounds(483, 208, 83, 16);
		contentPane.add(lblMedTax);
		
		JLabel lblNetPay = new JLabel("Net Pay");//This is the label in the GUI for Net Pay.
		lblNetPay.setBounds(483, 258, 56, 16);
		contentPane.add(lblNetPay);
		
		txtGrossPayR = new JTextField();//This is the textbox where the result after calculate function is executed will display Gross Pay.
		txtGrossPayR.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGrossPayR.setText("0.00"); //Will default to 0.00 value when nothing is inputted by user.
		txtGrossPayR.setBounds(596, 45, 116, 22);
		contentPane.add(txtGrossPayR);
		txtGrossPayR.setColumns(10);
		
		txtFedTax = new JTextField();//This is the textbox where the result after calculate function is executed will display Federal Tax.
		txtFedTax.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFedTax.setText("0.00");//Will default to 0.00 value when nothing is inputted by user.
		txtFedTax.setBounds(596, 94, 116, 22);
		contentPane.add(txtFedTax);
		txtFedTax.setColumns(10);
		
		txtSSTax = new JTextField();//This is the textbox where the result after calculate function is executed will display Social Security Tax.
		txtSSTax.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSSTax.setText("0.00");//Will default to 0.00 value when nothing is inputted by user.
		txtSSTax.setBounds(596, 146, 116, 22);
		contentPane.add(txtSSTax);
		txtSSTax.setColumns(10);
		
		txtMedTax = new JTextField();//This is the textbox where the result after calculate function is executed will display Medicare Tax.
		txtMedTax.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMedTax.setText("0.00");//Will default to 0.00 value when nothing is inputted by user.
		txtMedTax.setBounds(596, 208, 116, 22);
		contentPane.add(txtMedTax);
		txtMedTax.setColumns(10);
		
		txtNetPay = new JTextField();//This is the textbox where the result after calculate function is executed will display Net Pay.
		txtNetPay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNetPay.setText("0.00");//Will default to 0.00 value when nothing is inputted by user.
		txtNetPay.setBounds(596, 255, 116, 22);
		contentPane.add(txtNetPay);
		txtNetPay.setColumns(10);
		
		cmbMS = new JComboBox();//This is the drop down menu where the user will select marital status between options "Married" or "Single".
		cmbMS.setModel(new DefaultComboBoxModel(new String[] {"Married", "Single"}));
		cmbMS.setBounds(128, 146, 119, 22);
		contentPane.add(cmbMS);
		
	    cmbPP = new JComboBox();//This is the drop down menu where the user will select the pay period between options "Monthly" or "Bi-Weekly"
		cmbPP.setModel(new DefaultComboBoxModel(new String[] {"Monthly", "Bi-Weekly"}));
		cmbPP.setBounds(128, 205, 119, 22);
		contentPane.add(cmbPP);
		
		JButton btnExit = new JButton("Exit"); //The exit button here will allow the user to exit the program at any time.
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); //executes "Exit" function to close the program.
			}
		});
		btnExit.setBounds(551, 307, 97, 34);
		contentPane.add(btnExit);
	}



	protected void calculate() { //Function with calculations when "calculate" button is pressed.
		 double whAmt = 0; //This is for whole amount variable
         double taxablePay = 0; // This is for taxable pay varaible to subtract from gross pay later in calc.
         double grossPay = 0; // This will be the user's input for gross pay.
         double FIT = 0; // This value will be for Federal income tax rounded to two decimal places.
         double SS = 0; // This value will be for Social Security tax rounded to two decimal palces.
         double Med = 0; // This value will be for Medicare tax rounded to two deciaml places.
         double netPay = 0; // This value will be for net pay as a result of grosspay - all taxes, rounded to two deciaml palces.
         //These are the values that will be pulled from the arrays in the order executed in "calctax" funtion when parameters are met.
         //This should execute when the user selects calculate button.
         double [][] BR_BWS =  {
         { 88, 447, 1548, 3623, 7460, 16115, 16181, 0 },
         { 0, 0, 35.90, 201.05, 719.80, 1794.16, 4650.31, 4673.41 },
         { 0, 0.10, 0.15, 0.25, 0.28, 0.33, 0.35, 0.396 }
         };
         double[][] BR_BWM =  {
         { 333, 1050, 3252, 6221, 9308, 16360, 18437, 0 },
         { 0, 0, 71.70, 402.00, 1144.25, 2008.61, 4335.77, 5062.72 },
         { 0, 0.10, 0.15, 0.25, 0.28, 0.33, 0.35, 0.396 }
         };
         double[][] BR_MTHS = {
         { 192, 969, 3354, 7850, 16163, 34917, 35058, 0 },
         { 0, 0, 77.70, 435.45, 1559.45, 3887.09, 10075.91, 10125.26 },
         { 0, 0.10, 0.15, 0.25, 0.28, 0.33, 0.35, 0.396 }
         };
         double[][] BR_MTHM = {
         { 721, 2275, 7046, 13479, 20167, 35446, 39946, 0 },
         { 0, 0, 155.40, 871.05, 2479.30, 4351.94, 9394.01, 10969.01 },
         { 0, 0.10, 0.15, 0.25, 0.28, 0.33, 0.35, 0.396 }
         };

         grossPay = Double.parseDouble(txtGrossPay.getText());
         int dependents = Integer.parseInt(txtDependents.getText());
         int maritalStatus = (cmbMS.getSelectedIndex());
         int payPeriod = (cmbPP.getSelectedIndex());
         //Execution of following decision statement to allocate the values to whamt variable by multiplying user input for dependents by selected value.
         if (payPeriod == 0) //will execute if statement when payperiod is monthly.
         {
             whAmt = dependents * 337.50; // takes the dependents user selected and multiples by the given value 337.50 in order to give whole amount. This is used in determining taxable pay equation.
         }
         else
         {
             whAmt = dependents * 155.80;// takes the dependents user selected and multiples by the given value 155.80 to give whole amount. This is used in determining taxable pay equation.

         }
         //Calculation for taxable pay to figure out the final net pay in the program by taking gross pay from user input and subtracting it by the result of the above calculation.
         
         taxablePay = grossPay - whAmt; //This equation is used to determine the Federal income tax by taking the taxable pay result when Gross Pay entered is subtracted by the whole amount determined in the above sequence.

         if (payPeriod == 0)
         {
             if (maritalStatus == 0)//When selection of combo box is single the following calculation will take place for federal income tax.
                                    //This occurs by calculating taxable pay and pulling the value from the array associated when Marital status is selected as single.
             {
                 
                 FIT = CalcTax(taxablePay, BR_MTHM); // 

             }
             else
             {
                 
                 FIT = CalcTax(taxablePay, BR_MTHS);
             }
         }
         else
         {
             if (maritalStatus == 0) //When selection of combo box is mmarried the following calculation will take place for federal income tax.
                 //This occurs by calculating taxable pay and pulling the value from the array associated when Marital status is selected as married.
             {
                 
                 FIT = CalcTax(taxablePay, BR_BWM);
             }
             else
             {
                 
                 FIT = CalcTax(taxablePay, BR_BWS);
             }
         }



         SS = grossPay * 0.062; //Taking user input of gross pay and multiplying by indicated value to give result of Social Security tax.



         Med = grossPay * 0.0145; //Taking user input of gross pay and multiplying  by indicated value to give result of Medicare Tax.



         netPay = grossPay - FIT - SS - Med; //CAlculation for netpay determined by user input of gross pay, and subtracting due to calculate button being executed.
                                             // Will take the results from Federal income tax - Social security tax - medicare tax to give end result.


         //Update form fields.
         txtGrossPayR.setText(String.format("%.2f",grossPay));//This makes sure that there is 2 decimal places included in answer.
         txtFedTax.setText(String.format("%.2f", FIT)); 
         txtSSTax.setText(String.format("%.2f", SS)); 
         txtMedTax.setText(String.format("%.2f", Med));
         txtNetPay.setText(String.format("%.2f", netPay));
		
		
	}
	protected double CalcTax(double taxPay, double[][] BR) { // Calctax executes a sequence of if statements based on the gross pay user inputs. It takes the value and executes by pulling the values from the arrays and performing the calculations to give the equation. This gives the FED tax and returns it at the end into the Fed tax text box.
		 double fedTax = 0;

         if (taxPay <= BR[0] [0])
         {
             fedTax = 0;
         }
         else if (taxPay <= BR[0] [1])
         {
             fedTax = BR[1][1] + ((taxPay - BR[0][ 0]) * BR[2][ 1]);
         }
         else if (taxPay <= BR[0][ 2])
         {
             fedTax = BR[1][ 2] + ((taxPay - BR[0][ 1]) * BR[2][ 2]);
         }
         else if (taxPay <= BR[0][ 3])
         {
             fedTax = BR[1][ 3] + ((taxPay - BR[0][ 2]) * BR[2][ 3]);
         }
         else if (taxPay <= BR[0][ 4])
         {
             fedTax = BR[1][ 4] + ((taxPay - BR[0][ 3]) * BR[2][ 4]);
         }
         else if (taxPay <= BR[0][ 5])
         {
             fedTax = BR[1][ 5] + ((taxPay - BR[0][ 4]) * BR[2][ 5]);
         }
         else if (taxPay <= BR[0][ 6])
         {
             fedTax = BR[1][ 6] + ((taxPay - BR[0][ 5]) * BR[2][ 6]);
         }
         else
         {
             fedTax = BR[1][ 7] + ((taxPay - BR[0][ 6]) * BR[2][ 7]);
         }

         return fedTax; //Returns the fed tax to the "Fed tax" text box.
		
	}
}
