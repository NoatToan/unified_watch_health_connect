package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MACProvider extends BaseJWSProvider {
    public static final Set<JWSAlgorithm> SUPPORTED_ALGORITHMS;
    private final byte[] secret;
    private final SecretKey secretKey;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.HS256);
        linkedHashSet.add(JWSAlgorithm.HS384);
        linkedHashSet.add(JWSAlgorithm.HS512);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    public MACProvider(SecretKey secretKey) throws KeyLengthException {
        super(secretKey.getEncoded() != null ? getCompatibleAlgorithms(ByteUtils.bitLength(secretKey.getEncoded())) : SUPPORTED_ALGORITHMS);
        if (secretKey.getEncoded() != null && ByteUtils.bitLength(secretKey.getEncoded()) < 256) {
            throw new KeyLengthException("The secret length must be at least 256 bits");
        }
        this.secretKey = secretKey;
        this.secret = null;
    }

    public static Set<JWSAlgorithm> getCompatibleAlgorithms(int i14) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i14 >= 256) {
            linkedHashSet.add(JWSAlgorithm.HS256);
        }
        if (i14 >= 384) {
            linkedHashSet.add(JWSAlgorithm.HS384);
        }
        if (i14 >= 512) {
            linkedHashSet.add(JWSAlgorithm.HS512);
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static String getJCAAlgorithmName(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (jWSAlgorithm.equals(JWSAlgorithm.HS256)) {
            return "HMACSHA256";
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.HS384)) {
            return "HMACSHA384";
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.HS512)) {
            return "HMACSHA512";
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, SUPPORTED_ALGORITHMS));
    }

    public static int getMinRequiredSecretLength(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (JWSAlgorithm.HS256.equals(jWSAlgorithm)) {
            return 256;
        }
        if (JWSAlgorithm.HS384.equals(jWSAlgorithm)) {
            return 384;
        }
        if (JWSAlgorithm.HS512.equals(jWSAlgorithm)) {
            return 512;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, SUPPORTED_ALGORITHMS));
    }

    public void ensureSecretLengthSatisfiesAlgorithm(JWSAlgorithm jWSAlgorithm) throws KeyLengthException {
        int minRequiredSecretLength;
        if (getSecret() != null && ByteUtils.bitLength(getSecret()) < (minRequiredSecretLength = getMinRequiredSecretLength(jWSAlgorithm))) {
            throw new KeyLengthException("The secret length for " + jWSAlgorithm + " must be at least " + minRequiredSecretLength + " bits");
        }
    }

    public byte[] getSecret() {
        SecretKey secretKey = this.secretKey;
        if (secretKey != null) {
            return secretKey.getEncoded();
        }
        byte[] bArr = this.secret;
        if (bArr != null) {
            return bArr;
        }
        h.z("Unexpected state");
        return null;
    }

    public SecretKey getSecretKey() {
        SecretKey secretKey = this.secretKey;
        if (secretKey != null) {
            return secretKey;
        }
        if (this.secret != null) {
            return new SecretKeySpec(this.secret, "MAC");
        }
        h.z("Unexpected state");
        return null;
    }

    public String getSecretString() {
        byte[] secret = getSecret();
        if (secret == null) {
            return null;
        }
        return new String(secret, StandardCharset.UTF_8);
    }

    public MACProvider(byte[] bArr) throws KeyLengthException {
        super(getCompatibleAlgorithms(ByteUtils.bitLength(bArr.length)));
        if (ByteUtils.bitLength(bArr) >= 256) {
            this.secret = bArr;
            this.secretKey = null;
            return;
        }
        throw new KeyLengthException("The secret length must be at least 256 bits");
    }
}
