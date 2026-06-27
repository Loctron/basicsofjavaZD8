import taxes.Company;
import taxes.TaxSystemIncome;
import taxes.TaxSystemIncomeMinusExpenses;

public class Main {
    public static void main(String[] args) {

        Company company = new Company(
                "Рога и Копыта",
                new TaxSystemIncome()
        );

        company.shiftMoney(100_000); // доход
        company.shiftMoney(-30_000); // расход

        company.payTaxes(); // 6000 руб.

        company.setTaxSystem(
                new TaxSystemIncomeMinusExpenses()
        );

        company.shiftMoney(100_000);
        company.shiftMoney(-30_000);

        company.payTaxes(); // 10500 руб.
    }
}