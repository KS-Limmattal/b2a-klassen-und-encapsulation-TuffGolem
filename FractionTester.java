public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction(4, 3);
        Fraction d = new Fraction();
        Fraction c = new Fraction(f);
        Fraction b = new Fraction(8, 6);
        System.out.println(f + " " + d + " " + c + " " + b);
        System.out.println(f.equals(c) + " " + b.equals(f));  // Inhaltsgleichheit (gekürzt)
        System.out.println((f == c) + " " + (b == f) );  // Objektgleichheit
        f.add(b);
        System.out.println(f);
        f.subtract(b);
        System.out.println(f);
        f.multiply(b);
        System.out.println(f);
        f.divide(b);
        System.out.println(f);
        MixedNumber mi = new MixedNumber(1, 2, 3);
        MixedNumber mue = new MixedNumber(2, 3, 4);
        System.out.println(mi);
        System.out.println(mue);
        mi.add(mue);
        System.out.println(mi);

        final double PI = 3.14159265358979323846264338327950288419716939937510;
        // toString():

        // Encapsulation, Getter und Setter:

        // Copy-Konstruktor und equals():
        
        // Klassen- und Instanzenmethoden:

        // statische Variablen:

    }

}
