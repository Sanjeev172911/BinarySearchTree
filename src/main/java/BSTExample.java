public class BSTExample {
    public static void main(String[] args) {
        BinarySearchTree<Integer>bst=new BinarySearchTree<>();

        bst.addNode(56);
        bst.addNode(30);
        bst.addNode(70);

        bst.displayTree();
    }
}
