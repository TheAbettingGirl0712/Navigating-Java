import java.util.Scanner;
/*
   This program is written by Ali Mubeen Siddiqui and 
   is a part of Team Delta's practice session.
*/
public class Herons{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter hypotenuse: ");

    double hyp = sc.nextDouble();
    System.out.print("enter perpendicular: ");

    double per = sc.nextDouble();
    double base = get_base(hyp,per);
    double s = (hyp+base+per)/2;
    double area = get_area(hyp,per,base,s);
    System.out.println("area is " + area);
    sc.close();
  }

  public static double get_base(hyp,per){
    return Math.sqrt((hyp*hyp)-(per*per));
  }
  public static double get_area(hyp,per,base,s){
    return Math.sqrt(s*(s-hyp)*(s-base)*(s-per);
  }

}
  
