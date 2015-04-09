
public class linkedList
{
	public BaseballPlayer aPlayer;
    protected Node start;
    public int size;
    private static GUI ThreeColGUI;

    public linkedList()
    {
        start=null; // Start is a NODE
        size = 0;
    }
    /*  Function to check if list is empty  */
    public boolean isEmpty()
    {
        return start == null;
    }
    /*  Function to check size of list  */
    public int getSize()
    {
        return size;
    }    

    /*  Function to insert an element  */
    public void insert(BaseballPlayer aPlayer)
    {
        Node nptr, ptr, tmp = null; // all these 3 variables are NODES !
        nptr = new Node(aPlayer, null);
        boolean ins = false;
        if (start == null) // first round, IT IS NULL! as declared above
           start = nptr; // start is now a node with data aPlayer, and link=null
        else if (aPlayer.getPlayerNum() <= start.getData().getPlayerNum())
        {
            nptr.setLink(start);
            start = nptr;
        }
        else
        {
            tmp = start;
            ptr = start.getLink();
            while(ptr != null)
            {
                if (aPlayer.getPlayerNum() >= tmp.getData().getPlayerNum() && aPlayer.getPlayerNum() <= ptr.getData().getPlayerNum())
                {
                    tmp.setLink(nptr);
                    nptr.setLink(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    tmp = ptr;
                    ptr = ptr.getLink();
                }
            }
            if (ins == false)
            {
                tmp.setLink(nptr);
            }
        }
        size++;
    }
    public void display()
    {
  //  	System.out.print("Sorted Singly Linked List:\n");
    	if (size == 0) 
    	{
    		System.out.print("empty\n");
    		return;
    	}
    	Node ptr = start;
    	
    	if (start.getData().getPlayerType() == 'P') { // last one
    		ThreeColGUI.textArea3.append(ptr.getData().playerNumber + "," + 
    						 start.getData().lastName + "," + 
    						 start.getData().firstName + "," + 
    						 start.getData().battingAvg + "," +
    		//				 start.getData().earnedRunAvg +
    						 "\n");
    		}
    		
    		else if (start.getData().getPlayerType() == 'F'){
    			ThreeColGUI.textArea2.append(ptr.getData().playerNumber + "," + 
						 start.getData().lastName + "," + 
						 start.getData().firstName + "," + 
						 start.getData().battingAvg + "," +
		//				 start.getData().earnedRunAvg +
						 "\n");
    		}
    	
    	/*System.out.print(start.getData().playerNumber + "," +
    					 start.getData().lastName+ "," +
    					 start.getData().firstName+ "," +
    					 start.getData().battingAvg + "," +
    					 "\n");
    	*/
    	
    	
    	ptr = start.getLink();
    	
    	
    	
    	while (ptr.getLink() != null) {
    		if (ptr.getData().getPlayerType() == 'P') {
    		ThreeColGUI.textArea3.append(ptr.getData().playerNumber + "," + 
    						 ptr.getData().lastName + "," + 
    						 ptr.getData().firstName + "," + 
    						 ptr.getData().battingAvg + "," +
    		//				 ptr.getData().earnedRunAvg +
    						 "\n");
    		}
    		
    		else {
    			ThreeColGUI.textArea2.append(ptr.getData().playerNumber + "," + 
						 ptr.getData().lastName + "," + 
						 ptr.getData().firstName + "," + 
						 ptr.getData().battingAvg + "," +
		//				 ptr.getData().earnedRunAvg +
						 "\n");
    		}
    		ptr = ptr.getLink();
    	} // end while
    	if (ptr.getData().getPlayerType() == 'P') { // last one
    		ThreeColGUI.textArea3.append(ptr.getData().playerNumber + "," + 
    						 ptr.getData().lastName + "," + 
    						 ptr.getData().firstName + "," + 
    						 ptr.getData().battingAvg + "," +
    		//				 ptr.getData().earnedRunAvg +
    						 "\n");
    		}
    		
    		else if (ptr.getData().getPlayerType() == 'F'){
    			ThreeColGUI.textArea2.append(ptr.getData().playerNumber + "," + 
						 ptr.getData().lastName + "," + 
						 ptr.getData().firstName + "," + 
						 ptr.getData().battingAvg + "," +
		//				 ptr.getData().earnedRunAvg +
						 "\n");
    		}
    	
   /* 	while (ptr.getLink() != null) { // bakup original loop
    		System.out.print(ptr.getData().playerNumber + "," + 
    						 ptr.getData().lastName + "," + 
    						 ptr.getData().firstName + "," + 
    						 ptr.getData().battingAvg + "," +
    		//				 ptr.getData().earnedRunAvg +
    						 "\n");
    		ptr = ptr.getLink();
    	}
    	System.out.print(ptr.getData().playerNumber + "," + 
    					 ptr.getData().lastName + "," + 
    					 ptr.getData().firstName + "," + 
    					 ptr.getData().battingAvg + "," +
//						 ptr.getData().earnedRunAvg +

    					 "\n");
*/
    	
    	/*	if (start.getLink() == null) 
    	{
    		System.out.println(start.getData() );
    		return;
    	} */
    }
    /*  Function to delete an element at position  */
   /* public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            start = start.getLink();
            size--; 
            return ;
        }
        if (pos == size) 
        {
            Node ptr = start;
 
            for (int i = 1; i < size - 1; i++)
                ptr = ptr.getLink();
            ptr.setLink(null);            
            size --;
            return;
        }
        Node ptr = start;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
    }    */
    /*  Function to display elements  */
}