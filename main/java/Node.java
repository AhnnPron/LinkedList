
public class Node
{
    private Node nextNode;
    private String payload;

    public Node(String payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    public String getPayload()
    {
        return payload;
    }

    public void setPayload(String payload)
    {
            this.payload = payload;
    }
}
