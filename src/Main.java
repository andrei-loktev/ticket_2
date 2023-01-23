public class Main {

    // Задача
    // Напишите программу, которая проверяет, является ли строка палиндромом, т.е.
    // строка, которая пишется одинаково слева направо и справа налево (в том числе пустая).
    public static boolean isPalindrome (String text) {
        int lenght = text.length();
        if(lenght < 2) {
            return true;
        } else if (text.charAt(0) != text.charAt(lenght - 1)) {   //сравниваем 1й и последний элемент строки
            return false;
        } else {    // иначе вызываем функцию удаление концов строки
            return isPalindrome(text.substring(1, lenght - 1));
        }
    }

    public static void main(String[] args) {
        String text = "12345";
        System.out.println(isPalindrome(text));
        text = text + "54321";
        System.out.println(isPalindrome(text));
    }
}