package s3;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p005kotlin.jvm.internal.s;
import p3.h3;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final int a(int i14, int[] iArr) {
        return iArr[(i14 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i14, int i15) {
        int iF = f(arrayList, i14, i15);
        return iF >= 0 ? iF : -(iF + 1);
    }

    public static final int c(int i14, int[] iArr) {
        int i15 = i14 * 5;
        return Integer.bitCount(iArr[i15 + 1] >> 28) + iArr[i15 + 4];
    }

    public static final void d(int i14, int i15, int[] iArr) {
        if (i15 >= 0) {
        }
        int i16 = (i14 * 5) + 1;
        iArr[i16] = i15 | (iArr[i16] & (-67108864));
    }

    public static final i e(h3 h3Var) {
        i iVar = h3Var instanceof i ? (i) h3Var : null;
        if (iVar != null) {
            return iVar;
        }
        p3.n.b("Inconsistent composition");
        o2.c.f();
        return null;
    }

    public static final int f(ArrayList<b> arrayList, int i14, int i15) {
        int size = arrayList.size() - 1;
        int i16 = 0;
        while (i16 <= size) {
            int i17 = (i16 + size) >>> 1;
            int i18 = arrayList.get(i17).f156318a;
            if (i18 < 0) {
                i18 += i15;
            }
            int iH = s.h(i18, i14);
            if (iH < 0) {
                i16 = i17 + 1;
            } else {
                if (iH <= 0) {
                    return i17;
                }
                size = i17 - 1;
            }
        }
        return -(i16 + 1);
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }
}
