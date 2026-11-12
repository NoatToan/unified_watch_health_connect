package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.PublicKeyVerify;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes2.dex */
public final class RsaSsaPkcs1VerifyJce implements PublicKeyVerify {
    private static final String ASN_PREFIX_SHA256 = "3031300d060960864801650304020105000420";
    private static final String ASN_PREFIX_SHA512 = "3051300d060960864801650304020305000440";
    private final Enums.HashType hash;
    private final RSAPublicKey publicKey;

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RsaSsaPkcs1VerifyJce(RSAPublicKey rSAPublicKey, Enums.HashType hashType) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.publicKey = rSAPublicKey;
        this.hash = hashType;
    }

    private byte[] emsaPkcs1(byte[] bArr, int i14, Enums.HashType hashType) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.hash));
        engineFactory.update(bArr);
        byte[] bArrDigest = engineFactory.digest();
        byte[] asnPrefix = toAsnPrefix(hashType);
        int length = asnPrefix.length + bArrDigest.length;
        if (i14 < length + 11) {
            a.t("intended encoded message length too short");
            return null;
        }
        byte[] bArr2 = new byte[i14];
        bArr2[0] = 0;
        bArr2[1] = 1;
        int i15 = 2;
        int i16 = 0;
        while (i16 < (i14 - length) - 3) {
            bArr2[i15] = -1;
            i16++;
            i15++;
        }
        int i17 = i15 + 1;
        bArr2[i15] = 0;
        System.arraycopy(asnPrefix, 0, bArr2, i17, asnPrefix.length);
        System.arraycopy(bArrDigest, 0, bArr2, i17 + asnPrefix.length, bArrDigest.length);
        return bArr2;
    }

    private byte[] toAsnPrefix(Enums.HashType hashType) throws GeneralSecurityException {
        int i14 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i14 == 1) {
            return Hex.decode(ASN_PREFIX_SHA256);
        }
        if (i14 == 2) {
            return Hex.decode(ASN_PREFIX_SHA512);
        }
        a.k(hashType, "Unsupported hash ");
        return null;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        BigInteger publicExponent = this.publicKey.getPublicExponent();
        BigInteger modulus = this.publicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            a.t("invalid signature's length");
            return;
        }
        BigInteger bigIntegerBytes2Integer = SubtleUtil.bytes2Integer(bArr);
        if (bigIntegerBytes2Integer.compareTo(modulus) >= 0) {
            a.t("signature out of range");
        } else {
            if (Bytes.equal(SubtleUtil.integer2Bytes(bigIntegerBytes2Integer.modPow(publicExponent, modulus), iBitLength), emsaPkcs1(bArr2, iBitLength, this.hash))) {
                return;
            }
            a.t("invalid signature");
        }
    }
}
