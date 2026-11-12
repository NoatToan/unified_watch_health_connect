package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class aaco extends ThreadLocalCrypto<KeyPairGenerator> {
    public aaco(final String str) {
        super(new ThreadLocalCrypto.Factory<KeyPairGenerator>() { // from class: aaco.4
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public KeyPairGenerator getInstance() throws GeneralSecurityException {
                String str2 = str;
                return KeyPairGenerator.getInstance(zzm.e(str2, str2));
            }
        });
    }
}
