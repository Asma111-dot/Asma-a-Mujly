/**
 * Created by EBH on 03/03/21.
 */
public class Tast {

        public static void main(String[] args) {

            SingleLinkedList list= new SingleLinkedList();
            SingleLinkedList list1 = new SingleLinkedList();

            list.addLast(100);
            list.addLast(200);
            list.addLast(300);
            list.addLast(400);
            list.addLast(500);
            list.addLast(600);
            list1.addLast(700);
            list1.addLast(800);

            System.out.println(list.findSecondLastNode(list.head));
            System.out.println("_______________________");

            list.rotate(4);
            System.out.println(list.print());
            System.out.println("_______________________");

            System.out.println(list.newSize());
            System.out.println("_______________________");

            list.concatTwoLists(list,list1);
            System.out.println(list.print());
            System.out.println("_______________________");

            list.head = list.reverse(list.head);
            System.out.println(list.print());

        }
    }


