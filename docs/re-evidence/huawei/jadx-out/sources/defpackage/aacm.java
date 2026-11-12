package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateFactory;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class aacm extends ThreadLocalCrypto<CertificateFactory> {
    public aacm(final String str) {
        super(new ThreadLocalCrypto.Factory<CertificateFactory>() { // from class: aacm.5
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public CertificateFactory getInstance() throws GeneralSecurityException {
                return CertificateFactory.getInstance(str);
            }
        });
    }
}
