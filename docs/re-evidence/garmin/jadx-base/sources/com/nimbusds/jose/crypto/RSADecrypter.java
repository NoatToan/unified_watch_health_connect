package com.nimbusds.jose.crypto;

import com.mapbox.maps.p;
import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.JWEHeaderValidation;
import com.nimbusds.jose.crypto.impl.RSA1_5;
import com.nimbusds.jose.crypto.impl.RSACryptoProvider;
import com.nimbusds.jose.crypto.impl.RSAKeyUtils;
import com.nimbusds.jose.crypto.impl.RSA_OAEP;
import com.nimbusds.jose.crypto.impl.RSA_OAEP_SHA2;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import java.security.PrivateKey;
import java.util.Set;
import javax.crypto.SecretKey;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class RSADecrypter extends RSACryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {
    private Exception cekDecryptionException;
    private final CriticalHeaderParamsDeferral critPolicy;
    private final PrivateKey privateKey;

    public RSADecrypter(PrivateKey privateKey, Set<String> set, boolean z14) {
        int iKeyBitLength;
        super(null);
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (!privateKey.getAlgorithm().equalsIgnoreCase("RSA")) {
            h.s("The private key algorithm must be RSA");
            throw null;
        }
        if (!z14 && (iKeyBitLength = RSAKeyUtils.keyBitLength(privateKey)) > 0 && iKeyBitLength < 2048) {
            h.s("The RSA key size must be at least 2048 bits");
            throw null;
        }
        this.privateKey = privateKey;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, byte[] bArr) throws JOSEException {
        SecretKey secretKeyDecryptCEK;
        if (base64URL == null) {
            p.p("Missing JWE encrypted key");
            return null;
        }
        if (base64URL2 == null) {
            p.p("Missing JWE initialization vector (IV)");
            return null;
        }
        if (base64URL4 == null) {
            p.p("Missing JWE authentication tag");
            return null;
        }
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        JWEAlgorithm algorithmAndEnsureNotNull = JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        if (algorithmAndEnsureNotNull.equals(JWEAlgorithm.RSA1_5)) {
            int iCekBitLength = jWEHeader.getEncryptionMethod().cekBitLength();
            secretKeyDecryptCEK = ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
            try {
                SecretKey secretKeyDecryptCEK2 = RSA1_5.decryptCEK(this.privateKey, base64URL.decode(), iCekBitLength, getJCAContext().getKeyEncryptionProvider());
                if (secretKeyDecryptCEK2 != null) {
                    secretKeyDecryptCEK = secretKeyDecryptCEK2;
                }
            } catch (Exception e4) {
                this.cekDecryptionException = e4;
            }
            this.cekDecryptionException = null;
        } else if (algorithmAndEnsureNotNull.equals(JWEAlgorithm.RSA_OAEP)) {
            secretKeyDecryptCEK = RSA_OAEP.decryptCEK(this.privateKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        } else if (algorithmAndEnsureNotNull.equals(JWEAlgorithm.RSA_OAEP_256)) {
            secretKeyDecryptCEK = RSA_OAEP_SHA2.decryptCEK(this.privateKey, base64URL.decode(), 256, getJCAContext().getKeyEncryptionProvider());
        } else if (algorithmAndEnsureNotNull.equals(JWEAlgorithm.RSA_OAEP_384)) {
            secretKeyDecryptCEK = RSA_OAEP_SHA2.decryptCEK(this.privateKey, base64URL.decode(), 384, getJCAContext().getKeyEncryptionProvider());
        } else {
            if (!algorithmAndEnsureNotNull.equals(JWEAlgorithm.RSA_OAEP_512)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, RSACryptoProvider.SUPPORTED_ALGORITHMS));
            }
            secretKeyDecryptCEK = RSA_OAEP_SHA2.decryptCEK(this.privateKey, base64URL.decode(), 512, getJCAContext().getKeyEncryptionProvider());
        }
        return ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, secretKeyDecryptCEK, getJCAContext());
    }

    public Exception getCEKDecryptionException() {
        return this.cekDecryptionException;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public RSADecrypter(RSAKey rSAKey) {
        this(RSAKeyUtils.toRSAPrivateKey(rSAKey));
    }

    public RSADecrypter(PrivateKey privateKey, Set<String> set) {
        this(privateKey, set, false);
    }

    public RSADecrypter(PrivateKey privateKey) {
        this(privateKey, null, false);
    }

    @Deprecated
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        return decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, AAD.compute(jWEHeader));
    }
}
