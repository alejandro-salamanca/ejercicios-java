
//Palindrome Check:
public class Ejercicio02 {

    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("Hello"));

    }

    public static boolean isPalindrome(String str){
        //Limpiar Cadena de String
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //Verificar si es un palindromo
        int positionLeft = 0;
        int positionRight = cleanedStr.length() - 1;

        while (positionLeft<positionRight){
            if(cleanedStr.charAt(positionLeft) != cleanedStr.charAt(positionRight)){
                return false;
            }
            positionLeft++;
            positionRight--;
        }
        return true;
    }
}
