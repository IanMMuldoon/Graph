/* 
 * Ian Muldoon
 * Directed and Weighted Graph
 */
package project3.pkg282;

/**
 *
 * @author ianmu
 */
public class DistPar // distance and parent
{ // items stored in sPath array
public int distance; // distance from start to this vertex
public int parentVert; // current parent of this vertex

// -------------------------------------------------------------
public DistPar(int pv, int d) // constructor
{
distance = d;
parentVert = pv;
}
} // end class DistPar
///////////////////////////////////////////////////////////////
