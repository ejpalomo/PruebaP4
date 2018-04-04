/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misolucionp4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Esteban
 */
public class Main {
    public static void main(String[] args){
        Autor autor = new Autor();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MiSolucionP4PU");
        EntityManager em = emf.createEntityManager();
        
        em.close();
        emf.close();
    }
    
}
