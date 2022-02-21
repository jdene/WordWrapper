import java.util.StringTokenizer;

public class WordWrapper {

    public String wrap(String input, int maxLineLength) {
        int inputLen = input.length();
        int lineLen = 0;
        String delim = " ";

        StringTokenizer tok = new StringTokenizer(input, delim);
        StringBuilder output = new StringBuilder(inputLen);

        while (tok.hasMoreTokens()) {
            String word = tok.nextToken() + delim;

            if (lineLen + word.length() > maxLineLength) {
                output.append("\n");
                lineLen = 0;
            }
            output.append(word);
            lineLen += word.length();
        }
        return output.toString();
    }

    public static void main(String[] args) {
        WordWrapper w = new WordWrapper();
        String out1 = w.wrap("The quick brown fox jumped over the lazy dog", 30);
        System.out.println(out1);

    }

    }
 /*
You are working on a word processing application and want to be able to take a string and insert
line breaks at just the right places so that it will fit into a column of a given length. You want to break lines at word boundaries.
The wrap function should break the text into lines no longer than the max length
The wrap function should break the text on word boundaries by replacing a space with a newline character
The wrap function should output the resulting text


Requirements
Please complete the exercise in C# or Java
Please submit your code in a git repo
Please use Test Driven Development
Commit your changes for each test so we can see your progress as you code the solution

  */


