package defpackage;

import java.security.GeneralSecurityException;
import java.security.Signature;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCryptoMap;

/* JADX INFO: loaded from: classes20.dex */
public class aacr extends ThreadLocalCrypto<Signature> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocalCryptoMap<aacr> f130a = new ThreadLocalCryptoMap<>(new ThreadLocalCryptoMap.Factory<aacr>() { // from class: aacr.1
        @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCryptoMap.Factory
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public aacr getInstance(String str) {
            return new aacr(str);
        }
    });

    public aacr(final String str) {
        super(new ThreadLocalCrypto.Factory<Signature>() { // from class: aacr.3
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Signature getInstance() throws GeneralSecurityException {
                String str2 = str;
                return Signature.getInstance(zzm.e(str2, str2));
            }
        });
    }
}
