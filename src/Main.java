import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner gav = new Scanner(System.in);

        System.out.print("дюйми");

        double diymi = gav.nextDouble();

        double metri = diymi * 0.0254;

        System.out.println(diymi + "дюйми = " + metri + " метри ");

        gav.close();


    }
}
