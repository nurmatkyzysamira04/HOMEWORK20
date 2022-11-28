import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);

            try {
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
                System.out.println(parallelepiped);
                System.out.println(parallelepiped.area());
                System.out.println(parallelepiped.volume());

            } catch (InputMismatchException e) {
                System.out.println(" only number !");
            } catch (Exception e) {
                System.out.println(" number > 0 and number < 20");
            }
        }
    }




