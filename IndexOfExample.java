
/**
 * This class represents a program 
 * that demonstrates how the method,
 * "indexOf" functions. 
 * @author Lindsey Yu
 * @version 1
 */

public class IndexOfExample {

    /**
      * Main method calls the indexOf method in various examples/ 
      * @param args Standard array of commandline String arguments. Not used in this program.
      */  

    public static void main(String[] args) {

        //indexOf returns the index (location) of the first occurence of a character in a string or section of a string
        //indexOf will always return an integer 


        System.out.println("(1) Character index in a whole string: ");
        String string1 = "hello"; 
        System.out.println("String1 = " + string1);
        System.out.println("The index of 'o' in string1 is: " + string1.indexOf('o'));
        

        System.out.println();

        System.out.println("(2) Character index in a string with a specified index starting point: ");
        String string2 = "pneumonoultramicroscopicsilicovolcanoconiosis";
        System.out.println("String 2 = " + string2); 
        System.out.println("The index of 'i' in string2 starting from the 14th char is: " + string2.indexOf('i', 13));

        System.out.println();

        System.out.println("(3) Substring index in a string: ");
        String string3 = "tacocat";
        System.out.println("String3 = " + string3); 
        System.out.println("The index of 'cat' in string3 is: " + string3.indexOf("cat"));

        System.out.println();

        System.out.println("(4) Substring index in a string with a specified index starting point: ");
        String string4 = "bananas";
        System.out.println("String4 = " + string4); 
        System.out.println("The index of 'an' in string4 startin from the 3rd char is : " + string4.indexOf("an", 2));


        System.out.println();

        System.out.println("If the character or substring cannot be found in the string, the method will return -1.");
        String stringA = "trumpsucks"; 
        System.out.println("StringA = " + stringA);
        System.out.println("The index of 'z' in stringA is: " + stringA.indexOf('z'));
        System.out.println();

        System.out.println();
        System.out.println();


        System.out.println("lastIndexOf has 4 different cases that take in different parameter, they function the same as the indexOf methods, but search backwards from a specified index starting point"); 
 
        System.out.println();
        
        System.out.println("One example with lastIndexOf, searching for a index of substring in a specified index of a string."); 

        String string5 = "supercalifragilisticexpialidocious"; 
        System.out.println("String5 = " + string5);    
        System.out.println("The last occurence of 'ali' in string5, searching backward from the 16th char is: " + string5.lastIndexOf("ali", 15)); 

        



    }
}