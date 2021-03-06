package com.apress.springrecipes.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.apress.springrecipes.sequence");

        SequenceDao sequenceDao = context.getBean(SequenceDao.class);

        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
        
        System.out.println("enterd line for git testing");
        System.out.println("enterd 2nd.. line for git testing after importing(Pull) the project from git");
        System.out.println("enterd onemore line for comparing");
        System.out.println("One more");
    }
}