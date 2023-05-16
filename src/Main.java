import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String virazhenie = scanner.nextLine();
        String vivod = calc(virazhenie);
        System.out.println(vivod);
    }

    public static String calc(String input) throws IOException {
        String[] massiv = input.split(" ");
        int res = 0;
        if (massiv.length > 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                throw new IOException("Формат математической операции не удовлетворяет заданию");
            }
        }

        if (massiv.length < 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                throw new IOException("Строка не является математической операцией");
            }
        }

        int a;
        int b;
        String znak = massiv[1];

        try {
            a = Integer.parseInt(massiv[0]);
            b = Integer.parseInt(massiv[2]);
        } catch (NumberFormatException e) {
            throw new IOException("Строка не является математической операцией");
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                throw new IOException("Числа не удовлетворяют заданию — от 1 до 10 включительно");
            }
        }

        switch (znak) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                throw new IOException("Строка не является математической операцией");
        }

        return Integer.toString(res);
    }

}