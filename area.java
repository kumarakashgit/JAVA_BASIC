import java.util.Scanner;

public class area {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        Double radius = sc.nextDouble();
        Double area = 3.14*radius*radius;
        System.out.print(area);
    }
}
