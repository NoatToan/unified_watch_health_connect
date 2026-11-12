package defpackage;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class vcb {
    public static byte[] a(SecretKey secretKey, byte[] bArr, Provider provider) throws JOSEException {
        Mac macB = b(secretKey, provider);
        macB.update(bArr);
        return macB.doFinal();
    }

    public static Mac b(SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Mac mac = provider != null ? Mac.getInstance(secretKey.getAlgorithm(), provider) : Mac.getInstance(secretKey.getAlgorithm());
            mac.init(secretKey);
            return mac;
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid HMAC key: " + e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Unsupported HMAC algorithm: " + e2.getMessage(), e2);
        }
    }
}
