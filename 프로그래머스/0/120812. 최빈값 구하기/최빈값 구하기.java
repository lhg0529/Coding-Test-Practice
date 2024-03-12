import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        
        // 각 요소의 빈도수 계산
        for(int num : array) {
            int currentFrequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, currentFrequency);
            maxFrequency = Math.max(maxFrequency, currentFrequency);
        }
        
        // 최빈값 찾기
        int mode = 0;
        int modeCount = 0;
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() == maxFrequency) {
                mode = entry.getKey();
                modeCount++;
                
                // 최빈값이 여러 개인 경우
                if(modeCount > 1) {
                    return -1;
                }
            }
        }
        
        // 최빈값이 단 하나인 경우, 그 값을 반환
        return modeCount == 1 ? mode : -1;
    }
}
