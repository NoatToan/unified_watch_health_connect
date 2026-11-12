package com.google.crypto.tink.subtle;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
public final class PrfAesCmac implements Prf {
    private final SecretKey keySpec;
    private byte[] subKey1;
    private byte[] subKey2;

    public PrfAesCmac(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Validators.validateAesKeySize(bArr.length);
        this.keySpec = new SecretKeySpec(bArr, "AES");
        generateSubKeys();
    }

    private void generateSubKeys() throws InvalidKeyException {
        Cipher cipherInstance = instance();
        cipherInstance.init(1, this.keySpec);
        byte[] bArrDbl = AesUtil.dbl(cipherInstance.doFinal(new byte[16]));
        this.subKey1 = bArrDbl;
        this.subKey2 = AesUtil.dbl(bArrDbl);
    }

    private static Cipher instance() {
        return EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i14) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i14 > 16) {
            e.t("outputLength too large, max is 16 bytes");
            return null;
        }
        Cipher cipherInstance = instance();
        cipherInstance.init(1, this.keySpec);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrXor = iMax * 16 == bArr.length ? Bytes.xor(bArr, (iMax - 1) * 16, this.subKey1, 0, 16) : Bytes.xor(AesUtil.cmacPad(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.subKey2);
        byte[] bArrDoFinal = new byte[16];
        for (int i15 = 0; i15 < iMax - 1; i15++) {
            bArrDoFinal = cipherInstance.doFinal(Bytes.xor(bArrDoFinal, 0, bArr, i15 * 16, 16));
        }
        return Arrays.copyOf(cipherInstance.doFinal(Bytes.xor(bArrXor, bArrDoFinal)), i14);
    }
}
