package Middle_element_of_linked_list;

import java.util.Scanner;

public class Solution {
    Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static Solution Create(Solution list,int data)
	{
		Node q=new Node(data);
		if(list.head==null)
		{
			list.head=q;
		}
		else
		{
			Node p=list.head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=q;
		}
		return list;
	}
	public static void Middle(Solution list)
	{
		Node q1=list.head;
		Node q2=list.head;
		while (q1 != null && q1.next != null) 
        { 
           q1=q1.next.next;
           q2=q2.next;
        } 
		System.out.println(q2.data);
	}
    public static void main(String[] args) {
    	Solution list=new Solution();
     	int n;
     	Scanner sc=new Scanner(System.in);
     	System.out.println("Desired Size:");
     	n=sc.nextInt();
     	for(int i=1;i<=n;i++)
     	{
     		list=Create(list, sc.nextInt());
     	}
     	Middle(list);
     	sc.close();
     	
}
}
