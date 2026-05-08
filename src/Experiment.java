import java.util.List;

public class Experiment {

    public void runTraversals(Graph graph, int startVertex, boolean showOrder) {

        long start;
        long end;

        start = System.nanoTime();
        List<Integer> bfsOrder = graph.bfs(startVertex);
        end = System.nanoTime();

        long bfsTime = end - start;

        start = System.nanoTime();
        List<Integer> dfsOrder = graph.dfs(startVertex);
        end = System.nanoTime();

        long dfsTime = end - start;

        if (showOrder) {
            System.out.println("BFS order: " + bfsOrder);
            System.out.println("DFS order: " + dfsOrder);
        }

        System.out.println("BFS time: " + bfsTime + " ns");
        System.out.println("DFS time: " + dfsTime + " ns");
    }

    public void runMultipleTests() {

        System.out.println("Small graph: 10 vertices");
        Graph smallGraph = createGraph(10);
        smallGraph.printGraph();
        runTraversals(smallGraph, 0, true);

        System.out.println("\nMedium graph: 30 vertices");
        Graph mediumGraph = createGraph(30);
        runTraversals(mediumGraph, 0, false);

        System.out.println("\nLarge graph: 100 vertices");
        Graph largeGraph = createGraph(100);
        runTraversals(largeGraph, 0, false);
    }

    public void printResults() {
        System.out.println("\nExperiment finished.");
        System.out.println("BFS and DFS were tested on 10, 30, and 100 vertices.");
    }

    private Graph createGraph(int size) {

        Graph graph = new Graph();

        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        for (int i = 0; i < size - 1; i++) {
            graph.addEdge(i, i + 1);
        }

        for (int i = 0; i < size - 2; i += 2) {
            graph.addEdge(i, i + 2);
        }

        return graph;
    }
}