public class Sum{
public void adding(int a,int b){
System.out.println(a+b);
}
public void adding(int a,int b,int c){
System.out.println(a+b+c);
}
public void adding(double a,double b){
System.out.println(a+b);
}
public static void main(String args[]){
Sum ob=new Sum();
ob.adding(1,2);
ob.adding(1,2,3);
ob.adding(1.2,2.3);
}
}