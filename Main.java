class Base{
    public void helloPri(){
        System.out.println("hello i am form base class...");
    }
    public void hellopr(){
        System.out.println("hello i am second method from base class.....");
    }
    
}
class Derived extends Base{
    public void hit(){
        System.out.println("hello i am from Derived class method.....");
    }        
    public void hit2(){
        System.out.println("hello i second method from Derived class.....");
    }
    
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Base ee = new Base();
		ee.hellopr();
		Derived sc = new Derived();
		sc.hit2();
		sc.helloPri();
	}
}
