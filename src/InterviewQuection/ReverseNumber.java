package InterviewQuection;

public class ReverseNumber {

    public static void getData(int a) {
        int rev = 0;
        while (a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        getData(123);
    }
}