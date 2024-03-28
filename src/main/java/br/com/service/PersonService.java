package br.com.service;

import br.com.domain.Person;
import br.com.repository.PersonRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository personRepository;

    public List<Person> getAllPerson(){
        return personRepository.listAll();
    }

    public Person createPerson(Person person){
        personRepository.persist(person);
        return person;
    }
}
