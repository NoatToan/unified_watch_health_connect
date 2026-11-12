package defpackage;

import com.nimbusds.jose.util.IntegerOverflowException;

/* JADX INFO: loaded from: classes6.dex */
public class y73 {
    public static int a(int i) {
        return i * 8;
    }

    public static int b(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return a(bArr.length);
    }

    public static int c(int i) {
        return i / 8;
    }

    public static int d(int i) throws IntegerOverflowException {
        long j = ((long) i) * 8;
        int i2 = (int) j;
        if (i2 == j) {
            return i2;
        }
        throw new IntegerOverflowException();
    }

    public static int e(byte[] bArr) throws IntegerOverflowException {
        if (bArr == null) {
            return 0;
        }
        return d(bArr.length);
    }

    public static byte[] f(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
