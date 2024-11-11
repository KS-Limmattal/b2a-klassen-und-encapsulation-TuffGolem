public class Fraction {
    private static int numberOfFractions;
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {  // __init__()
        this.setNumerator(numerator);
        this.setDenominator(denominator);
        numberOfFractions++;
    }

    public Fraction() {
        this(0, 1);  // ruft Initialisierung für 0 und 1 auf.
    }

    public Fraction(Fraction f) {
        this(f.getNumerator(), f.getDenominator());
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero SO SCHLECHT MANANA");
        } else {
            this.denominator = denominator;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getNumberOfFractions() {
        return numberOfFractions;
    }

    public void simplify() {
        int actuallyPossibleGGT = 1;
        for (int possibleGGT = 1; possibleGGT <= Math.min(this.getDenominator(), this.getNumerator()); possibleGGT++){
            if ((this.getDenominator() % possibleGGT) == 0 && (this.getNumerator() % possibleGGT) == 0) {
                actuallyPossibleGGT = possibleGGT;
            }
        }
        this.setNumerator(this.getNumerator()/actuallyPossibleGGT);
        this.setDenominator(this.getDenominator()/actuallyPossibleGGT);
    }

    public void additive_inverse() {
        this.setNumerator(this.getNumerator()*-1);
    }

    public void multiplicative_inverse(){
        int denominator = this.getDenominator();
        this.setDenominator(this.getNumerator());
        this.setNumerator(denominator);
    }

    public void add(Fraction f) {  // Objektmethode -- verändert das Objekt, mit dem es aufgerufen wurde.
        this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator);
        this.setDenominator(this.denominator * f.denominator);
        this.simplify();
    }

    public static Fraction add(Fraction f1, Fraction f2) {  // Klassenmethode (static) -- gibt das Ergebnis zurück. wird mit Fraction.add(f, g) aufgerufen.
        Fraction f = new Fraction(f1.numerator * f2.denominator + f1.denominator * f2.numerator, f1.denominator * f2.denominator);
        f.simplify();
        return f;
    }

    public void subtract(Fraction f) {
        f.additive_inverse();
        this.add(f);
        f.additive_inverse();
    }

    public void multiply(Fraction f) {
        this.setNumerator(this.getNumerator()*f.getNumerator());
        this.setDenominator(this.getDenominator()*f.getDenominator());
        this.simplify();
    }

    public void divide(Fraction f) {
        f.multiplicative_inverse();
        this.multiply(f);
        f.multiplicative_inverse();
    }
    
    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }

}
