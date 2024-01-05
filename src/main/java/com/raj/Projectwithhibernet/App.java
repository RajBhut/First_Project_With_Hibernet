package com.raj.Projectwithhibernet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
        System.out.println( "Project Started!" );
        Configuration  cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Address ad = new Address();
        ad.setAdddate(new Date());
        ad.setAddress("Junagadh,zanzarda_Road");
        ad.setX(214.214);
        ad.setIsopen(true);
        FileInputStream file = new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[file.available()];
        file.read(data);
        ad.setImage(data);
        
        Student[] s = new Student[2];
        s[0] = new Student();
        s[1] = new Student();
       
        s[0].setId(1);
        s[0].setName("Khushi");
        s[0].setCity("Junagadh");
        System.out.println(s[0]); 
        
        s[1].setName("Raj");
        s[1].setCity("Junagadh");
        s[1].setId(2);
        for(int i = 0 ; i < 2 ; i++)
        {
        Session  session = factory.openSession();
        Transaction tx = session.beginTransaction();
     
        
       session.save(s[i]);
     
        tx.commit();
        session.close();
        }
        Session  session = factory.openSession();
        Transaction tx = session.beginTransaction();
     
        
      session.save(ad);
     
        tx.commit();
        session.close();
        
        
    }
}
