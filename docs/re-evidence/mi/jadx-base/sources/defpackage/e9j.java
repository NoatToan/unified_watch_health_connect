package defpackage;

import com.miuipub.internal.hybrid.SignUtils;
import com.nimbusds.jose.JOSEException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class e9j {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher cipherA = kw3.a(SignUtils.CIPHER_RSA, provider);
            cipherA.init(1, rSAPublicKey);
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException("Couldn't encrypt Content Encryption Key (CEK): " + e2.getMessage(), e2);
        }
    }
}
