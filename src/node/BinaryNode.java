package node;

/**
 * [BinaryNode] represents a single node in a binary tree.
 * Each node contains a value, references to its left and right child nodes,
 * and a height attribute which is useful for operations like balancing in AVL trees.
 */
public class BinaryNode {
    public String value;   // The data or value stored in this node
    public BinaryNode left;   // Reference to the left child node
    public BinaryNode right;  // Reference to the right child node
    public int height;  // The height of the node, useful for balancing trees (e.g., in AVL trees)

    /**
     * Default constructor for BinaryNode.
     * By default, the node's left and right child references are null, and the height is 0.
     */
    public BinaryNode() {
        this.value = null;
        this.left = null;
        this.right = null;
        this.height = 0;  // Initial height is set to 0 when a node is created
    }
}
