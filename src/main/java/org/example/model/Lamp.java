package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private int globRating;
    private boolean battery;


    public Lamp(LampType style, boolean battery, int globRating) {
        this.globRating = globRating;
        this.battery = battery;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery() {
        return battery;
    }

    public LampType getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "globRating=" + globRating +
                ", battery=" + battery +
                ", style=" + style +
                '}';
    }
}
