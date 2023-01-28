
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
int num1 = 1500; //num1変数に商品価格1500を代入
int num2 = 10; //num2変数に消費税率10を代入
int result;
result = taxMethod(num1, num2); //resultに税込価格を代入（戻り値）
System.out.println(num1 + "円の商品の税込価格は" + (num1 + result ) + "円" + "(消費税は"+ result + "円)です。" );

    }
public static int taxMethod(int num1, int num2) {
    int result = num1 * num2 / 100;
    return result;


    }

}
