package defpackage;

import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.signer.AsymmetricSignerBuilder;
import com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.SignHandler;
import com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes20.dex */
public class ynt implements KfsSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PrivateKey f53684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SignAlg f53685b;
    private final KeyStoreProvider d;
    private final PublicKey e;

    private ynt(KeyStoreProvider keyStoreProvider, SignAlg signAlg, PrivateKey privateKey, PublicKey publicKey) {
        this.d = keyStoreProvider;
        this.f53685b = signAlg;
        this.f53684a = privateKey;
        this.e = publicKey;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public SignHandler getSignHandler() throws ynz {
        yno ynoVar = new yno();
        ynoVar.c(this.f53685b);
        PrivateKey privateKey = this.f53684a;
        if (privateKey == null) {
            throw new ynz("privateKey is invalid.");
        }
        return new ynr(this.d, privateKey, ynoVar, null);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public VerifyHandler getVerifyHandler() throws ynz {
        yno ynoVar = new yno();
        ynoVar.c(this.f53685b);
        PublicKey publicKey = this.e;
        if (publicKey == null) {
            throw new ynz("publicKey is invalid.");
        }
        return new ynp(this.d, publicKey, ynoVar, null);
    }

    public static class b extends AsymmetricSignerBuilder<ynt> {
        public b() {
            this(KeyStoreProvider.ANDROID_KEYSTORE);
        }

        public b(KeyStoreProvider keyStoreProvider) {
            super(keyStoreProvider);
            withAlg(SignAlg.getPreferredAlg(JceNames.EC));
        }

        @Override // com.huawei.wisesecurity.kfs.crypto.AsymmetricBuilder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ynt build() throws ynz {
            return new ynt(this.keyStoreProvider, this.signAlg, this.privateKey, this.publicKey);
        }
    }
}
