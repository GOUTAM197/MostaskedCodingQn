import java.util.*;
import java.lang.*;
import java.io.*;
  class Main{
     public static void main(String[] arg)throws Exception{
         System.out.println("Enter the number of element");
         Scanner scn = new Scanner(System.in);
                  int n= scn.nextInt();
         int arr[] = new int[n];
         System.out.println("Enter the element");
          for(int i=0; i<arr.length; i++){
               arr[i] = scn.nextInt();
          }
          System.out.println("Enter the teaget"); 
           int data= scn.nextInt();
           
                int l=0,h=arr.length-1;
                int fi=-1;
                while(l<=h){
                int mid=(l+h)/2;
                
                 if(data<arr[mid]){
                     h=mid-1;
                 }
                   else if(data>arr[mid]){
                     l=mid+1;
                   }
                    else{
                        fi=mid;
                        h=mid-1;
                    }
                }    
                       System.out.println(fi);
                        
                  
  l=0;
  h=arr.length-1;
                int li=-1;
                while(l<=h){
                int mid=(l+h)/2;
                
                 if(data<arr[mid]){
                     h=mid-1;
                 }
                   else if(data>arr[mid]){
                     l=mid+1;
                   }
                    else{
                        li=mid;
                        l=mid+1;
                    }
                }    
                 System.out.println(li);
     }
 }