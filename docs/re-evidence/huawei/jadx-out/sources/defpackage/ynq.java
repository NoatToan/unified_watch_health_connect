package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes20.dex */
public class ynq extends KeyStoreKeyManager {
    private boolean d(int i) {
        return (i == 2048 || i == 3072 || i == 4096) ? false : true;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void generateKey(ynn ynnVar) throws yob {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(JceNames.RSA, getProvider().getProviderName());
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(ynnVar.c(), ynnVar.b().getValue()).setAttestationChallenge(getProvider().getName().getBytes(StandardCharsets.UTF_8)).setSignaturePaddings("PKCS1", "PSS").setEncryptionPaddings("PKCS1Padding", "OAEPPadding").setDigests("SHA-256", "SHA-384", "SHA-512").setKeySize(ynnVar.d()).build());
            if (keyPairGenerator.generateKeyPair() != null) {
            } else {
                throw new yob("generate rsa key pair failed with bad key");
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new yob("generate rsa key pair failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void validateParam(ynn ynnVar) throws yny {
        if (d(ynnVar.d())) {
            throw new yny("bad rsa key len");
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void validateKey(ynn ynnVar) throws yob {
        if (KfsKeyPurpose.containsPurpose(ynnVar.b(), KfsKeyPurpose.PURPOSE_CRYPTO)) {
            validateCrypto(new yni.a(getProvider()).b(CipherAlg.RSA_OAEP).withKeyStoreAlias(ynnVar.c()).build());
        }
        if (KfsKeyPurpose.containsPurpose(ynnVar.b(), KfsKeyPurpose.PURPOSE_SIGN)) {
            validateSign(new yns.d(getProvider()).withAlg(SignAlg.RSA_SHA256).withKeyStoreAlias(ynnVar.c()).build());
        }
    }
}
