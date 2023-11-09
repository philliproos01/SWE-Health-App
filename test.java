class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        
        String s1 = "hello all, bye all";
        System.out.println(s1);
        String r1 = rotateChar(s1, 2, true);
        System.out.println(r1); // "hell ola,lb eya ll"
        
        
        System.out.println("___________");
        String s2 = "1234567890";
        System.out.println(s2);
        String r2 = rotateChar(s2, 4, true);
        System.out.println(r2); // "4123856709"
        
        System.out.println("___________");
        String s3 = "hello all, bye all";
        System.out.println(s3);
        String r3 = rotateChar(s3, 2, false);
        System.out.println(r3); // "hell ola,lb eya ll"
        
        System.out.println("___________");
        String s4 = "1234567890";
        System.out.println(s4);
        String r4 = rotateChar(s4, 4, false);
        System.out.println(r4); // "2341678509"
    }
    public static String rotateChar(String str, int n, boolean right) {
            StringBuilder result = new StringBuilder();
            int len = str.length();
            int i = 0;
            while (i < len) {
                int j = i + n;
                if (j > len) {
                    j = len;
                }
                String substr = str.substring(i, j);
                if (right) {
                    char first = substr.charAt(substr.length() - 1);
                    substr = first + substr.substring(0, substr.length() - 1);
                } else {
                    char last = substr.charAt(0);
                    substr = substr.substring(1) + last;
                }
                result.append(substr);
                i += n;
            }
            return result.toString();
        }   
}
