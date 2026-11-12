package com.nimbusds.jose.crypto;

import com.mapbox.maps.p;
import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.AESCryptoProvider;
import com.nimbusds.jose.crypto.impl.AESGCMKW;
import com.nimbusds.jose.crypto.impl.AESKW;
import com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.nimbusds.jose.crypto.impl.AuthenticatedCipherText;
import com.nimbusds.jose.crypto.impl.ContentCryptoProvider;
import com.nimbusds.jose.crypto.impl.CriticalHeaderParamsDeferral;
import com.nimbusds.jose.crypto.impl.JWEHeaderValidation;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class AESDecrypter extends AESCryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {
    private final CriticalHeaderParamsDeferral critPolicy;

    public AESDecrypter(SecretKey secretKey, Set<String> set) {
        super(secretKey, null);
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
    }

    @Override // com.nimbusds.jose.JWEDecrypter
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, byte[] bArr) throws JOSEException {
        SecretKey secretKeyUnwrapCEK;
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
        JWEAlgorithm algorithmAndEnsureNotNull = JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        int iCekBitLength = jWEHeader.getEncryptionMethod().cekBitLength();
        if (algorithmAndEnsureNotNull.equals(JWEAlgorithm.A128KW) || algorithmAndEnsureNotNull.equals(JWEAlgorithm.A192KW) || algorithmAndEnsureNotNull.equals(JWEAlgorithm.A256KW)) {
            secretKeyUnwrapCEK = AESKW.unwrapCEK(getKey(), base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        } else {
            if (!algorithmAndEnsureNotNull.equals(JWEAlgorithm.A128GCMKW) && !algorithmAndEnsureNotNull.equals(JWEAlgorithm.A192GCMKW) && !algorithmAndEnsureNotNull.equals(JWEAlgorithm.A256GCMKW)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, AESCryptoProvider.SUPPORTED_ALGORITHMS));
            }
            if (jWEHeader.getIV() == null) {
                p.p("Missing JWE \"iv\" header parameter");
                return null;
            }
            byte[] bArrDecode = jWEHeader.getIV().decode();
            if (jWEHeader.getAuthTag() == null) {
                p.p("Missing JWE \"tag\" header parameter");
                return null;
            }
            secretKeyUnwrapCEK = AESGCMKW.decryptCEK(getKey(), bArrDecode, new AuthenticatedCipherText(base64URL.decode(), jWEHeader.getAuthTag().decode()), iCekBitLength, getJCAContext().getKeyEncryptionProvider());
        }
        return ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, secretKeyUnwrapCEK, getJCAContext());
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    @Override // com.nimbusds.jose.CriticalHeaderParamsAware
    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public AESDecrypter(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"));
    }

    public AESDecrypter(OctetSequenceKey octetSequenceKey) {
        this(octetSequenceKey.toSecretKey("AES"));
    }

    public AESDecrypter(SecretKey secretKey) {
        this(secretKey, null);
    }

    @Deprecated
    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        return decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, AAD.compute(jWEHeader));
    }
}
