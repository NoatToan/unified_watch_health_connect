package defpackage;

import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.signer.AsymmetricSignerBuilder;
import com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.SignHandler;
import com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes20.dex */
public class yns implements KfsSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SignAlg f53681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PublicKey f53682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AlgorithmParameterSpec f53683c;
    private final PrivateKey d;
    private final KeyStoreProvider e;

    private yns(KeyStoreProvider keyStoreProvider, SignAlg signAlg, PrivateKey privateKey, PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) {
        this.e = keyStoreProvider;
        this.f53681a = signAlg;
        this.d = privateKey;
        this.f53682b = publicKey;
        this.f53683c = algorithmParameterSpec;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public SignHandler getSignHandler() throws ynz {
        yno ynoVar = new yno();
        ynoVar.c(this.f53681a);
        PrivateKey privateKey = this.d;
        if (privateKey == null) {
            throw new ynz("privateKey is invalid.");
        }
        return new ynr(this.e, privateKey, ynoVar, this.f53683c);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public VerifyHandler getVerifyHandler() throws ynz {
        yno ynoVar = new yno();
        ynoVar.c(this.f53681a);
        PublicKey publicKey = this.f53682b;
        if (publicKey == null) {
            throw new ynz("publicKey is invalid.");
        }
        return new ynp(this.e, publicKey, ynoVar, this.f53683c);
    }

    public static class d extends AsymmetricSignerBuilder<yns> {
        public d() {
            this(KeyStoreProvider.ANDROID_KEYSTORE);
        }

        public d(KeyStoreProvider keyStoreProvider) {
            super(keyStoreProvider);
            withAlg(SignAlg.getPreferredAlg(JceNames.RSA));
        }

        @Override // com.huawei.wisesecurity.kfs.crypto.AsymmetricBuilder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public yns build() throws ynz {
            return new yns(this.keyStoreProvider, this.signAlg, this.privateKey, this.publicKey, this.parameterSpec);
        }
    }
}
