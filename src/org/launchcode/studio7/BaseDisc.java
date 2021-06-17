package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private Integer capacity;
    private ArrayList<String> contents;
    private String discType;
    private Integer spinRateMin;
    private Integer spinRateMax;

    public BaseDisc(String aName, ArrayList<String> someContents, Integer aCapacity, String aDiscType, Integer aSpinRateMin, Integer aSpinRateMax) {
        name = aName;
        capacity = aCapacity;
        contents = someContents;
        discType = aDiscType;
        spinRateMin = aSpinRateMin;
        spinRateMax = aSpinRateMax;
    }

    public BaseDisc(String aName, ArrayList<String> someContents, Integer aCapacity, String aDiscType) {
        name = aName;
        capacity = aCapacity;
        contents = someContents;
        discType = aDiscType;
    }

    public BaseDisc(String aName, ArrayList<String> someContents) {
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public Integer getSpinRateMin() {
        return spinRateMin;
    }

    public Integer getSpinRateMax() {
        return spinRateMax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void setSpinRateMin(Integer spinRateMin) {
        this.spinRateMin = spinRateMin;
    }

    public void setSpinRateMax(Integer spinRateMax) {
        this.spinRateMax = spinRateMax;
    }

    public String reportDiscInfo() {
        return "Name: " + this.name + "\nCapacity: " + this.capacity + "MB\nContents: " + this.contents +
                "\nDisc Type: " + this.discType + "\nSpin Rate: " + this.spinRateMin + " - " + this.spinRateMax + " rpm";
    }

    public void write() {
    }

}
