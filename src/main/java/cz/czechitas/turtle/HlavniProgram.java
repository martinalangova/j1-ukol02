package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        zofka.setLocation(50,150);
        nakresliZmrzlinu(zofka);

        zofka.turnLeft(90);





    }


    private void nakresliZmrzlinu(Turtle zofka) {
        zofka.setPenColor(Color.magenta);
        zofka.setPenWidth(5);
        nakresliKolecko(zofka, 150);

        zofka.turnRight(90);
        zofka.setPenColor(Color.ORANGE);
        zofka.setPenWidth(10);
        rovnostrannyTrojuhelnik(zofka, 150);
    }


    private void nakresliCtverecek(Turtle zofka, double delkaStrany) {
        nakresliMnohouhelnik(zofka, delkaStrany, 4);
    }

    private void nakresliObdelnik(Turtle zofka, double delkaStranyA, double delkaStranyB) {
        double uhel=90;
        for (int i=0; i<2;i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(uhel);
            zofka.move(delkaStranyB);
            zofka.turnRight(uhel);
        }
    }

    private void rovnostrannyTrojuhelnik(Turtle zofka, double delkaStrany){
        nakresliMnohouhelnik(zofka, delkaStrany, 3);
    }

    private void rovnoramennyTrojuhelnik(Turtle zofka, double delkaStrany){
        double velikostPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));
        double uhelA=90;
        double uhelB=45;
        zofka.move(delkaStrany);
        zofka.turnLeft(180-uhelB);
        zofka.move(velikostPrepony);
        zofka.turnLeft(180-uhelB);
        zofka.move(delkaStrany);

    }

    private void nakresliKolecko(Turtle zofka, double prumer) {
        int pocetStran=24;
        double delkaStrany=(prumer*3.14)/pocetStran;
        nakresliMnohouhelnik(zofka, delkaStrany,pocetStran);

    }

    // pro rovnostranný trojúhelník, čtverec i kolečko lze použít následující
    private void nakresliMnohouhelnik(Turtle zofka, double delkaStrany, int pocetStran) {
        double uhel=360.0/pocetStran;

        for (int i = 0; i < pocetStran; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
        }
    }


}
