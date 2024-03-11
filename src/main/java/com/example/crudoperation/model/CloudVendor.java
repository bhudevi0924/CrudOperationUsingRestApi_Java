package com.example.crudoperation.model;

import jakarta.persistence.*;

@Entity
@Table(name="vendor")
public class CloudVendor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long VendorId;
	private String VendorName;
	private String VendorAddress;
	private String VendorPhoneNumber;
	
	public CloudVendor(Long vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		
		VendorId = vendorId;
		VendorName = vendorName;
		VendorAddress = vendorAddress;
		VendorPhoneNumber = vendorPhoneNumber;
	}
	
	

	public CloudVendor() {
	
	}



	public Long getVendorId() {
		return VendorId;
	}

	public void setVendorId(Long vendorId) {
		VendorId = vendorId;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public String getVendorAddress() {
		return VendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		VendorAddress = vendorAddress;
	}

	public String getVendorPhoneNumber() {
		return VendorPhoneNumber;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		VendorPhoneNumber = vendorPhoneNumber;
	}
	
	
}
