package lesson01.online.homework;

public class SayHello {
    public static void main(String[] args){
        java.lang.String a = "Никита";

         sayHelloTo(a);
    }
        public static void sayHelloTo(String value) {
        System.out.println("Привет, " + value + "!");
        }
}
/*
4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
 */