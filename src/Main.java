import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        in();
    }

    static void in() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phuong trinh dang: ax^2 + bx + c = 0");
        System.out.println("Nhap a la: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap b la: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap c la: ");
        float c = scanner.nextFloat();

        giaiPTBac2(a, b, c);
    }

    static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            System.out.println("Phuong trinh tro thanh bac 1 co nghiem x = " + (-c / b));
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x = " + (-b / (2 * a)));
            } else {
                float x1 = (float) ((-b - Math.round(Math.sqrt(delta))) / (4 * a * c));
                float x2 = (float) ((-b - Math.round(Math.sqrt(delta))) / (4 * a * c));

                System.out.println("Phuong trinh co hai nghiem phan biet x1 =  " + x1 + " va x2 = " + x2);
            }
        }
    }
}
