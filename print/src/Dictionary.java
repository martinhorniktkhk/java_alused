import java.util.HashMap;

public class Dictionary {
    public HashMap<String, String> dict = new HashMap();

    public Dictionary() {
        this.dict = new HashMap<>();
    }

    public String translate(String word) {
        return dict.get(word);
    }

    public void add(String word, String translation) {
        dict.put(word, translation);
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
    }
}