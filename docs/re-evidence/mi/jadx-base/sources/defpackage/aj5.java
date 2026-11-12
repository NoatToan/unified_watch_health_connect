package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class aj5 extends ti5 {
    public static final BigInteger d = BigInteger.valueOf(1);
    public static final BigInteger e = BigInteger.valueOf(2);
    public BigInteger c;

    public aj5(BigInteger bigInteger, wi5 wi5Var) {
        super(false, wi5Var);
        this.c = d(bigInteger, wi5Var);
    }

    public BigInteger c() {
        return this.c;
    }

    public final BigInteger d(BigInteger bigInteger, wi5 wi5Var) {
        if (wi5Var == null) {
            return bigInteger;
        }
        BigInteger bigInteger2 = e;
        if (bigInteger2.compareTo(bigInteger) > 0 || wi5Var.b().subtract(bigInteger2).compareTo(bigInteger) < 0 || !d.equals(bigInteger.modPow(wi5Var.c(), wi5Var.b()))) {
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
        return bigInteger;
    }
}
