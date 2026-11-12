package defpackage;

import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler;
import com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler;
import com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes20.dex */
public class ynk implements KfsCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CipherAlg f53658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyStoreProvider f53659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Key f53660c;
    private final AlgorithmParameterSpec e;

    /* synthetic */ ynk(KeyStoreProvider keyStoreProvider, CipherAlg cipherAlg, Key key, AlgorithmParameterSpec algorithmParameterSpec, AnonymousClass1 anonymousClass1) {
        this(keyStoreProvider, cipherAlg, key, algorithmParameterSpec);
    }

    private ynk(KeyStoreProvider keyStoreProvider, CipherAlg cipherAlg, Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f53659b = keyStoreProvider;
        this.f53658a = cipherAlg;
        this.f53660c = key;
        this.e = algorithmParameterSpec;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher
    public EncryptHandler getEncryptHandler() throws ynz {
        ynf ynfVar = new ynf();
        ynfVar.d(this.f53658a);
        return new ynl(this.f53659b, this.f53660c, ynfVar, this.e);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.KfsCipher
    public DecryptHandler getDecryptHandler() throws ynz {
        ynf ynfVar = new ynf();
        ynfVar.d(this.f53658a);
        return new yne(this.f53659b, this.f53660c, ynfVar, this.e);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CipherAlg f53661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AlgorithmParameterSpec f53662b;
        private Key d;
        private final KeyStoreProvider e;

        public e() {
            this.f53661a = CipherAlg.getPreferredAlg("AES");
            this.e = KeyStoreProvider.ANDROID_KEYSTORE;
        }

        public e(KeyStoreProvider keyStoreProvider) {
            this.f53661a = CipherAlg.getPreferredAlg("AES");
            this.e = keyStoreProvider;
        }

        public e a(CipherAlg cipherAlg) {
            this.f53661a = cipherAlg;
            return this;
        }

        public e c(Key key) {
            this.d = key;
            return this;
        }

        public e c(String str) throws yob {
            try {
                KeyStore keyStore = KeyStore.getInstance(this.e.getName());
                keyStore.load(null);
                this.d = keyStore.getKey(str, null);
                return this;
            } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
                throw new yob("keystore get key with alias failed, " + e.getMessage());
            }
        }

        public e c(byte[] bArr) throws ynz {
            int i = AnonymousClass1.d[this.f53661a.ordinal()];
            if (i == 1) {
                this.f53662b = new GCMParameterSpec(128, yoc.a(bArr));
                return this;
            }
            if (i == 2 || i == 3) {
                this.f53662b = new IvParameterSpec(yoc.a(bArr));
                return this;
            }
            throw new ynz("unsupported cipher alg");
        }

        public ynk b() throws ynz {
            AlgorithmParameterSpec algorithmParameterSpec;
            Key key = this.d;
            if (key == null || (algorithmParameterSpec = this.f53662b) == null) {
                throw new ynz("key | parameterSpec cannot be null");
            }
            return new ynk(this.e, this.f53661a, key, algorithmParameterSpec, null);
        }
    }

    /* JADX INFO: renamed from: ynk$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CipherAlg.values().length];
            d = iArr;
            try {
                iArr[CipherAlg.AES_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CipherAlg.AES_CBC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CipherAlg.KEY_STORE_AES_CBC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
