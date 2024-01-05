package com.raj.Projectwithhibernet;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.*;

@Entity
@Table(name = "Student_Address")
public class Address {
	@Column(length = 100, name = "Student_add")
	private String Address;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_ID")
	private int id;
	@Column(name = "is_open")
	private boolean isopen;
	@Transient
	private double x;
	@Lob
	private byte[] image;
	private Date adddate;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String address, int id, boolean isopen, double x, byte[] image) {
		super();
		Address = address;
		this.id = id;
		this.isopen = isopen;
		this.x = x;
		this.image = image;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getAdddate() {
		return adddate;
	}
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}


}
