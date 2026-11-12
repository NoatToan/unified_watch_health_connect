package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xh5 implements lw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f39118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f39119b;
    public BigInteger c;
    public BigInteger d;
    public int e;
    public int f;
    public ci5 g;

    public xh5(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public static int a(int i) {
        if (i != 0 && i < 160) {
            return i;
        }
        return 160;
    }

    public BigInteger b() {
        return this.f39118a;
    }

    public int c() {
        return this.f;
    }

    public BigInteger d() {
        return this.f39119b;
    }

    public BigInteger e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xh5)) {
            return false;
        }
        xh5 xh5Var = (xh5) obj;
        if (e() != null) {
            if (!e().equals(xh5Var.e())) {
                return false;
            }
        } else if (xh5Var.e() != null) {
            return false;
        }
        return xh5Var.d().equals(this.f39119b) && xh5Var.b().equals(this.f39118a);
    }

    public int hashCode() {
        return (d().hashCode() ^ b().hashCode()) ^ (e() != null ? e().hashCode() : 0);
    }

    public xh5(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, a(i), i, null, null);
    }

    public xh5(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, ci5 ci5Var) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength()) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f39118a = bigInteger2;
        this.f39119b = bigInteger;
        this.c = bigInteger3;
        this.e = i;
        this.f = i2;
        this.d = bigInteger4;
        this.g = ci5Var;
    }

    public xh5(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ci5 ci5Var) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, ci5Var);
    }
}
