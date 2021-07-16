import java.util.Scanner;
public class MyClass {
    public void FizzBuzz(int i){
        if(i%3==0){
            System.out.print("Fizz");
        }
        if(i%5==0){
            System.out.print("Buzz");
        }
        if(i%3!=0&&i%5!=0){
            System.out.print(i);
        }
        System.out.print("\n");
    }
    public static void main(String args[]) {
        MyClass m = new MyClass();
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        String num = in.next();
        if(num.chars().allMatch(Character::isDigit)==false){
            System.out.println("Number must not contain any symbols except digits");
        }else if(Integer.parseInt(num) <= 0 ||Long.parseLong(num)>=2*Math.pow(10, 5)){
            System.out.println("Number must be between 1 and 2*10^5");
        }else{
            for(int i =1; i<=Integer.parseInt(num); i++){
                m.FizzBuzz(i);
            }
        }
    }
}