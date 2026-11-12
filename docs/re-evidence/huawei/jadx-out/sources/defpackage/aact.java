package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto;

/* JADX INFO: loaded from: classes20.dex */
public class aact extends ThreadLocalCrypto<Mac> {
    public aact(final String str) {
        super(new ThreadLocalCrypto.Factory<Mac>() { // from class: aact.1
            @Override // org.eclipse.californium.scandium.dtls.cipher.ThreadLocalCrypto.Factory
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Mac getInstance() throws GeneralSecurityException {
                return Mac.getInstance(str);
            }
        });
    }
}
