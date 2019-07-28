package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {
        //*********************************************Task 1***********************************************************
        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor = context.getBean("actor",Actor.class);
        System.out.println(actor);

        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

        //Using XMLBeanFactory
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie1= factory.getBean("movie", Movie.class);
        System.out.println(movie);
        System.out.println("*****************************************************************");

        //**********************************************Task 2**********************************************************
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor1 = context1.getBean("actor1", Actor.class);
        System.out.println(actor1);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor2 = context2.getBean("actor2", Actor.class);
        System.out.println(actor2);

        ApplicationContext context3 = new ClassPathXmlApplicationContext("beans.xml");
        Actor actor3 = context3.getBean("actor3", Actor.class);
        System.out.println(actor3);

        ApplicationContext context4 = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2 = context4.getBean("movie1", Movie.class);
        System.out.println(movie2);

        Movie movie3 = context4.getBean("movie1", Movie.class);
        System.out.println(movie3);

        System.out.println(movie3==movie2);

    }
}