import java.util.Scanner;

public class Szamitas {

    public Szamitas() {}
    public void startSzamitas() {
        double tenyleges =  this.bekerDatas();
        nyomtat(tenyleges);
    }
    private void nyomtat(double tenyleges) {
        System.out.println(tenyleges);
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
        double tenyleges = this.szamitTenylegesKamat(a_oldal, b_oldal, c_oldal);
        return tenyleges;
    }
    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
    public double szamitTenylegesKamat(double a_oldal, double b_oldal, double c_oldal) {
        double tenyleges = a_oldal*b_oldal*c_oldal;
        return tenyleges;
    }
    public boolean checkInput(String input) {
        if(input.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }        
    }
}
