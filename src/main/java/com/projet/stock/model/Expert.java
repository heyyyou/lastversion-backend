package com.projet.stock.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Expert")
public class Expert extends User {
	
	public Expert(String username, String email, String password, String gender , String image , long telephone,String role ) {
		super(username,email,password,gender,image,role,telephone);
	
	}
	public Expert() {
		super();
	}
}
