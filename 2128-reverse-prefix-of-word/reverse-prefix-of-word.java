class Solution {
    public String reversePrefix(String word, char ch) {
        char[] s = word.toCharArray();
        int end = word.indexOf(ch);

        if (end == -1) return word;

        int left = 0, right = end;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        return new String(s);
    }
}