import java.util.*;
class Customer 
{
	static int balance=200000;
	int withdraw,deposite;
	static int pincode=1234;
	static int aa[]=new int[10];
	static int bb[]=new int[10];
	static int i=0;
	static int j=0;
	static int m=0;
	Scanner sc=new Scanner(System.in);
}

class Withdrawal extends Customer
{
	  void show()
	  {   
	    System.out.println("\n\nEnter amount to be Withdraw");
	    withdraw=sc.nextInt();
		aa[i]=withdraw;
		i++;
		if(withdraw<=balance)
	 {
		
		System.out.println("ENTER YOUR PIN");
		int  pin=sc.nextInt();
		 if(pin==pincode)
		  {
		balance = balance - withdraw;
		System.out.println("PLEASE COLLECT MONEY\n");
		System.out.println("AVAILABLE BALANCE AMOUNT IS : "+balance); 
		
	      }
           else
		  {
		System.out.println("YOU ENTERD WRONG PIN");
		  }
	}
			else
		{
			    System.out.println("YOU DON'T HAVE ENOUGH MONEY FOR WITHDRAW");	
		}
		System.out.println("---------------THANK YOU--------------\n");
		
	  }
} 
class Deposite extends Withdrawal
{
	    void show1()
		{
			
      	System.out.println("\n\nENTER AMOUNT TO DEPOSITE");
		deposite=sc.nextInt();
		System.out.println("\n \nENTER YOUR PIN");
	    int  pin=sc.nextInt();
		             if(pin==pincode)
		          {
		            bb[j]=deposite;
                   j++;
	               balance=balance+deposite;
		           System.out.println("MONEY HAS BEEN DEPOSITED SUCCESSFULLY...");
				   System.out.println("NOW TOTAL BALANCE AVAILABLE IS : "+balance);
				  }
				     else
		          {
		           System.out.println("YOU ENTERD WRONG PIN\n\n");
		         }
				 System.out.println("---------------THANK YOU--------------\n");
		
		}
}
class CheckBalance extends Deposite
{
	              void show2()
				  {
					 System.out.println("\n \nENTER YOUR PIN");
		             int  pin=sc.nextInt();
		             if(pin==pincode)
		          {
				   System.out.println("BALANCE OF YOUR ACCOUNT IS   : "+balance);
				   System.out.println("  ");
				   }
				    else
		          {
		           System.out.println("YOU ENTERD WRONG PIN\n\n");
		          }
				  System.out.println("---------------THANK YOU--------------\n");
				  }
}
class Transection extends CheckBalance
{
	     void show3()
		 {
			System.out.println("\n\n");
			 for(int k=0;k<i;k++)
			 System.out.println("Withdrawal Transection  is : " +aa[k]);
		 
		      for(int k=0;k<j;k++)
			 System.out.println("Depostie Transection is    : " +bb[k]);
		
		 }
}
class Transfer extends Transection 
{
	void show4()
	{
		System.out.println("ENTER YOUR PIN");
		int  pin=sc.nextInt();
		if(pin==pincode)
		  {
			 System.out.println("Enter account Number if Receiver"); 
			 int l=sc.nextInt();
			 System.out.println("Enter How many amount you want to Transfer");
		     int sum=sc.nextInt();
		     bb[j]=sum;
		     System.out.println("Amount has been transferd successfully of  :  "+sum);
		     balance=balance-sum;
			 System.out.println("BALANCE OF YOUR ACCOUNT IS     :  "+balance);
		  }
		  else
		  {
		System.out.println("YOU ENTERD WRONG PIN\n \n");
		  }
		  System.out.println("---------------THANK YOU--------------\n");
	}
}
class ATM
{
	public static void main(String ar[])
	{
	       int k=1;
		   int y;
		   int id=12345;
		   int idcheck;
		Scanner st=new Scanner(System.in);
		System.out.println("\n----------------------------Welcome to ATM Machine----------------------------");
		System.out.println("Enter your id Number");
		idcheck=st.nextInt();
		   if(id==idcheck)
		   {
		while(k==1)
		{
			System.out.println("\n\n----------------------------------------");
			System.out.println("Press 1 for Withdraw");
		    System.out.println("Press 2 for Deposite");
		    System.out.println("Press 3 for Check Balnce");
		    System.out.println("Press 4 for Transection History");
			System.out.println("Press 5 for Transfer");
			System.out.println("press 6 for Quit");
			System.out.println("----------------------------------------");
			y=st.nextInt();
			switch(y)
			{
				case 1:
				{
				Withdrawal w=new Withdrawal();
				w.show();
				break;
			    }
				case 2:
				{
				Deposite d=new Deposite();
				d.show1();
				break;
				}
				
				case 3:
				{
					CheckBalance cb=new CheckBalance();
					cb.show2();
					break;
			    }
				case 4:
				{
					Transection trr=new Transection();
					trr.show3();
					break;
				}
				case 5:
				{
					Transfer tf=new Transfer();
					tf.show4();
					break;
				}
				case 6:
				{
					 k=0;
					 break;
				}
				default:
				System.out.println("\nNot found");
			}
	     }
	}
		else
		{
			System.out.println("\nThis id is not found");
		}
  }
  }
