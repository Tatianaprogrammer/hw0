import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        long left = -1;
        long right = 2_147_483_648L;
        System.out.println("Загадай число от 0 до 2147483647");

        System.out.println("Если я угадал число, напиши Да \n" +
                            "Если твое число больше, напиши Больше \n" +
                            "Если твое число меньше, напиши Меньше \n");
        int count = 0;
        while(left + 1 < right){

            long mid = (left + right)/2;

            System.out.printf("Это твое число: %d?", mid);
            Scanner scan = new Scanner(System.in);
            String ans = scan.nextLine();

            if(ans.equals("Да")){
                System.out.println("Ура!!!");
                break;
            }else if(ans.equals("Больше")){
                left = mid;
            }else if(ans.equals("Меньше")){
                right = mid;
            }
            count++;
        }
        System.out.printf("Я отгадал за %d попыток.", count);
    }

}