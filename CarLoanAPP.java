//Name: A.Verma
//Period: 4B

public class CarLoanAPP
{
    public static void main(String[] args)
    {
        double retailPrice = 25000.0;
        double tradeIn = 2000.0;
        double downPayment = 3000.0;
        double financedAmount = retailPrice - (tradeIn + downPayment);
        double interestPaid = financedAmount * 0.08;
        double totalFinanced = financedAmount + interestPaid;
        int months = 60;
        double monthlyPayment = totalFinanced/months;
        
        System.out.println("CAR LOAN PAYMENT APP");
        System.out.print("Retail price of car $");
        System.out.println(retailPrice);
        System.out.print("Trade-in value $");
        System.out.println(tradeIn);
        System.out.print("Down Payment $");
        System.out.println(downPayment);
        System.out.print("Amount to finance $");
        System.out.println(financedAmount);
        System.out.print("Interest Paid $");
        System.out.println(interestPaid);
        System.out.print("Total financing $");
        System.out.println(totalFinanced);
        System.out.print("MONTHLY PAYMENT $");
        System.out.println(monthlyPayment);
        System.out.print("spread out over ");
        System.out.print(months);
        System.out.println(" months");
        
    }
} 
