package is;

import lc.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94859a;

        static {
            int[] iArr = new int[ds.n.values().length];
            try {
                iArr[ds.n.f61012i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ds.n.f61013j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ds.n.f61014k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94859a = iArr;
        }
    }

    public static final String a(ds.n nVar, boolean z14) {
        nVar.getClass();
        int i14 = a.f94859a[nVar.ordinal()];
        if (i14 == 1) {
            return "_9x16";
        }
        if (i14 == 2) {
            return "_4x5";
        }
        if (i14 == 3) {
            return z14 ? "_1x1" : "";
        }
        u0.r();
        return null;
    }

    public static final String b(ds.n nVar) {
        nVar.getClass();
        int i14 = a.f94859a[nVar.ordinal()];
        if (i14 == 1) {
            return "_9x16";
        }
        if (i14 == 2) {
            return "_4x5";
        }
        if (i14 == 3) {
            return "_1x1";
        }
        u0.r();
        return null;
    }
}
