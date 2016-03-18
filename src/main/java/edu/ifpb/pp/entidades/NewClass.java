/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ifpb.pp.entidades;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Luciana
 */
public class NewClass {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DbUnit_Teste");

        EntityManager em = emf.createEntityManager();
        
    }    
}
