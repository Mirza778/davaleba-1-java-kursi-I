public class Main {
    public static void main(String[] args) {

        int a = 5, b = 9;
        int i = a;
        a = b;
        b = i;
        System.out.println(a + "." + b);

        // meore variant ravi
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "." + b);

        double x = 10.234;
        System.out.println(x - (int) x);

        int n = 345;
        boolean f = (n >= 100 && n <= 999) || (n <= -100 && n >= -999);
        System.out.println(f);

        char c = 'r';
        c -=32;
        System.out.println(c);

        double d = 11.5;
        int rounded = (int) (d + 0.5);
        System.out.println(rounded);

        int pa = 10, pb = 7, k = 3;
        int count = ((pa + k - 1) / k) * ((pb + k - 1) / k);
        System.out.println(count);

        int seconds = 3665;
        int h = 0;
        int m = 0;
        int s = seconds;
        if (s >= 3600)
        {
            h = s / 3600;
            s = s % 3600;
        }
        if (s >= 60)
        {
            m = s / 60;
            s = s % 60;
        }
        System.out.println(h + ":" + m + ":" + s);
//        ai es ifebis gareshe
        int seconds2 = 3665;
        int h2 = seconds2 / 3600;
        int m2 = (seconds2 % 3600) / 60;
        int s2 = seconds2 % 60;
        System.out.println(h2 + ":" + m2 + ":" + s2);
    }
}