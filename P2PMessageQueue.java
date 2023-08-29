import org.w3c.dom.Node;

/**
 * This Queue maintains the queue of messages coming from connected clients.
 */
public class P2PMessageQueue {

    private P2PMessage head = null;
    private P2PMessage tail = null;


    /**
     * This method allows adding a message object to the existing queue.
     *
     * @param oMessage
     */
    public synchronized void enqueue(P2PMessage oMessage) {
        P2PMessage oP2Pmsg = new P2PMessage();
        oP2Pmsg.setMessage(oMessage);
        if (tail == null && head == null) {
            head = oMessage;
            tail = oMessage;
        }
        tail.next = oMessage;
        tail = oMessage;
        }



		/*if(head == null){
		    head = oMessage;
        }

        P2PMessage tempNode = head;
		while(tempNode.next != null){
		    tempNode = tempNode.next;
        }
        tempNode.next = oP2PMessage;*/



    /**
     * This method allows removing a message object from the existing queue.
     *
     * @return
     */
    public synchronized P2PMessage dequeue() {
        P2PMessage oTemp = new P2PMessage();
        if (head == null) {
            System.out.println("HI");
        }else if(head == tail) {
            oTemp = head;
            head = null;
            tail = null;

        }
        return oTemp;
    }


    public boolean hasNodes() {

        return (head == null);
    }
}
