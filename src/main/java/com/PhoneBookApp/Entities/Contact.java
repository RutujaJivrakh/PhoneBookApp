package com.PhoneBookApp.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import lombok.Getter;
import lombok.Setter;

@Entity 
@Table(name = "CONTACT_DETAILS")
@Getter
@Setter
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTACT_ID")
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String contactname;
	
	@Column(name = "CONTACT_NUMBER")
	private String contactNumber;
	
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name = "CONTACT_ACTIVE_SWITCH")
	private Character activeSwitch;
	
	@Column(name = "CONTACT_CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	
	@Column(name = "CONTACT_UPDATED_DATE",insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

	
	
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactname=" + contactname + ", contactNumber=" + contactNumber
				+ ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createdDate=" + createdDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	
	
}
