package com.keepkoding;


import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.image.BufferedImage;

class PlayerShip extends Ship {
    private static final BufferedImage sprite =
        ImageLoader.load("playerShip.png");
    
    private static final double acc = 0.1;

    PlayerShip() {
        super(
            SpaceShooter.screenWidth * 0.5,     // x
            SpaceShooter.screenHeight * 0.8,    // y
            0,                                  // xVel
            0,                                  // yVel
            8.888,                              // maxVel
            sprite                              // sprite
        );
    }
    
    void update(boolean incXVel, boolean decXVel, boolean incYVel, boolean decYVel) {
        if(incXVel) {
            xVel += acc;
        }
        if(decXVel) {
            xVel -= acc;
        }
        if(incYVel) {
            yVel -= acc;
        }
        if(decYVel) {
            yVel += acc;
        }

        x += xVel;
        y += yVel;
        
        super.update();
    }
}
