package defpackage;

import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.SignHandler;
import com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes20.dex */
public class ynu implements KfsSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SignAlg f53686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyStoreProvider f53687b;
    private final Key d;

    private ynu(KeyStoreProvider keyStoreProvider, SignAlg signAlg, Key key) {
        this.f53687b = keyStoreProvider;
        this.f53686a = signAlg;
        this.d = key;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public SignHandler getSignHandler() throws ynz {
        yno ynoVar = new yno();
        ynoVar.c(this.f53686a);
        return new ynr(this.f53687b, this.d, ynoVar, null);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public VerifyHandler getVerifyHandler() throws ynz {
        yno ynoVar = new yno();
        ynoVar.c(this.f53686a);
        return new ynp(this.f53687b, this.d, ynoVar, null);
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Key f53688b;
        private SignAlg e = SignAlg.getPreferredAlg("HMAC");
        private final KeyStoreProvider d = KeyStoreProvider.ANDROID_KEYSTORE;

        public e c(SignAlg signAlg) {
            this.e = signAlg;
            return this;
        }

        public e e(byte[] bArr) {
            this.f53688b = new SecretKeySpec(bArr, this.e.getTransformation());
            return this;
        }

        public ynu e() throws ynz {
            Key key = this.f53688b;
            if (key == null) {
                throw new ynz("key cannot be null");
            }
            return new ynu(this.d, this.e, key);
        }
    }
}
