import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int comNumber = 356;
        int trial = 1;
        String strComNumber = String.valueOf(comNumber);
        Scanner sc = new Scanner(System.in);
        while (true) {
            String userNumber = sc.nextLine();
            System.out.println(trial + "번째 시도 : " + userNumber);
            if (userNumber.equals(strComNumber)) {
                System.out.println(trial + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            }
            int sCnt = 0;
            int bCnt = 0;
            for (int i = 0; i < 3; i++) {
                if (strComNumber.charAt(i) == userNumber.charAt(i)) {
                    sCnt++;
                }
                if (strComNumber.contains(String.valueOf(userNumber.charAt(i)))) {
                    bCnt++;
                }
            }
            String result = bCnt + "B" + sCnt + "S";
            System.out.println(result);
            trial++;
        }

    }
}