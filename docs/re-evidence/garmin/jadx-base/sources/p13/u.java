package p13;

import i3.e5;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class u extends s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"p13/u$a", "Lc53/j;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements c53.j<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f134962a;

        public a(Object[] objArr) {
            this.f134962a = objArr;
        }

        @Override // c53.j
        public final Iterator<T> iterator() {
            return p005kotlin.jvm.internal.i.b(this.f134962a);
        }
    }

    public static List A(int i14, Object[] objArr) {
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i14;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            vb.h.x(v.e0.f(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return j0.f134944a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return i0(objArr);
        }
        if (length == 1) {
            return w.c(objArr[length2 - 1]);
        }
        List listAsList = Arrays.asList(s.l(length2 - length, length2, objArr));
        listAsList.getClass();
        return listAsList;
    }

    public static List B(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length - 2;
        if (length < 0) {
            length = 0;
        }
        return Z(length, bArr);
    }

    public static ArrayList C(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static byte D(byte[] bArr) {
        bArr.getClass();
        if (bArr.length != 0) {
            return bArr[0];
        }
        n23.j.s("Array is empty.");
        return (byte) 0;
    }

    public static <T> T E(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[0];
        }
        n23.j.s("Array is empty.");
        return null;
    }

    public static Byte F(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public static Float G(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static <T> T H(T[] tArr) {
        tArr.getClass();
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static j23.l I(int[] iArr) {
        return new j23.l(0, iArr.length - 1);
    }

    public static int J(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Integer K(int i14, int[] iArr) {
        if (i14 < 0 || i14 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i14]);
    }

    public static Object L(int i14, Object[] objArr) {
        objArr.getClass();
        if (i14 < 0 || i14 >= objArr.length) {
            return null;
        }
        return objArr[i14];
    }

    public static <T> int M(T[] tArr, T t7) {
        tArr.getClass();
        int i14 = 0;
        if (t7 == null) {
            int length = tArr.length;
            while (i14 < length) {
                if (tArr[i14] == null) {
                    return i14;
                }
                i14++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i14 < length2) {
            if (t7.equals(tArr[i14])) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static final void N(Object[] objArr, StringBuilder sb3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, e23.l lVar) throws IOException {
        objArr.getClass();
        sb3.append(charSequence2);
        int i14 = 0;
        for (Object obj : objArr) {
            i14++;
            if (i14 > 1) {
                sb3.append(charSequence);
            }
            d53.m.a(sb3, obj, lVar);
        }
        sb3.append(charSequence3);
    }

    public static String O(byte[] bArr, String str, e23.l lVar, int i14) {
        if ((i14 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i14 & 2) != 0 ? "" : "[";
        String str3 = (i14 & 4) == 0 ? "]" : "";
        int i15 = (i14 & 8) != 0 ? -1 : 32;
        if ((i14 & 32) != 0) {
            lVar = null;
        }
        bArr.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) str2);
        int i16 = 0;
        for (byte b14 : bArr) {
            i16++;
            if (i16 > 1) {
                sb3.append((CharSequence) str);
            }
            if (i15 >= 0 && i16 > i15) {
                break;
            }
            if (lVar != null) {
                sb3.append((CharSequence) lVar.invoke(Byte.valueOf(b14)));
            } else {
                sb3.append((CharSequence) String.valueOf((int) b14));
            }
        }
        if (i15 >= 0 && i16 > i15) {
            sb3.append((CharSequence) "...");
        }
        sb3.append((CharSequence) str3);
        return sb3.toString();
    }

    public static String P(Object[] objArr, String str, String str2, String str3, e23.l lVar, int i14) throws IOException {
        if ((i14 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i14 & 2) != 0 ? "" : str2;
        String str6 = (i14 & 4) != 0 ? "" : str3;
        if ((i14 & 32) != 0) {
            lVar = null;
        }
        objArr.getClass();
        StringBuilder sb3 = new StringBuilder();
        N(objArr, sb3, str4, str5, str6, "...", lVar);
        return sb3.toString();
    }

    public static <T> T Q(T[] tArr) {
        tArr.getClass();
        if (tArr.length != 0) {
            return tArr[tArr.length - 1];
        }
        n23.j.s("Array is empty.");
        return null;
    }

    public static <T> int R(T[] tArr, T t7) {
        tArr.getClass();
        if (t7 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i14 >= 0) {
                        length = i14;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i15 = length2 - 1;
                    if (t7.equals(tArr[length2])) {
                        return length2;
                    }
                    if (i15 < 0) {
                        break;
                    }
                    length2 = i15;
                }
            }
        }
        return -1;
    }

    public static Float S(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static double T(double[] dArr) {
        dArr.getClass();
        if (dArr.length == 0) {
            c22.t.g();
            return 0.0d;
        }
        double dMax = dArr[0];
        int i14 = 1;
        int length = dArr.length - 1;
        if (1 <= length) {
            while (true) {
                dMax = Math.max(dMax, dArr[i14]);
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        return dMax;
    }

    public static char U(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            n23.j.s("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        vb.h.s("Array has more than one element.");
        return (char) 0;
    }

    public static <T> T V(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            n23.j.s("Array is empty.");
            return null;
        }
        if (length == 1) {
            return tArr[0];
        }
        vb.h.s("Array has more than one element.");
        return null;
    }

    public static byte[] W(byte[] bArr, j23.l lVar) {
        bArr.getClass();
        return lVar.isEmpty() ? new byte[0] : s.k(lVar.f96796a, lVar.f96797b + 1, bArr);
    }

    public static <T extends Comparable<? super T>> T[] X(T[] tArr) {
        tArr.getClass();
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Comparable[]) Arrays.copyOf(tArr, tArr.length));
        if (tArr2.length > 1) {
            Arrays.sort(tArr2);
        }
        return tArr2;
    }

    public static <T> List<T> Y(T[] tArr, Comparator<? super T> comparator) {
        tArr.getClass();
        comparator.getClass();
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        List<T> listAsList = Arrays.asList(tArr);
        listAsList.getClass();
        return listAsList;
    }

    public static List Z(int i14, byte[] bArr) {
        bArr.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return j0.f134944a;
        }
        if (i14 >= bArr.length) {
            return d0(bArr);
        }
        if (i14 == 1) {
            return w.c(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i14);
        int i15 = 0;
        for (byte b14 : bArr) {
            arrayList.add(Byte.valueOf(b14));
            i15++;
            if (i15 == i14) {
                break;
            }
        }
        return arrayList;
    }

    public static List a0(int i14, Object[] objArr) {
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return j0.f134944a;
        }
        if (i14 >= objArr.length) {
            return i0(objArr);
        }
        if (i14 == 1) {
            return w.c(objArr[0]);
        }
        List listAsList = Arrays.asList(s.l(0, i14, objArr));
        listAsList.getClass();
        return listAsList;
    }

    public static List b0(int i14, byte[] bArr) {
        bArr.getClass();
        if (i14 < 0) {
            vb.h.x(v.e0.f(i14, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i14 == 0) {
            return j0.f134944a;
        }
        int length = bArr.length;
        if (i14 >= length) {
            return d0(bArr);
        }
        if (i14 == 1) {
            return w.c(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = length - i14; i15 < length; i15++) {
            arrayList.add(Byte.valueOf(bArr[i15]));
        }
        return arrayList;
    }

    public static final void c0(Object[] objArr, AbstractSet abstractSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List<Byte> d0(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return w.c(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b14 : bArr) {
            arrayList.add(Byte.valueOf(b14));
        }
        return arrayList;
    }

    public static List<Double> e0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return w.c(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d14 : dArr) {
            arrayList.add(Double.valueOf(d14));
        }
        return arrayList;
    }

    public static List<Float> f0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return w.c(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f14 : fArr) {
            arrayList.add(Float.valueOf(f14));
        }
        return arrayList;
    }

    public static List<Integer> g0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? k0(iArr) : w.c(Integer.valueOf(iArr[0]));
        }
        return j0.f134944a;
    }

    public static List<Long> h0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return w.c(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    public static <T> List<T> i0(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return w.c(tArr[0]);
        }
        List<T> listAsList = Arrays.asList(Arrays.copyOf(tArr, tArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static List<Boolean> j0(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return j0.f134944a;
        }
        if (length == 1) {
            return w.c(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z14 : zArr) {
            arrayList.add(Boolean.valueOf(z14));
        }
        return arrayList;
    }

    public static ArrayList k0(int[] iArr) {
        iArr.getClass();
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int iD = 0;
        while (iD < length) {
            iD = e5.d(iArr[iD], iD, arrayList, 1);
        }
        return arrayList;
    }

    public static ArrayList l0(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new j(objArr, false));
    }

    public static <T> Set<T> m0(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        if (length == 0) {
            return l0.f134950a;
        }
        if (length == 1) {
            return a1.b(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0.a(tArr.length));
        c0(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList n0(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i14 = 0; i14 < iMin; i14++) {
            arrayList.add(new o13.p(objArr[i14], objArr2[i14]));
        }
        return arrayList;
    }

    public static <T> c53.j<T> v(T[] tArr) {
        tArr.getClass();
        return tArr.length == 0 ? c53.f.f24532a : new a(tArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean w(char[] cArr, char c14) {
        int length = cArr.length;
        int i14 = 0;
        while (i14 < length) {
            if (c14 == cArr[i14]) {
                if (i14 >= 0) {
                    return true;
                }
                return false;
            }
            i14++;
        }
        i14 = -1;
        if (i14 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    public static boolean x(int[] iArr, int i14) {
        iArr.getClass();
        int length = iArr.length;
        int i15 = 0;
        while (i15 < length) {
            if (i14 == iArr[i15]) {
                if (i15 >= 0) {
                    return true;
                }
                return false;
            }
            i15++;
        }
        i15 = -1;
        if (i15 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0017 A[RETURN] */
    public static boolean y(long[] jArr, long j8) {
        jArr.getClass();
        int length = jArr.length;
        int i14 = 0;
        while (i14 < length) {
            if (j8 == jArr[i14]) {
                if (i14 >= 0) {
                    return true;
                }
                return false;
            }
            i14++;
        }
        i14 = -1;
        if (i14 >= 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean z(T[] tArr, T t7) {
        tArr.getClass();
        return M(tArr, t7) >= 0;
    }
}
