class Solution {
    public int maxVowels(String s, int k) {
        int currentVowelCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
        }
        
        int maxVowelCount = currentVowelCount;
        if (maxVowelCount == k) {
            return maxVowelCount;
        }
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                currentVowelCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowelCount--;
            }
            
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
            if (maxVowelCount == k) {
                return maxVowelCount;
            }
        }
        
        return maxVowelCount;
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

    
    
        
    
