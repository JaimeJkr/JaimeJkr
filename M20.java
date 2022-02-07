package leectCode;

import java.util.Stack;

public class M20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "([)]";
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode();
		System.out.println(mergeTwoLists(l1,l2));
	}
	public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) 
		      { this.val = val; this.next = next;
		      
		      }
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null && l2 == null)
			return l1;
		if(l1 == null)
			return l2;
		else if(l2 == null)
			return l1;
		
		ListNode prev = new ListNode();
		ListNode temp = prev;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				temp.next = l1;
				l1 = l1.next;
			}else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		
		
		return prev.next;
	}
}
