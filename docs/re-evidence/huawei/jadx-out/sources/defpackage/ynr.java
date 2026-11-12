package defpackage;

import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.codec.Encoder;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.SignHandler;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes20.dex */
public class ynr implements SignHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Key f53677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyStoreProvider f53678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AlgorithmParameterSpec f53679c;
    private final yno d;

    public ynr(KeyStoreProvider keyStoreProvider, Key key, yno ynoVar, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f53678b = keyStoreProvider;
        this.f53677a = key;
        this.f53679c = algorithmParameterSpec;
        this.d = ynoVar;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ynr from(byte[] bArr) throws ynz {
        this.d.d(yoc.a(bArr));
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ynr from(String str) throws ynz {
        return from(str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ynr fromBase64(String str) throws ynz {
        return e(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ynr fromBase64Url(String str) throws ynz {
        return e(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ynr fromHex(String str) throws ynz {
        return e(str, Decoder.HEX);
    }

    private ynr e(String str, Decoder decoder) throws ynz {
        try {
            from(decoder.decode(str));
            return this;
        } catch (ynw e) {
            throw new ynz("Fail to decode plain text : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ynr$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53680a;

        static {
            int[] iArr = new int[SignAlg.values().length];
            f53680a = iArr;
            try {
                iArr[SignAlg.ECDSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53680a[SignAlg.RSA_SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53680a[SignAlg.RSA_SHA256_PSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53680a[SignAlg.HMAC_SHA256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void a() throws ynz {
        int i = AnonymousClass3.f53680a[this.d.c().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            e();
        } else if (i == 4) {
            b();
        } else {
            throw new ynz("unsupported sign alg : " + this.d.c().getTransformation());
        }
    }

    private void e() throws ynz {
        Signature signature;
        try {
            String transformation = this.d.c().getTransformation();
            if (this.f53678b == KeyStoreProvider.ANDROID_KEYSTORE) {
                signature = Signature.getInstance(transformation);
            } else {
                signature = Signature.getInstance(transformation, this.f53678b.getProviderName());
            }
            AlgorithmParameterSpec algorithmParameterSpec = this.f53679c;
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            Key key = this.f53677a;
            if (!(key instanceof PrivateKey)) {
                throw new ynz("sign key not private key");
            }
            signature.initSign((PrivateKey) key);
            signature.update(this.d.b());
            this.d.e(signature.sign());
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException e) {
            throw new ynz("Fail to sign : " + e.getMessage());
        }
    }

    private void b() throws ynz {
        Mac mac;
        try {
            String transformation = this.d.c().getTransformation();
            if (this.f53678b == KeyStoreProvider.ANDROID_KEYSTORE) {
                mac = Mac.getInstance(transformation);
            } else {
                mac = Mac.getInstance(transformation, this.f53678b.getProviderName());
            }
            mac.init(this.f53677a);
            mac.update(this.d.b());
            this.d.e(mac.doFinal());
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new ynz("Fail to sign : " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public byte[] sign() throws ynz {
        a();
        return this.d.a();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public String signBase64() throws ynz {
        return a(Encoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public String signBase64Url() throws ynz {
        return a(Encoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public String signHex() throws ynz {
        return a(Encoder.HEX);
    }

    private String a(Encoder encoder) throws ynz {
        try {
            a();
            return encoder.encode(this.d.a());
        } catch (ynw e) {
            throw new ynz("Fail to encode signature bytes: " + e.getMessage());
        }
    }
}
