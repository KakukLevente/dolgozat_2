/*
* Author: Kakuk Levente
* Group: Szoft 1/1/N
* Date: 2023-04-06
* Github: https://github.com/KakukLevente/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class Szamitas {

    public Szamitas() {}
    public void startSzamitas() {
        double terfogat =  this.bekerDatas();
        nyomtat(terfogat);
    }
    private void nyomtat(double terfogat) {
        System.out.println(terfogat);
    }
    private double bekerDatas() {
        String a_oldalStr = beker("A oldal: ");        
        if(!this.checkInput(a_oldalStr)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }
        String b_oldalStr = beker("B oldal: ");
        if(!this.checkInput(b_oldalStr)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }        
        String c_oldalStr = beker("C oldal: ");
        if(!this.checkInput(c_oldalStr)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }

        double a_oldal = Double.parseDouble(a_oldalStr);
        double b_oldal = Double.parseDouble(b_oldalStr);
        double c_oldal = Double.parseDouble(c_oldalStr);
        double terfogat = this.szamitTerfogat(a_oldal, b_oldal, c_oldal);
        return terfogat;
    }
    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
    public double szamitTerfogat(double a_oldal, double b_oldal, double c_oldal) {
        double terfogat = a_oldal*b_oldal*c_oldal;
        return terfogat;
    }
    public boolean checkInput(String input) {
        if(input.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }        
    }
}
