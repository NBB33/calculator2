import java.util.Scanner;

class Main {
    public static int calculateTax(int price, int weight) {
        int result = price / 100 + weight * 100;
        return result;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();
        int duty = calculateTax(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + duty);

    }
}



Import java.util.Scanner;
 Class Main {

     public static int calcul ( int price,int weight); {
int result = price * 0.01 + weight * 100;
return result;
     }

     Scanner scanner = new scanner( System.in);
     System.out.println("Введите цену");
     Int price = scanner.nextInt();
     System.out.println("введите вес");
     Int weight = scanner.nextInt();
     int duty = calcul(price,weight);
     Sustem.out.println("размер пошлины"+duty);

        }