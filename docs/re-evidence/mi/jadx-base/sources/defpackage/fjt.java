package defpackage;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes5.dex */
public final class fjt extends ijt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17858b;

    public fjt(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f17858b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f17858b;
    }
}
