package org.donkeysharp.repositories;

import javax.transaction.Transactional;

import org.donkeysharp.models.Person;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface PersonRepository extends CrudRepository<Person, Long> {
	public Person findByName(String name);
}
