package hu.petrik.szuperhosprojekt;
import java.text.MessageFormat;
import java.util.Random;

public class Vasember extends Bosszuallo implements Szuperhos, Milliardos{

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        Random rand = new Random();
        setSzuperero(this.getSzuperero() + rand.nextFloat() * 10);

    }

    @Override
    public boolean megmentiAVilagot() {
        if (this.getSzuperero() > 1000) {
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Vasember: Szupererő: {0}; {1}", this.getSzuperero(), this.isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége");
    }
}
