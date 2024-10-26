public class Task3 {
    public static void main(String[] args) {
        int year = 1900;
        if (year>1584){
            if(year%4==0 && year%100!=0){
                System.out.println(year+" год является високосным");
            } else if (year%400==0) {
                System.out.println(year+" год является високосным");
            }else{
                System.out.println(year+" год не является високосным");
            }
        } else{
            System.out.println(year+" год не является високосным");
        }
    }
}
