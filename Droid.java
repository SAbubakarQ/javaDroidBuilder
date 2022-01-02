// Bismillah - Abubakar Q
public class Droid{

  // Variables
  String name;
  int battery;


  // Constructor
  public Droid(String nameDroid){
    name = nameDroid;
    battery = 100;
  }

  // Method - Perfrom Task
  public void performTask(String task){
    System.out.println("*" + name + "*" + " is performing: " + task + "\n");
    battery -= 10;
  }

  // Method - State Battery Level
  public int stateBattery() {
    System.out.println(name + "'s battery level at ");
    return battery;
  }

  //-- Additional Methods --//

  // Recharge 
  public void rechargeDroid(){
    
    if (battery < 100) {
      System.out.println("\n" + name + " is charging...");
      battery = 100;

      System.out.println("Battery at " + battery + "%\n");
    } else {
      System.out.println("No need to charge " + name + ", battery at: " + battery + "%");
    }
  }

  // toString Method (Built in method in Java)
  public String toString() {
    return "Droid Name: " + name + "\nBattery Level: " + battery + "\n";
  }

  // Main Method
  public static void main(String[] args){
    System.out.println("--Bismillah--\n");

    // Declaring Droid
    Droid r2d2 = new Droid("R2D2");
    // Declaring Second Droid
    Droid bb8 = new Droid("BB8");

    // Droid Stats
    System.out.println(r2d2);
    System.out.println(bb8);


    // Performing Task
    r2d2.performTask("Annihilating");

    // Battery Level
    System.out.println(r2d2.stateBattery());
    System.out.println(bb8.stateBattery());

    // Recharge Droid
    r2d2.rechargeDroid();
    bb8.rechargeDroid();


  }
}
