package com.nt.service;

import java.util.Calendar;

public class LoanApproval {
	public String LoanApproval(int loanId,float amt,String loanType ) {
	
	Calendar calendar=null;
	int month=0;
	calendar=Calendar.getInstance();
	month=calendar.get(Calendar.MONTH);
	if(month>=7 && month<=10  && loanType.equalsIgnoreCase("agriculcture"))
	    return "Loan with loanId"+loanId+"is approved by";
	else
		return "Loan with loanId"+loanId+"is approved by";
	
	}
	

}
