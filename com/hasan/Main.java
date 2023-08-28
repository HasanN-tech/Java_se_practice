package com.hasan;
import java.util.ArrayList;
public class Main {
  public static void main(String args[]){
//    ArrayList l= new ArrayList();
//    l.add(72);
//    l.add(12);
//    l.add(22);
//    l.add(32);
//    l.add("A");
//    l.add(2,"tewnty two");
//    System.out.println(l);
//    l.remove(2);
//    l.remove(3);
//    System.out.println(l);
//    l.add(0,10);
//    l.add(0,15);
//
//    System.out.println(l.contains(72));
//    System.out.println(l);

    ArrayList l2=new ArrayList(6);
    l2.add(1);
    l2.add(2);
    l2.add(3);
    l2.add(4);
    l2.add(5);
    l2.add(6);
    l2.add(7);
    System.out.println(l2);
    l2.set(0,0);
    System.out.println(l2.size());
    System.out.println(l2);
    System.out.println("**************************************************");
    ArrayList l3=new ArrayList(l2);
    l3.add(10);
    l3.add(20);
    l3.add(30);
    l3.add(40);
    l3.add(50);
    System.out.println(l3);

    System.out.println("______________________________________________________");
    Vector v= new Vector(6,4);
      v.addElement(32);
      v.add(3);
      v.addElement(5);
      v.addElement(72);
    System.out.println(v.capacity());
    v.addElement(17);
    v.addElement(43);
    v.addElement(90);
    v.addElement(17);
    v.addElement(43);
    v.addElement(90);
    System.out.println(v.capacity());
    System.out.println(v);
  }
 }
}
