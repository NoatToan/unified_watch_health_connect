package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.PublicKeyVerify;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class RsaSsaPssVerifyJce implements PublicKeyVerify {
    private final Enums.HashType mgf1Hash;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssVerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType, Enums.HashType hashType2, int i14) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.publicKey = rSAPublicKey;
        this.sigHash = hashType;
        this.mgf1Hash = hashType2;
        this.saltLength = i14;
    }

    private void emsaPssVerify(byte[] bArr, byte[] bArr2, int i14) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] bArrDigest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int length = bArr2.length;
        if (length < this.saltLength + digestLength + 2) {
            a.t("inconsistent");
            return;
        }
        byte b14 = 1;
        if (bArr2[bArr2.length - 1] != -68) {
            a.t("inconsistent");
            return;
        }
        int i15 = length - digestLength;
        int i16 = i15 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i16);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArrCopyOf.length, bArrCopyOf.length + digestLength);
        int i17 = 0;
        while (true) {
            int i18 = i17;
            byte b15 = b14;
            int i19 = i16;
            long j8 = (((long) length) * 8) - ((long) i14);
            if (i17 < j8) {
                if (((bArrCopyOf[i18 / 8] >> (7 - (i18 % 8))) & 1) != 0) {
                    a.t("inconsistent");
                    return;
                } else {
                    i17 = i18 + 1;
                    b14 = b15;
                    i16 = i19;
                }
            } else {
                byte[] bArrMgf1 = SubtleUtil.mgf1(bArrCopyOfRange, i19, this.mgf1Hash);
                int length2 = bArrMgf1.length;
                byte[] bArr3 = new byte[length2];
                for (int i24 = 0; i24 < length2; i24++) {
                    bArr3[i24] = (byte) (bArrMgf1[i24] ^ bArrCopyOf[i24]);
                }
                for (int i25 = 0; i25 <= j8; i25++) {
                    int i26 = i25 / 8;
                    bArr3[i26] = (byte) ((~(b15 << (7 - (i25 % 8)))) & bArr3[i26]);
                }
                int i27 = 0;
                while (true) {
                    int i28 = this.saltLength;
                    if (i27 >= (i15 - i28) - 2) {
                        if (bArr3[(i15 - i28) - 2] != b15) {
                            a.t("inconsistent");
                            return;
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr3, length2 - i28, length2);
                        int i29 = digestLength + 8;
                        byte[] bArr4 = new byte[this.saltLength + i29];
                        System.arraycopy(bArrDigest, 0, bArr4, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr4, i29, bArrCopyOfRange2.length);
                        if (Bytes.equal(engineFactory.digest(bArr4), bArrCopyOfRange)) {
                            return;
                        }
                        a.t("inconsistent");
                        return;
                    }
                    if (bArr3[i27] != 0) {
                        a.t("inconsistent");
                        return;
                    }
                    i27++;
                }
            }
        }
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        int iBitLength2 = (modulus.bitLength() + 6) / 8;
        if (iBitLength != bArr.length) {
            a.t("invalid signature's length");
            return;
        }
        BigInteger bigIntegerBytes2Integer = SubtleUtil.bytes2Integer(bArr);
        if (bigIntegerBytes2Integer.compareTo(modulus) < 0) {
            emsaPssVerify(bArr2, SubtleUtil.integer2Bytes(bigIntegerBytes2Integer.modPow(publicExponent, modulus), iBitLength2), modulus.bitLength() - 1);
        } else {
            a.t("signature out of range");
        }
    }
}
