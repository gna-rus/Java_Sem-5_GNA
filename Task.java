//Формат сдачи: ссылка на подписанный git-проект.

//Задание

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут 
//повторяющиеся имена с разными телефонами, 
//их необходимо считать, как одного человека с разными телефонами. 
//Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Task {
    // Функция вывода всех ключей/клиентов
    public static void print_of_nums(HashMap Clients) {
        int count = 1;
        System.out.println("Все контакты");
        Set<String> keys = Clients.keySet();
        for (String elem : keys) {
            System.out.printf("%5d %s\n", count++, elem);
        }
    }

    // функция добавления нового клиента и его номеров телефонов
    public static HashMap add_client(HashMap Clients) {
        LinkedList<String> NewNumPhon1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя нового клиента: ");
        String name = scanner.nextLine();

    // Цикл для добавления новых номеров телефонов 
        while (true) {
            System.out.println("Номер телефона нового клиента: ");
            NewNumPhon1.add(scanner.nextLine());
            System.out.println("Добавить еще номер телефона для текущего клиента? yes/no");
            String asnw = scanner.nextLine();
            if (asnw.equals("no")) {
                break;
            }
        }
        Clients.put(name, NewNumPhon1);
        return Clients;
    }

    // Функция вывода перечня всех клиентов 
    // Сортировка по алфавиту
    public static void print_all_clients1(HashMap Clients) {
        TreeMap<String, LinkedList> sorted1 = new TreeMap<>(Clients);
        Set<String> keys = sorted1.keySet();
        for (String elem : keys) {
            System.out.printf("%20s: %s \n", elem, sorted1.get(elem));
        }
    }
    
    
    // Функция вывода перечня всех клиентов отсортированные по количеству номеров
    public static void print_all_clients2(HashMap Clients) {
        TreeMap<String, LinkedList> sorted1 = new TreeMap<>(Clients);
        Set<String> keys = Clients.keySet();
        for (String elem : keys) {
            System.out.printf("%20s: %s \n", elem, sorted1.get(elem));
        }
    }

    public static void main(String[] args) {
    // Меню
        System.out.println("Меню: \n1 - Вывести список всех контактов;\n2 - Добавить клиента и его номер телефона к базе дынных;");
        System.out.println("3 - Список всех клиентов и их номеров телефонов (сортировка по алфавиту);");
        System.out.println("4 - Список всех клиентов и их номеров телефонов; \n5 - Выход");
    // Генерируем первинчные значения для телефонного справочника
        LinkedList<String> NumPhon1 = new LinkedList<>();
        LinkedList<String> NumPhon2 = new LinkedList<>();
        LinkedList<String> NumPhon3 = new LinkedList<>();

        String str1 = new String("8(965)643-21-22");
        String str2 = new String("8(965)633-11-99");
        String str3 = new String("8(911)322-55-12");
        String str4 = new String("8(911)888-55-00");

        NumPhon1.add(str1);
        NumPhon1.add(str2);
        NumPhon2.add(str4);
        NumPhon3.add(str1);
        NumPhon3.add(str2);
        NumPhon3.add(str3);

        HashMap<String, LinkedList> Clients = new HashMap<>();
        Clients.put("Иванов Иван", NumPhon1);
        Clients.put("Петров Петр", NumPhon2);
        Clients.put("Мариянова Маша", NumPhon3);

    // Управление меню
        int num = 0;
        while (num != 5) {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            switch (num){
                case 1: print_of_nums(Clients);
                case 2: Clients = add_client(Clients);
                case 3: print_all_clients1(Clients);
                case 4: print_all_clients2(Clients);
            }
        }
    }
}






 

