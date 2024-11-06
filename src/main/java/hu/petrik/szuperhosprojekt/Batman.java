package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos, Milliardos {
    public double lelemenyesseg;


    public Batman() {
        lelemenyesseg = 100;


    }
    public Batman(double lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;

    }
    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }
    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (this.getLelemenyesseg() > szuperhos.mekkoraAzEreje()) {
            return true;
        } else return false;
    }

    public double getLelemenyesseg() {
        return lelemenyesseg;
    }

    public void setLelemenyesseg(double lelemenyesseg) {
        this.lelemenyesseg = lelemenyesseg;
    }

    @Override
    public void kutyutKeszit() {
        this.setLelemenyesseg(this.getLelemenyesseg() + 50);
    }

    @Override
    public String toString() {
        return MessageFormat.format("Batman: leleményesség: {0}", this.lelemenyesseg);
    }
}
