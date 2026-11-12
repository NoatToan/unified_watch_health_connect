package defpackage;

import com.huawei.wisesecurity.kfs.crypto.AsymmetricBuilder;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler;
import com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler;
import com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes20.dex */
public class yni implements KfsCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PublicKey f53654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CipherAlg f53655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AlgorithmParameterSpec f53656c;
    private final KeyStoreProvider d;
    private final PrivateKey e;

    private yni(KeyStoreProvider keyStoreProvider, CipherAlg cipherAlg, PrivateKey privateKey, PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) {
        this.d = keyStoreProvider;
        this.f53655b = cipherAlg;
        this.e = privateKey;
        this.f53654a = publicKey;
        this.f53656c = algorithmParameterSpec;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher
    public EncryptHandler getEncryptHandler() throws ynz {
        ynf ynfVar = new ynf();
        ynfVar.d(this.f53655b);
        PublicKey publicKey = this.f53654a;
        if (publicKey == null) {
            throw new ynz("publicKey is invalid.");
        }
        return new ynl(this.d, publicKey, ynfVar, this.f53656c);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher
    public DecryptHandler getDecryptHandler() throws ynz {
        ynf ynfVar = new ynf();
        ynfVar.d(this.f53655b);
        PrivateKey privateKey = this.e;
        if (privateKey == null) {
            throw new ynz("privateKey is invalid.");
        }
        return new yne(this.d, privateKey, ynfVar, this.f53656c);
    }

    public static class a extends AsymmetricBuilder<yni> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CipherAlg f53657a;
        private final AlgorithmParameterSpec e;

        public a() {
            super(KeyStoreProvider.ANDROID_KEYSTORE);
            this.f53657a = CipherAlg.getPreferredAlg(JceNames.RSA);
            this.e = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
        }

        public a(KeyStoreProvider keyStoreProvider) {
            super(keyStoreProvider);
            this.f53657a = CipherAlg.getPreferredAlg(JceNames.RSA);
            this.e = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
        }

        public a b(CipherAlg cipherAlg) {
            this.f53657a = cipherAlg;
            return this;
        }

        @Override // com.huawei.wisesecurity.kfs.crypto.AsymmetricBuilder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public yni build() throws ynz {
            return new yni(this.keyStoreProvider, this.f53657a, this.privateKey, this.publicKey, this.e);
        }
    }
}
