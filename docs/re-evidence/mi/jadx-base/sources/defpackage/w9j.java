package defpackage;

import com.nimbusds.jose.JOSEException;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class w9j {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters algorithmParametersA = u51.a("OAEP", provider);
            algorithmParametersA.init(new OAEPParameterSpec(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher cipherA = kw3.a("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
            cipherA.init(1, rSAPublicKey, algorithmParametersA);
            return cipherA.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
