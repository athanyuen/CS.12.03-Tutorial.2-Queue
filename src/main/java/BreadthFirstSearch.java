import java.util.Queue;

public class BreadthFirstSearch {

    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed via a Breadth First Search.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed via a Breadth First Search.
     */
    public static int[] bfs(int[][] graph) {

        // Create a Queue and add the first node (0) to it. Use your Queue class that you just created!
        CISQueue cisQueue = new CISQueue(0);
        // Create a visited array. This array will track whether we have visited a specific node.
        boolean[] visitedArray = new boolean[graph.length];
        // Create a bfs path array and a bfs path index. This array will track the order that the nodes were visited.
        int[] bfsPath = new int[graph.length];
        int bfsIndex = 0;
        // Add the first node (0) to the bfs array.
        cisQueue.enqueue(0);
        // Record the first node (0) as visited.
        visitedArray[0] = true;
        bfsPath[bfsIndex++] = 0;
        // Time to traverse the graph! While the queue is not empty ...
        while(!cisQueue.isEmpty()){
            // Dequeue (poll) the queue and store this value in a variable called currentNode.
            int currentNode = (int) cisQueue.dequeue();
            // Record this node as visited.
            visitedArray[currentNode] = true;
            // Add this node to the path and update the path index.
            for(int neighbour: graph[currentNode]){
                if(!visitedArray[neighbour]){
                    visitedArray[neighbour] = true;
                    cisQueue.enqueue(neighbour);
                    bfsPath[bfsIndex++] = neighbour;
                }
            }
            // Obtain an array of this node's neighbouring/adjacent nodes.

            // Explore the current nodes neighbouring nodes. For each neighbouring node ...

            // If a neighbour hasn't been visited before ...

            // Record the neighbour as visited.

            // Add the neighbour to the queue.

        }


        // Return bfs path.
        
        return bfsPath;
    }
}
