package baithuchanh0303;

import java.util.Scanner;

public class silde47 {
    public static void main(String[] args) {
        float sum = 0, number;
        Scanner sc = new Scanner(System.in);
             
        do {
            System.out.println("nhap vao so:");
            number = sc.nextFloat();
            sum += number;
                 
            if (sum > 100)
                break;
        } while (number > 0);
             
        System.out.println("tong = " + sum);
    }    
}
