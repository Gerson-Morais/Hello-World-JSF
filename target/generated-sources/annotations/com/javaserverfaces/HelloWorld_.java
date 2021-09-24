package com.javaserverfaces;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HelloWorld.class)
public abstract class HelloWorld_ {

	public static volatile SingularAttribute<HelloWorld, String> firstName;
	public static volatile SingularAttribute<HelloWorld, String> lastName;
	public static volatile SingularAttribute<HelloWorld, Integer> id;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String ID = "id";

}

