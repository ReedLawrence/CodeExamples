/*
 * Created by Reed Lawrence
 * Data Structures Fall 2014
 * Implementation of Double Linked Circular List
 */
package circularlist;

public class CircularList {
    //Added for testing purposes only
    public static void main(String[] args) {
        DoubleLinkedList list0;

        list0 = new DoubleLinkedList();
        System.out.println(list0.add(10));
        System.out.println("Content: ");
        list0.traverseAscend();
        list0.traverseDecend();
        System.out.println(list0.add(20));
        System.out.println("Content: ");
        list0.traverseAscend();
        list0.traverseDecend();
        System.out.println(list0.add(30));
        System.out.println("Content: ");
        list0.traverseAscend();
        list0.traverseDecend();
        System.out.println(list0.add(25));
        System.out.println("Content: ");
        list0.traverseAscend();
        list0.traverseDecend();
        System.out.println(list0.add(25));
        System.out.println("Content: ");
        list0.traverseAscend();
        list0.traverseDecend();
    }
}

class DoubleLinkedList {

    private Node head;
    private Node tail;

    // add an integer to the linked list in ascending order
    //if succeed, return the number being added
    //if the number already exists return -1
    public int add(Integer e) {
        //Special case: List is empty
        if (head == null) {
            head = new Node(e);
            tail = head;
            tail.next = head;
            head.previous = tail;
            return e;
        } else {        
            Node tmp = new Node(e);
            Node curr;
            for (curr = head; curr != tail && tmp.item <= curr.item; curr = curr.next) {
                if (tmp.item == curr.item) {
                    return -1;
                }
                System.out.println("curr.item = " + curr.item);
            }
            if (curr == tail && tmp.item > tail.item) {
                tmp.next = head;
                tmp.previous = tail;
                tail.next = tmp;
                head.previous = tmp;
                tail = tmp;
                return e;
            }
            if (tmp.item == tail.item) {
                return -1;
            }
            if (tmp.item > tail.item) {
                tmp.next = head;
                tmp.previous = tail;
                tail.next = tmp;
                head.previous = tmp;
                tail = tmp;
                return e;
            }
            //add item to middle of the list
            curr = curr.next;
            if (tmp.item == curr.next.item) {
                return -1;
            }
            tmp.next = curr.next;
            tmp.previous = curr;
            curr.next = tmp;
            tmp.next.previous = tmp;
            return e;
        }
    }

    /**
     * traverse the list. Print each element with a space as separator
     */
    public void traverseAscend() {
        for (Node curr = head; curr != tail; curr = curr.next) {
            System.out.print(curr + " ");
        }
        System.out.println(tail);
    }

    public void traverseDecend() {
        for (Node curr = tail; curr != head; curr = curr.previous) {
            System.out.print(curr + " ");
        }
        System.out.println(head);
    }

    class Node {

        Node next;
        Node previous;
        Integer item;

        Node(Integer item) {
            next = null;
            previous = null;
            this.item = item;
        }

        public String toString() {
            return item.toString();
        }
    }
}
