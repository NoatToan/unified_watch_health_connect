package defpackage;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class aaab extends aaba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<X509Certificate> f15a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PublicKey f16b;
    private final PrivateKey d;

    public aaab(aaae aaaeVar) {
        super(aaaeVar, null);
        this.d = null;
        this.f16b = null;
        this.f15a = null;
    }

    public PrivateKey d() {
        return this.d;
    }

    public PublicKey e() {
        return this.f16b;
    }

    public List<X509Certificate> c() {
        return this.f15a;
    }
}
