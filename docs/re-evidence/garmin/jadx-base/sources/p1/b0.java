package p1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f134674a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f134675b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f134676c = new Object();

    public static final void a(l1 l1Var) {
        int i14 = l1Var.f134767d;
        int[] iArr = l1Var.f134765b;
        Object[] objArr = l1Var.f134766c;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            Object obj = objArr[i16];
            if (obj != f134676c) {
                if (i16 != i15) {
                    iArr[i15] = iArr[i16];
                    objArr[i15] = obj;
                    objArr[i16] = null;
                }
                i15++;
            }
        }
        l1Var.f134764a = false;
        l1Var.f134767d = i15;
    }

    public static final int b(b bVar, Object obj, int i14) {
        int i15 = bVar.f134672c;
        if (i15 == 0) {
            return -1;
        }
        try {
            int iA = q1.a.a(i15, i14, bVar.f134670a);
            if (iA < 0 || p005kotlin.jvm.internal.s.g(obj, bVar.f134671b[iA])) {
                return iA;
            }
            int i16 = iA + 1;
            while (i16 < i15 && bVar.f134670a[i16] == i14) {
                if (p005kotlin.jvm.internal.s.g(obj, bVar.f134671b[i16])) {
                    return i16;
                }
                i16++;
            }
            for (int i17 = iA - 1; i17 >= 0 && bVar.f134670a[i17] == i14; i17--) {
                if (p005kotlin.jvm.internal.s.g(obj, bVar.f134671b[i17])) {
                    return i17;
                }
            }
            return ~i16;
        } catch (IndexOutOfBoundsException unused) {
            org.apache.commons.lang3.e.h();
            return 0;
        }
    }
}
