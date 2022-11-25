import java.util.*;				
public class BankApplication {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name ");
		String custname =s.nextLine();
		System.out.println(" ...Account Details... ");
		BankAccount.pause();
		BankAccount cust1=new BankAccount(custname,"36450100012212");
		cust1.showMenu();

	}
}

class BankAccount{
	double	balance				;
	double	previousTransaction ;
	String  customerName        ;
	String  AccountNumber		;

	BankAccount(String cname ,String acnum){
		customerName =cname ;
		AccountNumber  = acnum  ; 	

	}

	static	void pause(){
		try{Thread.sleep(1200);}
		catch(InterruptedException e){}			

		}
		void deposit(double amount ){
			if(amount !=0){
				balance =balance+amount ;
				previousTransaction =amount ;
				}
		}
		void withdraw(double amount){
			balance =balance - amount ;
			previousTransaction =-amount ;
				}
		void getPreviousTransaction(){
		if(previousTransaction >0){
			System.out.println("Amount Deposited "+previousTransaction );
		}	
		else if(previousTransaction <0){
		System.out.println("Amount Withdrawn "+Math.abs(previousTransaction ));
		}
		else {System.out.println("NO Transaction Occured");
			}
		} 
		void showMenu(){
			char option='\0';
			Scanner s=new Scanner(System.in);
			System.out.println("Welcome "+customerName);					
			System.out.println("Your AccountNumber is "+AccountNumber );					
			System.out.println("\n");					
			System.out.println("a.	Check Balance");					
			System.out.println("b.	Deposit");					
			System.out.println("c.	Withdraw");					
			System.out.println("d.	Previous Transaction");					
			System.out.println("e.	Exit");					

		do
		{
			System.out.println("---------------------------------------------------------");
			System.out.println("Please Choose Your Operation");
			System.out.println("---------------------------------------------------------");
			option=s.next().charAt(0);
			System.out.println("\n");
			switch (option)
			{
			case 'a':
				pause();
				System.out.println("---------------------------------------------------------");
				System.out.println("Your Current Balance Is Rs :"+balance);
				System.out.println("---------------------------------------------------------");
				System.out.println("\n");
				break;
			case 'b':
				pause();
				System.out.println("---------------------------------------------------------");
				System.out.println("Enter The Amount To Be Deposited ");                                     
				System.out.println("---------------------------------------------------------");
				int amount =s.nextInt(); 
				deposit(amount);
				System.out.println("\n");                                                   
				break;
			case 'c':
				pause();
				System.out.println("---------------------------------------------------------");
				System.out.println("Enter The Amount To Be Withdrawn ");                                     
				System.out.println("---------------------------------------------------------");
				int amount2 =s.nextInt(); 
				withdraw(amount2);
				System.out.println("\n");                                                   
				break;
				case 'd':
				pause();
				System.out.println("---------------------------------------------------------");
				getPreviousTransaction();                                     
				System.out.println("---------------------------------------------------------");
				System.out.println("\n");                                                   
				break;

			case 'e':
			
				System.out.println(" ********************** Visit Again ********************** ");
				break;

			default:
				System.out.println("Invalid Option !! Please Try Again ... ");
			}

		}
		while (option != 'e');
		System.out.println("   ********** Thank You For Using Our Service **********");
	


		}


	
}
