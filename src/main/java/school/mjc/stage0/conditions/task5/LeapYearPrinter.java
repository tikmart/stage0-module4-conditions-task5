package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {

        int i = ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) ? 1 : 0;

        switch (i){
            case 1:
                System.out.println("leap");
              break;
            default:
                System.out.println("not leap");
        }
    }
    public static void main(String [] args) {

        isLeapYear(2004);
        isLeapYear(2000);
        isLeapYear(1900);
    }
}
