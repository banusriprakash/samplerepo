public class stringrev {
    public static void main(String[] args) {
        String str = "Banu sri prakash";

        str.trim();

        String words[] = str.split("\\s+");

        StringBuilder s = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            s.append(words[i]);
            if (i > 0) {
                s.append(" ");
            }
        }
        System.out.println(s.toString());
        System.out.println(str);
    }
}
