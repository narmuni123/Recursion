package trees;

import node.BinaryNode;

/**
 * [BinaryTreeLL] represents a Binary Tree where each node can have at most two children
 * (commonly referred to as left and right children).
 *
 * This binary tree is implemented using a linked list structure, where each node
 * is connected via pointers to its left and right child nodes.
 *
 * Operations supported by this class include:
 * 1. Creation of the Tree
 * 2. Insertion of a Node
 * 3. Deletion of a Node
 * 4. Searching for a Value
 * 5. Traversing all Nodes
 * 6. Deleting the entire Tree
 *
 * Time Complexity (T.C) and Space Complexity (S.C) for each operation will be specified accordingly.
 */
public class BinaryTreeLL {
    BinaryNode root;  // Root node of the binary tree

    /**
     * Constructor for BinaryTreeLL.
     * Initializes the binary tree with an empty root.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public BinaryTreeLL() {
        this.root = null;  // Initially, the tree is empty with no root node
    }
}
