public class LeapYear {
    public static boolean isLeapYear(int year) {

        if (divisibleByFour(year) && notDivisibleBy100(year)) {
            return true;
        } else return divisibleBy400(year);
    }

    private static boolean divisibleByFour(int year) {
        return year % 4 == 0;
    }

    private static boolean notDivisibleBy100(int year) {
        return year % 100 != 0;
    }

    private static boolean divisibleBy400(int year) {
        return year % 400 == 0;
    }
}
