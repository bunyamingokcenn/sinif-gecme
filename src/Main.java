import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, sum = 0;
        double average, classAmount=0 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Sınıf Geçme Hesaplama\n---------------------");

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100) {
            classAmount++;
            sum+= mat;
        }
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100) {
            classAmount++;
            sum+= fizik;
        }
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100) {
            classAmount++;
            sum+= turkce;
        }
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100) {
            classAmount++;
            sum+= kimya;
        }
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100) {
            classAmount++;
            sum+= muzik;
        }

        average = sum/classAmount;
        if (average >= 55){
            System.out.println("Sınıfı başarılı olarak geçtiniz.");
        }else {
            System.out.println("Maalesef sınıfta kaldınız...");
        }

        System.out.print("Ortalamanız: " + average);


    }
}