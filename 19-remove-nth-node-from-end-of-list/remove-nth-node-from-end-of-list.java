class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode initial = new ListNode(0, head);
        ListNode first = initial;
        ListNode second = initial;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return initial.next;
    }
}