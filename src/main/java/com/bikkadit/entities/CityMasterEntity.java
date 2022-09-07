package com.bikkadit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CITY_MASTER")

public class CityMasterEntity {
	@Id
	@Column(name="CITY_ID")
	private Integer cityId;
	@Column(name="CITY_NAME")
	private String cityname;
	@Column(name="STATE_ID")
	private Integer stateId;
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	@Override
	public String toString() {
		return "CityMasterEntity [cityId=" + cityId + ", cityname=" + cityname + ", stateId=" + stateId + "]";
	}

}
