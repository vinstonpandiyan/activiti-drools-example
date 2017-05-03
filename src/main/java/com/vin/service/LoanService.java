package com.vin.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.vin.model.LoanApplicant;

public class LoanService implements JavaDelegate {
	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		LoanApplicant loan = new LoanApplicant();
		loan.setName((String) arg0.getVariable("name"));
		loan.setLoanAmount((Long) arg0.getVariable("amount"));
		loan.setIncome((Long) arg0.getVariable("salary"));
		arg0.setVariable("loanapplicant", loan);
	}
}
