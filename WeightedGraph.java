import java.util.ArrayList;
import java.util.LinkedList;

public class WeightedGraph {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<Edge>[] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight) {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); // for directed graph
        }

        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j < list.size(); j++) {
                    System.out.println("vertex-" + i + " is connected to " + list.get(j).destination + " with weight "
                            + list.get(j).weight);
                }
            }
        }

        public void chooseMin() {
            int[] weight = new int[vertices];
            for (int i = 0; i < vertices; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j < list.size(); j++) {
                    weight[j]=list.get(j).weight;
                }
            }
            for(int i=0;i<vertices;i++)
                for(int j=i+1;j<vertices;j++)
                    if(weight[i]>weight[j]) {
                        int temp = weight[i];
                        weight[i] = weight[j];
                        weight[j] = temp;
                    }
            System.out.println("The vertice with weight "+weight[1]+" should be selected");
        } 
    }

    public static void main(String[] args) {
        int vertices = 4;
        Graph graph = new Graph(vertices);
        graph.addEgde(0, 1, 4);
        graph.addEgde(0, 2, 5);
        graph.addEgde(0, 3, 6);
        graph.printGraph();
        graph.chooseMin();
    }
}
