public class Main {
    public static boolean isPalindrome(String str) {
        // Loại bỏ các ký tự không phải là chữ cái
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Kiểm tra chuỗi đối xứng
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
  
    public static void main(String[] args) {
        String chuoi = "Hello World";
        int[] tanSuat = new int[256]; // Mảng đếm tần suất xuất hiện của các ký tự ASCII
        
        // Chuyển chuỗi sang chữ hoa
        String chuoiHoa = chuoi.toUpperCase();
        System.out.println(chuoiHoa);
        //Cchuyển chuỗi sang chữ thường
        String chuoiThuong = chuoi.toLowerCase();
        System.out.println(chuoiThuong);
        // Đảo ngược trạng thái chữ của chuỗi
        String chuoiDaoNguoc = new StringBuilder(chuoi).reverse().toString();
        System.out.println(chuoiDaoNguoc);
        //  Tìm kiếm chuỗi con trong một chuỗi và trích xuất chuỗi con
        String chuoiCon = chuoi.substring(6, 11);
        System.out.println(chuoiCon);
        //  Thay thế chuỗi con trong một chuỗi
        String chuoiMoi = chuoi.replace("World", "Name");
        System.out.println(chuoiMoi);


        // Kiểm tra xem một chuỗi có phải là chuỗi đối xứng hay không
        String str = "racecar";
        if (isPalindrome(str)) {
            System.out.println(str + " là chuỗi đối xứng");
        } else {
            System.out.println(str + " không phải là chuỗi đối xứng");
        }

        // Đếm số lượng từ trong một chuỗi
        String str1 = "Đây là một ví dụ về đếm số từ trong một chuỗi.";
        String[] tu = chuoi.split(" ");
        int soTu = tu.length;
        System.out.println("Số từ trong chuỗi là: " + soTu);

    
        // Đếm tần suất xuất hiện của mỗi ký tự trong chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            tanSuat[kyTu]++;
        }

        // In ra tần suất xuất hiện của mỗi ký tự
        for (int i = 0; i < 256; i++) {
            if (tanSuat[i] > 0) {
                System.out.println("Ký tự " + (char) i + " xuất hiện " + tanSuat[i] + " lần");
            }
        }

    }
}
