// Задание 1.
// Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным.
// Задание 2.
// Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100). 

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(evenOddNumber(4));
        System.out.println(numberInInterval(55));
    }

    public static boolean evenOddNumber(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberInInterval(int i) {
        if (i > 25 && i < 100) {
            return true;
        } else {
            return false;
        }
    }

}
