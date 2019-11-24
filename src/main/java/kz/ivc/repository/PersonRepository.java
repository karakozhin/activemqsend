package kz.ivc.repository;

import kz.ivc.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepository {

    public Person getPerson(int id){
        List<Person> personList = new ArrayList<>();

        Person person = new Person();
        person.setId(1);
        person.setAge(26);
        person.setName("Zharkyn");
        person.setSurname("Karakozhin");
        person.setGender("male");

        Person person1 = new Person();
        person1.setId(2);
        person1.setAge(25);
        person1.setName("Bekzat");
        person1.setSurname("Minazhatov");
        person1.setGender("male");

        personList.add(person);
        personList.add(person1);

        return personList.get(id);
    }
}
