package com.example.Boot;

import com.entities.*;
import java.util.*;
import com.doa.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonRest {

	//@Autowired
	private PersonDao dao=new PersonDao();
	
	@RequestMapping("/")
	@ResponseBody
	public List<Person> person(){
		dao.add();
		return dao.persons();
	}
	
}
