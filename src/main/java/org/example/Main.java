package org.example;


import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp(LampType.NORMAL,true,80);
        Ceiling ceiling = new Ceiling(10, PaintColor.RED);
        Bed bed = new Bed("double", 2, 3,4,2);
        Wall nwall = new Wall("North");
        Wall swall = new Wall("South");
        Wall ewall = new Wall("East");
        Wall wwall = new Wall("West");
        Wall[] walls = new Wall[]{nwall, ewall, wwall, swall};
        Carpet carpet = new Carpet(10,20, PaintColor.WHITE);
        Wardrobe wardrobe = new Wardrobe(5,10,20);

        Bedroom bedroom = new Bedroom(wwall,ewall,swall,nwall,ceiling,lamp,carpet,"Oda",bed,wardrobe);
        bedroom.createBedroom();
    }
}