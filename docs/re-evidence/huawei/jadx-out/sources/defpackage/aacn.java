package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class aacn extends ThreadLocalCrypto<Cipher> {
    public aacn(final String str) {
        super(new ThreadLocalCrypto.Factory<Cipher>() { // from class: aacn.5
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Cipher getInstance() throws GeneralSecurityException {
                return Cipher.getInstance(str);
            }
        });
    }
}
