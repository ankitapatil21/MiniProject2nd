package com.bikkadit.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="USER_ACCOUNT")

public class UserAccountEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
@Column(name="USER_ID")
private Integer userId;
	
@Column(name="FIRST_NAME")
private String fname;

@Column(name="LAST_NAME")
private String lname;

@Column(name="USER_EMAIL")
private String email;

@Column(name="USER_PWD")
private String password;

@Column(name="USER_MOBILE")
private Long phno;

@Column(name="DOB")
private LocalDate dob;

@Column(name="GENDER")
private String gender;

@Column(name="CITY_ID")
private Integer cityId;

@Column(name="STATE_ID")
private Integer stateId;

@Column(name="COUNTRY_ID")
private Integer countryId;

@Column(name="ACC_STATUS")
private String accStatus;

@CreationTimestamp
@Column(name="CREATED_DATE",updatable=false)
private LocalDate createdDate;

@UpdateTimestamp
@Column(name="UPDATED_DATE",insertable=false)
private LocalDate updateddate;





public Integer getUserId() {
	return userId;
}





public void setUserId(Integer userId) {
	this.userId = userId;
}





public String getFname() {
	return fname;
}





public void setFname(String fname) {
	this.fname = fname;
}





public String getLname() {
	return lname;
}





public void setLname(String lname) {
	this.lname = lname;
}





public String getEmail() {
	return email;
}





public void setEmail(String email) {
	this.email = email;
}





public String getPassword() {
	return password;
}





public void setPassword(String password) {
	this.password = password;
}





public Long getPhno() {
	return phno;
}





public void setPhno(Long phno) {
	this.phno = phno;
}





public LocalDate getDob() {
	return dob;
}





public void setDob(LocalDate dob) {
	this.dob = dob;
}





public String getGender() {
	return gender;
}





public void setGender(String gender) {
	this.gender = gender;
}





public Integer getCityId() {
	return cityId;
}





public void setCityId(Integer cityId) {
	this.cityId = cityId;
}





public Integer getStateId() {
	return stateId;
}





public void setStateId(Integer stateId) {
	this.stateId = stateId;
}





public Integer getCountryId() {
	return countryId;
}





public void setCountryId(Integer countryId) {
	this.countryId = countryId;
}





public String getAccStatus() {
	return accStatus;
}





public void setAccStatus(String accStatus) {
	this.accStatus = accStatus;
}





public LocalDate getCreatedDate() {
	return createdDate;
}





public void setCreatedDate(LocalDate createdDate) {
	this.createdDate = createdDate;
}





public LocalDate getUpdateddate() {
	return updateddate;
}





public void setUpdateddate(LocalDate updateddate) {
	this.updateddate = updateddate;
}





@Override
public String toString() {
	return "UserAccountEntity [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
			+ ", password=" + password + ", phno=" + phno + ", dob=" + dob + ", gender=" + gender + ", cityId=" + cityId
			+ ", stateId=" + stateId + ", countryId=" + countryId + ", accStatus=" + accStatus + ", createdDate="
			+ createdDate + ", updateddate=" + updateddate + "]";
}




}
