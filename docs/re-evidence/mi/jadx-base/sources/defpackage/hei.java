package defpackage;

import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes3.dex */
public class hei implements yqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19980a;

    public hei(Provider provider) {
        this.f19980a = provider;
    }

    @Override // defpackage.yqd
    public CertificateFactory a(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.f19980a);
    }
}
