package classes;

public class Palindrom {


    public void checkWord(String word){

        String originalWord = word;

        String original, reverse = "";

        System.out.println(originalWord);

        int length = word.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + word.charAt(i);

        if ( reverse == originalWord){

            System.out.println(originalWord + " Is Palindrom!");

        }
        else{

            System.out.println(originalWord + " Is not Palindrom!");

        }
    }
}
