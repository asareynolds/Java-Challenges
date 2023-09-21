////// This file is for completing the Programing 101 challenges //////

//Ask for name and say hello, name
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);

//         System.out.println("What is your name?");
//         String s = scan.nextLine();
//         System.out.printf("Hello, %s", s);
//         scan.close();
//     }
// }

// Basic math
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args){
//         double x = 2.0;
//         double y = 5.0;
//         double z = Math.sqrt(3.14159265358979);
//         System.out.println(z);
//     }
// }

//Sum of numbers from 1 to user-input n
// import java.util.Scanner;

// public class Test{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Select a positive integer: ");
//         int n = scan.nextInt();

//         int count = 0;
//         for (int i = 1; i <= n; i++){
//             count += i;
//         }

//         System.out.printf("The sum is %d",count);

//         scan.close();
//     }
// }

//Sum of numbers from 1 to user-input n, but only adding multiples of 3 and 5
// import java.util.Scanner;

// public class Test{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Select a positive integer: ");
//         int n = scan.nextInt();

//         int count = 0;
//         for (int i = 1; i <= n; i++){
//             if(i%3 == 0 || i%5 == 0){
//                 count += i;
//             }
//         }

//         System.out.printf("The sum of multiples of 3 and 5 is %d",count);

//         scan.close();
//     }
// }

// User chooses between computing the sum or the product of 1 to user-selected n
// import java.util.Scanner;

// public class Test{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int x = scan.nextInt();

//         System.out.print("Menu: Calculate sum (1), Calculate product (2): ");
//         int choice = scan.nextInt();

//         int count = 0;

//         if (choice == 1){
//             count = 0;
//             for (int i = 1; i <= x; i++){
//                 count += i;
//             }
//         } else {if (choice == 2){
//             count = 1;
//             for (int i = 1; i <= x; i++){
//                 count = count * i;
//             }
//         }
//         }
//         System.out.printf("The result is %d",count);
//         scan.close();
//     }
// }

//Print all prime numbers smaller than countUntil
// public class Test{
//     public static void main(String[] args){
//         int countUntil = 200;
//         Boolean isprime = true;
//         for(int i = 2; i <= countUntil; i++){
//             isprime = true;
//             for(int j = 2; j <= 9; j++){
//                 if (i != j){
//                     if(i%j == 0){
//                     isprime = false;
//                     }
//                 }
//             }
//              if (isprime){
//                 System.out.printf("%d is prime!\n", i);
//             }
//         }
//     }
// }

//Binary search guessing game
// import java.util.Random;
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Random rand = new Random();
//         Scanner scan = new Scanner(System.in);
//         Boolean running = true;
//         int randInt = rand.nextInt(200);
//         int countGuesses = 0;

//         System.out.print("The system has selected a random integer between 1 and 200. Make a guess! Your guess: ");
//         int guess = scan.nextInt();

//         while (running) {

//             if (guess > randInt) {
//                 System.out.print("Your guess was higher than the integer. Guess again: ");
//                 guess = scan.nextInt();
//                 countGuesses++;
//             }
//             if (guess < randInt) {
//                 System.out.print("Your guess was lower than the integer. Guess again: ");
//                 guess = scan.nextInt();
//                 countGuesses++;
//             }
//             if (guess == randInt) {
//                 running = false;
//                 System.out.printf(
//                         "%d is correct! You took %d tries to find the integer.",
//                         randInt, countGuesses);
//             }
//         }
//         scan.close();
//     }
// }

//Find the next 20 leap years
// public class Test{
//     public static void main(String[] args){
//         int count = 0;
//         int currentyear = 2023;
//         int testyear = currentyear;
//         while (count < 20){
//             if (testyear % 100 == 0) {
//                 if (testyear % 400 == 0){
//                     System.out.println(testyear);
//                     count++;
//                 }
//             }else if (testyear % 4 == 0){
//                 System.out.println(testyear);
//                 count++;
//             }
//             testyear++;
//         }
//     }
// }

//Determine ISBN-13 checksum validity
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter an ISBN-13 without dashes: ");
//         String inputISBN = scan.nextLine();
//         int[] arrayISBN = new int[inputISBN.length()];
//         int countWeightedInts = 0;
//         for (int i = 0; i < inputISBN.length(); i++) {
//             arrayISBN[i] = Character.getNumericValue(inputISBN.charAt(i));
//             if (i % 2 != 0) { // if odd, multiply by 3
//                 arrayISBN[i] = arrayISBN[i] * 3;
//             }
//             if(i < 12){ // don't add the 13th digit (checksum) to the count
//             countWeightedInts += arrayISBN[i];   
//             }
//         }
//         if ((10 - countWeightedInts % 10) == arrayISBN[12]){ // if the calculated checksum matches the extant checksum
//             System.out.println("This ISBN is valid.");
//         }else{
//             System.out.println("This is not a valid ISBN.");
//         }
//         scan.close();
//     }
// }

//Return largest element in an array of integers
// public class Test{
//     public static void main(String[] args){
//         int[] integerList = {3,5,7,9,11,22,34,433,45,2,34,5,6,7,88,5};
//         int max = 0; // variable to store maximum number found so far
//         for (int i = 0; i < integerList.length; i++){
//             if(integerList[i] > max){
//                 max = integerList[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

//Reverse an array list in-place

// import java.util.ArrayList;
// import java.util.Arrays;

// public class Test{
//     public static void main(String[] args) {
//         ArrayList<String> stringArrayList = new ArrayList<>();
//         stringArrayList.addAll(Arrays.asList("Mario", "Luigi","Peach", "Toad", "Bowser"));
//         int stopNum = 0;
//         if(stringArrayList.size() % 2 == 0){
//             stopNum = (stringArrayList.size()) / 2;
//         }else{
//             stopNum = (stringArrayList.size() - 1) / 2;
//         }
//             for(int i = 0, j = stringArrayList.size() - 1; i < stopNum; i++, j--){// i = first element, j = last element
//                 String pos1store = stringArrayList.get(i);
//                 String pos2store = stringArrayList.get(j);
//                 stringArrayList.set(j, pos1store);
//                 stringArrayList.set(i, pos2store);
//             }       
//         System.out.print(stringArrayList);
//     }
// }

//Check if an item occurs in a list

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Arrays;

// class Test {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         ArrayList<String> searchableList = new ArrayList<>();
//         searchableList.addAll(Arrays.asList("Item1", "Item2", "Item4", "Item5", "Basketball"));

//         System.out.println("Enter the element to search for: ");
//         String searchInput = scan.nextLine();
//         boolean itemOccurs = false;

//         for (String item : searchableList){
//             if (item.equals(searchInput)){
//                 System.out.printf("%s occurs in the list.", searchInput);
//                 itemOccurs = true;
//                 break;
//             }
//         }
//         if (!itemOccurs){
//             System.out.printf("%s does not occur in the list.", searchInput);
//         }
//         scan.close();
//     }
// }

//Return items at odd positions in a list

// import java.util.ArrayList;
// import java.util.Arrays;

// class Test{
//     public static void main(String[] args){
//         ArrayList<String> itemList = new ArrayList<>();
//         itemList.addAll(Arrays.asList("0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"));
//         for (int i = 1; i < itemList.size(); i+=2){
//             System.out.println(itemList.get(i));
//         }
//     }
// }

//Get input from user, add double to ArrayList, and compute running total

// import java.util.ArrayList;
// import java.util.Scanner;

// class Test {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         ArrayList<Double> doubleList = new ArrayList<>();
//         boolean running = true;
//         double runningTotal = 0;
//         System.out.println("Running total is now active. Ctrl + C to exit.");
//         while (running) {
//             System.out.printf("=%f: ", runningTotal); // prompt user
//             double numberInput = Double.parseDouble(scan.next()); // convert input to double
//             doubleList.add(numberInput); // add input to list
//             runningTotal += numberInput; // update running total
//         }
//         scan.close();
//     }
// }

////  Test if given string is a palindrome (ignore spaces and punctuation)
// import java.util.Scanner;
// import java.util.Arrays;

// public class Test {
//     // removes spaces, capitalization, and punctuation, returns string of characters
//     public static String flattenText(String input) {
//         input = input.trim();
//         input = input.toLowerCase();
//         input = input.replaceAll("[\\p{Punct}\\s]", "");
//         return input;
//     }

//     // checks if a given string is equal to itself, backwards
//     public static Boolean checkPalindrome(String input) {
//         Character[] inputForwards = new Character[input.length()]; // array to store forward word
//         Character[] inputBackwards = new Character[input.length()]; // array to store backward word
//         for (int i = 0, j = input.length() - 1; i < input.length(); i++, j--) {
//             inputForwards[i] = input.charAt(i);
//             inputBackwards[i] = input.charAt(j);
//         }
//         return Arrays.equals(inputForwards, inputBackwards);
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter a string to check: ");
//         String input = scan.nextLine();
//         if (checkPalindrome(flattenText(input))) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
//         scan.close();
//     }
// }

// // Three functions to compute the sum of list numbers with a for-loop, while-loop, and recursion:
// public class Test{
//     public static void main(String[] args) {
//         int[] numList = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; // integer list of length 15 with values
//         int forSum = 0;
//         int whileSum = 0;
//         int recursionSum = 0;
//         for (int i = 0; i < numList.length; i++){
//             forSum += numList[i];
//         }
//         int whileCount = 0; // count variable for while loop
//         while (whileCount < numList.length){
//             whileSum += numList[whileCount];
//             whileCount ++;
//         }
//         recursionSum = sumList(numList, 0);
//         System.out.printf("For-Loop Count: %d", forSum);
//         System.out.printf("\nWhile-Loop Count: %d", whileSum);
//         System.out.printf("\nRecursion Count: %d", recursionSum);
//     }

//     //unused recursive demo (from internet, used as reference)
//     public static int recursionDemo(int input){
//         if (input > 0) {
//             return input + recursionDemo(input - 1);
//         }
//         else {
//             return 0;
//         }
//     }

//     //class to recursively add list elements
//     public static int sumList(int[] inputList, int index){
//         if (index < inputList.length){
//             int returnValue = inputList[index] + sumList(inputList, index + 1);
//             return returnValue;
//         } else {
//             return 0;
//         }
//     }
// }

////Calculate and print all squares and all n^n up to a given number
////note: the challenge is unclear here -- I decided to interpret this as:
////"Find all instances of the listed operations below a specific bound"

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Test{
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         ArrayList<Integer> squareList = new ArrayList<>();
//         ArrayList<Integer> expList = new ArrayList<>();

//         System.out.print("Square and exponentiation to (int): ");
//         int targetNum = scan.nextInt();

//         int expNext = 1; // next exponentiation to check for
//         for (int i = 1, expCount = 1; i <= targetNum; i++){
//             if(Math.sqrt(i) % 1 == 0){ // check for square root
//                 squareList.add(i);
//             }
//             if(i == expNext){ // if the current number is the targeted exponentiation
//                 expList.add(i);
//                 expCount++;
//                 expNext = (int) Math.pow(expCount,expCount); // set the next desired exponentiation 
//                 //(this works because exponentiation increases much faster than the linear count of the for loop)
//             }
//         }
//         //print output
//         System.out.print("Squares:        ");
//         System.out.println(squareList);
//         System.out.print("Exponentiation: ");
//         System.out.println(expList);
//         scan.close();
//     }
// }

//// Contacenate two lists of strings, abc 123 to abc123

// public class Test {
//     public static void main(String[] args){
//         String[] list1 = new String[]{"a", "b", "c"};
//         String[] list2 = new String[]{"1", "2", "3"};
//         int totalLength = list1.length + list2.length;
//         String[] combinedList = new String[totalLength];
//         for (int i = 0; i < totalLength; i++){
//             if (i < list1.length){
//                 combinedList[i] = list1[i];
//             } else {
//                 combinedList[i] = list2[i-list1.length];
//             }
//         }
//         System.out.print("List 1: ");
//         for (String s: list1){
//             System.out.print(s);
//         }
//         System.out.print("\nList 2: ");
//         for (String s: list2){
//             System.out.print(s);
//         }
//         System.out.print("\nCombined: ");
//         for (String s : combinedList){
//             System.out.print(s);
//         }
//     }
// }

//// Alternately combine two lists of strings, abc 123 to a1b2c3
// public class Test{
//     public static void main(String[] args){
//         String[] list1 = new String[]{"a", "b", "c"};
//         String[] list2 = new String[]{"1", "2", "3"};
//         int totalLength = list1.length + list2.length;
//         String[] combinedList = new String[totalLength];
//         for (int i = 0; i < totalLength; i ++){
//             if (i % 2 == 0){
//                 combinedList[i] = list1[i/2];
//             } else {
//                 combinedList[i] = list2[(i-1)/2];
//             }
//         }
//         System.out.print("List 1: ");
//         for (String s: list1){
//             System.out.print(s);
//         }
//         System.out.print("\nList 2: ");
//         for (String s: list2){
//             System.out.print(s);
//         }
//         System.out.print("\nAlternately Combined: ");
//         for (String s : combinedList){
//             System.out.print(s);
//         }
//     }
// }

//// Merge two sorted lists (length-independent) into a new sorted list: [1,4,6],[2,3,5] → [1,2,3,4,5,6] - should be done faster than cat & sort
public class Test {
    public static void main(String[] args) {
        int[] list1 = new int[] { 1, 5, 9, 10 };
        int[] list2 = new int[] { 2, 6, 8, 51, 100 };
        int totalLength = list1.length + list2.length;
        int[] sortedList = new int[totalLength];

        int count1 = 0;
        int count2 = 0;

        int sortedListCount = 0;

        int num1 = 0;
        int num2 = 0;

        boolean isDone = false;

        while (!isDone) { // while running
            if (count1 <= list1.length - 1 && count2 <= list2.length - 1) { // if neither list exhausted
                num1 = list1[count1]; // get num1
                num2 = list2[count2]; // get num2
                if (num1 < num2) { // if num1 is smaller
                    sortedList[sortedListCount] = num1; // add num1 to the list
                    count1++; // increment counter for list1
                }
                if (num1 > num2) { // if num2 is smaller
                    sortedList[sortedListCount] = num2; // add num2 to the list
                    count2++; // increment counter for list2
                }
                if (num1 == num2) { // if num1 == num2
                    sortedList[sortedListCount] = num1; // add num1 to the list
                    count1++; // increment counter for list1
                }
            } else { // if at least one list exhausted
                if (count1 > list1.length - 1 && count2 > list2.length - 1) { // if both lists exhausted
                    isDone = true; // end program
                } else { // if only one list exhausted
                    if (count1 > list1.length - 1) { // if list1 exhausted
                        // add and increment from list 2
                        num2 = list2[count2];
                        sortedList[sortedListCount] = num2;
                        count2++;
                    } else { // 'else' prevents both from executing in one loop
                        if (count2 > list2.length - 1) { // if list2 exhausted
                            // add and increment from list 1
                            num1 = list1[count1];
                            sortedList[sortedListCount] = num1;
                            count1++;
                        }
                    }
                }
            }
            sortedListCount++;
        }

        for (int i : sortedList) {
            System.out.printf("%d ", i);
        }
    }
}