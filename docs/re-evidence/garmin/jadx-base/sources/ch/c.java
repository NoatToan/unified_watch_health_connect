package ch;

import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static byte[] a(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int i14 = blockSize * 2;
        byte[] bArr = new byte[i14];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int i15 = 1; i15 < i14; i15++) {
            byte bCodePointAt = (byte) (str.codePointAt(i15 % str.length()) & 127);
            bArr[i15] = bCodePointAt;
            if (i15 >= blockSize) {
                bArr[i15] = (byte) (bArr[0] & bCodePointAt);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }
}
