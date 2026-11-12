package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class c87 implements y77 {
    public b87 g;
    public byte[] h;
    public i97 i;
    public BigInteger j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BigInteger f5040k;

    public c87(b87 b87Var, i97 i97Var, BigInteger bigInteger, BigInteger bigInteger2) {
        this(b87Var, i97Var, bigInteger, bigInteger2, null);
    }

    public b87 a() {
        return this.g;
    }

    public i97 b() {
        return this.i;
    }

    public BigInteger c() {
        return this.f5040k;
    }

    public BigInteger d() {
        return this.j;
    }

    public byte[] e() {
        return wj1.d(this.h);
    }

    public c87(b87 b87Var, i97 i97Var, BigInteger bigInteger) {
        this(b87Var, i97Var, bigInteger, y77.f39884b, null);
    }

    public c87(b87 b87Var, i97 i97Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.g = b87Var;
        this.i = i97Var.w();
        this.j = bigInteger;
        this.f5040k = bigInteger2;
        this.h = bArr;
    }
}
