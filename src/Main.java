import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        // Создаем объект класса Scanner, которому в параметр передаем
//        // условие получения входных данных - «через консоль»
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your age");
//        // Для присвоения значения целочесленной переменной используется метод nextInt()
//        int age = scanner.nextInt(); // вводим в консоль 19
//
//        System.out.println("Enter your name");
//        // Для присвоения значения
//        // строковой переменной используется метод next()
//        String name = scanner.next(); // вводим в консоль Java-master
//
//        if (age < 18) {
//            System.out.println(name + " this page is adults only");
//        } else {
//            System.out.println("Welcome to the application " + name);
//        }
          task1();
          task2();
          task3();
//        task4();
//        task5();
//        task6();
//        task7();
        }
    public static void task1 () {
        String firstName = new String("Иванов");
        String middleName = new String("Иван");
        String lastName = new String("Иванович");
        String fullName = new String(firstName+" "+middleName+" "+lastName);
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2 () {
        String firstName = new String("Иванов ");
        String middleName = new String("Иван ");
        String lastName = new String("Иванович ");
        String fullName = new String(firstName+middleName+lastName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }
    public static void task3 () {

        String fullName = new String("Иванов Семён Семёнович");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }

    }

