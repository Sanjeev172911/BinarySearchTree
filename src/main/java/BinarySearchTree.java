public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T>root;


    BinarySearchTree(){
        root=null;
    }

    public Node<T> addNode(Node<T>root,T data){
        if(root==null){
            return new Node(data);
        }

        if(root.data.compareTo(data)>0){
            root.left=addNode(root.left,data);
        }else if(root.data.compareTo(data)<0){
            root.right=addNode(root.right,data);
        }

        return root;
    }

    public void addNode(T data){
        Node<T>Root=addNode(root,data);
        this.root=Root;
    }

    public boolean searchNode(Node<T>root,T data){
        if(root==null) return false;

        if(root.data==data) return true;
        else if(root.data.compareTo(data)<0) return searchNode(root.right,data);
        else return searchNode(root.left,data);
    }

    public boolean searchNode(T data){
        return searchNode(this.root,data);
    }

    public void inOrder(Node<T>root){
        if(root==null) return ;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void displayTree(){
        inOrder(root);
    }


}
