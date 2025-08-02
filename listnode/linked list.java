Dublic class List
// return a linked list based on parameters
list and soFar
public static LisENode process (ListNode list, ListNode sofar)
if (list == null) ( return
soFar;
)
else l
ListNode temp = list. getNext () ;
list. setNext (soFar) ;
return process (temp, list) ;
// return a new linked list based on parameter n
public static ListNode create lint n)
ListNode list = null;
for (int k=1; k <= n;
list = new ListNode (new
String (""+k), list);
return list;
// print a linked list
public static void print (ListNode list)
while (list != null) l
System. out print (list.getValue () +" ");
list = list. getNext () ;
System. out. println();
//not complete js copy and pasted
