/*  Class Node  */
public class Node
{
    protected BaseballPlayer thePlayer;
    protected Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(BaseballPlayer thePlayer,Node n)
    {
        this.thePlayer = thePlayer;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(BaseballPlayer thePlayer)
    {
        this.thePlayer = thePlayer;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public BaseballPlayer getData()
    {
        return thePlayer;
    }
}
