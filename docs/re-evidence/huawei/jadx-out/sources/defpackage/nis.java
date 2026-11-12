package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes38.dex */
public final class nis {
    public static byte[] d(String str) {
        if (str == null) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (int i = 0; i < length; i++) {
            char cCharAt = upperCase.charAt(i);
            if (('0' > cCharAt || cCharAt > '9') && ('A' > cCharAt || cCharAt > 'F')) {
                return new byte[0];
            }
        }
        int i2 = length / 2;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            bArr2[0] = (byte) upperCase.charAt(i4);
            int i5 = i4 + 2;
            bArr2[1] = (byte) upperCase.charAt(i4 + 1);
            for (int i6 = 0; i6 < 2; i6++) {
                byte b2 = bArr2[i6];
                if (65 <= b2 && b2 <= 70) {
                    bArr2[i6] = (byte) (b2 - 55);
                } else {
                    bArr2[i6] = (byte) (b2 - 48);
                }
            }
            bArr[i3] = (byte) ((bArr2[0] << 4) | bArr2[1]);
            i3++;
            i4 = i5;
        }
        return bArr;
    }
}
