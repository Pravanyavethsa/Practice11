package ass11;

public class CouponNum {
    public static void main(String[] args) {
        char[] chars="abcgftrfyhgljujopipouitDVDJHHKLJKLKJFTE243557".toCharArray();
        int max=100000000;
        int random=(int)(Math.random()*max);
        StringBuffer sb=new StringBuffer();
        while(random>0)
        {
            sb.append(chars[random % chars.length]);
            random= random / chars.length;
        }
        String couponCode=sb.toString();
        System.out.println("coupon code:" +couponCode);
    }
}
