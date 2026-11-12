package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class p8i {
    public static boolean a(char[] cArr, char c) {
        return b(cArr, c) > -1;
    }

    public static int b(char[] cArr, char c) {
        if (cArr == null) {
            return -1;
        }
        for (int i = 0; i < cArr.length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean c(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean d(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    public static boolean e(byte[] bArr) {
        return !c(bArr);
    }

    public static Object f(Object obj, int i) throws IllegalArgumentException {
        if (obj == null) {
            return null;
        }
        int length = Array.getLength(obj);
        if (i < 0 || i >= length) {
            return obj;
        }
        int i2 = length - 1;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), i2);
        System.arraycopy(obj, 0, objNewInstance, 0, i);
        if (i < i2) {
            System.arraycopy(obj, i + 1, objNewInstance, i, (length - i) - 1);
        }
        return objNewInstance;
    }

    public static byte[] g(byte[] bArr, int i) {
        if (i < 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        if (i > 0 && e(bArr)) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        }
        return bArr2;
    }

    public static byte[] h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static byte[] i(byte[] bArr, int i, int i2) {
        if (c(bArr)) {
            return bArr;
        }
        int iMin = Math.min(bArr.length, i2) - 1;
        for (int iMax = Math.max(i, 0); iMin > iMax; iMax++) {
            j(bArr, iMax, iMin);
            iMin--;
        }
        return bArr;
    }

    public static byte[] j(byte[] bArr, int i, int i2) {
        if (c(bArr)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
        return bArr;
    }
}
