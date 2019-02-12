package SolfugaSoft.demoHeroku;

import javax.persistence.Entity;

@Entity
public class Person {

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

