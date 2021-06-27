package com.personal.bank.account;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String user_name = null,type;
		type = null;
		int bal=0, tmp=0;
		int wd=0, cb=0;
		
		// generate random account number
		int aNum = 0;
		aNum = (int)((Math.random()*9000)+1000);
		
		 // Initialise -- name,acc_number,Balance,Type
		CreateAccount user = new CreateAccount ("user","savings", 0,0);
		
		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		int userChoice;
		boolean quit = false;
		
		do {
			System.out.println("1. Create account");
			System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Account Details");
            System.out.println("0. to quit: \n");
            System.out.print("Enter Your Choice : ");
            userChoice = in.nextInt();
            switch (userChoice) {
            
            case 1:
            	System.out.println("Enter your name : ");
            	user_name = str.nextLine();
            	System.out.println("Enter Accout Type : ");
            	type=in.next();
            	user.insert(user_name, aNum, type);  // inserted 
            	System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
            	System.out.println("**************************"); 
            	user.displayDetails();
            	break;
            	
            case 2: // Deposit
            	 System.out.print("Enter your account number : ");
            	 tmp=in.nextInt();
            	 if(tmp==user.Accnt_num){
            		 System.out.println("Enter amount of money : ");
            		 bal=in.nextInt();
            		 user.Accnt_Balance=bal;
            		 System.out.println("\t Successfully Deposited.");
            	 } 
            	else 
            	System.out.println("Wrong Accoount Number.");          
                break;
            	
            
            case 3: // withdraw money
            	System.out.println("Enter your account Number : ");
            	tmp=in.nextInt();
            	if (tmp==user.Accnt_num) {
            		if (user.Accnt_Balance==0) {
            			System.out.println("Your account is empty");
            		} else {
            			System.out.print("Enter Amout Of Money : "); 
            			wd=in.nextInt(); 
            			
            			if (wd>user.Accnt_Balance) {
            				System.out.println("Enter Valid Amout of Money : ");
            				wd=in.nextInt();
            			} else {
            				cb= user.withdraw(wd);
                            System.out.println("Your Current Balance : "+cb);  
            			}
            		}
            	} 
            	else 
            	System.out.println("Wrong Accoount Number."); 
            	break;
            	
            case 4: // check balance 

                System.out.print("Enter your Account Number : ");
                tmp=in.nextInt();
                
                if(tmp==user.Accnt_num){
                	System.out.println("Your Current Balance : "+user.Accnt_Balance);
                }
                else
                System.out.println("Wrong Accoount Number.");                         
                break;
                
            case 5: // display all info 
                
                System.out.print("Enter your Account Number :");
                tmp=in.nextInt();                     
                if(tmp==user.Accnt_num){                               
                	user.displayDetails();                             
                	
                }
                else
                System.out.println("Wrong Accoount Number.");       
                break;
            
            case 0:
                quit = true;
                break;
            
            default:
                System.out.println("Wrong Choice.");
                break;
            }
            System.out.println("\n");
		}  while (!quit);
		System.out.println("Thanks !");
	}
}
