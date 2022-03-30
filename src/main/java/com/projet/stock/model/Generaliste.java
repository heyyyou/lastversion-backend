package com.projet.stock.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="generaliste")
public class Generaliste extends User {

	
	public Generaliste(String username, String email, String password, String gender , String image , long telephone,String role ) {
		super(username,email,password,gender,image,role,telephone);
	
	}
	public Generaliste() {
		super();
	}
}
