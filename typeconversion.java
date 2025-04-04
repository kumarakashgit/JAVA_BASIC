import java.util.Scanner;

public class typeconversion {
    public static void main(String args[]){
       /* int a= 25;
        long b=a;
        System.out.print(b); */
        // long cant be converted in int because long creates large size of memory
        // conversion happens on following condition
        //1- type compatible
        //b-destination type>source type
        // lossy converiosn when big from small size
        // byte->short->int->float->long->double
        // type or widening or implicit
        Scanner sc = new Scanner(System.in);
        float num= sc.nextInt();
        System.out.print(num);




    }
}
