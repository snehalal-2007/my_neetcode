class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() == 0 || t.length() == 0) // checks if 
       {
        return false;
       } 
       if(s.length() != t.length() )
       {
        return false;
       }

        char[] sArray1 = s.toCharArray();
        char[] tArray2 = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArray1);
        Arrays.sort(tArray2);

        // Compare sorted arrays
        return Arrays.equals(sArray1, tArray2);
    }
}
