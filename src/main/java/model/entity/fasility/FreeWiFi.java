package model.entity.fasility;

public class FreeWiFi extends Facility {
        private float coast;

    @Override
    public float getCoast() {
        return this.coast;
    }

    @Override
    public void setCoast(float coast) {
        this.coast=coast;
    }

    public FreeWiFi(float coast) {
        this.coast = coast;
    }
    @Override
    public String toString() {
        return "FreeWiFi coast=" + coast ;
    }
}
