package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes2.dex */
public final class EcdsaSignJce implements PublicKeySign {
    private final EllipticCurves.EcdsaEncoding encoding;
    private final ECPrivateKey privateKey;
    private final String signatureAlgorithm;

    public EcdsaSignJce(ECPrivateKey eCPrivateKey, Enums.HashType hashType, EllipticCurves.EcdsaEncoding ecdsaEncoding) {
        this.privateKey = eCPrivateKey;
        this.signatureAlgorithm = SubtleUtil.toEcdsaAlgo(hashType);
        this.encoding = ecdsaEncoding;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) throws GeneralSecurityException {
        Signature engineFactory = EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
        engineFactory.initSign(this.privateKey);
        engineFactory.update(bArr);
        byte[] bArrSign = engineFactory.sign();
        return this.encoding == EllipticCurves.EcdsaEncoding.IEEE_P1363 ? EllipticCurves.ecdsaDer2Ieee(bArrSign, EllipticCurves.fieldSizeInBytes(this.privateKey.getParams().getCurve()) * 2) : bArrSign;
    }
}
