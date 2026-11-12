package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class aacv extends ThreadLocalCrypto<MessageDigest> {
    public aacv(final String str) {
        super(new ThreadLocalCrypto.Factory<MessageDigest>() { // from class: aacv.4
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public MessageDigest getInstance() throws GeneralSecurityException {
                return MessageDigest.getInstance(str);
            }
        });
    }
}
