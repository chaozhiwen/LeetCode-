import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        
        if(root==null) return ans;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int count=q.size();
            while(count>0){
                TreeNode tmp=q.poll();
                max=Math.max(max,tmp.val);
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);
                count--;
            }
            ans.add(max);
        }
        return ans;
    }
}

class Main{
	public static void main(String[] args){
		Solution s=new Solution();
		
		/*         100             */
		/*        /   \            */
		/*       50    20          */
		/*      / \   /  \          */
		/*     60  3 6   99         */
		TreeNode t1=new TreeNode(100);
		TreeNode t2=new TreeNode(50);
		TreeNode t3=new TreeNode(20);
		TreeNode t4=new TreeNode(60);
		TreeNode t5=new TreeNode(3);
		TreeNode t6=new TreeNode(6);
		TreeNode t7=new TreeNode(99);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		List<Integer> print1=s.largestValues(t1);
		for(int i=0;i<print1.size();i++)
			System.out.print(print1.get(i)+" ");
		System.out.println();
		
		
		/*      100              */
		/*      / \             */
		/*    50   20            */
		/*   /  \    \           */
		/*  60   3   99        */
		TreeNode g1=new TreeNode(100);
		TreeNode g2=new TreeNode(50);
		TreeNode g3=new TreeNode(20);
		TreeNode g4=new TreeNode(60);
		TreeNode g5=new TreeNode(3);
		TreeNode g6=new TreeNode(99);
		g1.left=g2;
		g1.right=g3;
		g2.left=g4;
		g2.right=g5;
		g3.right=g6;
		List<Integer> print2=s.largestValues(g1);
		for(int i=0;i<print2.size();i++)
			System.out.print(print2.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      / \             */
		/*     2   4            */
		/*    /     \           */
		/*   3       5          */
		TreeNode q1=new TreeNode(1);
		TreeNode q2=new TreeNode(2);
		TreeNode q3=new TreeNode(4);
		TreeNode q4=new TreeNode(3);
		TreeNode q5=new TreeNode(5);
		q1.left=q2;
		q1.right=q3;
		q2.left=q4;
		q3.right=q5;
		List<Integer> print3=s.largestValues(q1);
		for(int i=0;i<print3.size();i++)
			System.out.print(print3.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		/*    /                 */
		/*   3                  */
		TreeNode w1=new TreeNode(1);
		TreeNode w2=new TreeNode(2);
		TreeNode w3=new TreeNode(3);
		w1.left=w2;
		w2.left=w3;
		List<Integer> print4=s.largestValues(w1);
		for(int i=0;i<print4.size();i++)
			System.out.print(print4.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      / \              */
		/*     2   3             */
		/*    /                 */
		/*   4                  */
		TreeNode a1=new TreeNode(1);
		TreeNode a2=new TreeNode(2);
		TreeNode a3=new TreeNode(3);
		TreeNode a4=new TreeNode(4);
		a1.left=a2;
		a1.right=a3;
		a2.left=a4;
		List<Integer> print5=s.largestValues(a1);
		for(int i=0;i<print5.size();i++)
			System.out.print(print5.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		TreeNode b1=new TreeNode(1);
		TreeNode b2=new TreeNode(2);
		List<Integer> print6=s.largestValues(b1);
		for(int i=0;i<print6.size();i++)
			System.out.print(print6.get(i)+" ");
		System.out.println();
		
		
		/*       1              */
		/*      /               */
		/*     2                */
		b1.left=b2;
		List<Integer> print7=s.largestValues(b1);
		for(int i=0;i<print7.size();i++)
			System.out.print(print7.get(i)+" ");
		System.out.println();
		
		
		/*               100                 */
		/*            /       \              */
		/*          50         20            */
		/*        /   \      /    \          */
		/*      60     3    6      99        */
		/*     /  \   / \  / \    /  \       */
		/*    70  80 50 4 60  5  9   22      */
		/*      \   \  \ \  \  \  \    \     */
		/*      42  66 7 81 32 53  95  24    */
		/*      /   /  / /  /  /   /   /     */
		/*     42  66 7 81 32 53  95  24    */
		TreeNode t8=new TreeNode(70);
		TreeNode t9=new TreeNode(80);
		TreeNode t10=new TreeNode(50);
		TreeNode t11=new TreeNode(4);
		TreeNode t12=new TreeNode(60);
		TreeNode t13=new TreeNode(5);
		TreeNode t14=new TreeNode(9);
		TreeNode t15=new TreeNode(22);
		t4.left=t8;t4.right=t9;t5.left=t10;t5.right=t11;t6.left=t12;t6.right=t13;t7.left=t14;t7.right=t15;
		TreeNode t16=new TreeNode(42);
		TreeNode t17=new TreeNode(66);
		TreeNode t18=new TreeNode(7);
		TreeNode t19=new TreeNode(81);
		TreeNode t20=new TreeNode(32);
		TreeNode t21=new TreeNode(53);
		TreeNode t22=new TreeNode(95);
		TreeNode t23=new TreeNode(24);
		t8.right=t16;t9.right=t17;t10.right=t18;t11.right=t19;t12.right=t20;t13.right=t21;t14.right=t22;t15.right=t23;
		TreeNode t24=new TreeNode(42);
		TreeNode t25=new TreeNode(66);
		TreeNode t26=new TreeNode(7);
		TreeNode t27=new TreeNode(81);
		TreeNode t28=new TreeNode(32);
		TreeNode t29=new TreeNode(53);
		TreeNode t30=new TreeNode(95);
		TreeNode t31=new TreeNode(24);
		t16.left=t24;t17.left=t25;t18.left=t26;t19.left=t27;t20.left=t28;t21.left=t29;t22.left=t30;t23.left=t31;
		List<Integer> print8=s.largestValues(t1);
		for(int i=0;i<print8.size();i++)
			System.out.print(print8.get(i)+" ");
		System.out.println();
	}
}
