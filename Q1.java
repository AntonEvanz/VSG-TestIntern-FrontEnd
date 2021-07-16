import java.util.Scanner;
public class MyClass {
    public String lastLetters(String word){
        String ll = new String("");
        ll+=(word.substring(word.length() - 1)+" "+word.substring(word.length() - 2, word.length() - 1));
        return ll;
    }
    public static void main(String args[]) {
        String letters = new String("");
        MyClass m = new MyClass();
        Scanner in = new Scanner(System.in);
        System.out.print("Input word: ");
        String word = in.next();
        if (word.chars().allMatch(Character::isLetter)==false){
            System.out.println("Word must not contain any symbols except letters");
        }else if(word.length()<2||word.length()>100){
            System.out.println("Word must contain from 2 to 100 letters");
        }else{
            letters = m.lastLetters(word);
        }

      System.out.println(letters);
    }
}