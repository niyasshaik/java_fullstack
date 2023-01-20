abstract class Animal{
abstract void run();
public void printing(){
System.out.println("Some");
}
}
class Tiger extends Animal{
void run(){
System.out.println("Run");
}
public static void main(String args[]){
Tiger obj= new Tiger();

obj.printing();
obj.run();
}
}