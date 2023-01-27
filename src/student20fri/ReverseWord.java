/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student20fri;
import java.util.Scanner;
/**
 *Hello there
 * @author Ben Praseuth
 */
public class ReverseWord {
    public static void main(String[]args){
        System.out.println("enter Word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
         char[] charArray = new char[word.length()];
    for (int i = 0; i < word.length(); i++) {
      charArray[i] = word.charAt(i);
    }
    for (int i = charArray.length - 1; i >= 0; i--) {
      System.out.print(charArray[i]);
    }
    
        
    }
}
