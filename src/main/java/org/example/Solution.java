package org.example;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strs0Length = strs[0].length();
        int strsLength = strs.length;
        String output = "";
        boolean isCommmon;
        for (int i = 0; i < strs0Length; i++){
            isCommmon = true;
            for(int j = 0; j < strsLength-1; j++){
                try {
                    if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                        isCommmon = false;
                    }
                }
                catch (Exception e) {
                    isCommmon = false;
                }

            }
            if(isCommmon){
                output = output + strs[0].charAt(i);
            }
            else break;
        }

        return output;
    }
}
