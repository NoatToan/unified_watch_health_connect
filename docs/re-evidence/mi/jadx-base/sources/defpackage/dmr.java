package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class dmr extends f9j implements gqd {
    public final RSAPublicKey f;
    public final SecretKey g;

    public dmr(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, null);
    }

    @Override // defpackage.gqd
    public eqd d(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URLEncode;
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        SecretKey secretKeyA = this.g;
        if (secretKeyA == null) {
            secretKeyA = jh4.a(encryptionMethod, e().b());
        }
        SecretKey secretKey = secretKeyA;
        if (algorithm.equals(JWEAlgorithm.RSA1_5)) {
            base64URLEncode = Base64URL.encode(e9j.a(this.f, secretKey, e().d()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP)) {
            base64URLEncode = Base64URL.encode(v9j.a(this.f, secretKey, e().d()));
        } else {
            if (!algorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
                throw new JOSEException(x51.c(algorithm, f9j.d));
            }
            base64URLEncode = Base64URL.encode(w9j.a(this.f, secretKey, e().d()));
        }
        return od5.c(jWEHeader, bArr, secretKey, base64URLEncode, e(), new byte[0]);
    }

    public dmr(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.f = rSAPublicKey;
            if (secretKey != null) {
                if (secretKey.getAlgorithm() != null && secretKey.getAlgorithm().equals("AES")) {
                    this.g = secretKey;
                    return;
                }
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
            }
            this.g = null;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }
}
