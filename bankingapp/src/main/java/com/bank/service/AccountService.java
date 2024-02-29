package com.bank.service;

import java.util.List;

import com.bank.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(int id);
	
	AccountDto deposit(int id, double balance);
	
	AccountDto withdraw(int id, double balance);
	
	List<AccountDto> getAllAccounts();
	

}
