package OOP.model;

import java.util.List;

public class Station {

    private int ID;
    private String name;
    private List<Bike> bikes;

    public Station(int ID, String name, List<Bike> bikes) {
        this.ID = ID;
        this.name = name;
        this.bikes = bikes;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public List<Bike> getBikes() {
        return bikes;
    }
}
