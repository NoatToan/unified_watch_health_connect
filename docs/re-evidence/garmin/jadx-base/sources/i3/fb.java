package i3;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.j0 f88099a = p3.v.c(new i01.j(23));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gb f88100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gb f88101c;

    static {
        g6.f.f75994b.getClass();
        float f14 = g6.f.f75996d;
        o4.d0.f128823b.getClass();
        long j8 = o4.d0.f128832k;
        f88100b = new gb(true, f14, j8, (p005kotlin.jvm.internal.j) null);
        f88101c = new gb(false, f14, j8, (p005kotlin.jvm.internal.j) null);
    }

    public static gb a(float f14, int i14, long j8, boolean z14) {
        if ((i14 & 1) != 0) {
            z14 = true;
        }
        boolean z15 = z14;
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        float f15 = f14;
        if ((i14 & 4) != 0) {
            o4.d0.f128823b.getClass();
            j8 = o4.d0.f128832k;
        }
        long j14 = j8;
        g6.f.f75994b.getClass();
        if (g6.f.c(f15, g6.f.f75996d)) {
            o4.d0.f128823b.getClass();
            if (o4.d0.d(j14, o4.d0.f128832k)) {
                return z15 ? f88100b : f88101c;
            }
        }
        return new gb(z15, f15, j14, (p005kotlin.jvm.internal.j) null);
    }
}
