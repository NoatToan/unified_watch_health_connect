package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.PublicKeyVerify;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public final class EcdsaVerifyJce implements PublicKeyVerify {
    private final EllipticCurves.EcdsaEncoding encoding;
    private final ECPublicKey publicKey;
    private final String signatureAlgorithm;

    public EcdsaVerifyJce(ECPublicKey eCPublicKey, Enums.HashType hashType, EllipticCurves.EcdsaEncoding ecdsaEncoding) throws GeneralSecurityException {
        EllipticCurves.checkPublicKey(eCPublicKey);
        this.signatureAlgorithm = SubtleUtil.toEcdsaAlgo(hashType);
        this.publicKey = eCPublicKey;
        this.encoding = ecdsaEncoding;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.encoding == EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            if (bArr.length != EllipticCurves.fieldSizeInBytes(this.publicKey.getParams().getCurve()) * 2) {
                a.t("Invalid signature");
                return;
            }
            bArr = EllipticCurves.ecdsaIeee2Der(bArr);
        }
        if (!EllipticCurves.isValidDerEncoding(bArr)) {
            a.t("Invalid signature");
            return;
        }
        Signature engineFactory = EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
        engineFactory.initVerify(this.publicKey);
        engineFactory.update(bArr2);
        try {
            zVerify = engineFactory.verify(bArr);
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (zVerify) {
            return;
        }
        a.t("Invalid signature");
    }
}
