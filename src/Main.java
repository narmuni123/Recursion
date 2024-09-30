import node.TreeNode;  // Import the TreeNode class from the 'node' package
import trees.BinaryTreeLL;

/**
 * Main class to demonstrate the functionality of the TreeNode structure.
 * This example builds a simple tree of drink categories and prints it.
 */
public class Main {
    public static void main(String[] args) {
        // 1 - //////////////////////////// - BASIC TREE -////////////////////////////////////////////
//        // Create root node representing the category "Drinks"
//        TreeNode drinks = new TreeNode("Drinks");
//
//        // Create subcategories of drinks - "Hot" and "Cold"
//        TreeNode hot = new TreeNode("Hot");
//        TreeNode cold = new TreeNode("Cold");
//
//        // Create specific drinks under the "Hot" category
//        TreeNode tea = new TreeNode("Tea");
//        TreeNode coffee = new TreeNode("Coffee");
//
//        // Create specific drinks under the "Cold" category
//        TreeNode cola = new TreeNode("Cola");
//        TreeNode orange = new TreeNode("Orange");
//
//        // Build the tree by adding subcategories and drinks as children of their respective parent nodes
//        drinks.addChild(hot);   // Add "Hot" category under "Drinks"
//        drinks.addChild(cold);  // Add "Cold" category under "Drinks"
//        hot.addChild(tea);      // Add "Tea" under "Hot"
//        hot.addChild(coffee);   // Add "Coffee" under "Hot"
//        cold.addChild(cola);    // Add "Cola" under "Cold"
//        cold.addChild(orange);  // Add "Orange" under "Cold"
//
//        // Print the entire tree structure starting from the "Drinks" root node
//        System.out.println(drinks.print(0));  // Print the tree with an initial indentation level of 0
        //////////////////////////// - BASIC TREE -////////////////////////////////////////////

        /////////////////////////////- Binary Tree using Linked List -///////////////////////////////
        BinaryTreeLL binaryTreeLL = new BinaryTreeLL();
    }
}
