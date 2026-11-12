package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class t38 implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f34260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f34261b;

    public t38(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f34260a = bigInteger;
        this.f34261b = bigInteger2;
    }

    public BigInteger a() {
        return this.f34261b;
    }

    public BigInteger b() {
        return this.f34260a;
    }
}
