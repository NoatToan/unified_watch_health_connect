package com.nimbusds.jose.crypto.impl;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.mapbox.maps.p;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.util.Base64URL;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ECDHCryptoProvider extends BaseJWEProvider {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final ConcatKDF concatKDF;
    private final Curve curve;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.ECDH_ES);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A128KW);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A192KW);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A256KW);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public ECDHCryptoProvider(Curve curve, SecretKey secretKey) throws JOSEException {
        super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS, secretKey);
        Curve curve2 = curve != null ? curve : new Curve(PrivacyUpdateRequestError.UNKNOWN);
        if (!supportedEllipticCurves().contains(curve)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEllipticCurve(curve2, supportedEllipticCurves()));
        }
        this.curve = curve;
        this.concatKDF = new ConcatKDF(MessageDigestAlgorithms.SHA_256);
    }

    public byte[] decryptWithZ(JWEHeader jWEHeader, byte[] bArr, SecretKey secretKey, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        ECDH.AlgorithmMode algorithmModeResolveAlgorithmMode = ECDH.resolveAlgorithmMode(JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader));
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        SecretKey secretKeyDeriveSharedKey = ECDH.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        if (!algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.DIRECT)) {
            if (!algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.KW)) {
                p.m(algorithmModeResolveAlgorithmMode, "Unexpected JWE ECDH algorithm mode: ");
                return null;
            }
            if (base64URL == null) {
                p.p("Missing JWE encrypted key");
                return null;
            }
            secretKeyDeriveSharedKey = AESKW.unwrapCEK(secretKeyDeriveSharedKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
        }
        return ContentCryptoProvider.decrypt(jWEHeader, bArr, base64URL, base64URL2, base64URL3, base64URL4, secretKeyDeriveSharedKey, getJCAContext());
    }

    public JWECryptoParts encryptWithZ(JWEHeader jWEHeader, SecretKey secretKey, byte[] bArr, byte[] bArr2) throws JOSEException {
        Base64URL base64URLEncode;
        SecretKey secretKey2;
        ECDH.AlgorithmMode algorithmModeResolveAlgorithmMode = ECDH.resolveAlgorithmMode(JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader));
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        SecretKey secretKeyDeriveSharedKey = ECDH.deriveSharedKey(jWEHeader, secretKey, getConcatKDF());
        if (algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.DIRECT)) {
            if (isCEKProvided()) {
                p.p("The provided CEK is not supported");
                return null;
            }
            secretKey2 = secretKeyDeriveSharedKey;
            base64URLEncode = null;
        } else {
            if (!algorithmModeResolveAlgorithmMode.equals(ECDH.AlgorithmMode.KW)) {
                p.m(algorithmModeResolveAlgorithmMode, "Unexpected JWE ECDH algorithm mode: ");
                return null;
            }
            SecretKey cek = getCEK(encryptionMethod);
            base64URLEncode = Base64URL.encode(AESKW.wrapCEK(cek, secretKeyDeriveSharedKey, getJCAContext().getKeyEncryptionProvider()));
            secretKey2 = cek;
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, bArr2, secretKey2, base64URLEncode, getJCAContext());
    }

    public ConcatKDF getConcatKDF() {
        return this.concatKDF;
    }

    public Curve getCurve() {
        return this.curve;
    }

    public abstract Set<Curve> supportedEllipticCurves();
}
