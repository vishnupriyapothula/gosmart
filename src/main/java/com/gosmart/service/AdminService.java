package com.gosmart.service;

import com.gosmart.repository.entity.AdminEntity;

public interface AdminService {
	
	
	public AdminEntity getAdmin(String adminEmailId, String adminPassword);
	public AdminEntity getAdmin(String adminEmailId);
	public void updateAdmin(AdminEntity adminEntity);
	
}
