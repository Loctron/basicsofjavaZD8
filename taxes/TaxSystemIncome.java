package taxes;

public class TaxSystemIncome extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit * 6 / 100;
    }
}