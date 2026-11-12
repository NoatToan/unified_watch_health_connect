package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.crypto.key.KeyStoreProvider;
import com.huawei.wisesecurity.kfs.crypto.key.KfsKeyPurpose;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes20.dex */
public class ynm extends KeyStoreKeyManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AlgorithmParameterSpec f53666b = new ECGenParameterSpec("secp256r1");

    public ynm() {
    }

    public ynm(KeyStoreProvider keyStoreProvider) {
        super(keyStoreProvider);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void generateKey(ynn ynnVar) throws yob {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(JceNames.EC, getProvider().getProviderName());
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(ynnVar.c(), ynnVar.b().getValue()).setAttestationChallenge(ynnVar.e() ? getProvider().getName().getBytes(StandardCharsets.UTF_8) : null).setDigests("SHA-256", "SHA-384", "SHA-512").setAlgorithmParameterSpec(f53666b).setKeySize(ynnVar.d()).build());
            if (keyPairGenerator.generateKeyPair() != null) {
            } else {
                throw new yob("generate ec key pair failed with bad key");
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException | ProviderException e) {
            throw new yob("generate ec key pair failed, " + e.getMessage());
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void validateParam(ynn ynnVar) throws yny {
        if (ynnVar.d() != 256) {
            throw new yny("bad ec key len, only ec prime 256 is supported");
        }
        if (ynnVar.b() != KfsKeyPurpose.PURPOSE_SIGN) {
            throw new yny("bad purpose for ec key, only sign is supported");
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.key.KeyStoreKeyManager
    public void validateKey(ynn ynnVar) throws yob {
        validateSign(new ynt.b(getProvider()).withAlg(SignAlg.ECDSA).withKeyStoreAlias(ynnVar.c()).build());
    }
}
