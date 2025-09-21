package JavaBasics;

public class Lab003_Increment {
    public static void main(String[] args) {

     //pre increment
      int a =10;
      int b= ++a;

      System.out.println(a);
      System.out.println(b);

      //post increment
      int a_post =10;
      int b_post = a_post++;
      System.out.println(b_post);
      System.out.println(a_post);
// Advance
        int q =10;
        System.out.println(q++ + q);
        System.out.println(q);
        System.out.println(q++ + ++q);
        System.out.println(q);


    }
}
