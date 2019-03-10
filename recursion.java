import java.util.ArrayList;
import java.util.List;
public class recursion{
    public static List<String> makeAllWords(int k, int maxLetter){
      List<String> wordarr = new ArrayList<String>();
      return wordsHelper(k, maxLetter, "", wordarr);
    }
    public static List<String> wordsHelper(int k, int maxLetter, String word, List<String> wordarr){
      if (k == 0) wordarr.add(word);
      else {
        for (int i = 0; i < maxLetter; i++) {
          int tempInt = 'a' + i;
          char tempChar = (char) tempInt;
          wordsHelper(k - 1, maxLetter, word + tempChar, wordarr);
        }
      }
      return wordarr;
    }
    public static void main(String[] args){
      System.out.println(makeAllWords(2, 26).toString());
    }
}
