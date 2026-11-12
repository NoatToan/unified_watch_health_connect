package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class bi5 extends uh5 {
    public static final BigInteger d = BigInteger.valueOf(1);
    public static final BigInteger e = BigInteger.valueOf(2);
    public BigInteger c;

    public bi5(BigInteger bigInteger, xh5 xh5Var) {
        super(false, xh5Var);
        this.c = d(bigInteger, xh5Var);
    }

    public BigInteger c() {
        return this.c;
    }

    public final BigInteger d(BigInteger bigInteger, xh5 xh5Var) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger bigInteger2 = e;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(xh5Var.d().subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (xh5Var.e() == null || d.equals(bigInteger.modPow(xh5Var.e(), xh5Var.d()))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    @Override // defpackage.uh5
    public boolean equals(Object obj) {
        return (obj instanceof bi5) && ((bi5) obj).c().equals(this.c) && super.equals(obj);
    }

    @Override // defpackage.uh5
    public int hashCode() {
        return this.c.hashCode() ^ super.hashCode();
    }
}
