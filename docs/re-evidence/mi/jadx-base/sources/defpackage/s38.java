package defpackage;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes3.dex */
public class s38 implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f33232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f33233b;

    public s38(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f33232a = bigInteger;
        this.f33233b = bigInteger2;
    }

    public BigInteger a() {
        return this.f33233b;
    }

    public BigInteger b() {
        return this.f33232a;
    }
}
