public class A {
    private int var=100;

    public int getvar(){
        return var;
    }
    public void setvar(int var){
        if (var>1000) {
            this.var = 0;
        }
        else{
            this.var=var;
        }
        //System.out.println("set value is:"+var);
        //return var;


    }
}
