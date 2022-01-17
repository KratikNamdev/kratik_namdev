public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Started");
        String ar[]={"12","0"};
        String s1 = ar[0];
        String s2 = ar[1];
        int i =Integer.parseInt(s1);
        int j =Integer.parseInt(s2);
        try{
        int k=i/j;
        System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println("can not divide by zero");
        }
        System.out.println("Finished");
    }
    
}
