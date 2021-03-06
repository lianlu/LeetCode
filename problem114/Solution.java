package problem114;

import java.util.Stack;

import TreeNode.TreeNode;

//Given a binary tree, flatten it to a linked list in-place.
//
//For example,
//Given
//
//         1
//        / \
//       2   5
//      / \   \
//     3   4   6
//The flattened tree should look like:
//   1
//    \
//     2
//      \
//       3
//        \
//         4
//          \
//           5
//            \
//             6

public class Solution {
	 public void flatten(TreeNode root) {
		 	if (root == null) return;
		 	TreeNode left = root.left;
		 	TreeNode right = root.right;
			root.left = null;
		 	flatten(left);
		 	flatten(right);
		 	root.right = left;
		 	
		 	TreeNode cur = root;
		 	while(cur.right !=null)
		 	{
		 		cur = cur.right;
		 	}
		 	cur.right = right;
		 	
		 	
	    }

}
