package programmers;

import java.util.*;

public class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(0) == 'I') {
                // I 숫자
                queue.add(Integer.parseInt(operations[i].substring(2)));
            } else {
                if (queue.isEmpty()) {
                    continue;
                }
                if (operations[i].charAt(2) == '-') {
                    // D -1
                    queue.remove(queue.peek());
                } else {
                    // D 1
                    Iterator<Integer> it = queue.iterator();
                    int max = Integer.MIN_VALUE;
                    while (it.hasNext()) {
                        int temp = it.next();
                        if (temp > max) {
                            max = temp;
                        }
                    }
                    queue.remove(max);
                }
            }
        }

        if (queue.isEmpty()) {
            return new int[] {0, 0};
        } else {
            int min = queue.peek();
            int max = Integer.MIN_VALUE;
            for (int num : queue) {
                max = Math.max(max, num);
            }
            return new int[] {max, min};
        }
    }
}
