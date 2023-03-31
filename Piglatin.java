/*
This program transforms Strings into pig Latin.
Pig Latin is all the vowels + all the consonents + "ay"
*/

package piglatin;
import java.util.*;
public class Piglatin {
String w;
        
    void input(){
     // Input from the user
     System.out.println("Enter a String: ");
     Scanner s = new Scanner(System.in);
     w = s.next();

     }   
    
    
    void display(){
        int num = w.length();
        String vow = "";
        String con = "";
        
     for(int i = 0; i < num; i++){
         char c = w.charAt(i); // Extract a charachter
            if(c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'){
  // check if it's a vowel, if it is a vowel the add it to a String vow
             vow = vow + c; 
         }
         else{
       // if it is not a consonent then add it to a String con
        con = con + c;
         }
    }
     // Print - vowels + consonents + ay
    System.out.println(vow + con + "ay");   
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Piglatin ob1 = new Piglatin();
    // Call the method input and display
    ob1.input();
    ob1.display();
         
    
    }
}


