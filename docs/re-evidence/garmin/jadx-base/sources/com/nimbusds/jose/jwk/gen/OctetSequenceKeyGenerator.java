package com.nimbusds.jose.jwk.gen;

import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.SecureRandom;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class OctetSequenceKeyGenerator extends JWKGenerator<OctetSequenceKey> {
    public static final int MIN_KEY_SIZE_BITS = 112;
    private final int size;

    public OctetSequenceKeyGenerator(int i14) {
        if (i14 < 112) {
            h.s("The key size must be at least 112 bits");
            throw null;
        }
        if (i14 % 8 == 0) {
            this.size = i14;
        } else {
            h.s("The key size in bits must be divisible by 8");
            throw null;
        }
    }

    @Override // com.nimbusds.jose.jwk.gen.JWKGenerator
    public OctetSequenceKey generate() {
        byte[] bArr = new byte[this.size / 8];
        SecureRandom secureRandom = this.secureRandom;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        } else {
            new SecureRandom().nextBytes(bArr);
        }
        OctetSequenceKey.Builder builderKeyStore = new OctetSequenceKey.Builder(Base64URL.encode(bArr)).keyUse(this.use).keyOperations(this.ops).algorithm(this.alg).expirationTime(this.exp).notBeforeTime(this.nbf).issueTime(this.iat).keyStore(this.keyStore);
        if (this.tprKid) {
            builderKeyStore.keyIDFromThumbprint();
        } else {
            builderKeyStore.keyID(this.kid);
        }
        return builderKeyStore.build();
    }
}
