public class BigNumber_Multi {
    public static BigInteger Big_Number_Multi(BigInteger X, BigInteger Y, int n) {
        
        if (n == 1) {
            return X.multiply(Y);
        }

        
        int s = X.signum() * Y.signum();

        
        X = X.abs();
        Y = Y.abs();

        
        BigInteger A = X.shiftRight(n / 2);
        BigInteger B = X.subtract(A.shiftLeft(n / 2));
        BigInteger C = Y.shiftRight(n / 2);
        BigInteger D = Y.subtract(C.shiftLeft(n / 2));

       
        BigInteger m1 = Big_Number_Multi(A, C, n / 2);
        BigInteger m2 = Big_Number_Multi(A.subtract(B), D.subtract(C), n / 2);
        BigInteger m3 = Big_Number_Multi(B, D, n / 2);

        
        BigInteger result = m1.shiftLeft(2 * (n / 2)).add((m1.add(m2).add(m3)).shiftLeft(n / 2)).add(m3);

        
        return result.multiply(BigInteger.valueOf(s));
    }

    public static void main(String[] args) {
        BigInteger X = new BigInteger("12345678901234567890");
        BigInteger Y = new BigInteger("98765432109876543210");
        int n = Math.max(X.bitLength(), Y.bitLength());

        BigInteger result = Big_Number_Multi(X, Y, n);

        System.out.println("Ket qua: " + result);
    }
}