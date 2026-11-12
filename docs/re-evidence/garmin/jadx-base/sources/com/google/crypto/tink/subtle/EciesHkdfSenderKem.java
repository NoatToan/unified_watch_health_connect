package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public final class EciesHkdfSenderKem {
    private ECPublicKey recipientPublicKey;

    public static final class KemKey {
        private final ImmutableByteArray kemBytes;
        private final ImmutableByteArray symmetricKey;

        public KemKey(byte[] bArr, byte[] bArr2) {
            this.kemBytes = ImmutableByteArray.of(bArr);
            this.symmetricKey = ImmutableByteArray.of(bArr2);
        }

        public byte[] getKemBytes() {
            ImmutableByteArray immutableByteArray = this.kemBytes;
            if (immutableByteArray == null) {
                return null;
            }
            return immutableByteArray.getBytes();
        }

        public byte[] getSymmetricKey() {
            ImmutableByteArray immutableByteArray = this.symmetricKey;
            if (immutableByteArray == null) {
                return null;
            }
            return immutableByteArray.getBytes();
        }
    }

    public EciesHkdfSenderKem(ECPublicKey eCPublicKey) {
        this.recipientPublicKey = eCPublicKey;
    }

    public KemKey generateKey(String str, byte[] bArr, byte[] bArr2, int i14, EllipticCurves.PointFormatType pointFormatType) throws GeneralSecurityException {
        KeyPair keyPairGenerateKeyPair = EllipticCurves.generateKeyPair(this.recipientPublicKey.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        byte[] bArrComputeSharedSecret = EllipticCurves.computeSharedSecret((ECPrivateKey) keyPairGenerateKeyPair.getPrivate(), this.recipientPublicKey);
        byte[] bArrPointEncode = EllipticCurves.pointEncode(eCPublicKey.getParams().getCurve(), pointFormatType, eCPublicKey.getW());
        return new KemKey(bArrPointEncode, Hkdf.computeEciesHkdfSymmetricKey(bArrPointEncode, bArrComputeSharedSecret, str, bArr, bArr2, i14));
    }
}
