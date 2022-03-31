package com.projet.stock.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="generaliste")
public class Generaliste extends User {
	 public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getImage() {
		return image;
	}





	public void setImage(String image) {
		this.image = image;
	}





	public long getTelephone() {
		return telephone;
	}





	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}


	private String gender ;
	  private String image ; 
	  private long telephone ;
	
		public Generaliste(String username, String email, String password, String gender, long telephone , String image  ) {
			super(username,email,password,image);
			this.gender=gender;
			this.image=image;
			this.telephone=telephone;
		
		}
		
		

		
		
		public String getUsername(){
			return super.getUsername();
		}
		

		public void setUsername(){
			 super.setUsername(super.getUsername());
			 
		}
		public String getEmail(){
			return super.getEmail();
		}
		

		public void setEmail(){
			 super.setEmail(super.getEmail());
		}
		
		
		public String getUPassword(){
			return super.getPassword();
		}
		

		public void setPassword(){
			 super.setPassword(super.getPassword());
		}
		
		
	/*	public String getRole(){
			return super.getRole();
		}
		

		public void setRole(){
			 super.setRole(super.getRole());
		}*/
		
	
	public Generaliste() {
		super();
	}
}
