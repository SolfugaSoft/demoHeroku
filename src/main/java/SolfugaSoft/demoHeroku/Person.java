package SolfugaSoft.demoHeroku;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private Person() {

    }

    private Person(String name){
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

