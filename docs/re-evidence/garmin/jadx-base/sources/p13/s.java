package p13;

import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class s extends m {
    public static <T> List<T> c(T[] tArr) {
        tArr.getClass();
        List<T> listAsList = Arrays.asList(tArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void d(int i14, int i15, int i16, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i15, iArr2, i14, i16 - i15);
    }

    public static void e(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i15, bArr2, i14, i16 - i15);
    }

    public static void f(char[] cArr, char[] cArr2, int i14, int i15, int i16) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i15, cArr2, i14, i16 - i15);
    }

    public static void g(long[] jArr, long[] jArr2, int i14, int i15, int i16) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i15, jArr2, i14, i16 - i15);
    }

    public static void h(Object[] objArr, Object[] objArr2, int i14, int i15, int i16) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i15, objArr2, i14, i16 - i15);
    }

    public static /* synthetic */ void i(int i14, int i15, int i16, int[] iArr, int[] iArr2) {
        if ((i16 & 2) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = iArr.length;
        }
        d(i14, 0, i15, iArr, iArr2);
    }

    public static /* synthetic */ void j(Object[] objArr, Object[] objArr2, int i14, int i15, int i16) {
        if ((i16 & 4) != 0) {
            i14 = 0;
        }
        if ((i16 & 8) != 0) {
            i15 = objArr.length;
        }
        h(objArr, objArr2, 0, i14, i15);
    }

    public static byte[] k(int i14, int i15, byte[] bArr) {
        bArr.getClass();
        l.a(i15, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i14, i15);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] l(int i14, int i15, Object[] objArr) {
        objArr.getClass();
        l.a(i15, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i14, i15);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static void m(int i14, int i15, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i14, i15, obj);
    }

    public static void n(int i14, int[] iArr) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i14);
    }

    public static void p(long[] jArr, long j8) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j8);
    }

    public static byte[] q(byte[] bArr, byte[] bArr2) {
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static int[] r(int i14, int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i14;
        return iArrCopyOf;
    }

    public static int[] s(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    public static <T> T[] t(T[] tArr, T[] tArr2) {
        tArr.getClass();
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static Double[] u(double[] dArr) {
        dArr.getClass();
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            dArr2[i14] = Double.valueOf(dArr[i14]);
        }
        return dArr2;
    }
}
