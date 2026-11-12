package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class f97 implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a87 f17546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f17547b;
    public h97 c;
    public BigInteger d;
    public BigInteger e;

    public f97(a87 a87Var, h97 h97Var, BigInteger bigInteger) {
        this.f17546a = a87Var;
        this.c = h97Var.y();
        this.d = bigInteger;
        this.e = BigInteger.valueOf(1L);
        this.f17547b = null;
    }

    public a87 a() {
        return this.f17546a;
    }

    public h97 b() {
        return this.c;
    }

    public BigInteger c() {
        return this.e;
    }

    public BigInteger d() {
        return this.d;
    }

    public byte[] e() {
        return this.f17547b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f97)) {
            return false;
        }
        f97 f97Var = (f97) obj;
        return a().l(f97Var.a()) && b().e(f97Var.b());
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public f97(a87 a87Var, h97 h97Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f17546a = a87Var;
        this.c = h97Var.y();
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f17547b = bArr;
    }
}
