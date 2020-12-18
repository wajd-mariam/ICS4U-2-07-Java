/*
* Copyright (c) 2020
*
* The Jet.java is a subclass for Airplanes.java file.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/16
*/

// Airplane class
public class Bike extends Vehicles {
  
  // fields
  public float cadence;
  
  /**
   * Method that calculates the car speed while accelerating.
   */ 
  public Bike(String colorBike) {
    super(colorBike);
    this.color = colorBike;
    cadence = 0;
  }  

  // Method to calculate cadence
  public float cadenceGetter() {
    cadence = (speedGetter() * 8);
    return cadence;
  }
  
  // Method returning the bell ring noise.
  public String ringBell() {
    return "RING RING";
  }
}