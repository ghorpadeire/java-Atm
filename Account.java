import java.util.*;
import java.text.DecimalFormat;
class Account  
{
	Scanner ip  = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##,0.00");

	//Set Customer  Number
	public int  setCustomerNumber(int customerNumber){	
	this.customerNumber=customerNumber;
	return customerNumber;
	}
	
	//Get Customer  Number
	public int  getCustomerNumber(){
	return  customerNumber;
	}
	
	//Set pin  Number
	public int  setPinNumber(int PinNumber){	
	this.pinNumber= pinNumber;
	return pinNumber;
	}

	//Get pin  Number
	public int  getPinNumber(){
	return pinNumber;
	}

	//get check AccountBalance
	public double  getCheckingBalance(){	
	this.checkingBalance= checkingBalance;
	return checkingBalance;
	}

	//get savingsAccountBalance 
	public double savingsAccountBalance(){
	this.savingsAccountBalance=savingsAccountBalance;
	return savingsAccountBalance;
	}

	//calculate savingAccountDeposite
	public double savingAccountDeposite(double amount){
	savingBalance+=amount; 
	return savingBalance;
	}

	//customer checkingAccountWithdraw
	public void getcheckingAccountWithdraw(){
		System.out.println("checkingAccount balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amounty you want to withdraw from checking account" );

		double amount =ip.nextDouble();
		if((checkingBalance- amount) >=0){
			calcCheckiing==Withdraw(amount);
			System.out.println("new checking balance" + moneyFormat.format(checkingBalance));
		}else{
			System.out.println("balance can not be negative");
		}
	}

	//Customer Saving acc withdraw ip
	public void getSavingAccountWithdraw()
	{
		System.out.println("checkingAccount balance"+moneyFormat.format(savingBalance));
		System.out.println("Amounty you want to withdraw from saving account" );

		double amount =ip.nextDouble();
		if((savingBalance- amount) >=0){
			calcCheckiing ==Withdraw(amount);
			System.out.println("new checking balance" + moneyFormat.format(savingBalance));
		}else{
			System.out.println("balance can not be negative");
		}
	}

	//customer checkingAccountDepositInput
	public void getcheckingAccountDepositInput()
	{
		System.out.println("checkingAccount balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amounty you want to withdraw from checking account" );

		double amount =ip.nextDouble();
		if((checkingBalance+ amount) >=0){
			calcCheckiing ==Withdraw(amount);
			System.out.println("new checking balance" + moneyFormat.format(checkingBalance));
		}else{
			System.out.println("balance can not be negative");
		}
	}
	//Customer SavingAccountDepositInput
	public void getSavingAccountDepositInput()
	{
		System.out.println("checkingAccount balance"+moneyFormat.format(savingBalance));
		System.out.println("Amounty you want to withdraw from saving account" );

		double amount =ip.nextDouble();
		if((savingBalance+ amount) >=0){
			calcCheckiing ==Withdraw(amount);
			System.out.println("new checking balance" + moneyFormat.format(savingBalance));
		}else{
			System.out.println("balance can not be negative");
		}
	}

	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;



}
