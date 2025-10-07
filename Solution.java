class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int mini=Math.min(len1,len2);
        int p=0;
        int q=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(count<mini)
        {
            sb.append(word1.charAt(p));
            sb.append(word2.charAt(q));
            p++;
            q++;
            count++;
        }
        if(len1==mini)
        {
            sb.append(word2.substring(mini));
        }
        else{
            sb.append(word1.substring(mini));
        }
        return sb.toString();
        
    }
}
