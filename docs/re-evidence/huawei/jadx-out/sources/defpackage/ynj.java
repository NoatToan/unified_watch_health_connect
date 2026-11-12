package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes20.dex */
public class ynj extends KeyStoreKeyManager {
    private boolean c(int i) {
        return (i == 128 || i == 192 || i == 256) ? false : true;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void generateKey(ynn ynnVar) throws yob {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", getProvider().getProviderName());
            keyGenerator.init(new KeyGenParameterSpec.Builder(ynnVar.c(), ynnVar.b().getValue()).setKeySize(ynnVar.d()).setAttestationChallenge(getProvider().getName().getBytes(StandardCharsets.UTF_8)).setRandomizedEncryptionRequired(false).setBlockModes("GCM", "CBC").setEncryptionPaddings("NoPadding", "PKCS7Padding").build());
            if (keyGenerator.generateKey() != null) {
            } else {
                throw new yob("generate aes key failed with bad key");
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new yob("generate aes key failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void validateParam(ynn ynnVar) throws yny {
        if (c(ynnVar.d())) {
            throw new yny("bad aes key len");
        }
        if (ynnVar.b() != KfsKeyPurpose.PURPOSE_CRYPTO) {
            throw new yny("bad purpose for aes key, only crypto is supported");
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void validateKey(ynn ynnVar) throws yob {
        validateCrypto(new ynk.e(getProvider()).a(CipherAlg.AES_GCM).c(ynnVar.c()).c(yol.b(CipherAlg.AES_GCM.getIvLen())).b());
    }
}
