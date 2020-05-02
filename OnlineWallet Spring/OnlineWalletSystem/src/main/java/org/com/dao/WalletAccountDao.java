package org.com.dao;


import org.com.model.WalletAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletAccountDao extends JpaRepository<WalletAccount, Integer>{

	
	@Query( value = "select account_balance from wallet_account where user_id = :user_id", nativeQuery=true)
	double getAccountBalance(@Param("user_id") int user_id);
}
