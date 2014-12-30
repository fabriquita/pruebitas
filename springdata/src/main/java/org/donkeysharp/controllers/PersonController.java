package org.donkeysharp.controllers;

import org.donkeysharp.models.Person;
import org.donkeysharp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/person/{name}")
	public Person get(@PathVariable(value="name")String name) {
		try {
			Person person = personRepository.findByName(name);
			return person;
		} catch (Exception e) {
		}
		return new Person("foo", "bar");
	}
}
