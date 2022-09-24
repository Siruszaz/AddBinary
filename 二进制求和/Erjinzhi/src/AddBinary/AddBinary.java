package AddBinary;

public class AddBinary {
    public String addBinary(String a, String b) {
        int m = a.length(), n = b.length();
        if(m < n) return addBinary(b,a);
        int carry = 0,j = n-1;
        StringBuilder sb = new StringBuilder();
        for(int i=m-1;i>-1;i--){
            if(a.charAt(i) == '1') ++carry;
            if(j > -1 && b.charAt(j--) == '1') ++carry;
            sb.append(carry % 2 == 1 ? "1" : "0");
            carry /= 2;
        }
        if(carry > 0) sb.append("1");
        sb.reverse();
        return sb.toString();
    }
}
