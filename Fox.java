class Fox {
  boolean alive;
  boolean attackable;
  String canAttack;
  String color;
  String description;

  public Fox() {
    boolean alive = true;
    boolean attackable = false;
    String canAttack = "Hen";
  }

  public Fox(String color) {
    boolean alive = true;
    boolean attackable = false;
    String canAttack = "Hen";
    this.color = color;
    String description = "A "+color+" fox. I wonder if it has a name?";
  }

  public static void speak(String say){
    if (say.equals("yip")) {
      System.out.println("The fox yips and yaps...");
    }
    else if (say.equals("scream")) {
      System.out.println("The fox shouts a blood curdling scream!");
    }
    else if (say.equals("growl")) {
      System.out.println("The fox lowers his stance, smiles his abhorrent teeth and then growls quietly.");
    }
    else if (say.equals("whine")) {
      System.out.println("The fox whines it displeasure.");
    }
    else if (say.equals("yelp")) {
      System.out.println("The fox yelps loudly.");
    }
    else{
      System.out.println("The fox makes a peculiar noise.");
    }
  }

  //SETTERS
  //GETTERS
}