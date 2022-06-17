package com.company;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinFuncInterfaces {
    public static void main(String[] args) {
        //предикат
        int n = -2;
        Predicate<Integer> isPositive = i->i>0;
        System.out.println(isPositive.test(n));

        Predicate<Integer> isZero = i->i==0;
        System.out.println(isZero.test(n));

        Predicate<Integer> isNegative = isPositive.or(isZero).negate();
        System.out.println(isNegative.test(n));

        //функция
        Function<Person, String> getName = Person::getName;
        Person person = new Person("name", "surname");
        System.out.println(getName.apply(person));

        Function<String, Character> firstChar = s->s.charAt(0);
        System.out.println(firstChar.apply("Hello"));

        //поставщик
        Supplier<Person> supplier = Person::new;
        person = supplier.get();
        System.out.println(person.getName());

        //потребитель
        Consumer<Person> greeating = p-> System.out.println("Hello,"+p.getName());
        person = new Person("name", "surname");
        greeating.accept(person);

        //сравниватель
        Comparator<Person> comparator = (p1,p2)->p1.getName().compareTo(p2.getName());
        Person person1 = new Person("john", "doe");
        Person person2 = new Person("alice", "krige");
        System.out.println(comparator.compare(person1, person2));
    }

    boolean isPositive2(Integer i){
        if (i>0) return true;
        else return false;
    }
}
