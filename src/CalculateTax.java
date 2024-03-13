public class CalculateTax {
    public static void main(String[] args) {
        // Define base Yearly income without Tax
        double yearlySalary = 36000;

        // 15% bonus with base salary added
        double yearlySalaryWithBonus = 41400; // 15% bonus with base salary added (3600 + 5400)

        //define all sort of taxes
        double federalTaxAmount = 15.5;
        double stateTaxAmount =3.4;
        double localTaxAmount = 1.8;


        // calculate taxes
        double federalTax = yearlySalary * (federalTaxAmount / 100);
        double stateTax = yearlySalary * stateTaxAmount / 100;
        double  localTax = yearlySalary * localTaxAmount / 100;

        // sum of all taxes paid
        double totalTaxPaid = federalTax + stateTax + localTax;

        // calculate take home salary
        double takeHomeSalary = yearlySalaryWithBonus - totalTaxPaid;

        // print results
        System.out.println("Take home yearly salary: $" + takeHomeSalary);
        System.out.println("Tax Paid $" + totalTaxPaid);
        System.out.println("Federal Tax: $" + federalTax);
        System.out.println("State Tax: $" + stateTax);
        System.out.println("Local Tax: $" + localTax);

    }
}
