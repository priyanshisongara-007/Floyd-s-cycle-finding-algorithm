/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 **/
public class DetectTheElementWhereLoopStarted {
    public ListNode detectTheLoopElement(ListNode head) {
        if(head==null || head.next==null) return null;
       ListNode tortoise = head;
         ListNode hare = head;
         while(hare != null && hare.next != null) {
             tortoise = tortoise.next;
             hare = hare.next.next;
             if(tortoise == hare){

                 break;
             }
         }
         if(tortoise!=hare){
             return null;
         }else{
             tortoise=head;
             while(hare!=tortoise){
                 hare=hare.next;
                 tortoise=tortoise.next;

             }
                 return tortoise;
         }
    }
}