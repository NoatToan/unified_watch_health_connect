package defpackage;

import java.security.PublicKey;
import java.security.cert.CertPath;

/* JADX INFO: loaded from: classes20.dex */
public final class aaac extends aaba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aaay f17a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PublicKey f18c;
    private final CertPath e;

    public aaac(aaae aaaeVar, CertPath certPath, Object obj) {
        super(aaaeVar, obj);
        this.e = certPath;
        this.f18c = null;
        this.f17a = null;
    }

    public aaac(aaae aaaeVar, PublicKey publicKey, Object obj) {
        super(aaaeVar, obj);
        this.e = null;
        this.f18c = publicKey;
        this.f17a = null;
    }

    public aaac(aaae aaaeVar, aaay aaayVar, Object obj) {
        super(aaaeVar, obj);
        if (aaayVar == null) {
            throw new NullPointerException("exception must not be null!");
        }
        this.e = null;
        this.f18c = null;
        this.f17a = aaayVar;
    }

    public CertPath c() {
        return this.e;
    }

    public PublicKey d() {
        return this.f18c;
    }

    public aaay b() {
        return this.f17a;
    }
}
