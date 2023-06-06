package study2;


/**
 * 1回分の支出情報を表すクラス
 */
public class Expense {
    //支出分類
    private String category;
    //概要
    private String comment;
    //支出金額
    private int amount;

    /**
     * 支出分類の Getter.
     * @return 支出分類
     */

    public String getCategory(){
        return category;
    }



    /**
     * 支出分類のSetter
     * @paramcategory 支出分類
     *
     */

    public void setCategory(String category){
        this.category = category;
    }

    /**
     *  概要の Getter.
     *  @return 概要
     */
    public  String getComment(){
        return comment;
    }

    /**
     * 概要の Setter.
     *  @param comment 概要
     *
     */

    public void setComment(String comment){
        this.comment = comment;
    }

    /**
     * 支出金額の Getter.
     *@return 支出金額
     */

    public int getAmount(){
        return amount;
    }

    /**
     *  支出金額の Setter.
     * @param amount 支出金額
     */

    public void setAmount(int amount){
        this.amount = amount;
    }
}
