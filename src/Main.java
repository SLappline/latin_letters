import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
        //Например: “I love java 8 Я люблю java 14 core1”.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с пробелами, например: " + "I love java 8 Я люблю java 14 core1");
        String words = scanner.nextLine();
        int count = 0;
        if (words.contains(" ")){
            //1. Выведите слова, состоящие только из латиницы.
            String str1 = words.replaceAll("[а-яА-Я\\d]", "");//Отбираем слова только на английском
            //Заменяя все слова на кириллице пробелами
            String prob = str1.replaceAll("\\s+", " ");//Убираем лишние пробелы
            System.out.println("Строка содержит слова на латинице:");
            System.out.println(prob);
            //2. Выведите количество этих слов.
            String[] list = prob.split("\\W+"); //Записываем в list слова в виде массива
            //Выводим длину list, что соответствует кол-ву слов в строке.
            System.out.println("Вы ввели: " + list.length + " слов(а) на латинице");
        }
        else{
            System.out.println("Упс...");
        }
    }
}

