class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String st:strs){
            int[] ch = new int[26];
            for(char c:st.toCharArray()) ch[c-'a']++;
            map.computeIfAbsent(Arrays.toString(ch),k-> new ArrayList<>()).add(st);
        }
        List<List<String>> res = new ArrayList<>();
        map.values().forEach(list -> res.add(list));
        return res;
    }
}
