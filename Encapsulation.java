class Encapsulation{
    private int amount;

    void getter(){
        System.out.println(amount);
    }
    void setter(int num){
        amount=num;
    }
}
class Encaps{
    public static void main(String[] args){
        User us = new User();
        us.setter(2000);
        us.getter();
    }
}