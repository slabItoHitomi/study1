package study2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//家計簿クラス
public class HouseholdEXpenses {
    // 支出情報リスト
private List<study2.Expense>expenseList = new ArrayList<>();
//分類別の集計結果マップ (Key:支出分類, Value:合計金額)
private Map<String,Integer>summaryMap = new HashMap<>();


/**
 * 受け取った支出情報を記録するメソッド.
 * @param category 支出分類
 * @param comment  概要
 * @param amount   支出金額
 */

public void addExpense(String category, String comment,int amount){
    if (amount <=0){
        System.out.println("金額が不正なため、入力された内容は記録されませんでした。");
        System.out.println("\"1円以上の支出情報を正しく入力してください。");
        return;
    }

    Expense expense= new study2.Expense();
    expense.setCategory(category);
    expense.setComment(comment);
    expense.setAmount(amount);

    expenseList.add(expense);

    if (summaryMap.containsKey(category)) {
        int sum = summaryMap.get(category) + amount;
        summaryMap.put(category, sum);
    }else {
        summaryMap.put(category,amount);
    }
}
/**
 * 支出情報を分類別に合計したサマリを標準出力するメソッド.
 */

public void printSummary(){

    System.out.println("-----------------------");
    System.out.println("今月の支出 (分類別)\\n");

    if (summaryMap.size() ==0) {
        System.out.println("データが登録されていません。");
    }else {
        for (Map.Entry<String,Integer>entry : summaryMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

    System.out.println("-----------------------");
}

/**
 *  指定された分類に当てはまる支出情報の一覧を標準出力するメソッド.
 *   @param category 支出分類
 */

public void printApplicableExpenses(String category){

    int count = 0;

    System.out.println("-----------------------");
    System.out.println("「\" + category + \"」に分類されている支出情報\\n");

    if(!summaryMap.containsKey(category)) {
        System.out.println("該当するデータがありません。");
    }else {
        for (study2.Expense expense : expenseList){
            if (category.equals(expense.getCategory())){
                System.out.println("-----------------------\"");
                System.out.println("概要："+expense.getComment());
                System.out.println("金額："+expense.getAmount());
                count++;
            }
        }


        System.out.println("-----------------------");
        System.out.println("\\n以上、\" + count + \"件のデータが見つかりました");
    }
}

}
