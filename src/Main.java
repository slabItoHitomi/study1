package study2;

import java.util.Scanner;

/**
 * まとめ　Activity (家計簿プログラム).
 * 支出情報の登録・確認ができる家計簿プログラムを作成しましょう
 *
 */

public class Main {

    public static void main(String[]args){
        //標準入力用オブジェクト
        Scanner sc = new Scanner(System.in);
        //支出情報の入力を続けるか管理するフラグ
        boolean isContinueAdd = true;
        //支出情報の詳細確認を続けるか管理するフラグ
        boolean isContinueCheck = true;
        //ユーザからの入力内容を保持する変数
        String input;
        //ユーザが入力した内容を「,」区切りで分割した配列([0]:支出分類,[1]:概要,[2]:支出金額)
        String[] inputArray;

        //Todo1
        study2.HouseholdEXpenses householdEXpenses = new study2.HouseholdEXpenses();


        while (isContinueAdd){

            System.out.println("\n追加する支出情報を次の形式で入力してください. (支出分類),(概要),(支出金額)");
            System.out.print("Ex)交際費,職場の飲み会,5000\n");
            input = sc.nextLine();

            //Todo2
            inputArray = input.split(",");
            //「,」区切りで3つの項目が正しく入力されているかチェック
            if (inputArray.length == 3) {

                //Todo3
                int amount = Integer.parseInt(inputArray[2]);
                //Todo4
                householdEXpenses.addExpense(inputArray[0], inputArray[1], amount);

                System.out.println("\nさらに情報を追加しますか？ 追加する場合は「yes」を入力してください。");
                System.out.print("その他の値が入力された場合は、追加処理を終了します。\\n>");
                input = sc.nextLine();

                //Todo5
                if (!"yes".equals(input)) {
                    isContinueAdd = false;
                }
            } else {
                System.out.println("\n入力の形式が間違っています。正しく入力し直してください。");
            }
        }


        //Todo6
        householdEXpenses.printSummary();

        while (isContinueCheck){

            System.out.println("\nn支出情報の一覧を確認したい支出分類を入力してください");
            System.out.println("確認を終了する場合は「exit」と入力してください\n");
            input = sc.nextLine();

            if ("exit".equals(input)) {
                isContinueCheck = false;
            }else {
                householdEXpenses.printApplicableExpenses(input);
            }
        }


    }
}