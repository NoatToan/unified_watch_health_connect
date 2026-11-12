package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import kg.f;

/* JADX INFO: loaded from: classes2.dex */
public final class RsaSsaPkcs1SignJce implements PublicKeySign {
    private final RSAPrivateCrtKey privateKey;
    private final RSAPublicKey publicKey;
    private final String signatureAlgorithm;

    public RsaSsaPkcs1SignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.privateKey = rSAPrivateCrtKey;
        this.signatureAlgorithm = SubtleUtil.toRsaSsaPkcs1Algo(hashType);
        this.publicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) throws GeneralSecurityException {
        EngineFactory<EngineWrapper.TSignature, Signature> engineFactory = EngineFactory.SIGNATURE;
        Signature engineFactory2 = engineFactory.getInstance(this.signatureAlgorithm);
        engineFactory2.initSign(this.privateKey);
        engineFactory2.update(bArr);
        byte[] bArrSign = engineFactory2.sign();
        Signature engineFactory3 = engineFactory.getInstance(this.signatureAlgorithm);
        engineFactory3.initVerify(this.publicKey);
        engineFactory3.update(bArr);
        if (engineFactory3.verify(bArrSign)) {
            return bArrSign;
        }
        f.n("Security bug: RSA signature computation error");
        return null;
    }
}
