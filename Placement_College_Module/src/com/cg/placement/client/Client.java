package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;

public class Client {

	public static void main(String[] args) {
	
		College college = new College();
		ICollegeService service = new CollegeServiceImpl();
		
		college.setId(51);
		college.setCollegeadmin("Admin");
		college.setCollegename("RYMEC College");
		college.setLocation("Ballari Contenment, Karnataka");
		service.addCollege(college);
		
		System.out.println("College details added in database");

	}

}
