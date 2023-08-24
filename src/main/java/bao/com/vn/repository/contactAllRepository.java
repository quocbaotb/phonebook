package bao.com.vn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import bao.com.vn.entity.contact;

@Transactional
public interface contactAllRepository extends JpaRepository<contact, String> {

	@Query(value = "SELECT name, email_address, telephone_number, posalt_address, id FROM public.\"contactInfo\"", nativeQuery = true)
	public List<contact> listCont();
	
	@Query(value = "SELECT name, email_address, telephone_number, posalt_address, id\r\n"
			+ "	FROM public.\"contactInfo\" where id = ?", nativeQuery = true)
	public contact contactById(int id);
	
	@Modifying
	@Query(value = "DELETE FROM public.\"contactInfo\"\r\n"
			+ "	WHERE id= ?", nativeQuery = true)
	public int deleteContactById(int id);
	
	@Modifying
	@Query(value = "UPDATE public.\"contactInfo\" SET name=?, email_address=?, telephone_number=?, posalt_address=? WHERE id=?", nativeQuery = true)
	public void updateContactById(String name, String email, int phone, String address, int id);
	
}
