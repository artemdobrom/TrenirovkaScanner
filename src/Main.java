import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        Scanner dialog = new Scanner(System.in);
        System.out.println("Привет, напиши что-нибудь, пожалуйста");
        String privet = dialog.nextLine();

        System.out.println("Очень креативно =)");
        System.out.println();
        System.out.println("Сколько секунд ты это думала?(ответ только цифрами)");
        String sek = dialog.nextLine();

        System.out.println(sek + "? Я был о Вас лучшего мнения...");
        System.out.println();
        System.out.println("На этом пока что всё, потом я смогу писать ответы в зависимости от твоих ответов, как боты в социальных сетях. Тебе понравилось? (Напиши ответ)");
        String pokaTak = dialog.nextLine();
        Scanner dialogT = new Scanner(System.in);
        String pokaTakt = dialogT.nextLine();
        System.out.println("Я в Вас очень сиииильно влюблён :*");

            }
        }

