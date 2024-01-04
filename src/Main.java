import pojo.TreeNode;

public class Main {

    public static TreeNode buildBinaryTree() {
        TreeNode rootNode = new TreeNode('A');
        TreeNode nodeB = new TreeNode('B');
        TreeNode nodeC = new TreeNode('C');
        TreeNode nodeD = new TreeNode('D');
        TreeNode nodeE = new TreeNode('E');
        TreeNode nodeF = new TreeNode('F');
        TreeNode nodeG = new TreeNode('G');
        TreeNode nodeH = new TreeNode('H');

        rootNode.left = nodeB;
        rootNode.right = nodeC;
        nodeB.left = nodeD;
        nodeB.right = nodeE;
        nodeC.left = nodeF;
        nodeC.right = nodeG;
        nodeE.right = nodeH;

        return rootNode;
    }

    public static void main(String[] args) {
        TreeNode rootNode = buildBinaryTree();
        System.out.println("前序遍历：");
        preIterate(rootNode);
        System.out.println("\n中序遍历：");
        midIterate(rootNode);
        System.out.println("\n后序遍历：");
        postIterate(rootNode);
    }

    public static void preIterate(TreeNode rootNode) {
        if(rootNode == null) {
            return;
        }
        System.out.print(rootNode.val);
        preIterate(rootNode.left);
        preIterate(rootNode.right);
    }

    public static void midIterate(TreeNode rootNode) {
        if(rootNode == null) {
            return;
        }
        midIterate(rootNode.left);
        System.out.print(rootNode.val);
        midIterate(rootNode.right);
    }

    public static void postIterate(TreeNode rootNode) {
        if(rootNode == null) {
            return;
        }
        postIterate(rootNode.left);
        postIterate(rootNode.right);
        System.out.print(rootNode.val);
    }
}