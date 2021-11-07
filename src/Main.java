public class Main {

    public static void main(String[] args) {
	Solution2 solution = new Solution2();

    //test lists
        ListNode list5 = new ListNode(5);
        ListNode list4 = new ListNode(4, list5);
        ListNode list3 = new ListNode(3, list4);
        ListNode list2 = new ListNode(2, list3);
        ListNode list1 = new ListNode(1, list2);

        ListNode list6 = new ListNode(1);

        ListNode list8 = new ListNode(2);
        ListNode list7 = new ListNode(1, list8);

    //tests
        ListNode head = solution.removeNthFromEnd(list1, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        System.out.println("-----------------------------------------");

        ListNode head2 = solution.removeNthFromEnd(list6, 1);
        while (head2 != null) {
            System.out.println(head2.val);
            head2 = head2.next;
        }

        System.out.println("-----------------------------------------");

        ListNode head3 = solution.removeNthFromEnd(list7, 1);
        while (head3 != null) {
            System.out.println(head3.val);
            head3 = head3.next;
        }

        System.out.println("-----------------------------------------");

        ListNode head4 = solution.removeNthFromEnd(list7, 2);
        while (head4 != null) {
            System.out.println(head4.val);
            head4 = head4.next;
        }
    }
}
