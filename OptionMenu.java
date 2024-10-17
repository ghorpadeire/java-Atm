import java.util.*;
import java.text.DecimalFormat;
import java.lang.*;
class  OptionMenu extends Account
{
	Scanner ip =new Scanner (System.in);
	DecimalFormat moneyFormat = new DecimalFormat ("'$'###,##0.00");

	HashMap<Integer ,Integer> data = new HashMap<Integer ,Integer>();
	
	//validate login information customer no and pin
	public void getLogin()throws IOException
	{
		int x=1;
		do{
			try{
				data.put(9876543,9876);
				data.put(31082000,3108);
				System.out.println("Welcome to atm project ");
				System.out.println("Enter  customer  number ");

				setCustomerNumber(ip.nextInt());
				System.out.println("Enter  customner no");

				setPinNumber(ip.nextInt());
			}catch(Exception e){
				System.out.println("\n Enter valid number  \n");
				x=2;
			}
			for(Entry <Integer,Integer> entry : data.entrySet()) // int arr[] = {}		for (int i :arr)
			{
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber())
				{
						getAccountType();
				}
			}System.out.println(" \n"+ " Wrong customer Number or  pin"+ "\n");
		}while(x==1);
	}

	//display AccountTypeMenuWithSelection 
	public void getAccountType()
	{
		System.out.println("Select the Account You want to access ");
		System.out.println("Type 1 :- Checking Account ");
		System.out.println("Type 2 :- saving Account ");
		System.out.println("Type 3 :- Exit");
		System.out.print("Choice:-");
		selection=ip.nextInt();
		switch(selection)
		{
			case 1 : getCheckin(); break;
			case 2 : getSaving(); break;
			case 3 : System.out.print("Thanks for using ATM , visit again , BYEE!");
			default :System.out.print("Invalid Choice");
		}
		getAccountType();	//reccurrsion
	}

}