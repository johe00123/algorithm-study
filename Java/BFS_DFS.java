/*
너비 우선 탐색, BFS
깊이 우선 탐색, DFS
*/
import java.util.*;

public class BFS_DFS{
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String args[]){
        // 1. 그래프 채우기 (for문 + add줄)
        for(int i = 0; i<5; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(1);
        graph.get(2).add(4);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(4).add(2);
        graph.get(4).add(3);

        // 그래프 출력
        System.out.println(graph);

        visited = new boolean[5];
        bfs(1);
        System.out.println("-------구분선-------");
        visited = new boolean[5];
        dfs(1);

    }
    static void bfs(int start) {
        //큐
        Deque<Integer> queue = new ArrayDeque<>();

        //1번에서 출발
        queue.offer(start);
        visited[start] = true;

        //대기줄이 비어있지 않은 동안
        while (!queue.isEmpty()){
            //맨 앞 사람 꺼내기
            int node = queue.poll();

            System.out.println(node + "번 방문");
            for (int next : graph.get(node)) {
                if(!visited[next]){
                    visited[next] = true;
                    //대기줄에 넣기
                    queue.offer(next);
                }
                
            }
        }
    }

    static void dfs(int node){
        visited[node] = true;
        System.out.println(node + "번 방문");
        for(int next : graph.get(node)){
            if(!visited[next]){
                //재귀
                dfs(next);
            }
        }
    }
}