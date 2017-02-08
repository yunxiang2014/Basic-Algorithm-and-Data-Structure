package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn4 = new TreeNode(4);
        TreeNode tn_2 = new TreeNode(-2);
        TreeNode tn_5 = new TreeNode(-5);
        TreeNode tn11 = new TreeNode(11);
        TreeNode tn = new TreeNode(1);
        tn.left = tn_5;
        tn.right = tn11;
        tn_5.left = tn1;
        tn_5.right = tn2;
        tn11.left = tn4;
        tn11.right = tn_2;

        //SubtreewithMaximumAverage sma = new SubtreewithMaximumAverage();
        SubtreeMaximumAverage sma = new SubtreeMaximumAverage();
        TreeNode ans = sma.findSubtree2(tn);
        System.out.print(ans.val);
    }
}
