package com.fourtk.desafiozup.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourtk.desafiozup.dto.PersonDTO;
import com.fourtk.desafiozup.entities.Person;
import com.fourtk.desafiozup.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	@Transactional
	public PersonDTO insert(PersonDTO dto) {
		
		Person entity = new Person();
		copyDtoToEntity(dto, entity);
		entity =  repository.save(entity);
		return new PersonDTO(entity);		
	}
	
	
	private void copyDtoToEntity(PersonDTO dto, Person entity) {
		
			entity.setName(dto.getName());
			entity.setEmail(dto.getEmail());
			entity.setCpf(dto.getCpf());
			entity.setDateOfBirth(dto.getDateOfBirth());
		}
}
