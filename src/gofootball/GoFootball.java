/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofootball;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ma 7m Ou D
 */
public class GoFootball {
    int loggedUser=0;
 ArrayList<player> users=new ArrayList<player>();
        ArrayList<playground> playgrounds=new ArrayList<playground>();
    

//    }
    public void addplayground(int price,int ownerId){
        playground p=new playground();
        p.setId(playgrounds.size()+1);
        p.setOwnerId(ownerId);
        p.setPricePerHour(price);
        playgrounds.add(p);
        System.out.println("Done!");
    }
    public static void main(String[] args) {
        GoFootball admin=new GoFootball();
       player p=new player();
       owner o=new owner();
       p.signup("mahmoud", "aa@gmail", 22, "nn", admin);           //add player
       o.signup("ahmed", "a@yahoo.com", 40,1, "aa", admin);         //add playground owner
       admin.addplayground(20,2);                                  //add playground with price per hour and owner id
       p.bookPlayground(1, 1, 2, "12/1/2021", 5, 7, admin);        //make reservation
       p.bookPlayground(1, 1, 1, "12/1/2021", 6, 7, admin);        //make wronge reservation
       for(int i=0;i<admin.users.size();i++)                       //print users names
           System.out.println(admin.users.get(i).name);
    
       for(int i=0;i<admin.playgrounds.size();i++)
           System.out.print(admin.playgrounds.get(i).schedule.size());
    }
    
}
