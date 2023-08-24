package bao.com.vn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bao.com.vn.entity.contact;
import bao.com.vn.repository.contactAllRepository;

@Service
public class contactService {

	private static final Logger logger = Logger.getLogger(contactService.class);

	@Autowired
	contactAllRepository contactAllRepo;

	public List<contact> lsitAllCont() {
		List<contact> listConts = new ArrayList<>();
		try {
			listConts = contactAllRepo.listCont();
		} catch (Exception e) {
			logger.error(e);
		}
		return listConts;
	}

	public contact contactById(int id) {
		contact cont = new contact();
		try {
			cont = contactAllRepo.contactById(id);
		} catch (Exception e) {
			logger.error(e);
		}
		return cont;
	}

	public String deleteContactById(int id) {
		try {
			contactAllRepo.deleteContactById(id);
		} catch (Exception e) {
			logger.info(e);
			return "NULL";
		}
		return "SUCCESS";
	}
	
	public String updateContactById(String name, String email, int phone, String address, int id) {
		try {
			contactAllRepo.updateContactById(name, email, phone, address, id);
		} catch (Exception e) {
			logger.info(e);
			return "NULL";
		}
		return "SUCCESS";
	}
}
