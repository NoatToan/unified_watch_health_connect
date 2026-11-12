package com.nimbusds.jose.jwk.gen;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.RSAKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class RSAKeyGenerator extends JWKGenerator<RSAKey> {
    public static final int MIN_KEY_SIZE_BITS = 2048;
    private final int size;

    public RSAKeyGenerator(int i14, boolean z14) {
        if (z14 || i14 >= 2048) {
            this.size = i14;
        } else {
            h.s("The key size must be at least 2048 bits");
            throw null;
        }
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public RSAKey generate() throws JOSEException {
        KeyPairGenerator keyPairGenerator;
        try {
            KeyStore keyStore = this.keyStore;
            if (keyStore != null) {
                keyPairGenerator = KeyPairGenerator.getInstance("RSA", keyStore.getProvider());
            } else {
                Provider provider = this.provider;
                keyPairGenerator = provider != null ? KeyPairGenerator.getInstance("RSA", provider) : KeyPairGenerator.getInstance("RSA");
            }
            SecureRandom secureRandom = this.secureRandom;
            int i14 = this.size;
            if (secureRandom != null) {
                keyPairGenerator.initialize(i14, secureRandom);
            } else {
                keyPairGenerator.initialize(i14);
            }
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            RSAKey.Builder builderKeyStore = new RSAKey.Builder((RSAPublicKey) keyPairGenerateKeyPair.getPublic()).privateKey(keyPairGenerateKeyPair.getPrivate()).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).expirationTime(this.exp).notBeforeTime(this.nbf).issueTime(this.iat).keyStore(this.keyStore);
            if (this.tprKid) {
                builderKeyStore.keyIDFromThumbprint();
            } else {
                builderKeyStore.keyID(this.kid);
            }
            return builderKeyStore.build();
        } catch (NoSuchAlgorithmException e4) {
            throw new JOSEException(e4.getMessage(), e4);
        }
    }

    public RSAKeyGenerator(int i14) {
        this(i14, false);
    }
}
