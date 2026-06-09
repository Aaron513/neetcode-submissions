class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = new char[26];
        for(char a:s.toCharArray()) c[a-'a'] +=1;
        for(char a:t.toCharArray()) c[a-'a'] -=1;
        for(int i=0;i<c.length;i++){
            if(c[i]>0) return false;
        }
        return true;
    }
}
