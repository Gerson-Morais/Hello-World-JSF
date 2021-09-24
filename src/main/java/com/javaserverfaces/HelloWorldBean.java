package com.javaserverfaces;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

@ManagedBean
public class HelloWorldBean {

    HelloWorld hello = new HelloWorld();
    List<HelloWorld> helloWorlds;

    public void setHello(HelloWorld hello) {
        this.hello = hello;
    }

    public HelloWorld getHello() {
        return hello;
    }

    public List<HelloWorld> getHelloWorlds(){
        EntityManager em = JPAUtil.getEntityManager();
        Query q = em.createNativeQuery("SELECT * FROM public.helloworld LIMIT 3",HelloWorld.class);
        this.helloWorlds = q.getResultList();
        em.close();
        return helloWorlds;
    }
    public void salvar (){

        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(hello);
        tx.commit();
        em.close();
        JPAUtil.getEntityManager().close();
    }
}
