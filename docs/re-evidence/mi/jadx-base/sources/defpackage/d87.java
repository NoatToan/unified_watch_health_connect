package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class d87 implements z77 {
    public a87 g;
    public byte[] h;
    public h97 i;
    public BigInteger j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BigInteger f15207k;

    public d87(a87 a87Var, h97 h97Var, BigInteger bigInteger) {
        this(a87Var, h97Var, bigInteger, z77.f40976b, null);
    }

    public a87 a() {
        return this.g;
    }

    public h97 b() {
        return this.i;
    }

    public BigInteger c() {
        return this.f15207k;
    }

    public BigInteger d() {
        return this.j;
    }

    public byte[] e() {
        return vj1.e(this.h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d87)) {
            return false;
        }
        d87 d87Var = (d87) obj;
        return this.g.l(d87Var.g) && this.i.e(d87Var.i) && this.j.equals(d87Var.j) && this.f15207k.equals(d87Var.f15207k);
    }

    public int hashCode() {
        return (((((this.g.hashCode() * 37) ^ this.i.hashCode()) * 37) ^ this.j.hashCode()) * 37) ^ this.f15207k.hashCode();
    }

    public d87(a87 a87Var, h97 h97Var, BigInteger bigInteger, BigInteger bigInteger2) {
        this(a87Var, h97Var, bigInteger, bigInteger2, null);
    }

    public d87(a87 a87Var, h97 h97Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.g = a87Var;
        this.i = h97Var.y();
        this.j = bigInteger;
        this.f15207k = bigInteger2;
        this.h = bArr;
    }
}
