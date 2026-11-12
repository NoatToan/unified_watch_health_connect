package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCryptoMap;

/* JADX INFO: loaded from: classes20.dex */
public class aacq extends ThreadLocalCrypto<KeyFactory> {
    public static final ThreadLocalCryptoMap<aacq> d = new ThreadLocalCryptoMap<>(new ThreadLocalCryptoMap.Factory<aacq>() { // from class: aacq.4
        @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCryptoMap.Factory
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public aacq getInstance(String str) {
            return new aacq(str);
        }
    });

    public aacq(final String str) {
        super(new ThreadLocalCrypto.Factory<KeyFactory>() { // from class: aacq.5
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public KeyFactory getInstance() throws GeneralSecurityException {
                String str2 = str;
                return KeyFactory.getInstance(zzm.e(str2, str2));
            }
        });
    }
}
