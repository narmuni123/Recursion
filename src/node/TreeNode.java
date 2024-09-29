package node;  // Declare package for organizational purposes

import java.util.ArrayList;  // Import ArrayList to manage child nodes dynamically

/**
 * TreeNode class represents a node in a tree structure.
 * Each node contains data and a list of child nodes.
 */
public class TreeNode {
    public String data;  // The data stored in the node, in this case, a String
    public ArrayList<TreeNode> children;  // List of child nodes for the current node

    /**
     * Constructor to initialize a TreeNode with data.
     * It also initializes an empty list for the node's children.
     *
     * @param data - The data associated with the node.
     */
    public TreeNode(String data) {
        this.data = data;  // Set the node's data
        this.children = new ArrayList<TreeNode>();  // Initialize an empty list of children
    }

    /**
     * Adds a child node to the current node's list of children.
     *
     * @param node - The TreeNode to be added as a child.
     */
    public void addChild(TreeNode node) {
        this.children.add(node);  // Append the new child node to the children list
    }

    /**
     * Recursively prints the tree structure, starting from the current node.
     * Each level of the tree is indented to visually represent the hierarchy.
     *
     * @param level - The current depth level of the node in the tree.
     * @return String - A formatted string representation of the tree.
     */
    public String print(int level) {
        String ret;  // To hold the result of the printed tree
        // Indent by 'level' spaces and append the node's data followed by a new line
        ret = " ".repeat(level) + data + "\n";

        // Recursively call print() on each child, increasing the indentation level
        for (TreeNode node: children) {
            ret += node.print(level + 1);  // Add child node's representation to the result
        }

        return ret;  // Return the formatted tree structure
    }
}
