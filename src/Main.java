public class Main {

    private static Node reverse(Node headNode){
        Node prevNode = headNode;
        Node nextNode = headNode.getNext();
        headNode = nextNode;
        prevNode.setNext(null);

        while (true){
            nextNode = headNode.getNext();
            headNode.setNext(prevNode);
            if (nextNode == null){
                break;
            }
            prevNode = headNode;
            headNode = nextNode;
        }

        return headNode;
    }

    public static void main(String[] args) {

        //创建链表
        Node headNode = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3,null);
        Node node4 = new Node(4, null);

        headNode.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        headNode = reverse(headNode);

        while (headNode != null){
            System.out.println(headNode.getData());
            headNode = headNode.getNext();
        }

    }
}
