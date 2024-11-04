public class TimSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố từ 1 đến 100 là:");
        
        for (int num = 1; num <= 100; num++) {
            if (laSoNguyenTo(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
