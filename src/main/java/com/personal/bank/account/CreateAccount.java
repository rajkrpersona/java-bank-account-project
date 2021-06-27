/**
 * 
 */
package com.personal.bank.account;

/**
 * @author raj.kumar
 *
 */
public class CreateAccount extends Account {

	public CreateAccount() {
		super();
	}

	// pass name and account type
	public CreateAccount(String nam, String accnt_t, int accnt_n, int accnt_Bal) {
		name = nam;
		Accnt_num = accnt_n;
		Accnt_Balance = accnt_Bal;
		Accnt_type = accnt_t;
	}
	
	// input user name, account number and type
	void insert(String n, int acc_num, String a_t) {
		name = n;
		Accnt_num = acc_num;
		Accnt_Balance = 0;
		Accnt_type = a_t;		
	}
	
	void displayDetails() {
		System.out.println("Depositor name : " + name);
		System.out.println("Account number : " + Accnt_num);
		System.out.println("Account balance : " + Accnt_Balance);
		System.out.println("Account type : " + Accnt_type);
	}
	
	void deposit(int acc_num,int money) {
		Accnt_Balance = money;
	}
	
	int withdraw(int wd) {
		Accnt_Balance = Accnt_Balance - wd;
		return Accnt_Balance;
	}
}
