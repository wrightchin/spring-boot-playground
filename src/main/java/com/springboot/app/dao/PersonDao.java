package com.springboot.app.dao;

import com.springboot.app.model.Person;

import java.util.List;
import java.util.UUID;
import java.util.Optional;

public interface PersonDao {

    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
