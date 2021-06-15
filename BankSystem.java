import java.util.*;
interface RBI
{
	void CreateAccount();
	 void deposite(int a);
	 void withdraw(int b);
	int checkBalance(int c);
	void updateDetails(int d);
}
class SBI implements RBI
{
	String name,address,type_account;
	int age,pan_no,adhar_no;
	final int rateofinterest=9;
	static int banknumber=1234567;
	int balance=500;
	int loan;
	int time;
	public void updateDetails(int banknumber)
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter name ");
   		this.name = sc.nextLine();
   		
   		System.out.println("Enter Address ");
   		 this.address=sc.nextLine();

   		

   		System.out.println("Enter pan number ");
   		 this.pan_no=sc.nextInt();

   		 System.out.println("Enter Adhar number ");
   		 this.adhar_no=sc.nextInt();
   		 System.out.println("Details Updated sucessfully\n");
   
        	System.out.println("Your deatails: name :"+this.name+"\n");
        	System.out.println(" address :"+this.address+"\n");
        	System.out.println(" adhar no :"+this.adhar_no+"\n");
        	System.out.println(" pan no :"+this.pan_no+"\n");
        	
   		
	}
	public int checkBalance(int banknumber)
	{
		return this.balance;
	}
	public void  deposite(int banknumber)
	{
			Scanner sc=new Scanner(System.in);
		System.out.println("Depositing money\n");
		System.out.println("Enter amount to deposite\n");
		int temp=sc.nextInt();
		this.balance=this.balance+temp;
		int a=checkBalance(this.banknumber);
		System.out.println("Your current bankbalance after debiting money is "+a);
	}
	public void Getloan(int banknumber)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*************Types of loan***************\n");
		System.out.println("1.Car loan\n2.home loan\n3.Gold loan");
		System.out.println("Enter Which kind of loan you want\n");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Welcome to car loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
			int t=temp1*rateofinterest/100;
			this.loan=temp1+t;
			System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}

}



		}else if(ch==2)
		{
				System.out.println("Welcome to gold loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
				int t=temp1*rateofinterest/100;
			this.loan=temp1+t;
				System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
		}
		}

		else
		{
			System.out.println("Welcome to home loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
			int t=temp1*rateofinterest/100;
		
			this.loan=temp1+t;
				System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
		}
		}


	}
	public void  withdraw(int banknumber)
	{
			Scanner sc=new Scanner(System.in);
		System.out.println("withdrawing  money\n");
		System.out.println("Enter amount to withdraw\n");
		int temp=sc.nextInt();
		if(this.balance<=500  || temp>this.balance)
		{
			System.out.println("Sorry can not debit\n");
		}
		else
		{
				this.balance=this.balance-temp;
			int a=checkBalance(this.banknumber);
		System.out.println("Your current bankbalance after credit of money is "+a);
		}
	
	}

	private void login(int banknumber)
	{
		int ch;
        System.out.println("Enter Bank Number\n");
        	Scanner sc=new Scanner(System.in);
        int bno=sc.nextInt();
        if(bno==banknumber)
        {
        	System.out.println("Login Sucessfull\n");
        	System.out.println("Welcome "+this.name+"\n");
        	System.out.println("Your deatails: name :"+this.name+"\n");
        	System.out.println(" address :"+this.address+"\n");
        	System.out.println(" adhar no :"+this.adhar_no+"\n");
        	System.out.println(" pan no :"+this.pan_no+"\n");
        	
        	System.out.println("**************menu of opearation**************\n");
        	System.out.println("**************1.credit money**************\n");
        	System.out.println("**************2.withdraw money**************\n");
        	System.out.println("**************3.Check Balance**************\n");

        	System.out.println("**************4.Get loan**************\n");
        			System.out.println("**************5.update deatails**************\n");
        	
        	System.out.println("Enter Choice of operation");
        	
        	do
        	{
        		ch=sc.nextInt();
        		switch(ch)
        		{
        			case 1 : 	deposite(this.banknumber);  break;
        			case 2: 	withdraw(this.banknumber); break;
        			case 3 :   int a= checkBalance(this.banknumber); 
        			System.out.println("Your account Balance is "+a);
        			break;
        			case 4: Getloan(this.banknumber); break;
        			case 5: updateDetails(this.banknumber); break;
        			default : System.out.println("Enter valid choice\n");
        		} 
        			System.out.println("Do u want to perform more\n");

        	}while(ch!=6);
        
        }
        else
        {
        	System.out.println("Enter Correct bank number\n");
        }
	}

   public void CreateAccount()
   {
   		
   		Scanner sc=new Scanner(System.in);
   		 System.out.println("Enter Type of account : 1. Saving \t 2.Deposite \n ");
   		 type_account=sc.nextLine();
   		System.out.println("Enter name ");
   		name = sc.nextLine();
   		
   		System.out.println("Enter Address ");
   		 address=sc.nextLine();

   		 System.out.println("Enter Age ");
   		 age=sc.nextInt();

   		System.out.println("Enter pan number ");
   		 pan_no=sc.nextInt();

   		 System.out.println("Enter Adhar number ");
   		 adhar_no=sc.nextInt();
   		
   		
   		 if(age>18 && name!=" " && address!=" ")
   		 {
   		 	
   		 	System.out.println("Account created kindly login to perform operation");
   		 	this.banknumber=banknumber+1;

   		 	System.out.println("Your Bank Number is "+this.banknumber);	
   		 	  	login(this.banknumber);
   		
   		 	
   		 }
   		 else
   		 {
   		 	System.out.println("Sorry Not fit in criteria error in account creation");
   		 }



   }
   public static void main(String args[])
   {
          // SBI[] s=new  SBI[10];
          // for(int i=0;i<10;i++)
          // {
          // 	s[i]=new SBI();
          // 	s[i].CreateAccount();

          // }
   	System.out.println("Welcome to SBI bank\n");
   	       SBI s=new SBI();
   	       s.CreateAccount();
   }
}

