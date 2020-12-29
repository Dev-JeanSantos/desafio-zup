package com.fourtk.desafiozup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fourtk.desafiozup.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
