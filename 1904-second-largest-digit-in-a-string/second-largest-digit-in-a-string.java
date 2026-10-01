class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int second = -1;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';

                if (digit > largest) {
                    second = largest;
                    largest = digit;
                } else if (digit > second && digit < largest) {
                    second = digit;
                }
            }
        }

        return second;
    }
}