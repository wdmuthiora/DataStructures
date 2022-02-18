package com.muthiora;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

//public class Kata{
//    public static String replaceNth(String text, int n, char oldValue, char newValue){
//        int count = 0;
//        StringBuilder characters = new StringBuilder(text);
//        for(int i=0; i<characters.length();i++){
//            if (characters.charAt(i)==oldValue){
//                count++;
//
//            }
//            if ((count %=n)==0 && n<count){
//                characters.setCharAt(i,newValue);
//            }
//            else if(n<1 || n>count){
//                return text;
//            }
//        }
//        return characters.toString();
//
//    }
//}

//public class Kata
//{
//    public static String replaceNth(String text, int n, char oldValue, char newValue)
//    {
//        int count = 0;
//        StringBuilder str = new StringBuilder(text);
//
//        if(n==0)
//            return text;
//
//        for(int i = 0; i < text.length();i++)
//            if( (text.charAt(i) == oldValue) && ( ++count == n) )
//            {
//                str.setCharAt(i, newValue);
//                count = 0;
//            }
//        return str.toString();
//    }
//}
//public class Kata {
//    public static String replaceNth(String text, int n, char oldValue, char newValue) {
//        if(n <= 0 || n > text.length()) {
//            return text;
//        }
//
//        char[] textArray = text.toCharArray();
//        for(int count = 1, index = text.indexOf(oldValue);
//            index >= 0;
//            index = text.indexOf(oldValue, index + 1), count++) {
//            if(count % n == 0) {
//                textArray[index] = newValue;
//            }
//        }
//
//        return new String(textArray);
//    }
//}
//public class Kata {
//    public static String replaceNth(String text, int n, char oldValue, char newValue) {
//        if (n <= 0) return text;
//
//        StringBuilder res = new StringBuilder(text);
//        int count = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.charAt(i) == oldValue) {
//                count++;
//                if (count % n == 0) res.setCharAt(i, newValue);
//            }
//        }
//        return res.toString();
//    }
//}