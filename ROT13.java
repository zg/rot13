class ROT13 {
    private static String cipher_text = "Whfg trggvat gurer vf uneq rabhtu... tbbq yhpx! :)";

    private static char rot13(char input) {
        if (Character.isLetter(input))
            return (char) ((((input & 0b01011111) - 'A' + 13) % 26 + 'A') | (input & 0b00100000));
        return input;
    }

    public static void main(String[] args) {
        for(char c : cipher_text.toCharArray()) {
            System.out.print(rot13(c));
        }
        System.out.println();
    }
}
