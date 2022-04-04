package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class College {

	@Id
	private int id;
	private String collegeadmin;
	private String collegename;
	private String location;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeadmin() {
		return collegeadmin;
	}
	public void setCollegeadmin(String collegeadmin) {
		this.collegeadmin = collegeadmin;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
