package com.personal.bank.account;

/**
 * An account class 
 * 
 * @author raj.kumar
 *
 */

public class Account {
	
	String name;
	String Accnt_type;
	int Accnt_num;
	int Accnt_Balance;
	
	Account() {};
	
	public Account(String nam, String accnt_t, int accnt_n, int accnt_Bal) {
		this.name = nam;
		this.Accnt_type = accnt_t;
		Accnt_num = accnt_n;
		Accnt_Balance = accnt_Bal;
	}

}
