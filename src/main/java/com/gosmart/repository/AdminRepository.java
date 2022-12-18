package com.gosmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gosmart.repository.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
	public AdminEntity findByAdminEmailIdAndAdminPassWord(String emailId, String password);

}
