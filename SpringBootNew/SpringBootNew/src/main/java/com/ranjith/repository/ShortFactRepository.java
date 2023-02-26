package com.ranjith.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ranjith.model.ShortFact;  

public interface ShortFactRepository extends CrudRepository<ShortFact, Integer>
{

	 List<ShortFact> findByDescriptionContainingIgnoreCase(String word);
	 List<ShortFact> findByNameContainingIgnoreCase(String name);
	
}
 