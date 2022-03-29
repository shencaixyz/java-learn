public class Main {
    public static void main(String[] args) {
        double x = 1.0/10;
        double y = 1- 9.0/10;
                //观察 x 与 y 是否相等
        System.out.println(x);
        System.out.println(y);
        //比较x y 是否相当 ，先计算其差值
        double r = Math.abs(x -y);
        if(r < 0.0001){
            //相等
            System.out.println("相等");
        }else{
            //不相等
            System.out.println("不相等");
        }
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
//        int d4 = -1 / 0; // 整数会报错
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
//        System.out.println(d4);//整数会报错

        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
}
