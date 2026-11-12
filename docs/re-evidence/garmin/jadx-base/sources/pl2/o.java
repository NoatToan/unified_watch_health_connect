package pl2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes11.dex */
public class o {
    public static int a(int i14, byte[] bArr) {
        int i15 = 0;
        while (i14 <= bArr.length) {
            i15++;
            if ((bArr[i14] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return i15;
            }
            i14++;
        }
        return i15;
    }

    public static int b(int i14, byte[] bArr) {
        int i15 = 0;
        byte b14 = -128;
        int i16 = 0;
        while (i14 <= bArr.length) {
            b14 = bArr[i14];
            if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                break;
            }
            i15 |= (b14 & Ascii.DEL) << i16;
            i16 += 7;
            if (i16 > 35) {
                vb.h.s("Variable length quantity is too long");
                return 0;
            }
            i14++;
        }
        return (b14 << i16) | i15;
    }

    public static byte[] c(int i14) {
        byte[] bArr = new byte[10];
        int i15 = 0;
        while ((i14 & (-128)) != 0) {
            bArr[i15] = (byte) ((i14 & 127) | 128);
            i14 >>>= 7;
            i15++;
        }
        bArr[i15] = (byte) (i14 & 127);
        byte[] bArr2 = new byte[i15 + 1];
        while (i15 >= 0) {
            bArr2[i15] = bArr[i15];
            i15--;
        }
        return bArr2;
    }
}
