package org.example;
import java.util.Scanner;
public class aaa {
    static  String a;
    static String b;
    public static void main(String[] args) {
        winner();
    }
    public static int team1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("teamname : ");
        a = scanner.nextLine();
        System.out.println("shot 3 point : ");
        int shot3 = scanner.nextInt();
        shot3 = shot3 * 3;
        System.out.println("shot 2 point : ");
        int shot2 = scanner.nextInt();
        shot2 = shot2 * 2;
        System.out.println("shot 1 point : ");
        int shot1 = scanner.nextInt();
        shot1 = shot1 * 1;
        int s = (shot1 + shot2 + shot3);
        System.out.println(s);
        return s;
    }

    public static int team2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("teamname : ");
        b = scanner.nextLine();
        System.out.println("shot 3 point : ");
        int shot3 = scanner.nextInt();
        shot3 = shot3 * 3;
        System.out.println("shot 2 point : ");
        int shot2 = scanner.nextInt();
        shot2 = shot2 * 2;
        System.out.println("shot 1 point : ");
        int shot1 = scanner.nextInt();
        shot1 = shot1 * 1;
        int s = (shot1 + shot2 + shot3);
        System.out.println(s);
        return s;
    }
    public static void winner(){
        int r;
        int d;
        r = team1();
        d = team2();
        if (r > d){
            System.out.println(a + " win");
        } else if (r < d) {
            System.out.println(b + " win");
        } else if (r == d) {
            System.out.println(" tie ");
        }
    }
}
