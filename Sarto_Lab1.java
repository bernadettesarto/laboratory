public class Sarto_Lab1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int row = scanner.nextInt();
        
        System.out.println("*");
        
        // print the upper part
        for (int i = 1; i <= row; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        // print the Bottom part
        for (int i = row - 1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        System.out.println("*");
        
        scanner.close();
    }
}