package defpackage;

import com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.codec.Encoder;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes20.dex */
public class yne implements DecryptHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Key f53649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KeyStoreProvider f53650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AlgorithmParameterSpec f53651c;
    private final ynf d;

    public yne(KeyStoreProvider keyStoreProvider, Key key, ynf ynfVar, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f53650b = keyStoreProvider;
        this.f53649a = key;
        this.f53651c = algorithmParameterSpec;
        this.d = ynfVar;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yne from(byte[] bArr) throws ynz {
        this.d.a(bArr);
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public yne fromBase64(String str) throws ynz {
        return c(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yne fromBase64Url(String str) throws ynz {
        return c(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public yne fromHex(String str) throws ynz {
        return c(str, Decoder.HEX);
    }

    private yne c(String str, Decoder decoder) throws ynz {
        try {
            from(decoder.decode(str));
            return this;
        } catch (ynw e) {
            throw new ynz("Fail to decode cipher text: " + e.getMessage());
        }
    }

    private byte[] d() throws ynz {
        Cipher cipher;
        try {
            String transformation = this.d.c().getTransformation();
            if (this.f53650b == KeyStoreProvider.ANDROID_KEYSTORE) {
                cipher = Cipher.getInstance(transformation);
            } else {
                cipher = Cipher.getInstance(transformation, this.f53650b.getProviderName());
            }
            cipher.init(2, this.f53649a, this.f53651c);
            return cipher.doFinal(this.d.b());
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new ynz("Fail to decrypt: " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public byte[] to() throws ynz {
        return d();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public String toBase64() throws ynz {
        return e(Encoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public String toHex() throws ynz {
        return e(Encoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public String toRawString() throws ynz {
        return e(Encoder.RAW);
    }

    private String e(Encoder encoder) throws ynz {
        try {
            return encoder.encode(to());
        } catch (ynw e) {
            throw new ynz("Fail to encode plain text: " + e.getMessage());
        }
    }
}
