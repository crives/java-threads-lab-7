import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {

    /*
    Write a method called getCallableInteger that reads an integer
    from the standard input and returns a Callable<Integer>.
     */
    public static Callable<Integer> getCallableInteger() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Callable callable = () -> num;
        return callable;
    }
}
//
// ## WAY 2 ##
//import java.util.Scanner;
//import java.util.concurrent.Callable;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            int num = scanner.nextInt();
//        }
//    }
//
//    /*
//    Write a method called getCallableInteger that reads an integer
//    from the standard input and returns a Callable<Integer>.
//     */
//    public static Callable<Integer> getCallableInteger(int num) {
//        Callable callable = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                return num;
//            }
//        };
//        return callable;
//    }
//}
