public class Solution2 {
    //Stolen from the internet
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 1;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }

        ListNode i = head, temp2 = head;
        int n1 = len - n-1;
        if (len <= 1){
            return null;
        }
        if (n1 == -1){
            return head.next;
        }
        while (n1 > 0){
            i = temp2.next;
            temp2 = temp2.next;
            n1--;
        }
        i.next = i.next.next;

        return head;
    }
}
