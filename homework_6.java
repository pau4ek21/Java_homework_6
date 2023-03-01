import java.util.*;

public class homework_6 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(root);
        System.out.println(result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalHelper(root, result);
        return result;
    }

    private void preorderTraversalHelper(TreeNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.val);
            preorderTraversalHelper(node.left, result);
            preorderTraversalHelper(node.right, result);
        }
    }
}