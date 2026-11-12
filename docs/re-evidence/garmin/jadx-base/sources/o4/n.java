package o4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final int[] a(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = f0.j(((d0) list.get(i14)).f128833a);
        }
        return iArr;
    }

    public static final float[] b(List list, List list2) {
        if (list != null) {
            return p13.h0.Y0(list);
        }
        return null;
    }

    public static final void c(List<d0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            vb.h.s("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            vb.h.s("colors and colorStops arguments must have equal length.");
        }
    }
}
