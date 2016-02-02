

    import android.widget.LinearLayout;
    public class LinkedList
    {
        private Node head;
        private LinearLayout layout;

        public LinkedList(LinearLayout layout)
        {
            this.head = null;
            this.layout = layout;
        }

        public void display()
        {
            if(this.head == null)
            {
                System.out.println("Empty List");
            }
            else
            {
                //display the list in a reasonable format
            }

        public void addFront(String value)
        {
                if(this.getHead() == null)
                {
                    Node n = new Node(value);
                    this.setHead(n);
                }

                else
                {
                    Node n = new Node(this.getHead().getPayload());
                    n.setNextNode(this.getHead().getNextNode());
                    Node newHead = new Node(value);
                    newHead.setNextNode(n);
                    this.setHead(newHead);
                }
            }

        public Node removeFront()
            {
                if(this.head.getNextNode() == null)
                {
                    this.setHead(null);
                    return null;
                }

                else
                {
                    Node n = new Node(this.getHead().getPayload());
                    n.setNextNode(this.getHead().getNextNode());
                    this.head = n.getNextNode();
                    return n;
                }
            }
        }
    }
}
