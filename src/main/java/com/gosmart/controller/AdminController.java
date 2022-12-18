package com.gosmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gosmart.repository.entity.AdminEntity;
import com.gosmart.service.AdminService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin/login")
	public ResponseEntity<AdminEntity> getAdmin(@RequestBody AdminEntity adminEntity)
	{
		try {
			AdminEntity admin=adminService.getAdmin(adminEntity.getAdminEmailId(), adminEntity.getAdminPassWord());
			if(admin!=null)
			{
				return new ResponseEntity<>(HttpStatus.OK);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
			}
		} 
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
