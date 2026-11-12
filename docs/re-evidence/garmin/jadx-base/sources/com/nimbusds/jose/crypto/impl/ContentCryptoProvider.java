package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class ContentCryptoProvider {
    public static final Map<Integer, Set<EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.A128CBC_HS256;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.A192CBC_HS384;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.A256CBC_HS512;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.A128GCM;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.A192GCM;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.A256GCM;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.A128CBC_HS256_DEPRECATED;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.A256CBC_HS512_DEPRECATED;
        linkedHashSet.add(encryptionMethod8);
        EncryptionMethod encryptionMethod9 = EncryptionMethod.XC20P;
        linkedHashSet.add(encryptionMethod9);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet);
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet3.add(encryptionMethod9);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        map.put(128, Collections.unmodifiableSet(hashSet));
        map.put(192, Collections.unmodifiableSet(hashSet2));
        map.put(256, Collections.unmodifiableSet(hashSet3));
        map.put(384, Collections.unmodifiableSet(hashSet4));
        map.put(512, Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(map);
    }

    private static void checkCEKLength(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            int iSafeBitLength = ByteUtils.safeBitLength(secretKey.getEncoded());
            if (iSafeBitLength == 0 || encryptionMethod.cekBitLength() == iSafeBitLength) {
                return;
            }
            StringBuilder sb3 = new StringBuilder("The Content Encryption Key (CEK) length for ");
            sb3.append(encryptionMethod);
            int iCekBitLength = encryptionMethod.cekBitLength();
            sb3.append(" must be ");
            sb3.append(iCekBitLength);
            sb3.append(" bits");
            throw new KeyLengthException(sb3.toString());
        } catch (IntegerOverflowException e4) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e4.getMessage());
        }
    }

    public static byte[] decrypt(JWEHeader jWEHeader, byte[] bArr, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) throws JOSEException {
        byte[] bArrDecryptAuthenticated;
        if (bArr == null) {
            return decrypt(jWEHeader, AAD.compute(jWEHeader), base64URL, base64URL2, base64URL3, base64URL4, secretKey, jWEJCAContext);
        }
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            jWEHeader = jWEHeader;
            bArrDecryptAuthenticated = AESCBC.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArr, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            bArrDecryptAuthenticated = AESGCM.decrypt(secretKey, base64URL2.decode(), base64URL3.decode(), bArr, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
            jWEHeader = jWEHeader;
            bArrDecryptAuthenticated = AESCBC.decryptWithConcatKDF(jWEHeader, secretKey, base64URL, base64URL2, base64URL3, base64URL4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else {
            if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.XC20P)) {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            bArrDecryptAuthenticated = XC20P.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArr, base64URL4.decode());
            jWEHeader = jWEHeader;
        }
        return DeflateHelper.applyDecompression(jWEHeader, bArrDecryptAuthenticated);
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) throws JOSEException {
        byte[] bArrGenerateIV;
        AuthenticatedCipherText authenticatedCipherTextEncryptAuthenticated;
        if (bArr2 == null) {
            return encrypt(jWEHeader, bArr, AAD.compute(jWEHeader), secretKey, base64URL, jWEJCAContext);
        }
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        byte[] bArrApplyCompression = DeflateHelper.applyCompression(jWEHeader, bArr);
        if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) && !jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
                Container container = new Container(AESGCM.generateIV(jWEJCAContext.getSecureRandom()));
                authenticatedCipherTextEncryptAuthenticated = AESGCM.encrypt(secretKey, container, bArrApplyCompression, bArr2, jWEJCAContext.getContentEncryptionProvider());
                bArrGenerateIV = (byte[]) container.get();
            } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                byte[] bArrGenerateIV2 = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
                authenticatedCipherTextEncryptAuthenticated = AESCBC.encryptWithConcatKDF(jWEHeader, secretKey, base64URL, bArrGenerateIV2, bArrApplyCompression, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
                bArrGenerateIV = bArrGenerateIV2;
            } else {
                if (!jWEHeader.getEncryptionMethod().equals(EncryptionMethod.XC20P)) {
                    throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
                }
                Container container2 = new Container(null);
                authenticatedCipherTextEncryptAuthenticated = XC20P.encryptAuthenticated(secretKey, container2, bArrApplyCompression, bArr2);
                bArrGenerateIV = (byte[]) container2.get();
            }
            return new JWECryptoParts(jWEHeader, base64URL, Base64URL.encode(bArrGenerateIV), Base64URL.encode(authenticatedCipherTextEncryptAuthenticated.getCipherText()), Base64URL.encode(authenticatedCipherTextEncryptAuthenticated.getAuthenticationTag()));
        }
        bArrGenerateIV = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
        authenticatedCipherTextEncryptAuthenticated = AESCBC.encryptAuthenticated(secretKey, bArrGenerateIV, bArrApplyCompression, bArr2, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        jWEHeader = jWEHeader;
        return new JWECryptoParts(jWEHeader, base64URL, Base64URL.encode(bArrGenerateIV), Base64URL.encode(authenticatedCipherTextEncryptAuthenticated.getCipherText()), Base64URL.encode(authenticatedCipherTextEncryptAuthenticated.getAuthenticationTag()));
    }

    public static SecretKey generateCEK(EncryptionMethod encryptionMethod, SecureRandom secureRandom) throws JOSEException {
        Set<EncryptionMethod> set = SUPPORTED_ENCRYPTION_METHODS;
        if (!set.contains(encryptionMethod)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(encryptionMethod, set));
        }
        byte[] bArr = new byte[ByteUtils.byteLength(encryptionMethod.cekBitLength())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }

    public static byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) {
        return decrypt(jWEHeader, null, base64URL, base64URL2, base64URL3, base64URL4, secretKey, jWEJCAContext);
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) {
        return encrypt(jWEHeader, bArr, null, secretKey, base64URL, jWEJCAContext);
    }
}
