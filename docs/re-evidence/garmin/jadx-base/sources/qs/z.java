package qs;

import c22.o3;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f147240a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.UNIT_PRESSURE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.UNIT_PRESSURE_PSI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f147240a = iArr;
        }
    }

    public static final o3 a(y yVar) {
        int i14 = a.f147240a[yVar.ordinal()];
        if (i14 == 1) {
            return o3.BAR;
        }
        if (i14 != 2) {
            return null;
        }
        return o3.PSI;
    }
}
