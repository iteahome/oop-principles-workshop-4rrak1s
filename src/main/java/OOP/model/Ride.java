package OOP.model;

import java.util.Date;

public class Ride {

    private int ID;
    private String User;
    private String Bike;
    private String StartStation;
    private String EndStation;
    private String TimeStamp;

    public Ride(int ID, String user, String bike, String startStation, String endStation, String timeStamp) {
        this.ID = ID;
        User = user;
        Bike = bike;
        StartStation = startStation;
        EndStation = endStation;
        TimeStamp = timeStamp;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getBike() {
        return Bike;
    }

    public void setBike(String bike) {
        Bike = bike;
    }

    public String getStartStation() {
        return StartStation;
    }

    public void setStartStation(String startStation) {
        StartStation = startStation;
    }

    public String getEndStation() {
        return EndStation;
    }

    public void setEndStation(String endStation) {
        EndStation = endStation;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }

}

