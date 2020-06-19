package com.doa;

import com.entities.*;
import java.util.*;

public class PersonDatModel {

	private List<Person> allPerson = new ArrayList<>();

	public List<Person> getP() {
		return this.allPerson;
	}

	public void addPerson(Person person) {
		this.allPerson.add(person);
	}

	public Person getPersonById(int id) {
		return this.allPerson.get(id);
	}

	public List<Person> removePerson(int id) {
		this.allPerson.remove(id);
		return this.allPerson;
	}
}
