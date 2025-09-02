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
 Another good solution:
 https://leetcode.com/problems/linked-list-cycle/solutions/7126201/java-100-spotting-the-snake-cycle/
 */
public class Main {
    public boolean hasCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;
            if(hare==tortoise){
                return true;
            }

        }
        return false;
    }
}

//we can solve this problem using a hashset to store the nodes we have seen so far. If we see a node again, then there is a cycle in the linked list. Otherwise, if we reach the end of the list (i.e., a null pointer), then there is no cycle.
//but then there will be O(N) space complexity
//the above solution is better because it uses O(1) space complexity and O(N) time complexity
//this is called Floyd's Tortoise and Hare algorithm
//the idea is to have two pointers, one moving twice as fast as the other. If there is a cycle, the two pointers will eventually meet. If there is no cycle, the faster pointer will reach the end of the list.