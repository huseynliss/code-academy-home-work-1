import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(findDigitCounts(number));

        System.out.println(theSumOfPrimeNumbers(number));

        System.out.println(checkPalindromeStatus(number));
        System.out.println(findMonthName(number));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(45);
        integerArrayList.add(53);
        integerArrayList.add(51);
        integerArrayList.add(53);
        integerArrayList.add(454);
        integerArrayList.add(4);
        System.out.println(findMax(integerArrayList));

        System.out.println(checkUniqueDigits(number));

        scanner.close();
    }

    public static int findDigitCounts(int a) {
        String stringNumber = Integer.toString(a);
        return stringNumber.length();
    }

    public static int theSumOfPrimeNumbers(int a) {
        int tempA = a;
        int result = 0;
        int length = Integer.toString(tempA).length();
        for (int i = 0; i < length; i++) {
            int lastDigit = tempA % 10;
            int numberOfDivisors = 0;
            for (int j = 1; j <= lastDigit; j++) {
                if (lastDigit % j == 0) {
                    numberOfDivisors++;
                }
            }
            if (numberOfDivisors == 2 || numberOfDivisors == 1) {
                result += lastDigit;
            }

            tempA /= 10;
        }

        return result;

    }

    public static Boolean checkPalindromeStatus(int a) {
        String stringNumber = Integer.toString(a);
        String newNumber = null;
        for (int i = 0; i < stringNumber.length(); i++) {
            char c = stringNumber.charAt(stringNumber.length() - i - 1);
            if (newNumber == null) {
                newNumber = String.valueOf(c);
            } else {
                newNumber += c;
            }
        }
        return a == Integer.parseInt(newNumber);

    }

    public static String findMonthName(int a) {
        String monthString;

        switch (a) {
            case 1:
                monthString = "Yanvar";
                break;
            case 2:
                monthString = "Fevral";
                break;
            case 3:
                monthString = "Mart";
                break;
            case 4:
                monthString = "Aprel";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "Iyun";
                break;
            case 7:
                monthString = "Iyul";
                break;
            case 8:
                monthString = "Avqust";
                break;
            case 9:
                monthString = "Sentyabr";
                break;
            case 10:
                monthString = "Oktyabr";
                break;
            case 11:
                monthString = "Noyabr";
                break;
            case 12:
                monthString = "Dekabr";
                break;
            default:
                monthString = "Invalid month";
        }
        return monthString;
    }

    public static final int findMax(ArrayList<Integer> arrayList){
        int maxNumber = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i)>maxNumber){
                maxNumber=arrayList.get(i);
            }
        }
        return maxNumber;
    }

    public static final boolean checkUniqueDigits(int a){
        String stringNumber = Integer.toString(a);
        ArrayList<Integer> list = new ArrayList<>();
        Boolean checkStatus = true;
        for (int i = 0; i < stringNumber.length(); i++) {
            char c = stringNumber.charAt(i);
            int intC = Character.getNumericValue(c);
            list.add(intC);
        }

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)==list.get(j)){
                    checkStatus=false;
                }
            }
        }
        return checkStatus;


    }
}