package p1;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f134727a = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t0 f134728b = new t0(0);

    public static final int a(int i14) {
        if (i14 == 7) {
            return 6;
        }
        return i14 - (i14 / 8);
    }

    public static final <K, V> t0<K, V> b() {
        return new t0<>(0, 1, null);
    }

    public static final int c(int i14) {
        if (i14 == 0) {
            return 6;
        }
        return (i14 * 2) + 1;
    }

    public static final int d(int i14) {
        if (i14 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i14);
        }
        return 0;
    }

    public static final int e(int i14) {
        if (i14 == 7) {
            return 8;
        }
        return am.j.a(i14, 1, 7, i14);
    }
}
