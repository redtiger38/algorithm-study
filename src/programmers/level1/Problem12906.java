package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem12906 {
    public void run() {
        int[] input = {1, 1, 3, 3, 0, 1, 1};
        int[] result = solution(input);
        System.out.println(Arrays.toString(result));  // 기대: [1, 3, 0, 1]
    }

    public static int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();

        result.add(arr[0]);          // 첫 값 무조건 추가
        int before = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != before) {  // 이전과 다르면
                result.add(arr[i]);  // 현재 값 추가
                before = arr[i];     // before 업데이트
            }
            // 같으면 아무것도 안 함 (else 불필요)
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
