
//Reverse String
public class Ejercicio03 {
    public static void main(String[] arg){
            System.out.println(stringReverse("Hola"));
            System.out.println(stringReverse("Java"));
            System.out.println(stringReverse("Palindrome"));

            System.out.println(stringBuilderReverse("Hola"));
            System.out.println(stringBuilderReverse("Java"));
            System.out.println(stringBuilderReverse("Palindrome"));
    }

    public static String stringBuilderReverse(String str){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String stringReverse(String str){
        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }

}
