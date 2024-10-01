public class Classwork
{
  public static void main(String[] args)
  {
    // test your code here
    System.out.println(firstLastN("elephant", 3));
    //0 1 2 3 4 5 6 7 8 9 10
    //e l e p h a n t           //length is 8
    //n=3 
    //eleant

    System.out.println(delEnd("library", 5));
    System.out.println(compareLower("framing", "framING"));
    System.out.println(lengthFirst("Everything in its right place"));
  }

  // write solutions to problems below
  public static String firstLastN(String word, int n)
  {
    String output = new String();
    String firstN = word.substring(0, n); //first n letters, from 0 to n-1

    int indexOfNToLast = word.length() - n; //index of n to last letter
    String lastN = word.substring(indexOfNToLast);

    output = firstN + lastN;
    return output;
  }

  public static String delEnd(String word, int n) 
  {
    return word = word.substring(0, word.length() - n);
  }

  public static int compareLower(String word1, String word2) 
  {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    return word1.compareTo(word2);
  }
  public static int lengthFirst(String sentence)
   { 
      return sentence.indexOf(" ");
   }
   
}
