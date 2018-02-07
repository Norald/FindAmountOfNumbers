public class FindNumbersTest {
    public static void main(String[] args) {
        System.out.println(getAmountOf3NotRepeatNumbers(3));
    }

    public static int getAmountOf3NotRepeatNumbers(int n){
        if(n>30||n<0){
            throw new ArithmeticException();
        }
        if(n==1) {//если состояит из одной цифры, то это может быть только 4 или 7
            return 2;
        }
        if(n==2) {//если состоит из 2 цифр, то это может быть 47, 74, 44, 77
            return 4;
        }
        return getAmountOf3NotRepeatNumbers(n-1)+getAmountOf3NotRepeatNumbers(n-2);
    }
}
