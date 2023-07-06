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
    public static void print_of_nums(HashMap Clients){
    System.out.println("Все контакты");
    Set<String> keys = Clients.keySet();
    System.out.println(keys);
}
    public static HashMap add_client(HashMap Clients)
    {
        LinkedList<String> NewNumPhon1 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя нового клиента: ");
        String name = scanner.nextLine();
        System.out.println("Номер телефона нового клиента: ");
        NewNumPhon1.add(scanner.nextLine());
        Clients.put(name, NewNumPhon1);
        
        return Clients;
    }


    
	public static void main(String[] args) {
	    
	System.out.println("Меню: \n1 - Вывести список всех контактов;\n2 - Добавить клиента и его номер телефона к базе дынных");
	System.out.println("3 - Списко всех клиентов и их номеров телефонов;\n4 - Выход");
    

    LinkedList<String> NumPhon1 = new LinkedList<>();
    String str1 = new String("8(965)643-21-22");
    String str2 = new String("8(965)633-11-99");
    NumPhon1.add(str1);
    NumPhon1.add(str2);
       
    HashMap<String, LinkedList> Clients = new HashMap<>();
   Clients.put("Иванов Иван", NumPhon1);
   System.out.println(Clients);
   
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
    
    
    }
    
       
	}
}
