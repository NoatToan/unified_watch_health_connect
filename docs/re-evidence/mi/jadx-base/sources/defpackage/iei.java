package defpackage;

import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes3.dex */
public class iei implements zqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f21057a;

    public iei(Provider provider) {
        this.f21057a = provider;
    }

    @Override // defpackage.zqd
    public CertificateFactory a(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.f21057a);
    }
}
