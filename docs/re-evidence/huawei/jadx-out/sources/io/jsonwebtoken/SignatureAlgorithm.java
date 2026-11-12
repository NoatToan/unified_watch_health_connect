package io.jsonwebtoken;

import androidx.media3.exoplayer.RendererCapabilities;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import defpackage.yxt;
import defpackage.yyb;
import defpackage.yyc;
import defpackage.yye;
import defpackage.yyg;
import java.security.Key;
import java.security.PrivateKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import org.eclipse.californium.elements.util.JceNames;

/* JADX INFO: loaded from: classes46.dex */
@Deprecated
public enum SignatureAlgorithm {
    NONE("none", "No digital signature or MAC performed", "None", null, false, 0, 0),
    HS256("HS256", "HMAC using SHA-256", "HMAC", "HmacSHA256", true, 256, 256, "1.2.840.113549.2.9"),
    HS384("HS384", "HMAC using SHA-384", "HMAC", "HmacSHA384", true, RendererCapabilities.DECODER_SUPPORT_MASK, RendererCapabilities.DECODER_SUPPORT_MASK, "1.2.840.113549.2.10"),
    HS512("HS512", "HMAC using SHA-512", "HMAC", "HmacSHA512", true, 512, 512, "1.2.840.113549.2.11"),
    RS256(CommonPickerConstant.IdTokenSupportAlg.RS_256, "RSASSA-PKCS-v1_5 using SHA-256", JceNames.RSA, "SHA256withRSA", true, 256, 2048),
    RS384("RS384", "RSASSA-PKCS-v1_5 using SHA-384", JceNames.RSA, "SHA384withRSA", true, RendererCapabilities.DECODER_SUPPORT_MASK, 2048),
    RS512("RS512", "RSASSA-PKCS-v1_5 using SHA-512", JceNames.RSA, "SHA512withRSA", true, 512, 2048),
    ES256("ES256", "ECDSA using P-256 and SHA-256", "ECDSA", "SHA256withECDSA", true, 256, 256),
    ES384("ES384", "ECDSA using P-384 and SHA-384", "ECDSA", "SHA384withECDSA", true, RendererCapabilities.DECODER_SUPPORT_MASK, RendererCapabilities.DECODER_SUPPORT_MASK),
    ES512("ES512", "ECDSA using P-521 and SHA-512", "ECDSA", "SHA512withECDSA", true, 512, 521),
    PS256("PS256", "RSASSA-PSS using SHA-256 and MGF1 with SHA-256", JceNames.RSA, "RSASSA-PSS", false, 256, 2048),
    PS384("PS384", "RSASSA-PSS using SHA-384 and MGF1 with SHA-384", JceNames.RSA, "RSASSA-PSS", false, RendererCapabilities.DECODER_SUPPORT_MASK, 2048),
    PS512("PS512", "RSASSA-PSS using SHA-512 and MGF1 with SHA-512", JceNames.RSA, "RSASSA-PSS", false, 512, 2048);

    private static final List<SignatureAlgorithm> PREFERRED_EC_ALGS;
    private static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS;
    private final String description;
    private final int digestLength;
    private final String familyName;
    private final String jcaName;
    private final boolean jdkStandard;
    private final int minKeyLength;

    @Deprecated
    private final String pkcs12Name;
    private final String value;

