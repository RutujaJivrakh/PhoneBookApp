package com.PhoneBookApp.Service;

import java.util.List;

import com.PhoneBookApp.Entities.Contact;


public interface ContactServiceI {

	public abstract boolean saveContact(Contact contact);

	public abstract List<Contact> getAllContact();
}
