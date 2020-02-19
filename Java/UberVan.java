import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {

  Map<String, Map<String, Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterials;
  private Integer passegenger;

  public UberVan(String license, Account driver) {
    super(license, driver);
  }

  public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterials) {
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterials = seatsMaterials;
  }

  @Override
  public void setPassenger(Integer passegenger) {
    if (passegenger == 6) {
      this.passegenger = passegenger;  
    } else {
      System.out.println("Necesitas asignar 4 pasajeros");  
    }
  }
}