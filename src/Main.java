import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String random = "";
        while (random.length() < 3){
            String num = Integer.toString((int) (Math.random() * 10));
            if (random.contains(num)) {
                continue;
            } else {
                random += num;
            }
        }
//        System.out.println(random);

        int trial = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String userNumber = sc.nextLine();
            System.out.println(trial + "번째 시도 : " + userNumber);

            int sCnt = 0;   // Strike
            int bCnt = 0;   // Ball
            for (int i = 0; i < 3; i++) {
                if (random.charAt(i) == userNumber.charAt(i)) {
                    sCnt++;
                } else if (random.contains(String.valueOf(userNumber.charAt(i)))) {
                    bCnt++;
                }
            }
            if (sCnt == 3) {
                System.out.println("3S");
                System.out.println(trial + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            } else if (bCnt == 3 && sCnt == 0) {
                System.out.println("3B");
            } else {
                String result = bCnt + "B" + sCnt + "S";
                System.out.println(result);
                trial++;
            }
        }
    }
}