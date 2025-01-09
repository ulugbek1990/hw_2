import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(23, 39));
        System.out.println(permission(79, 20));
        System.out.println(permission(0, 40));
        System.out.println(permission(30, 90));
        System.out.println(permission(18, 23));
        System.out.println(permission(generatorRandomAge(), 15));
    }

    private static String permission(int age, int temp) {

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти домой";
        } else if ( age < 20 && temp >= 0 && temp <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else
            return "Оставайтесь дома";
    }

    public static int generatorRandomAge() {
        Random random = new Random();
        int x = random.nextInt(100);
        return x;
    }
}