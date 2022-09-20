public class Main
{
    public static void main(String[] args)
    {

        double ccBalance = 5000;
        double interestPercent = 0.17;
        double interestDueFirst = 0;
        double interestDueSecond = 0;
        double interestDueThird = 0;

        interestDueFirst = ccBalance * interestPercent / 12;

        System.out.printf("First month interest due : %.2f", interestDueFirst);
        System.out.println();
        ccBalance += interestDueFirst;
        interestDueSecond = ccBalance *  interestPercent / 12;
        ccBalance += interestDueSecond;
        interestDueThird = ccBalance *  interestPercent / 12;
        System.out.printf("Third month interest due : %.2f", interestDueThird);




    }
}