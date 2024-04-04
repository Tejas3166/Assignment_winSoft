import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count the number of words in a string using HashMap";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
