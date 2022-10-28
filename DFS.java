import java.util.LinkedList;

import alist.*;


public class DFS {

    static int time=0;
    public static void traversal(Graph graph){
        for(LinkedList<Node>ls:graph.returnAlist()){
            ls.get(0).color='w';
        }
        for(LinkedList<Node>ls:graph.returnAlist()){
            Node u=ls.get(0);
           if( u.color=='w'){
            Explore(graph,u);


           }
        }

    }
    public static void Explore(Graph graph,Node u){
        u.color='G';
        time++;
       
        for(LinkedList<Node>ls:graph.returnAlist()){
            Node node=ls.get(0);
           if( node.data==u.data){
            for(Node n:graph.alistOFNode(u)){
                if(n.color=='G'){
                    System.out.print("");
                }
                else if(n.color=='w'){
                    Explore(graph, n);
                    n.p=u;
                    
                }
            }


           }
        }
        
        u.color='B';
        System.out.println( u.data);
        time++;
    }
    
}