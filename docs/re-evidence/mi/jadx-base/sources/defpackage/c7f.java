package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.VisibleForTesting;
import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class c7f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final KeyGenParameterSpec f5013a = a("_androidx_security_master_key_");

    public static KeyGenParameterSpec a(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }

    public static void b(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", IECDHAlgorithm.KEY_STORE);
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    public static String c(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        e(keyGenParameterSpec);
        if (!d(keyGenParameterSpec.getKeystoreAlias())) {
            b(keyGenParameterSpec);
        }
        return keyGenParameterSpec.getKeystoreAlias();
    }

    public static boolean d(String str) throws GeneralSecurityException, IOException {
        KeyStore keyStore = KeyStore.getInstance(IECDHAlgorithm.KEY_STORE);
        keyStore.load(null);
        return keyStore.containsAlias(str);
    }

    @VisibleForTesting
    public static void e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
        }
        if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
        }
    }
}
