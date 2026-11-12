package c63;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o13.t f24972a = o13.m.b(new g0(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f24973b = o13.m.b(new g0(5));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f24974c = o13.m.b(new g0(6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f24975d = new d0(null, null, null, null, 15, null);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24976a;

        static {
            int[] iArr = new int[j1.values().length];
            try {
                iArr[j1.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j1.IF_NONZERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24976a = iArr;
        }
    }

    public static final void a(s.e eVar, j1 j1Var, e23.l lVar) {
        eVar.getClass();
        int i14 = a.f24976a[j1Var.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                t.c(eVar, "", new a12.a(lVar, 29));
            } else if (i14 == 3) {
                lVar.invoke(eVar);
            } else {
                lc.u0.r();
            }
        }
    }
}
