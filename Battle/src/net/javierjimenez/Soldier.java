/**
 *
 */
package net.javierjimenez;

import acm.graphics.GImage;
import java.util.Random;

/**
 * @author Surrui
 *
 */
public class Soldier {

    private static final int MAX_VELOCITY = 10;

    private GImage image;

    private int directionX;

    private int velocity;

    private int looking;

    /**
     * @return the velocity
     */
    public int getVelocity() {

        Random rnd = new Random();

        velocity = rnd.nextInt(MAX_VELOCITY);

        return velocity;

    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(int velocity) {

        this.velocity = velocity;

    }

    /**
     * @return the image
     */
    public GImage getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(GImage img) {

        this.image = img;

    }



}
