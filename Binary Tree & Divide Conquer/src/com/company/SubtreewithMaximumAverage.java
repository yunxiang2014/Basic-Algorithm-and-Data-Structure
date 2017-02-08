package com.company;

/**
 * Created by yunxiangchai on 2/7/2017.
 */

public class SubtreewithMaximumAverage {
    /**
     * @param root the root of binary tree
     * @return the root of the maximum average of subtree
     */
    private Result maxResult =  new Result(0, null, 0);

    public TreeNode findSubtree2(TreeNode root) {
        // Write your code here
        //bottom up;
        //Result result = new Result(0, null);
        if(root==null){
            return null;
        }
        Result result = helper(root);
        return maxResult.getNode();
    }

    public Result helper(TreeNode root){
        if(root==null){
            return new Result(0, null, 0);
        }
        Result left = helper(root.left);
        Result right = helper(root.right);
        int number = left.getNumber() + right.getNumber() + 1;
        float maxAvergae = (left.getSum() + right.getSum() + root.val)/number;
        float sum = (left.getSum() + right.getSum() + root.val)/number;
        if(maxAvergae > maxResult.getSum()){
            maxResult = new Result(maxAvergae, root, number);
        }
        return new Result(sum, root, number);
    }

    class Result{
        float sum;
        TreeNode node;
        int number;
        public Result(float sum, TreeNode node, int number){
            this.sum = sum;
            this.node = node;
            this.number = number;
        }
        public float getSum(){
            return sum;
        }
        public TreeNode getNode(){
            return node;
        }
        public int getNumber(){
            return number;
        }
    }
}
