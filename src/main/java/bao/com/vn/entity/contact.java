package bao.com.vn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactInfo")
public class contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "email_address")
	private String email_address;

	@Column(name = "telephone_number")
	private int telephone_number;

	@Column(name = "posalt_address")
	private String posalt_address;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}


	public int getTelephone_number() {
		return telephone_number;
	}

	public void setTelephone_number(int telephone_number) {
		this.telephone_number = telephone_number;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosalt_address() {
		return posalt_address;
	}

	public void setPosalt_address(String posalt_address) {
		this.posalt_address = posalt_address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
