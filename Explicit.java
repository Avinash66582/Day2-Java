class Explicit{
    public static void main(String[] args){
    int a=10;//globsl scope
    {
        int b=20;//local scope
        System.out.println(a);
        System.out.println(b);
    }
    