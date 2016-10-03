class ROT13 {
    private static String cipher_text = "Whfg trggvat gurer vf uneq rabhtu... tbbq yhpx! :)";

    private static char rot13(char input) {
        if('a' <= input && input <= 'z') {
            return (char)(((input - 'a' + 13) % 26) + 'a');
        } else if('A' <= input && input <= 'Z') {
            return (char)(((input - 'A' + 13) % 26) + 'A');
        }
        return input;
    }

    public static void main(String[] args) {
        for(char c : cipher_text.toCharArray()) {
            System.out.print(rot13(c));
        }
        System.out.println();
    }
}
