//package Parkeersimulator;

import java.util.Random;
import java.awt.*;

/**
 * Represents a car that reserved a spot, coloured green in the simulation.
 */
public class ReservedCar extends Car {
    private static final Color COLOR=Color.decode("#15c757");

    /**
     * Constructor for the ReservedCar class. Car stays between 15 and 195 minutes.
     */
    public ReservedCar() {
        Random random = new Random();
        int stayMinutes = (int) (15 + random.nextFloat() * 3 * 60);
        this.setMinutesLeft(stayMinutes);
        this.setMinutesTotal(stayMinutes);
        this.setHasToPay(true);
        this.setHasReserved(true);
        this.setHasReducedPrice(false);
    }

    /**
     * @return Colour of the car
     */
    public Color getColor(){
        return COLOR;
    }
}