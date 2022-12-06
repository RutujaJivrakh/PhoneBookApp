package com.PhoneBookApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PhoneBookApp.Entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
