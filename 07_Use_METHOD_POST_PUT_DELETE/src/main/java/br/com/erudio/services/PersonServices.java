package br.com.erudio.services;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {

        logger.info("Finding All people!");
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 8;  i++) {
            Person person = mockPerson(i);
                persons.add(person);
        }
        return persons;

    }

    public Person findById(String id) {

        logger.info("Finding one person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leonardo");
        person.setLasttName("Carvalho Vilela");
        person.setAddress("Uberlandia - Minas Gerais - Brasil");
        person.setGender("Male");
        return  person;

    }

    public Person create(Person person) {

        logger.info("Creating one person!");

        return person;
    }

    public Person update(Person person) {

        logger.info("Updating one person!");

        return person;
    }

    public void delete(String id) {

        logger.info("Deleting one person!");

    }


    private Person mockPerson(int i) {

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLasttName("Last Name " + i);
        person.setAddress("Some Addres in Brasil " + i);
        person.setGender("Male");
        return  person;
    }

}
