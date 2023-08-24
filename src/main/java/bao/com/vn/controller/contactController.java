package bao.com.vn.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bao.com.vn.entity.contact;
import bao.com.vn.service.contactService;

@RestController
public class contactController {

	@Autowired
	contactService contSv;

	@GetMapping("/contact")
	public List<?> listContact() {
		return contSv.lsitAllCont();
	}

	@GetMapping("/contact/{id}")
	public contact listContactById(@PathVariable int id) {
		return contSv.contactById(id);
	}

	@PostMapping("/contact/delete/{id}")
	public String deleteContactById(@PathVariable int id) {
		return contSv.deleteContactById(id);
	}

	@PostMapping("/contact/update/{id}")
	public String updateContactById(@RequestBody contact contacts, @PathVariable int id) {
		return contSv.updateContactById(contacts.getName(), contacts.getEmail_address(), contacts.getTelephone_number(),
				contacts.getPosalt_address(), id);
	}

}
