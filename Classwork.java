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

}
