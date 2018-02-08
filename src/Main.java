

public class Main {

    public static void main(String[] args) {
        System.out.println(sleepIn(true, true));
        System.out.println(stringBits("hello"));
        System.out.println(withoutEnd("hello"));
        System.out.println(makePi());
        System.out.println(teenSum(3, 4));
        System.out.println(blackjack(22, 19));
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(countTriple("xxxabyyyycd"));
        int[] inp =  {2, 2, 1 , 5};
        System.out.println(has22(inp));
        System.out.println(squareUp(3));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    public static String stringBits(String str){
        String res = "";
        for(int i = 0; i < str.length(); i += 2){
            res += str.charAt(i);
        }
        return res;
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static int[] makePi() {
        return new int[] {3, 1, 4};
    }

    public static int teenSum(int a, int b) {
        if((a > 12 && a < 20) || (b > 12 && b < 20)){
            return 19;
        }
        return a + b;
    }

    public static int blackjack(int a, int b) {
        if(b > 21 && a > 21){
            return 0;
        }
        if(a > 21){
            return b;
        }
        if(b > 21){
            return a;
        }
        if((21 - a) < (21 - b)){
            return a;
        }
        return b;
    }

    public static String repeatFront(String str, int n) {
        String res = "";
        for(int i = n; i > 0; i--){
            res += str.substring(0, i);
        }
        return res;
    }

    public static int countTriple(String str) {
        int res = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)){
                res++;
            }
        }
        return res;
    }

    public static boolean has22(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i + 1] == 2){
                return true;
            }
        }
        return false;
    }

    public static int[] squareUp(int n) {
        int[] res = new int[n * n];
        for(int i = 1; i <= n; i++){
            for(int j = n; j > i - 1; j--){
                res[(n * j) - i] = i;
            }
        }
        return res;
    }

}

