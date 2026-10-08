// 해시를 이용해서 리스트 안 알파벳 숫자를 세서 출력한다.

import java.util.*;

public class hash{
    public static void main(String[] args) {
        String en[] = {"a", "b", "a", "c", "v", "b"};

        Map<String, Integer> count = new HashMap<>();
        
        for (String n : en){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        System.out.println(count);
    }
}
// 결과 : {a=2, b=2, c=1, v=1}