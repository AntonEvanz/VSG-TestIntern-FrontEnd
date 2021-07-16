import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class MyClass {
    public int countDuplicate(int[] numArray){
        Map<Integer, Integer> counter = new HashMap<>();
            for (int x : numArray) {
                int newValue = counter.getOrDefault(x, 0) + 1;
                counter.put(x, newValue);
            }
            int count = 0;
            for (int value : counter.values()) {
                if (value > 1) {
                    count++;
                }
            }
            return count;
    }
    public static void main(String args[]) {
        MyClass m = new MyClass();
        Scanner in = new Scanner(System.in);
        System.out.println("Input length of array: ");
        String num = in.next();
        if(num.chars().allMatch(Character::isDigit)==false){
            System.out.println("Length of array must not contain any symbols except digits");
        }else if(Integer.parseInt(num)<3||Integer.parseInt(num)>1000){
            System.out.println("Length of array must be between 3 an 1000");
        }else{
            int[] numArray = new int[Integer.parseInt(num)];
            for(int i=0;i<Integer.parseInt(num);i++){
                String nums = in.next();
                if(nums.chars().allMatch(Character::isDigit)==false){
                    System.out.println("Numbers must not contain any symbols except digits");
                    System.exit(0);
                }else if(Integer.parseInt(nums)<1||Integer.parseInt(nums)>1000){
                    System.out.println("Numbers must be between 1 and 1000");
                    System.exit(0);
                }else{
                    numArray[i]=Integer.parseInt(nums);
                }
            }
            int cd = m.countDuplicate(numArray);
            System.out.println(cd);
        }
    }
}