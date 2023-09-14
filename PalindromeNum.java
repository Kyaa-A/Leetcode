public class PalindromeNum {
    public static void main(String[] args) {
        
        boolean sout = isPalindrome(121);
        System.out.println(sout);
    }
    
    public static boolean isPalindrome(int x) {

        StringBuilder str = new StringBuilder();

        String strConverted = String.valueOf(x);
        str.append(strConverted);

        String word1 = str.toString();
        String word2 = str.reverse().toString();
        
        return (word1.equals(word2)) ? true : false;

    }
}

/* if(word1.equals(word2)){
    return true;
}
return false; */
