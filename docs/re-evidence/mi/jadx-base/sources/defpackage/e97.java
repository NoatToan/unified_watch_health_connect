package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class e97 implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b87 f16407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f16408b;
    public i97 c;
    public BigInteger d;
    public BigInteger e;

    public e97(b87 b87Var, i97 i97Var, BigInteger bigInteger) {
        this.f16407a = b87Var;
        this.c = i97Var.w();
        this.d = bigInteger;
        this.e = BigInteger.valueOf(1L);
        this.f16408b = null;
    }

    public b87 a() {
        return this.f16407a;
    }

    public i97 b() {
        return this.c;
    }

    public BigInteger c() {
        return this.e;
    }

    public BigInteger d() {
        return this.d;
    }

    public byte[] e() {
        return this.f16408b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e97)) {
            return false;
        }
        e97 e97Var = (e97) obj;
        return a().i(e97Var.a()) && b().e(e97Var.b());
    }

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public e97(b87 b87Var, i97 i97Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f16407a = b87Var;
        this.c = i97Var.w();
        this.d = bigInteger;
        this.e = bigInteger2;
        this.f16408b = bArr;
    }
}
