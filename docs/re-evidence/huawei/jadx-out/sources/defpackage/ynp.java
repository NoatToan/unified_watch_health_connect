package defpackage;

import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes20.dex */
public class ynp implements VerifyHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AlgorithmParameterSpec f53675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KeyStoreProvider f53676c;
    private final Key d;
    private final yno e;

    public ynp(KeyStoreProvider keyStoreProvider, Key key, yno ynoVar, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f53676c = keyStoreProvider;
        this.d = key;
        this.f53675b = algorithmParameterSpec;
        this.e = ynoVar;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ynp fromData(byte[] bArr) throws ynz {
        this.e.d(bArr);
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ynp fromData(String str) throws ynz {
        return fromData(str.getBytes(Charset.forName("UTF-8")));
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ynp fromBase64Data(String str) throws ynz {
        return e(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ynp fromBase64UrlData(String str) throws ynz {
        return e(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ynp fromHexData(String str) throws ynz {
        return e(str, Decoder.HEX);
    }

    private ynp e(String str, Decoder decoder) throws ynz {
        try {
            fromData(decoder.decode(str));
            return this;
        } catch (ynw e) {
            throw new ynz("Fail to decode sign data: " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verify(byte[] bArr) throws ynz {
        this.e.e(bArr);
        return c();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verify(String str) throws ynz {
        return verify(str.getBytes(Charset.forName("UTF-8")));
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verifyBase64(String str) throws ynz {
        return c(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verifyBase64Url(String str) throws ynz {
        return c(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verifyHex(String str) throws ynz {
        return c(str, Decoder.HEX);
    }

    private boolean c(String str, Decoder decoder) throws ynz {
        try {
            return verify(decoder.decode(str));
        } catch (ynw e) {
            throw new ynz("Fail to decode signature : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ynp$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[SignAlg.values().length];
            d = iArr;
            try {
                iArr[SignAlg.ECDSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[SignAlg.RSA_SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[SignAlg.RSA_SHA256_PSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[SignAlg.HMAC_SHA256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean c() throws ynz {
        int i = AnonymousClass3.d[this.e.c().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return e();
        }
        if (i == 4) {
            return b();
        }
        throw new ynz("unsupported sign alg : " + this.e.c().getTransformation());
    }

    private boolean e() throws ynz {
        Signature signature;
        try {
            String transformation = this.e.c().getTransformation();
            if (this.f53676c == KeyStoreProvider.ANDROID_KEYSTORE) {
                signature = Signature.getInstance(transformation);
            } else {
                signature = Signature.getInstance(transformation, this.f53676c.getProviderName());
            }
            AlgorithmParameterSpec algorithmParameterSpec = this.f53675b;
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            Key key = this.d;
            if (!(key instanceof PublicKey)) {
                throw new ynz("verify key not public key");
            }
            signature.initVerify((PublicKey) key);
            signature.update(this.e.b());
            return signature.verify(this.e.a());
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException e) {
            throw new ynz("Fail to decrypt: " + e.getMessage());
        }
    }

    private boolean b() throws ynz {
        Mac mac;
        try {
            String transformation = this.e.c().getTransformation();
            if (this.f53676c == KeyStoreProvider.ANDROID_KEYSTORE) {
                mac = Mac.getInstance(transformation);
            } else {
                mac = Mac.getInstance(transformation, this.f53676c.getProviderName());
            }
            mac.init(this.d);
            mac.update(this.e.b());
            return e(this.e.a(), mac.doFinal());
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new ynz("Fail to sign : " + e.getMessage());
        }
    }

    private boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
