package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Ivan", "Ivanov"),
                new Person("Ivan", "Petrov"),
                new Person("Petr", "Ivanov")
        );
/*
        Collections.sort(persons, new Comparator<Person>() {
        @Override
            public int compare(Person o1, Person o2){
            return o1.getSurname().compareTo(o2.getSurname());
        }
        });

 */

        persons.sort(Comparator.comparing(Person::getSurname));


        persons.forEach( System.out::println);
    }
}
