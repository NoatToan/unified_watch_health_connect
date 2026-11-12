package k2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f102406a;

    static {
        int i14 = c.f102402a;
        f fVar = new f(50);
        f102406a = new h(fVar, fVar, fVar, fVar);
    }

    public static final h a(float f14) {
        e eVarA = c.a(f14);
        return new h(eVarA, eVarA, eVarA, eVarA);
    }

    public static final h b(float f14, float f15, float f16, float f17) {
        return new h(c.a(f14), c.a(f15), c.a(f16), c.a(f17));
    }

    public static h c(float f14, float f15, float f16, float f17, int i14) {
        if ((i14 & 1) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i14 & 2) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        if ((i14 & 4) != 0) {
            f16 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
        }
        if ((i14 & 8) != 0) {
            f17 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        }
        return b(f14, f15, f16, f17);
    }
}
