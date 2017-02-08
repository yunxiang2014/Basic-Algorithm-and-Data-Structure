package com.company;

/**
 * Created by yunxiangchai on 2/7/2017.
 */
public class SubtreeMaximumAverage {
    public TreeNode subtree;
    public ResultType maxResult;

    public TreeNode findSubtree2(TreeNode root) {
        helper(root);
        return subtree;
    }
    public ResultType helper(TreeNode root){
        if(root==null){
            return  new ResultType(0, 0);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        ResultType current = new ResultType(
                left.sum + right.sum + root.val,
                left.size + right.size + 1
        );

        if(maxResult==null||maxResult.sum*current.size<current.sum*maxResult.size){
            subtree = root;
            maxResult = current;
        }
        return current;
    }
}
class ResultType{
    public int sum;
    public int size;
    public ResultType(int sum, int size){
        this.sum = sum;
        this.size = size;
    }
}
