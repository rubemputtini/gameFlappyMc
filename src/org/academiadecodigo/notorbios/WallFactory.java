package org.academiadecodigo.notorbios;

public class WallFactory {

    private Walls upperPipe;
    private Walls lowerPipe;


    public void createWall() {
        this.upperPipe = new Walls(100, 300);
        this.lowerPipe = new Walls(100,200, 500);
    }


    public void start () {
        upperPipe.fill();
        lowerPipe.fill();
    }

}
