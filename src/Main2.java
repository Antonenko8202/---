;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner gav = new Scanner(System.in);
        int minutes = gav.nextInt();
        int years = minutes  / 525600;
        int remaining = minutes % 525600;
        int days = remaining / 1440;
        System.out.println(days + " Днів і " + years+" Років");
    }







}
