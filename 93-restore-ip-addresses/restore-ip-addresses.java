import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, "", result);
        return result;
    }

    void backtrack(String s, int index, int parts, String ip,
                   List<String> result) {

        if (parts == 4) {
            if (index == s.length()) {
                result.add(ip.substring(0, ip.length() - 1));
            }
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            int value = Integer.parseInt(part);

            if (value > 255) {
                break;
            }

            backtrack(s, index + len, parts + 1,
                      ip + part + ".", result);
        }
    }
}