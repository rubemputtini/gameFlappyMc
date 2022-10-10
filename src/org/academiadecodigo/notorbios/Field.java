package org.academiadecodigo.notorbios;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {

        private Picture picture;

        Rectangle field = new Rectangle( 0, 0, 1200,700);

        public void init(){
                field.draw();
                this.picture.draw();
        }

        public Field(String pathToFile) {
                this.picture = new Picture(0, 0, pathToFile);
        }
}
