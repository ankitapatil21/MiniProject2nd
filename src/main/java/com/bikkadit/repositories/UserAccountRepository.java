package com.bikkadit.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.entities.UserAccountEntity;
@Repository

public interface UserAccountRepository extends JpaRepository<UserAccountEntity,Serializable>
{
	public UserAccountEntity findByEmailAndPassword(String email,String password);

}
