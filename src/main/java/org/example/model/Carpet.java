package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width, height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "height=" + height +
                ", color=" + color +
                ", width=" + width +
                '}';
    }
}
