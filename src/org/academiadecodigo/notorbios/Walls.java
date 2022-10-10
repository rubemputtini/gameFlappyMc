package org.academiadecodigo.notorbios;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Walls extends Rectangle {

    private int positionX;
    private int positionY;

    public Walls(int width, int height) {
        new Rectangle(1100, 0, width, height);
        this.positionX = width;
        this.positionY = height;
    }

    public Walls(int width, int height, int YPos) {
        new Rectangle(1100, YPos, width, height);
        this.positionX = width;
        this.positionY = height;
    }
}
