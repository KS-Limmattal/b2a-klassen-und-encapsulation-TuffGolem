public class MixedNumber extends Fraction{
    private int numberInSeFront;

    public MixedNumber(int numberInSeFront, int numerator, int denominator){
        super(numerator, denominator);
        this.numberInSeFront = numberInSeFront;
    }

    public int getNumberInSeFront() {
        return numberInSeFront;
    }

    public void setNumberInSeFront(int numberInSeFront) {
        this.numberInSeFront = numberInSeFront;
    }

    public void add(MixedNumber f){
        this.setNumberInSeFront(f.getNumberInSeFront() + this.getNumberInSeFront());
        super.add(f);
    }

    public String toString() {
        return this.getNumberInSeFront() + " + " + super.getNumerator() + "/" + super.getDenominator();
    }
}
