class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prevNode = new ListNode(0);
        prevNode.next = head;
        ListNode newHead = prevNode;
        while(prevNode.next != null && prevNode.next.next != null){
            ListNode node1 = prevNode.next;
            ListNode node2 = node1.next;
            ListNode nextNode = node2.next;
            prevNode.next = node2;
            node2.next=node1;
            node1.next=nextNode;
            prevNode=node1;
        }
        return newHead.next;
    }
}
