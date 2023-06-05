import java.util.Random;
import java.util.Scanner;

//じゃんけんゲーム
public class Study1 {
    public static void main(String[] args) {
        //標準入力
        Scanner sc = new Scanner(System.in);
        //乱数
        Random rand = new Random();
        //じゃんけんの手を表す配列
        String[] hands = {"グー", "チョキ", "パー"};
        //ユーザーが入力した、｛じゃんけんをプレイする回数｝を保持する変数
        int numOfMatch;
        //ユーザーが選んだ手を表す変数
        int yourHand;
        //コンピュータが選んだ手を表す変数
        int comHand;

        System.out.print("何回戦しますか？\n>");
        numOfMatch = sc.nextInt();
        System.out.println("じゃんけんを開始します");

        //Todo1
        for (int i = 1; i <= numOfMatch; i++){

            //Todo2
            System.out.println("\n----------" +i + "回戦開始！-----------\n");

            //Todo3
            System.out.print("あなたが出す手をえらんでください　０：グー　１：チョキ　２：パー\n>");
            yourHand = sc.nextInt();

            //Todo4
            while (yourHand !=0 && yourHand != 1 && yourHand != 2){
                System.out.print("出す手は次から選んでください 0:グー　1:チョキ　２：パー\n>");
                yourHand = sc.nextInt();
            }

            //Todo5
            comHand = rand.nextInt(3);

            //Todo6
            System.out.println("あなたの手："+ hands[yourHand]);
            System.out.println("COMの手：" +hands[comHand]);

            //Todo7
            if (yourHand == comHand) {
                System.out.println("あいこです");
            } else if (yourHand== 0 && comHand == 1 || yourHand == 1 && comHand == 2 || yourHand == 2 && comHand == 0) {
                System.out.println("あなたの勝ちです");
            } else {
                System.out.println("あなたの負けです。。。");
        }

            //Todo8
            System.out.println("\n-----------" + i + "回戦終了!--------\n");
        }

        System.out.println("じゃんけんゲームを終了します！またプレイしてね！");

    }
}