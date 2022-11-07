public class WordScramble {
    public static void main(String[] args) {
        System.out.println(hasPattern("TAAAAAA"));
        System.out.println(hasPattern("AARDVARK"));
        System.out.println(hasPattern("ABABAB"));
        System.out.println(hasPattern("BOZO"));

        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("ABABAB"));
        System.out.println(scrambleWord("BOZO"));
    }

    public static boolean hasPattern(String word) {

        for (int i = 0; i < word.length() - 1; i++)
        {
            if (word.substring(i, i + 1).equals("A") && !word.substring(i + 1, i + 2).equals("A"))
            {
                return true;
            }
        }
        return false;
    }

    public static String scrambleWord(String word) {
        String newString = "";
        for (int i = 0; i < word.length(); i++)
        {
            if (i == word.length() - 1)
            {
                newString = newString + word.substring(i, i + 1);
            }
            else if (word.substring(i, i + 1).equals("A") && !word.substring(i + 1, i + 2).equals("A"))
            {
                String add1 = word.substring(i + 1, i + 2);
                String add2 = word.substring(i, i + 1);
                newString = newString + add1 + add2;
                i++;
            }
            else
            {
                newString = newString + word.substring(i, i + 1);
            }
        }
        return newString;
    }
}
