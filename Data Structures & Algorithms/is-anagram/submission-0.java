class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> map=new HashMap<>();
         HashMap <Character,Integer> map1=new HashMap<>();
         for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
    }
    if(s.length()!=t.length()){
        return false;
    }
    for(char ch:map.keySet()){
        if(!map1.containsKey(ch)){
            return false;
        }else{
            if(!map.get(ch).equals(map1.get(ch))){
                return false;


            }
        }
        
    }
    return true;
}
}