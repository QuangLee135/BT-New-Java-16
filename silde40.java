package baithuchanh0303;

import java.util.Scanner;

public class silde40 {

    public static void main(String[] args) {
        int thu;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" ngay trong tuan: ");
            thu = scanner.nextInt();
        }
         
        switch (thu){
            case 1: 
            System.out.println("CN");
                break;
            case 2:
            System.out.println("thu 2");
                break;
            case 3:
            System.out.println("thu 3");
                break;
            case 4:
            System.out.println("thu 4");
                break;
            case 5:
            System.out.println("thu 5");
                break;
            case 6:
            System.out.println("thu 6");
                break;
            case 7:
            System.out.println("thu 7");
                break;
            default:
            System.out.println("ngay khong hop le");
        }
        
}
}
