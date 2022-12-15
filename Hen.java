class Hen {
  boolean alive;
  boolean attackable;
  String canAttack;
  String size;
  String description;

  public Hen() {
    boolean alive = true;
    boolean attackable = false;
    String canAttack = "Grain";
  }

  public Hen(String size) {
    boolean alive = true;
    boolean attackable = false;
    String canAttack = "Grain";
    this.size = size;
    String description = "A "+size+" hen. A fox will find this as a tasty snack.";
  }
}