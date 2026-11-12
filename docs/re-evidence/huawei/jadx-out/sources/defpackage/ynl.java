package defpackage;

import com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.codec.Encoder;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import java.nio.charset.StandardCharsets;
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
public class ynl implements EncryptHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Key f53663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ynf f53664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KeyStoreProvider f53665c;
    private final AlgorithmParameterSpec d;

    public ynl(KeyStoreProvider keyStoreProvider, Key key, ynf ynfVar, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f53665c = keyStoreProvider;
        this.f53663a = key;
        this.d = algorithmParameterSpec;
        this.f53664b = ynfVar;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ynl from(byte[] bArr) throws ynz {
        this.f53664b.d(yoc.a(bArr));
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ynl from(String str) throws ynz {
        return from(str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ynl fromBase64(String str) throws ynz {
        return d(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ynl fromBase64Url(String str) throws ynz {
        return d(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ynl fromHex(String str) throws ynz {
        return d(str, Decoder.HEX);
    }

    private ynl d(String str, Decoder decoder) throws ynz {
        try {
            from(decoder.decode(str));
            return this;
        } catch (ynw e) {
            throw new ynz("Fail to decode plain text : " + e.getMessage());
        }
    }

    private void c() throws ynz {
        Cipher cipher;
        try {
            String transformation = this.f53664b.c().getTransformation();
            if (this.f53665c == KeyStoreProvider.ANDROID_KEYSTORE) {
                cipher = Cipher.getInstance(transformation);
            } else {
                cipher = Cipher.getInstance(transformation, this.f53665c.getProviderName());
            }
            cipher.init(1, this.f53663a, this.d);
            ynf ynfVar = this.f53664b;
            ynfVar.a(cipher.doFinal(ynfVar.a()));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new ynz("Fail to encrypt: " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public byte[] to() throws ynz {
        c();
        return this.f53664b.b();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public String toBase64() throws ynz {
        return d(Encoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public String toBase64Url() throws ynz {
        return d(Encoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public String toHex() throws ynz {
        return d(Encoder.HEX);
    }

    private String d(Encoder encoder) throws ynz {
        try {
            c();
            return encoder.encode(this.f53664b.b());
        } catch (ynw e) {
            throw new ynz("Fail to encode cipher bytes: " + e.getMessage());
        }
    }
}
