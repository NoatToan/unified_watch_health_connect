package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.crypto.impl.HMAC;
import com.nimbusds.jose.crypto.impl.MACProvider;
import com.nimbusds.jose.jwk.OctetSequenceKey;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class MACSigner extends MACProvider implements JWSSigner {
    public MACSigner(String str) {
        this(str.getBytes(StandardCharset.UTF_8));
    }

    @Override // com.nimbusds.jose.JWSSigner
    public Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws KeyLengthException {
        ensureSecretLengthSatisfiesAlgorithm(jWSHeader.getAlgorithm());
        return Base64URL.encode(HMAC.compute(MACProvider.getJCAAlgorithmName(jWSHeader.getAlgorithm()), getSecretKey(), bArr, getJCAContext().getProvider()));
    }

    public MACSigner(byte[] bArr) {
        super(bArr);
    }

    public MACSigner(SecretKey secretKey) {
        super(secretKey);
    }

    public MACSigner(OctetSequenceKey octetSequenceKey) {
        this(octetSequenceKey.toByteArray());
    }
}
