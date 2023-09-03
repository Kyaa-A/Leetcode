import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        
        List<String> output = fizzBuzz(15);
        System.out.println(output);
    }
    public static List<String> fizzBuzz(int n) {
        
        ArrayList<String> ans = new ArrayList<>(n);

        for(int i = 1; i <= n; i++){

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if(divisibleBy3 && divisibleBy5){   
                ans.add("FizzBuzz");
            }else if(divisibleBy3){
                ans.add("Fizz");
            }else if(divisibleBy5){
                ans.add("Buzz");
            }else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
