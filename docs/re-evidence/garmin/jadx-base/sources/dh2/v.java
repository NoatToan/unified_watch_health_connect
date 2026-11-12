package dh2;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes11.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f59673a;

    public v(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        this.f59673a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    public static String a(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i14 = 0; i14 < bArr.length; i14++) {
            byte b14 = bArr[i14];
            int i15 = i14 * 2;
            cArr[i15] = charArray[(b14 & UnsignedBytes.MAX_VALUE) >>> 4];
            cArr[i15 + 1] = charArray[b14 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static byte[] d(String str) {
        String upperCase = str.toUpperCase();
        int length = upperCase.length();
        byte[] bArr = new byte[length / 2];
        for (int i14 = 0; i14 < length; i14 += 2) {
            bArr[i14 / 2] = (byte) (Character.digit(upperCase.charAt(i14 + 1), 16) + (Character.digit(upperCase.charAt(i14), 16) << 4));
        }
        return bArr;
    }

    public byte[] b() {
        return this.f59673a;
    }

    public abstract int c(boolean z14);

    public v(boolean z14) {
        this.f59673a = new byte[c(z14)];
    }
}
