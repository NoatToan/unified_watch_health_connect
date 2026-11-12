package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.KeyAgreement;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class aacp extends ThreadLocalCrypto<KeyAgreement> {
    public aacp(final String str) {
        super(new ThreadLocalCrypto.Factory<KeyAgreement>() { // from class: aacp.2
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public KeyAgreement getInstance() throws GeneralSecurityException {
                return KeyAgreement.getInstance(str);
            }
        });
    }
}
