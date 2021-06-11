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
public class player {

    protected String name, email, password;
    protected int age, id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean bookPlayground(int playId, int playerId, int duration, String date, int checkin, int checkout, GoFootball admin) {
        reservation r = new reservation();

        playground p = new playground();
        r.setPlayerId(playerId);
        r.setPlaygroundId(playId);
        r.setDuration(duration);
        r.setDate(date);
        r.setCheckin(checkin);
        r.setCheckout(checkout);
        int temp=0;
        if (!admin.playgrounds.isEmpty()) {
            for (int i = 0; i < admin.playgrounds.size(); i++) {
                temp=i;
                if (playId == admin.playgrounds.get(i).getId()) {
                    for (int j = 0; j < admin.playgrounds.get(i).schedule.size(); j++) {
                        if (admin.playgrounds.get(i).schedule.get(j).getDate().equals(date)) {
                            if ((admin.playgrounds.get(i).schedule.get(j).getCheckin() == checkin || admin.playgrounds.get(i).schedule.get(j).getCheckout() == checkout)
                                    || (checkin < admin.playgrounds.get(i).schedule.get(j).getCheckout()) || checkout < admin.playgrounds.get(i).schedule.get(j).getCheckin()) {
                                System.out.println("failed");
                                return false;
                            }
                        }
                    }
                }

            }
            admin.playgrounds.get(temp).schedule.add(r);
            System.out.println("done");
            return true;
        } else {
            System.out.println("failed");
            return false;
        }

    }
    public void signup(String name,String email,int age,String password,GoFootball admin){
            this.name=name;
            this.age=age;
            this.email=email;
            this.password=password;
            this.id=admin.users.size()+1;
            admin.users.add(this);
            System.out.println("DONE ! ");
    }
}
