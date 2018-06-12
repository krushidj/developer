package com.cidac.onlineparking.module.user;

import java.sql.Timestamp;

public class RegisterVO {
	private int id;
	private String fName;
	private String lName;
	private String email;
	private String pass;
	private String dob;
	private String mobileNumber;
	private String gender;
	private int cityId;
	private String currentTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public String toString() {
		return "RegisterVO [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", pass=" + pass
				+ ", dob=" + dob + ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", cityId=" + cityId
				+ ", currentTime=" + currentTime + "]";
	}

	
	
}