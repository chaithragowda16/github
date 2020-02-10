public class encapsulationMain {
    public static void main(String[] args){
        A a=new A();
        //a.var=200;
        System.out.println("value:"+a.getvar());
        a.setvar(10234);
        System.out.println("value:"+a.getvar());

    }
}
