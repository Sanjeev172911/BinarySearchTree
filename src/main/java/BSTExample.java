public class BSTExample {
    public static void main(String[] args) {
        BinarySearchTree<Integer>bst=new BinarySearchTree<>();

        bst.addNode(56);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(22);
        bst.addNode(40);
        bst.addNode(11);
        bst.addNode(3);
        bst.addNode(16);
        bst.addNode(60);
        bst.addNode(95);
        bst.addNode(65);
        bst.addNode(63);
        bst.addNode(67);

        bst.displayTree();
    }
}
