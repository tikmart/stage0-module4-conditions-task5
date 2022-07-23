package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public static void printRange(int number) {

        switch (number) {
            default:
                System.out.println("out of range");
                break;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("number is between 1 and 5");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("number is between 6 and 10");
                break;
        }
    }

    public static void main(String [] args) {
        printRange(1);
        printRange(10);
        printRange(0);
    }
}
