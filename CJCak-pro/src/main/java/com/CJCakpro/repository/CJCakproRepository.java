package com.CJCakpro.repository;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository; 
import org.springframework.stereotype.Repository;

import com.CJCakpro.model.Student1;

@Repository
public interface CJCakproRepository extends CrudRepository<Student1,Integer>{

	
	
	public List findByAddress(String addr);
}