    static {
        SignatureAlgorithm signatureAlgorithm = HS256;
        SignatureAlgorithm signatureAlgorithm2 = HS384;
        SignatureAlgorithm signatureAlgorithm3 = HS512;
        SignatureAlgorithm signatureAlgorithm4 = ES256;
        SignatureAlgorithm signatureAlgorithm5 = ES384;
        SignatureAlgorithm signatureAlgorithm6 = ES512;
        PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(signatureAlgorithm3, signatureAlgorithm2, signatureAlgorithm));
        PREFERRED_EC_ALGS = Collections.unmodifiableList(Arrays.asList(signatureAlgorithm6, signatureAlgorithm5, signatureAlgorithm4));
    }

    SignatureAlgorithm(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        this(str, str2, str3, str4, z, i, i2, str4);
    }

    SignatureAlgorithm(String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5) {
        this.value = str;
        this.description = str2;
        this.familyName = str3;
        this.jcaName = str4;
        this.jdkStandard = z;
        this.digestLength = i;
        this.minKeyLength = i2;
        this.pkcs12Name = str5;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String getJcaName() {
        return this.jcaName;
    }

    public boolean isJdkStandard() {
        return this.jdkStandard;
    }

    public boolean isHmac() {
        return this.familyName.equals("HMAC");
    }

    public boolean isRsa() {
        return this.familyName.equals(JceNames.RSA);
    }

    public boolean isEllipticCurve() {
        return this.familyName.equals("ECDSA");
    }

    public int getMinKeyLength() {
        return this.minKeyLength;
    }

    public void assertValidSigningKey(Key key) throws yyb {
        assertValid(key, true);
    }

    public void assertValidVerificationKey(Key key) throws yyb {
        assertValid(key, false);
    }

    private static String keyType(boolean z) {
        return z ? "signing" : "verification";
    }

    private void assertValid(Key key, boolean z) throws yyb {
        if (this == NONE) {
            throw new yyb("The 'NONE' signature algorithm does not support cryptographic keys.");
        }
        if (isHmac()) {
            if (!(key instanceof SecretKey)) {
                throw new yyb(this.familyName + " " + keyType(z) + " keys must be SecretKey instances.");
            }
            SecretKey secretKey = (SecretKey) key;
            byte[] encoded = secretKey.getEncoded();
            if (encoded == null) {
                throw new yyb("The " + keyType(z) + " key's encoded bytes cannot be null.");
            }
            String algorithm = secretKey.getAlgorithm();
            if (algorithm == null) {
                throw new yyb("The " + keyType(z) + " key's algorithm cannot be null.");
            }
            SignatureAlgorithm signatureAlgorithm = HS256;
            if (!signatureAlgorithm.jcaName.equalsIgnoreCase(algorithm)) {
                SignatureAlgorithm signatureAlgorithm2 = HS384;
                if (!signatureAlgorithm2.jcaName.equalsIgnoreCase(algorithm)) {
                    SignatureAlgorithm signatureAlgorithm3 = HS512;
                    if (!signatureAlgorithm3.jcaName.equalsIgnoreCase(algorithm) && !signatureAlgorithm.pkcs12Name.equals(algorithm) && !signatureAlgorithm2.pkcs12Name.equals(algorithm) && !signatureAlgorithm3.pkcs12Name.equals(algorithm)) {
                        throw new yyb("The " + keyType(z) + " key's algorithm '" + algorithm + "' does not equal a valid HmacSHA* algorithm name and cannot be used with " + name() + ".");
                    }
                }
            }
            int length = encoded.length * 8;
            if (length >= this.minKeyLength) {
                return;
            }
            throw new yye("The " + keyType(z) + " key's size is " + length + " bits which is not secure enough for the " + name() + " algorithm.  The JWT JWA Specification (RFC 7518, Section 3.2) states that keys used with " + name() + " MUST have a size >= " + this.minKeyLength + " bits (the key size must be greater than or equal to the hash output size).  Consider using the " + yyg.class.getName() + " class's 'secretKeyFor(SignatureAlgorithm." + name() + ")' method to create a key guaranteed to be secure enough for " + name() + ".  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.");
        }
        if (z && !(key instanceof PrivateKey)) {
            throw new yyb(this.familyName + " signing keys must be PrivateKey instances.");
        }
        if (isEllipticCurve()) {
            if (!(key instanceof ECKey)) {
                throw new yyb(this.familyName + " " + keyType(z) + " keys must be ECKey instances.");
            }
            int iBitLength = ((ECKey) key).getParams().getOrder().bitLength();
            if (iBitLength >= this.minKeyLength) {
                return;
            }
            throw new yye("The " + keyType(z) + " key's size (ECParameterSpec order) is " + iBitLength + " bits which is not secure enough for the " + name() + " algorithm.  The JWT JWA Specification (RFC 7518, Section 3.4) states that keys used with " + name() + " MUST have a size >= " + this.minKeyLength + " bits.  Consider using the " + yyg.class.getName() + " class's 'keyPairFor(SignatureAlgorithm." + name() + ")' method to create a key pair guaranteed to be secure enough for " + name() + ".  See https://tools.ietf.org/html/rfc7518#section-3.4 for more information.");
        }
        if (!(key instanceof RSAKey)) {
            throw new yyb(this.familyName + " " + keyType(z) + " keys must be RSAKey instances.");
        }
        int iBitLength2 = ((RSAKey) key).getModulus().bitLength();
        if (iBitLength2 < this.minKeyLength) {
            String str = name().startsWith("P") ? "3.5" : "3.3";
            throw new yye("The " + keyType(z) + " key's size is " + iBitLength2 + " bits which is not secure enough for the " + name() + " algorithm.  The JWT JWA Specification (RFC 7518, Section " + str + ") states that keys used with " + name() + " MUST have a size >= " + this.minKeyLength + " bits.  Consider using the " + yyg.class.getName() + " class's 'keyPairFor(SignatureAlgorithm." + name() + ")' method to create a key pair guaranteed to be secure enough for " + name() + ".  See https://tools.ietf.org/html/rfc7518#section-" + str + " for more information.");
        }
    }

    public static SignatureAlgorithm forSigningKey(Key key) throws yyb {
        if (key == null) {
            throw new yyb("Key argument cannot be null.");
        }
        boolean z = key instanceof SecretKey;
        if (!z && (!(key instanceof PrivateKey) || (!(key instanceof ECKey) && !(key instanceof RSAKey)))) {
            throw new yyb("JWT standard signing algorithms require either 1) a SecretKey for HMAC-SHA algorithms or 2) a private RSAKey for RSA algorithms or 3) a private ECKey for Elliptic Curve algorithms.  The specified key is of type " + key.getClass().getName());
        }
        if (z) {
            int iA = yxt.a(((SecretKey) key).getEncoded()) * 8;
            for (SignatureAlgorithm signatureAlgorithm : PREFERRED_HMAC_ALGS) {
                if (iA >= signatureAlgorithm.minKeyLength) {
                    return signatureAlgorithm;
                }
            }
            throw new yye("The specified SecretKey is not strong enough to be used with JWT HMAC signature algorithms.  The JWT specification requires HMAC keys to be >= 256 bits long.  The specified key is " + iA + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.");
        }
        if (key instanceof RSAKey) {
            int iBitLength = ((RSAKey) key).getModulus().bitLength();
            if (iBitLength >= 4096) {
                SignatureAlgorithm signatureAlgorithm2 = RS512;
                signatureAlgorithm2.assertValidSigningKey(key);
                return signatureAlgorithm2;
            }
            if (iBitLength >= 3072) {
                SignatureAlgorithm signatureAlgorithm3 = RS384;
                signatureAlgorithm3.assertValidSigningKey(key);
                return signatureAlgorithm3;
            }
            SignatureAlgorithm signatureAlgorithm4 = RS256;
            if (iBitLength >= signatureAlgorithm4.minKeyLength) {
                signatureAlgorithm4.assertValidSigningKey(key);
                return signatureAlgorithm4;
            }
            throw new yye("The specified RSA signing key is not strong enough to be used with JWT RSA signature algorithms.  The JWT specification requires RSA keys to be >= 2048 bits long.  The specified RSA key is " + iBitLength + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.3 for more information.");
        }
        int iBitLength2 = ((ECKey) key).getParams().getOrder().bitLength();
        for (SignatureAlgorithm signatureAlgorithm5 : PREFERRED_EC_ALGS) {
            if (iBitLength2 >= signatureAlgorithm5.minKeyLength) {
                signatureAlgorithm5.assertValidSigningKey(key);
                return signatureAlgorithm5;
            }
        }
        throw new yye("The specified Elliptic Curve signing key is not strong enough to be used with JWT ECDSA signature algorithms.  The JWT specification requires ECDSA keys to be >= 256 bits long.  The specified ECDSA key is " + iBitLength2 + " bits.  See https://tools.ietf.org/html/rfc7518#section-3.4 for more information.");
    }

    public static SignatureAlgorithm forName(String str) throws yyc {
        for (SignatureAlgorithm signatureAlgorithm : values()) {
            if (signatureAlgorithm.getValue().equalsIgnoreCase(str)) {
                return signatureAlgorithm;
            }
        }
        throw new yyc("Unsupported signature algorithm '" + str + "'");
    }
}