class BOM implements RBI
{
	String name,address,type_account;
	String mob_no;
	int age,pan_no,adhar_no;
	final int rateofinterest=4;
	static int banknumber=10000;
	int balance=100;
	int loan;
	int time;
	public int checkBalance(int banknumber)
	{
		return this.balance;
	}
	public void  deposite(int banknumber)
	{
			Scanner sc=new Scanner(System.in);
		System.out.println("Depositing money\n");
		System.out.println("Enter amount to deposite\n");
		int temp=sc.nextInt();
		this.balance=this.balance+temp;
		int a=checkBalance(this.banknumber);
		System.out.println("Your current bankbalance after debiting money is "+a);
	}
	public void updateDetails(int banknumber)
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter name ");
   		this.name = sc.nextLine();
   		
   		System.out.println("Enter Address ");
   		 this.address=sc.nextLine();


   		System.out.println("Enter pan number ");
   		 this.pan_no=sc.nextInt();

   		 System.out.println("Enter Adhar number ");
   		 this.adhar_no=sc.nextInt();
   		 System.out.println("Details Updated sucessfully\n");
   		 System.out.println("Details are name:"+this.name+"\n");
     
        	System.out.println(" address :"+this.address+"\n");
        	System.out.println(" adhar no :"+this.adhar_no+"\n");
        	System.out.println(" pan no :"+this.pan_no+"\n");

   		
	}
	public void Getloan(int banknumber)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*************Types of loan***************\n");
		System.out.println("1.Car loan\n2.home loan\n3.Gold loan\n 4.Buisness loan");
		System.out.println("Enter Which kind of loan you want\n");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			System.out.println("Welcome to car loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
			int t=temp1*rateofinterest/100;
			this.loan=temp1+t;
			System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}

}



		}else if(ch==2)
		{
				System.out.println("Welcome to home loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
				int t=temp1*rateofinterest/100;
			this.loan=temp1+t;
				System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
		}
		}
		else if(ch==3)
		{
				System.out.println("Welcome to gold loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
				int t=temp1*rateofinterest/100;
			this.loan=temp1+t;
				System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
		}
		}

		else
		{
			System.out.println("Welcome to buisness loan\n");
			System.out.println("Enter amount of loan You want\n");
			int temp1=sc.nextInt();
			if(temp1<20000)
			{
				System.out.println("Sorry bank does not allowed this amount of loan\n");
			}
			else
			{
			int t=temp1*rateofinterest/100;
		
			this.loan=temp1+t;
				System.out.println("Thanks for your loan granted\n");
			System.out.println("Your total loan is "+this.loan);
			if(this.loan<=100000)
			{
				this.time=1;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>100000 && this.loan<=300000)
			{
				this.time=2;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else if(this.loan>300000 && this.loan<500000)
			{
				this.time=5;
				System.out.println("Time to retun loan is "+this.time +" year");
			}
			else
			{
				this.time=6;
				System.out.println("Time to retun loan is "+this.time +" year");
			}	
			}
			
		}


	}
	public void  withdraw(int banknumber)
	{
			Scanner sc=new Scanner(System.in);
		System.out.println("withdrawing  money\n");
		System.out.println("Enter amount to withdraw\n");
		int temp=sc.nextInt();
		if(this.balance<=500 || temp>this.balance)
		{
			System.out.println("Sorry can not debit\n");
		}
		else
		{
				this.balance=this.balance-temp;
			int a=checkBalance(this.banknumber);
		System.out.println("Your current bankbalance after credit of money is "+a);
		}
	
	}
	public void link(int banknumber)
	{
		 String str=Integer.toString((this.adhar_no));
		String link1;
		link1=str.concat(this.mob_no);
		System.out.println("Linking sucessfull of mobile number with adhar number of bank number "+this.banknumber);
	}

	private void login(int banknumber)
	{
		int ch;
        System.out.println("Enter Bank Number\n");
        	Scanner sc=new Scanner(System.in);
        int bno=sc.nextInt();
        if(bno==banknumber)
        {
        	System.out.println("Login Sucessfull\n");
        	System.out.println("Welcome "+this.name+"\n");
        	System.out.println("Your deatails: name :"+this.name+"\n");
        	System.out.println(" address :"+this.address+"\n");
        	System.out.println(" adhar no :"+this.adhar_no+"\n");
        	System.out.println(" pan no :"+this.pan_no+"\n");
        		System.out.println(" mobile number :"+this.mob_no+"\n");
        	System.out.println("**************menu of opearation**************\n");
        	System.out.println("**************1.credit money**************\n");
        	System.out.println("**************2.withdraw money**************\n");
        	System.out.println("**************3.Check Balance**************\n");

        	System.out.println("**************4.Get loan**************\n");
        		System.out.println("**************5.link mob number**************\n");
        		System.out.println("**************6.update deatails**************\n");
        	
        	System.out.println("Enter Choice of operation");
        	
        	do
        	{
        		ch=sc.nextInt();
        		switch(ch)
        		{
        			case 1 : 	deposite(this.banknumber);  break;
        			case 2: 	withdraw(this.banknumber); break;
        			case 3 :   int a= checkBalance(this.banknumber); 
        			System.out.println("Your account Balance is "+a);
        			break;
        			case 4: Getloan(this.banknumber); break;
        			case 5: link(this.banknumber); break;
        			case 6: updateDetails(this.banknumber); break;
        			default : System.out.println("Enter valid choice\n");
        		} 
        			System.out.println("Do u want to perform more\n");

        	}while(ch!=7);
        
        }
        else
        {
        	System.out.println("Enter Correct bank number\n");
        }
	}

   public void CreateAccount()
   {
   		
   		Scanner sc=new Scanner(System.in);
   		 System.out.println("Enter Type of account : 1. Saving \t 2.Deposite \n ");
   		 type_account=sc.nextLine();
   		System.out.println("Enter name ");
   		name = sc.nextLine();
   		
   		System.out.println("Enter Address ");
   		 address=sc.nextLine();

   		 System.out.println("Enter mobile no ");
   		 mob_no=sc.nextLine();

   		 System.out.println("Enter Age ");
   		 age=sc.nextInt();

   		System.out.println("Enter pan number ");
   		 pan_no=sc.nextInt();

   		 System.out.println("Enter Adhar number ");
   		 adhar_no=sc.nextInt();
   		
   		
   		 if(age>18 && name!=" " && address!=" ")
   		 {
   		 	
   		 	System.out.println("Account created kindly login to perform operation");
   		 	this.banknumber=banknumber+1;

   		 	System.out.println("Your Bank Number is "+this.banknumber);	
   		 	  	login(this.banknumber);
   		
   		 	
   		 }
   		 else
   		 {
   		 	System.out.println("Sorry Not fit in criteria error in account creation");
   		 }



   }
   public static void main(String args[])
   {
          // SBI[] s=new  SBI[10];
          // for(int i=0;i<10;i++)
          // {
          // 	s[i]=new SBI();
          // 	s[i].CreateAccount();

          // }
   	       BOM b=new BOM();
   	       b.CreateAccount();
   }
}
