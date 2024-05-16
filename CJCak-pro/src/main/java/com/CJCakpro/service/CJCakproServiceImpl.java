package com.CJCakpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CJCakpro.model.Student1;
import com.CJCakpro.repository.CJCakproRepository;

@Service
public class CJCakproServiceImpl implements CJCakproServiceI {

	@Autowired
	CJCakproRepository cr;
	
	
	@Override
	public List getData(String addr) {
		    List l=cr.findByAddress(addr);
		
		    return l;
	}

	@Override
	public void postData(Student1 s) {
		        cr.save(s);
		
	}

	@Override
	public void deleteData(int rollno) {
		   cr.deleteById(rollno);
		
	}

}
