public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode before = new ListNode(-1);
        before.next = head;

        ListNode up = before;
        ListNode down = before;

        for (int i = 0; i < n && up != null; i++) {
            up = up.next;
        }

        while (up.next != null) {
            down = down.next;
            up = up.next;
        }
        down.next = down.next.next;

        return before.next;
    }
}
