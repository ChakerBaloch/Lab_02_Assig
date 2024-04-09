class Node{
   int value;
   Node left, right;
   
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}

class BinarySearchTree{

   Node root;
   
   
   /*
   recursive insert method
   */
   public Node insert(Node root, int value){
      //base case
      if(root == null){
         root = new Node(value);
         return root;
      }
      
      //recursive step
      if(value < root.value){
         root.left = insert(root.left, value); 
      }else{
         root.right = insert(root.right, value);
      }
      
      return root;
   }
   
   
   
   /**
    * Performs a pre-order traversal of a binary tree.
    * In pre-order traversal, the root node is visited first,
    * followed by recursive visits to the left and right subtrees.
    * This method prints the data of each node during the traversal.
    *
    * @param root The root node of the binary tree to be traversed.
    */

   public void preOrderTraversal(Node root){
    if (root == null) {
      return;
  }

  System.out.print(root.value + " ");

  preOrderTraversal(root.left);

  preOrderTraversal(root.right);

}

   
   
   /**
   * Performs an in-order traversal of a binary tree.
   * In in-order traversal, the left subtree is visited first,
   * then the root node, and finally the right subtree.
   * This method prints the data of each node during the traversal.
   * This traversal method is commonly used in binary search trees
   * to retrieve elements in their sorted order.
   *
   * @param root The root node of the binary tree to be traversed.
   */
   public void inOrderTraversal(Node root){
      if (root == null) {
          return;
      }
  
      inOrderTraversal(root.left);
  
      System.out.print(root.value + " ");
  
      inOrderTraversal(root.right);
   }
   
   
   /**
   * Performs a post-order traversal of a binary tree rooted at the given node.
   * Post-order traversal visits the left subtree, then the right subtree, and finally the root node.
   * This method prints the values of the nodes in post-order traversal.
   *
   * @param root The root node of the binary tree to traverse.
   */
   public void postOrderTraversal(Node root){
      if (root == null) {
         return;
     }
     postOrderTraversal(root.left);
     
     postOrderTraversal(root.right);

     System.out.println(root.value + " ");
   }
   
   
   
   /*
   a method to find the node in the tree
   with a specific value
   */
   public boolean find(Node root, int key){
	  //implement me
      return false;           
   }
   
   
   
   /*
   a method to find the node in the tree
   with a smallest key
   */
   public int getMin(Node root){
      //implement me
      return 0;
   }
  
  
  
   /*
   a method to find the node in the tree
   with a largest key
   */
   public int getMax(Node root){
	  //implement me
     return 0;
   }
   
   
   
   /*
   this method will not compile until getMax
   is implemented
   */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}