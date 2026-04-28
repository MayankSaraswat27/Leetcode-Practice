import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode newHead = obj.reverseList(head);

        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode node1 = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = node1;
            node1 = head;
            head = temp;
        }
        return node1;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
