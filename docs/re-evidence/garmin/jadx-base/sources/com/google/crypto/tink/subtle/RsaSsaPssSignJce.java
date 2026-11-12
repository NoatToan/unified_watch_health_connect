package com.google.crypto.tink.subtle;

import am.j;
import com.google.android.gms.internal.measurement.a;
import com.google.crypto.tink.PublicKeySign;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import kg.f;

/* JADX INFO: loaded from: classes2.dex */
public final class RsaSsaPssSignJce implements PublicKeySign {
    private static final String RAW_RSA_ALGORITHM = "RSA/ECB/NOPADDING";
    private final Enums.HashType mgf1Hash;
    private final RSAPrivateCrtKey privateKey;
    private final RSAPublicKey publicKey;
    private final int saltLength;
    private final Enums.HashType sigHash;

    public RsaSsaPssSignJce(RSAPrivateCrtKey rSAPrivateCrtKey, Enums.HashType hashType, Enums.HashType hashType2, int i14) throws GeneralSecurityException {
        Validators.validateSignatureHash(hashType);
        Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.privateKey = rSAPrivateCrtKey;
        this.publicKey = (RSAPublicKey) EngineFactory.KEY_FACTORY.getInstance("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.sigHash = hashType;
        this.mgf1Hash = hashType2;
        this.saltLength = i14;
    }

    private byte[] emsaPssEncode(byte[] bArr, int i14) throws GeneralSecurityException {
        Validators.validateSignatureHash(this.sigHash);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance(SubtleUtil.toDigestAlgo(this.sigHash));
        byte[] bArrDigest = engineFactory.digest(bArr);
        int digestLength = engineFactory.getDigestLength();
        int i15 = 1;
        int iA = j.a(i14, 1, 8, 1);
        int i16 = this.saltLength;
        if (iA < digestLength + i16 + 2) {
            a.t("encoding error");
            return null;
        }
        byte[] bArrRandBytes = Random.randBytes(i16);
        int i17 = digestLength + 8;
        byte[] bArr2 = new byte[this.saltLength + i17];
        System.arraycopy(bArrDigest, 0, bArr2, 8, digestLength);
        System.arraycopy(bArrRandBytes, 0, bArr2, i17, bArrRandBytes.length);
        byte[] bArrDigest2 = engineFactory.digest(bArr2);
        int i18 = (iA - digestLength) - 1;
        byte[] bArr3 = new byte[i18];
        int i19 = this.saltLength;
        bArr3[((iA - i19) - digestLength) - 2] = 1;
        System.arraycopy(bArrRandBytes, 0, bArr3, ((iA - i19) - digestLength) - 1, bArrRandBytes.length);
        byte[] bArrMgf1 = SubtleUtil.mgf1(bArrDigest2, i18, this.mgf1Hash);
        byte[] bArr4 = new byte[i18];
        for (int i24 = 0; i24 < i18; i24++) {
            bArr4[i24] = (byte) (bArr3[i24] ^ bArrMgf1[i24]);
        }
        int i25 = 0;
        while (true) {
            int i26 = i15;
            int i27 = i25;
            if (i25 >= (((long) iA) * 8) - ((long) i14)) {
                int i28 = digestLength + i18;
                byte[] bArr5 = new byte[i28 + 1];
                System.arraycopy(bArr4, 0, bArr5, 0, i18);
                System.arraycopy(bArrDigest2, 0, bArr5, i18, bArrDigest2.length);
                bArr5[i28] = -68;
                return bArr5;
            }
            int i29 = i27 / 8;
            bArr4[i29] = (byte) ((~(i26 << (7 - (i27 % 8)))) & bArr4[i29]);
            i25 = i27 + 1;
            i15 = i26;
        }
    }

    private byte[] rsasp1(byte[] bArr) throws GeneralSecurityException {
        EngineFactory<EngineWrapper.TCipher, Cipher> engineFactory = EngineFactory.CIPHER;
        Cipher engineFactory2 = engineFactory.getInstance(RAW_RSA_ALGORITHM);
        engineFactory2.init(2, this.privateKey);
        byte[] bArrDoFinal = engineFactory2.doFinal(bArr);
        Cipher engineFactory3 = engineFactory.getInstance(RAW_RSA_ALGORITHM);
        engineFactory3.init(1, this.publicKey);
        if (new BigInteger(1, bArr).equals(new BigInteger(1, engineFactory3.doFinal(bArrDoFinal)))) {
            return bArrDoFinal;
        }
        f.n("Security bug: RSA signature computation error");
        return null;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public byte[] sign(byte[] bArr) {
        return rsasp1(emsaPssEncode(bArr, this.publicKey.getModulus().bitLength() - 1));
    }
}
