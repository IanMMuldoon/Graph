/*
 * Ian Muldoon
 * Directed and Weighted Graph
 * 
 */
package project3.pkg282;
// PathApp.java
// demonstrates shortest path with weighted, directed graphs
// to run this program: C>java PathApp
////////////////////////////////////////////////////////////////


public class PathApp{
    public static int translate(char input){
        int num;
        num = Character.getNumericValue(input)-10;
        return num;
    }

    
public static void main(String[] args)
{
Graph theGraph = new Graph();
theGraph.addVertex('A'); // 0 (start)
theGraph.addVertex('B'); // 1
theGraph.addVertex('C'); // 2
theGraph.addVertex('D'); // 3
theGraph.addVertex('E'); // 4
theGraph.addEdge(0, 1, 50); // AB 50
theGraph.addEdge(0, 3, 80); // AD 80
theGraph.addEdge(1, 2, 60); // BC 60
theGraph.addEdge(1, 3, 90); // BD 90
theGraph.addEdge(2, 4, 40); // CE 40
theGraph.addEdge(3, 2, 20); // DC 20
System.out.println("Shortest paths");
theGraph.path(); // shortest paths
System.out.println();
int key = -1;
do{
    System.out.println(" 1 - Change the weight of an edge \n 2 - Add an edge \n 3 - Delete an edge \n 4 - Find path(s)\n 5 - Quit");
    key = UserInput.getInt(1, 5);
    switch (key)
    {
        case 1:         //Change the weight of an edge
            char from;
            char to;
            int weight;
            int numfrom;
            int numto;
            System.out.println("Enter a 'from' vertex");
            from = UserInput.getChar('A', 'E');
            System.out.println("Enter a 'to' vertex");
            to = UserInput.getChar('A', 'E');
            System.out.println("Enter new weight");
            weight = UserInput.getInt();
            numfrom = translate(from);
            numto = translate(to);
            theGraph.changeWeight(numfrom, numto, weight);
            break;
        case 2:        //Add an edge
            char start;
            char end;
            int weight2;
            int numstart;
            int numend;
            System.out.println("Enter a 'from' edge");
            start = UserInput.getChar('A', 'E');
            System.out.println("Enter a 'to' edge");
            end = UserInput.getChar('A', 'E');
            System.out.println("Enter a weight");
            weight2 = UserInput.getInt();
            numstart = translate(start);
            numend = translate(end);
            theGraph.addEdge(numstart, numend, weight2);
            System.out.println("Done!");
            break;
        case 3:         //Delete an edge
            char start2;
            char end2;
            int numstart2;
            int numend2;
            System.out.println("Enter a 'from' vertex");
            start2 = UserInput.getChar('A', 'E');
            System.out.println("Enter a 'to' edge");
            end2 = UserInput.getChar('A', 'E');
            numstart2 = translate(start2);
            numend2 = translate(end2);
            theGraph.deleteEdge(numstart2, numend2);
            break;
        case 4:        //Find path(s) from a vertex
            char vertex;
            int numvertex;
            System.out.println("Enter a vertex you wish to find the path for:");
            vertex = UserInput.getChar('A', 'E');
            numvertex = translate(vertex);
            theGraph.displayRoute(numvertex);
            break;
        case 5:        //Quit the program
            break;
        default:
            System.out.println("Must be a number between 1 and 5");
    }
    theGraph.adjust_sPath();
    theGraph.path();
} while (key != 5);

 // end main()
}// end class PathApp
}////////////////////////////////////////////////////////////////
/**
 *
 * @author ianmu
 */
///////////////////////////////////