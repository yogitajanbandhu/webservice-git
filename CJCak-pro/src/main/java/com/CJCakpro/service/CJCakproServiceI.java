package com.CJCakpro.service;

import java.util.List;

import com.CJCakpro.model.Student1;

public interface CJCakproServiceI {

	public List getData(String addr);

	public void postData(Student1 s);

	public void deleteData(int rollno);

}
