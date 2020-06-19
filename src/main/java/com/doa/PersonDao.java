package com.doa;

import java.util.*;
import com.entities.*;

public class PersonDao {

	
	PersonDatModel model=new PersonDatModel();
	
	
	public void add() {
		Person p1=new Person();
		p1.setfName("Kwame");
		p1.setlName("Nana");
		p1.setGender("Male");
		p1.setId(12);
		p1.setUserName("Nana_kwame");
		
		Person p2=new Person();
		p2.setfName("James");
		p2.setlName("Brown");
		p2.setUserName("Jamesbrown");
		p2.setGender("Male");
		p2.setId(23);
		
		Person p3=new Person();
		p3.setUserName("WHiteLady");
		p3.setfName("White");
		p3.setlName("Lady");
		p3.setGender("Female");
		p3.setId(3);
		model.addPerson(p1);
		model.addPerson(p2);
		model.addPerson(p3);
	}
	
	public List<Person> persons(){
		return model.getP();
	}
	

}
