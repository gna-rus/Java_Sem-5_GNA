//Формат сдачи: ссылка на подписанный git-проект.

//Задание

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут 
//повторяющиеся имена с разными телефонами, 
//их необходимо считать, как одного человека с разными телефонами. 
//Вывод должен быть отсортирован по убыванию числа телефонов.


  //passportsAndNames.put("Дональд Джон Трамп", 8082771);
  //int lidiaName = passportsAndNames.get("Лидия");
  //passportsAndNames.remove("Дональд Джон Трамп");

import java.util.*;
import java.util.Scanner;

public class Main
{
    // Функция вывода всех ключей/клиентов
    public static void print_of_nums(HashMap Clients){
    System.out.println("Все контакты");
    Set<String> keys = Clients.keySet();
    System.out.println(keys);
}
    // функция добавления нового клиента и его номеров телефонов
    public static HashMap add_client(HashMap Clients)
    {
        LinkedList<String> NewNumPhon1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя нового клиента: ");
        String name = scanner.nextLine();
        
        // Цикл для добавления новых номеров телефонов 
        while (true)
        {
            System.out.println("Номер телефона нового клиента: ");
            NewNumPhon1.add(scanner.nextLine());
            System.out.println("Добавить еще номер телефона для текущего клиента? yes/no");
            String asnw = scanner.nextLine();
            if (asnw != "yes"){ // НЕ РАБОТАЕТ ЭТО УСЛОВИЕ КОРРЕКТНО ПОЧЕМУ-ТО
                break;
            }
        }
        Clients.put(name, NewNumPhon1);
        return Clients;
    }
    
    // Функция вывода перечня всех клиентов отсортированные по количеству номеров
     public static void print_all_clients(HashMap Clients){
    System.out.println(Clients);
    Set<String> keys = Clients.keySet();
    System.out.println(keys);
    //for (int i = 0;i < keys.length(); i++){ System.out.println(Clients);}
}
    
	public static void main(String[] args) {
	    
	System.out.println("Меню: \n1 - Вывести список всех контактов;\n2 - Добавить клиента и его номер телефона к базе дынных");
	System.out.println("3 - Список всех клиентов и их номеров телефонов;\n4 - Выход");
    

    LinkedList<String> NumPhon1 = new LinkedList<>();
    LinkedList<String> NumPhon2 = new LinkedList<>();
    LinkedList<String> NumPhon3 = new LinkedList<>();
    
    String str1 = new String("8(965)643-21-22");
    String str2 = new String("8(965)633-11-99");
    String str3 = new String("8(911)322-55-12");
    
    NumPhon1.add(str1);
    NumPhon1.add(str2);
    NumPhon2.add(str3);
    NumPhon3.add(str1);
    NumPhon3.add(str2);
    NumPhon3.add(str3);
    
    HashMap<String, LinkedList> Clients = new HashMap<>();
    Clients.put("Иванов Иван", NumPhon1);
    Clients.put("Петров Петр", NumPhon2);
    Clients.put("Мариянова Маша", NumPhon3);
   
    int num = 0;
    while (num != 4){
    System.out.print("Введите число: ");
   	Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();
    if (num == 1)
    {
        print_of_nums(Clients);
    }
    
    if (num == 2)
    {
        Clients = add_client(Clients);
    }
    
    if (num == 3)
    {
        print_all_clients(Clients);
    }
    
    
    }
    
       
	}
}
