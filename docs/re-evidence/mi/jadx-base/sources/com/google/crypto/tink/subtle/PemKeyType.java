package com.google.crypto.tink.subtle;

import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import defpackage.j12;
import defpackage.pb8;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RSA_PSS_2048_SHA256' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class PemKeyType {
    private static final /* synthetic */ PemKeyType[] $VALUES;
    private static final String BEGIN = "-----BEGIN ";
    public static final PemKeyType ECDSA_P256_SHA256;
    public static final PemKeyType ECDSA_P384_SHA384;
    public static final PemKeyType ECDSA_P521_SHA512;
    private static final String END = "-----END ";
    private static final String MARKER = "-----";
    private static final String PRIVATE_KEY = "PRIVATE KEY";
    private static final String PUBLIC_KEY = "PUBLIC KEY";
    public static final PemKeyType RSA_PSS_2048_SHA256;
    public static final PemKeyType RSA_PSS_3072_SHA256;
    public static final PemKeyType RSA_PSS_4096_SHA256;
    public static final PemKeyType RSA_PSS_4096_SHA512;
    public static final PemKeyType RSA_SIGN_PKCS1_2048_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_3072_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_4096_SHA256;
    public static final PemKeyType RSA_SIGN_PKCS1_4096_SHA512;
    public final String algorithm;
    public final Enums$HashType hash;
    public final int keySizeInBits;
    public final String keyType;

    static {
        Enums$HashType enums$HashType = Enums$HashType.SHA256;
        PemKeyType pemKeyType = new PemKeyType("RSA_PSS_2048_SHA256", 0, SignUtils.KEY_RSA, "RSASSA-PSS", 2048, enums$HashType);
        RSA_PSS_2048_SHA256 = pemKeyType;
        PemKeyType pemKeyType2 = new PemKeyType("RSA_PSS_3072_SHA256", 1, SignUtils.KEY_RSA, "RSASSA-PSS", BaseAivsService.MAX_PACKAGE_LENGTH, enums$HashType);
        RSA_PSS_3072_SHA256 = pemKeyType2;
        PemKeyType pemKeyType3 = new PemKeyType("RSA_PSS_4096_SHA256", 2, SignUtils.KEY_RSA, "RSASSA-PSS", 4096, enums$HashType);
        RSA_PSS_4096_SHA256 = pemKeyType3;
        Enums$HashType enums$HashType2 = Enums$HashType.SHA512;
        PemKeyType pemKeyType4 = new PemKeyType("RSA_PSS_4096_SHA512", 3, SignUtils.KEY_RSA, "RSASSA-PSS", 4096, enums$HashType2);
        RSA_PSS_4096_SHA512 = pemKeyType4;
        PemKeyType pemKeyType5 = new PemKeyType("RSA_SIGN_PKCS1_2048_SHA256", 4, SignUtils.KEY_RSA, "RSASSA-PKCS1-v1_5", 2048, enums$HashType);
        RSA_SIGN_PKCS1_2048_SHA256 = pemKeyType5;
        PemKeyType pemKeyType6 = new PemKeyType("RSA_SIGN_PKCS1_3072_SHA256", 5, SignUtils.KEY_RSA, "RSASSA-PKCS1-v1_5", BaseAivsService.MAX_PACKAGE_LENGTH, enums$HashType);
        RSA_SIGN_PKCS1_3072_SHA256 = pemKeyType6;
        PemKeyType pemKeyType7 = new PemKeyType("RSA_SIGN_PKCS1_4096_SHA256", 6, SignUtils.KEY_RSA, "RSASSA-PKCS1-v1_5", 4096, enums$HashType);
        RSA_SIGN_PKCS1_4096_SHA256 = pemKeyType7;
        PemKeyType pemKeyType8 = new PemKeyType("RSA_SIGN_PKCS1_4096_SHA512", 7, SignUtils.KEY_RSA, "RSASSA-PKCS1-v1_5", 4096, enums$HashType2);
        RSA_SIGN_PKCS1_4096_SHA512 = pemKeyType8;
        PemKeyType pemKeyType9 = new PemKeyType("ECDSA_P256_SHA256", 8, "EC", "ECDSA", 256, enums$HashType);
        ECDSA_P256_SHA256 = pemKeyType9;
        PemKeyType pemKeyType10 = new PemKeyType("ECDSA_P384_SHA384", 9, "EC", "ECDSA", 384, Enums$HashType.SHA384);
        ECDSA_P384_SHA384 = pemKeyType10;
        PemKeyType pemKeyType11 = new PemKeyType("ECDSA_P521_SHA512", 10, "EC", "ECDSA", 521, enums$HashType2);
        ECDSA_P521_SHA512 = pemKeyType11;
        $VALUES = new PemKeyType[]{pemKeyType, pemKeyType2, pemKeyType3, pemKeyType4, pemKeyType5, pemKeyType6, pemKeyType7, pemKeyType8, pemKeyType9, pemKeyType10, pemKeyType11};
    }

    private PemKeyType(String str, int i, String str2, String str3, int i2, Enums$HashType enums$HashType) {
        super(str, i);
        this.keyType = str2;
        this.algorithm = str3;
        this.keySizeInBits = i2;
        this.hash = enums$HashType;
    }

    private Key getPrivateKey(byte[] bArr) throws GeneralSecurityException {
        return validate(pb8.l.a(this.keyType).generatePrivate(new PKCS8EncodedKeySpec(bArr)));
    }

    private Key getPublicKey(byte[] bArr) throws GeneralSecurityException {
        return validate(pb8.l.a(this.keyType).generatePublic(new X509EncodedKeySpec(bArr)));
    }

    private Key validate(Key key) throws GeneralSecurityException {
        if (this.keyType.equals(SignUtils.KEY_RSA)) {
            int iBitLength = ((RSAKey) key).getModulus().bitLength();
            if (iBitLength != this.keySizeInBits) {
                throw new GeneralSecurityException(String.format("invalid RSA key size, want %d got %d", Integer.valueOf(this.keySizeInBits), Integer.valueOf(iBitLength)));
            }
        } else {
            ECParameterSpec params = ((ECKey) key).getParams();
            if (!EllipticCurves.g(params)) {
                throw new GeneralSecurityException("unsupport EC spec: " + params.toString());
            }
            int iA = EllipticCurves.a(params.getCurve());
            if (iA != this.keySizeInBits) {
                throw new GeneralSecurityException(String.format("invalid EC key size, want %d got %d", Integer.valueOf(this.keySizeInBits), Integer.valueOf(iA)));
            }
        }
        return key;
    }

    public static PemKeyType valueOf(String str) {
        return (PemKeyType) Enum.valueOf(PemKeyType.class, str);
    }

    public static PemKeyType[] values() {
        return (PemKeyType[]) $VALUES.clone();
    }

    public Key readKey(BufferedReader bufferedReader) throws IOException {
        String strSubstring;
        int iIndexOf;
        String line = bufferedReader.readLine();
        while (line != null && !line.startsWith("-----BEGIN ")) {
            line = bufferedReader.readLine();
        }
        if (line == null || (iIndexOf = (strSubstring = line.trim().substring(11)).indexOf(MARKER)) < 0) {
            return null;
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String str = END + strSubstring2 + MARKER;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 == null) {
                break;
            }
            if (line2.indexOf(":") <= 0) {
                if (line2.contains(str)) {
                    break;
                }
                sb.append(line2);
            }
        }
        try {
            byte[] bArrA = j12.a(sb.toString(), 0);
            if (strSubstring2.contains(PUBLIC_KEY)) {
                return getPublicKey(bArrA);
            }
            if (strSubstring2.contains(PRIVATE_KEY)) {
                return getPrivateKey(bArrA);
            }
            return null;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
    }
}
