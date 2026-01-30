Problem-1: Check Character case
   Write a program to check the single character as input and print it as uppercase or uppercase or not an alphabet?
    Code:
    //using java language
import java.util.*;
class CharacterCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println("Enter the Character:");
        if(ch>='a' && ch<='z')
        {
            System.out.println("lowercase");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Upper Case");
        }
        else
        {
            System.out.println("Not an alphabet");
        }
    }
}
