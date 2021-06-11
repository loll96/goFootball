/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gofootball;

/**
 *
 * @author Ma 7m Ou D
 */
public class owner extends player{
    private int playgroundId;

    public int getPlaygroundId() {
        return playgroundId;
    }

    public void setPlaygroundId(int playgroundId) {
        this.playgroundId = playgroundId;
    }
    
    public void signup(String name,String email,int age,int playgroundId,String password,GoFootball admin){
            this.name=name;
            this.age=age;
            this.email=email;
            this.password=password;
            this.id=admin.users.size()+1;
            admin.users.add(this);
            System.out.println("DONE ! ");
    }
    
}
