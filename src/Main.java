import programmers.이중우선순위큐;
import programmers.주식가격;

public class Main {
    public static void main(String[] args) {
        이중우선순위큐 x = new 이중우선순위큐();
        String[] list = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        x.solution(list);
    }
}