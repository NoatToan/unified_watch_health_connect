package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class uva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f36184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f36185b;
    public final BigInteger c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final BigInteger g;
    public final BigInteger h;
    public final int i;

    public uva(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f36184a = bigInteger;
        this.f36185b = bigInteger2;
        this.c = bigIntegerArr[0];
        this.d = bigIntegerArr[1];
        this.e = bigIntegerArr2[0];
        this.f = bigIntegerArr2[1];
        this.g = bigInteger3;
        this.h = bigInteger4;
        this.i = i;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException("'" + str + "' must consist of exactly 2 (non-null) values");
        }
    }

    public BigInteger b() {
        return this.f36184a;
    }

    public int c() {
        return this.i;
    }

    public BigInteger d() {
        return this.g;
    }

    public BigInteger e() {
        return this.h;
    }

    public BigInteger f() {
        return this.c;
    }

    public BigInteger g() {
        return this.d;
    }

    public BigInteger h() {
        return this.e;
    }

    public BigInteger i() {
        return this.f;
    }
}
