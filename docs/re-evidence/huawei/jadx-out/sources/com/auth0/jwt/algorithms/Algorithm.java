package com.auth0.jwt.algorithms;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.ECDSAKeyProvider;
import com.auth0.jwt.interfaces.RSAKeyProvider;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import defpackage.qs;
import defpackage.qu;
import defpackage.qv;
import defpackage.qz;
import defpackage.rc;
import defpackage.rg;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Algorithm {
    private final String description;
    private final String name;

    public String getSigningKeyId() {
        return null;
    }

    public abstract byte[] sign(byte[] bArr) throws rg;

    public abstract void verify(DecodedJWT decodedJWT) throws rc;

    public static Algorithm RSA256(RSAKeyProvider rSAKeyProvider) throws IllegalArgumentException {
        return new qz(CommonPickerConstant.IdTokenSupportAlg.RS_256, "SHA256withRSA", rSAKeyProvider);
    }

    public static Algorithm RSA256(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey) throws IllegalArgumentException {
        return RSA256(qz.e(rSAPublicKey, rSAPrivateKey));
    }

    public static Algorithm RSA256(RSAKey rSAKey) throws IllegalArgumentException {
        return RSA256(rSAKey instanceof RSAPublicKey ? (RSAPublicKey) rSAKey : null, rSAKey instanceof RSAPrivateKey ? (RSAPrivateKey) rSAKey : null);
    }

    public static Algorithm RSA384(RSAKeyProvider rSAKeyProvider) throws IllegalArgumentException {
        return new qz("RS384", "SHA384withRSA", rSAKeyProvider);
    }

    public static Algorithm RSA384(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey) throws IllegalArgumentException {
        return RSA384(qz.e(rSAPublicKey, rSAPrivateKey));
    }

    public static Algorithm RSA384(RSAKey rSAKey) throws IllegalArgumentException {
        return RSA384(rSAKey instanceof RSAPublicKey ? (RSAPublicKey) rSAKey : null, rSAKey instanceof RSAPrivateKey ? (RSAPrivateKey) rSAKey : null);
    }

    public static Algorithm RSA512(RSAKeyProvider rSAKeyProvider) throws IllegalArgumentException {
        return new qz("RS512", "SHA512withRSA", rSAKeyProvider);
    }

    public static Algorithm RSA512(RSAPublicKey rSAPublicKey, RSAPrivateKey rSAPrivateKey) throws IllegalArgumentException {
        return RSA512(qz.e(rSAPublicKey, rSAPrivateKey));
    }

    public static Algorithm RSA512(RSAKey rSAKey) throws IllegalArgumentException {
        return RSA512(rSAKey instanceof RSAPublicKey ? (RSAPublicKey) rSAKey : null, rSAKey instanceof RSAPrivateKey ? (RSAPrivateKey) rSAKey : null);
    }

    public static Algorithm HMAC256(String str) throws IllegalArgumentException {
        return new qs("HS256", "HmacSHA256", str);
    }

    public static Algorithm HMAC256(byte[] bArr) throws IllegalArgumentException {
        return new qs("HS256", "HmacSHA256", bArr);
    }

    public static Algorithm HMAC384(String str) throws IllegalArgumentException {
        return new qs("HS384", "HmacSHA384", str);
    }

    public static Algorithm HMAC384(byte[] bArr) throws IllegalArgumentException {
        return new qs("HS384", "HmacSHA384", bArr);
    }

    public static Algorithm HMAC512(String str) throws IllegalArgumentException {
        return new qs("HS512", "HmacSHA512", str);
    }

    public static Algorithm HMAC512(byte[] bArr) throws IllegalArgumentException {
        return new qs("HS512", "HmacSHA512", bArr);
    }

    public static Algorithm ECDSA256(ECDSAKeyProvider eCDSAKeyProvider) throws IllegalArgumentException {
        return new qv("ES256", "SHA256withECDSA", 32, eCDSAKeyProvider);
    }

    public static Algorithm ECDSA256(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws IllegalArgumentException {
        return ECDSA256(qv.c(eCPublicKey, eCPrivateKey));
    }

    public static Algorithm ECDSA256(ECKey eCKey) throws IllegalArgumentException {
        return ECDSA256(eCKey instanceof ECPublicKey ? (ECPublicKey) eCKey : null, eCKey instanceof ECPrivateKey ? (ECPrivateKey) eCKey : null);
    }

    public static Algorithm ECDSA384(ECDSAKeyProvider eCDSAKeyProvider) throws IllegalArgumentException {
        return new qv("ES384", "SHA384withECDSA", 48, eCDSAKeyProvider);
    }

    public static Algorithm ECDSA384(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws IllegalArgumentException {
        return ECDSA384(qv.c(eCPublicKey, eCPrivateKey));
    }

    public static Algorithm ECDSA384(ECKey eCKey) throws IllegalArgumentException {
        return ECDSA384(eCKey instanceof ECPublicKey ? (ECPublicKey) eCKey : null, eCKey instanceof ECPrivateKey ? (ECPrivateKey) eCKey : null);
    }

    public static Algorithm ECDSA512(ECDSAKeyProvider eCDSAKeyProvider) throws IllegalArgumentException {
        return new qv("ES512", "SHA512withECDSA", 66, eCDSAKeyProvider);
    }

    public static Algorithm ECDSA512(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws IllegalArgumentException {
        return ECDSA512(qv.c(eCPublicKey, eCPrivateKey));
    }

    public static Algorithm ECDSA512(ECKey eCKey) throws IllegalArgumentException {
        return ECDSA512(eCKey instanceof ECPublicKey ? (ECPublicKey) eCKey : null, eCKey instanceof ECPrivateKey ? (ECPrivateKey) eCKey : null);
    }

    public static Algorithm none() {
        return new qu();
    }

    public Algorithm(String str, String str2) {
        this.name = str;
        this.description = str2;
    }

    public String getName() {
        return this.name;
    }

    protected String getDescription() {
        return this.description;
    }

    public String toString() {
        return this.description;
    }

    public byte[] sign(byte[] bArr, byte[] bArr2) throws rg {
        byte[] bArr3 = new byte[bArr.length + 1 + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = 46;
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        return sign(bArr3);
    }
}
