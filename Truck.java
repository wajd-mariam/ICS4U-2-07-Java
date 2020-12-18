/*
* Copyright (c) 2020
*
* The Jet.java is a subclass for Airplanes.java file.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/16
*/

// Truck class
public class Truck extends Vehicles {

  // fields
  private String licensePlateNumber;
  
  /**
   * Method that calculates the car speed while accelerating.
   */
  public Truck(String colorTruck) {
    super(colorTruck);
    this.color = colorTruck;
    licensePlateNumber = "";
  }  

  // Setting license plate number Method
  public void licensePlateSetter(String licensePlate) {
    this.licensePlateNumber = licensePlate;
  }
  
  // Getter to return license plate number:
  public String licensePlateGetter() {
    return this.licensePlateNumber;
  }
  
  // Method returning the honk noise.
  public String provideAir() {
    return "HONK HONK";
  }
}