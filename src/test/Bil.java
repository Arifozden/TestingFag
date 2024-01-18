package test;

public class Bil {
    private String farge;

    private int km;

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String sjekkService(){
        if(km < 20000){
            return "Service er ikke nødvendig";
        } else if (km >= 20000 && km < 50000) {
            return "20000 km service er nødvendig";
        }
        return "50000 km service er nødvendig";
    }
}
