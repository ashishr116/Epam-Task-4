package Queue_using_2_stacks;


import java.io.*;
import java.util.*;

public class Solution {
static Stack<Integer> s1 = new Stack<Integer>();  
static Stack<Integer> s2 = new Stack<Integer>();  
  static void enQueue(int x)  
    {   
        s1.push(x);
    }  
    static int  deQueue()  
    {  
       if(s2.empty())
           { 
               while(!s1.empty())
               {
                   s2.push(s1.peek());
                   s1.pop();
               } 
               return s2.pop();
            }    
           if(!s2.empty())
           {
               return s2.pop();
           }   
          return 0;
    }  
    public static void main(String[] args) {
       int n,a,x;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
        a=sc.nextInt();
        if(a==1)
        {
            x=sc.nextInt();
            enQueue(x);
        }
        else if(a==2)
        {
            deQueue();
        }
        else
        {  if(s2.empty())
           { 
               while(!s1.empty())
               {
                   s2.push(s1.peek());
                   s1.pop();
               } 
               System.out.println(s2.peek());
            }    
           else
           {
              System.out.println(s2.peek());
           }   
        }
       }
    }
}

