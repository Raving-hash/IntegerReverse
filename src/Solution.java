class Solution {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder();
        int rei;
        double d;
        if(x<10 && x>-10) return x;
        s.append(x);
        d = x < 0 ? Double.parseDouble("-" + s.delete(0, 1).reverse()) :Double.parseDouble(s.reverse().toString());
        if(d< Math.pow(-2,31) || d > Math.pow(2,31) - 1) return 0;
        rei = (int) d;
        return rei;
    }

    public static void main(String[] args) {
        int x =1536469;
        Solution solution = new Solution();
        x = solution.reverse(x);
        System.out.println("x = " + x);
    }
}
