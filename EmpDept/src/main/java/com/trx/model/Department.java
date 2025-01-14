package com.trx.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Department {
	
	@Id
	private long deptId;
	private String deptName;
	private String location;
	
	@JsonIgnore
	@OneToMany(mappedBy = "department")
	List<Employee> empList = new ArrayList<Employee> ();
	
	public Department() {
		
	}

	public Department(long deptId, String deptName, String location) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	

}
