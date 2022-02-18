package com.muthiora;

import java.util.*;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5]; //create array called colors, holding 5 elements
        colors[0] = "red"; // put color red in the index 0
        System.out.println(Arrays.toString(colors)); //to display the entire contents of this array
        System.out.println(colors[0]); //to display item at index 0
        colors[0] = "blue";
        System.out.println(Arrays.toString(colors));
        int[] numbersArray = {100, 200}; //Instantiate this array with these two known numbers. Remember, you cannot change the array size.
        System.out.println(Arrays.toString(numbersArray));
        for (int i = colors.length - 1; i >= 0; i--) { //iterate through array
            System.out.println(colors[i]);
        }
        //Enhanced for loop
        for (String color : colors) { //iterate while constructing String color, on the fly.
            System.out.println(color);
        }
        Arrays.stream(colors).forEach(System.out::println); //iterate through, using stream

        //2D arrays
        char[][] board = new char[3][4]; //X-Y plane. Three columns, four rows.
        for (int i = 0; i < 3; i++) { //Outer loop (X-plane)
            for (int j = 0; j < 4; j++) { //Inner loop (Y-plane)
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board)); //iterate through 2d array.

        //2D  array
        char[][] secondBoard = new char[][]{
                new char[]{'0', '-', '-', '-'},
                new char[]{'0', '-', '-', '-'},
                new char[]{'0', '-', '-', '-'},
        };
        System.out.println(Arrays.deepToString(secondBoard));

        //Create a list of different types
        List colorsList = new ArrayList();
        colorsList.add("purple");
        colorsList.add(1);
        colorsList.add('@');
        System.out.println(colorsList);

        //Create a list with single type enforcing
        List<String> colorsList2 = new ArrayList<>(); //We use List because it is an INTERFACE, and is implemented by ArrayList CLASS. Thus, we have access to more methods.
        ArrayList<String> colorsArrayList2 = new ArrayList<>(); //Similar to the above line, but has access to fewer methods, as opposed to List<>
        colorsList2.add("purple");
        colorsList2.add("1");
        colorsList2.add("@");
        System.out.println(colorsList2.contains("@"));
        System.out.println(colorsList.size());
        for (String color2 : colorsList2) {
            System.out.println(color2);
        }

        //create List that is unmodifiable/immutable.
        List<String> colorsList3 = List.of(
                "red", "blue", "Yellow"
        );
        System.out.println(colorsList3.toString());
        //colorsList3.add("pink"); //This will not work because the colorsList3 is immutable. Throws exception.


        //Create a stack
        System.out.println("\n" + "Working with Stack" + "\n");

        Stack<Integer> newStack = new Stack<>();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.peek()); //display the item at the top of the Stack
        System.out.println(newStack.pop()); //remove the last item, then display the remaining items in the stack
        System.out.println(newStack.peek());
        System.out.println(newStack.size());

        //Create a stack
        System.out.println("\n" + "Working with Stack" + "\n");

        List<Integer> newStack2 = new Stack<>();
        newStack2.add(7);
        newStack2.add(8);
        newStack2.add(9);
        System.out.println(newStack2); //display the items in the Stack
        System.out.println(newStack2.size());

        //Create a queue
        System.out.println("\n" + "Working with Queue" + "\n");

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Alex1", 22));
        supermarket.add(new Person("Alex2", 23));
        supermarket.add(new Person("Alex3", 24)); //Using add with capacity restrictions on Queue can lead to a fail with exception.
        supermarket.offer(new Person("Alex4", 25)); //Use when Queue has capacity restrictions.

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek().name); // displays the first item in the Queue
        System.out.println(supermarket.poll().name); // displays and removes the first item in the Queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek().name);


        //Create a LinkedList
        System.out.println("\n" + "Working with LinkedList" + "\n");

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex3", 23));
        linkedList.add(new Person("Alex4", 24));
        linkedList.add(new Person("Alex5", 25));
        linkedList.addFirst(new Person("Alex6", 26)); // Add an item as the first node in a LinkedList
        linkedList.addLast(new Person("Alex7", 27)); //Add an item as the last node in a LinkedList

        ListIterator listIterator = linkedList.listIterator();
        System.out.println("\n" + "LinkedList forward iteration" + "\n");

        while (listIterator.hasNext()) { //iterate through the LinkedList in forward direction
            System.out.println(listIterator.next().toString());
        }
        System.out.println("\n" + "LinkedList reverse iteration" + "\n");

        while (listIterator.hasPrevious()) { //iterate through the LinkedList in reverse direction
            System.out.println(listIterator.previous());
        }


        //Creating sets
        System.out.println("\n" + "Working with Sets" + "\n");

        Set<Ball> balls = new HashSet<>(); //Backed by HashMap
        Set<Ball> balls1 = new TreeSet<>(); //Preserves order, and is backed by a TreeMap

        balls.add(new Ball("red"));
        balls.add(new Ball("green"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("purple"));
        System.out.println(balls.size());
        System.out.println("\n" + "Iterate through a set");
        balls.forEach(System.out::println);

        //Create a Map
        System.out.println("\n" + "Working with Maps" + "\n"); //Shift+Ctr+Space
        Map<Integer, Person> map = new HashMap<>(); //Keys must be unique
        map.put(1, new Person("Alex7", 27));
        map.put(2, new Person("Alex8", 28));
        map.put(3, new Person("Alex9", 29));

        System.out.println("\n" + "Display Map " + "\n"); //Shift+Ctr+Space
        System.out.println(map);
        System.out.println("\n" + "Display Map size" + "\n"); //Shift+Ctr+Space
        System.out.println(map.size());
        System.out.println("\n" + "Display Maps' entrySet"  + "\n"); //Shift+Ctr+Space
        System.out.println(map.entrySet());
        System.out.println("\n" + "Display Maps' keySet" + "\n"); //Shift+Ctr+Space
        System.out.println(map.keySet());

        System.out.println("\n" + "Iterate through a Map");
        map.entrySet().forEach(x-> System.out.println(x.getKey() + " " + x.getValue().name));
        System.out.println("\n" + "Iterate through a Map");
        map.forEach((key, person) -> System.out.println(key + "-" + person.name));
        System.out.println("\n" + "Look through a Map, using object reference");
        map.put(1, new Person("Alex10", 30) );
        System.out.println(map.get(1).hashCode());
        System.out.println(map.get( new Person("Alex7", 27).hashCode())); //This returns a null because Maps reference Key-Value pairs by their generated hashCode value, which comes from the key.

        //The lines below share a hashCode, because the Person object has overridden equals() and hashcode(). Without it, they would produce different hashCodes, despite seemingly identical values
        System.out.println(new Person("Alex7", 27).hashCode());
        System.out.println(new Person("Alex7", 27).hashCode());

    }

    private static class Ball {
        String color;

        public Ball(String color) {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Ball)) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }
    }


    //record Ball(String color){} //This only works for Java 14 and above. Record takes the burden of creating getters, fields, setters, hashCode, toString, equals implementations of POJOs

//    public static void main(String[] args) {
//        replaceNth("Vader said: No, I am your father!", 2, 'a', 'o');
//    }
//
//    public static String replaceNth(String text, int n, char oldValue, char newValue){
//
//        //explode text to characters' array, and store it.
//        char[] charactersExploded = text.toCharArray();
//        StringBuilder stringBuilder= new StringBuilder(text);
//        System.out.println(charactersExploded.length);
//        System.out.println(stringBuilder.length());
//
//            //Identify the nth character from the characters' array
//        int count = 0;
//
//
//            //Identify the number of occurrences of the nth character, and store in a variable
//
//            //Replace the oldValue at the Nth occurrence with newValue
//
//            //un-explode text back to string, and return it
//
//            return text;
//        }

}
