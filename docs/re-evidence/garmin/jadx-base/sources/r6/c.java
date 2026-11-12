package r6;

/* JADX INFO: loaded from: classes.dex */
public class c extends q6.d {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public q6.g.c f150963n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f150964o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public t6.a f150965p0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150966a;

        static {
            int[] iArr = new int[q6.g.c.values().length];
            f150966a = iArr;
            try {
                iArr[q6.g.c.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f150966a[q6.g.c.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f150966a[q6.g.c.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f150966a[q6.g.c.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f150966a[q6.g.c.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f150966a[q6.g.c.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(q6.g gVar) {
        super(gVar, q6.g.d.BARRIER);
    }

    @Override // q6.d, q6.a, q6.e
    public final void apply() {
        s();
        int i14 = a.f150966a[this.f150963n0.ordinal()];
        int i15 = 3;
        if (i14 == 3 || i14 == 4) {
            i15 = 1;
        } else if (i14 == 5) {
            i15 = 2;
        } else if (i14 != 6) {
            i15 = 0;
        }
        t6.a aVar = this.f150965p0;
        aVar.f162564y0 = i15;
        aVar.A0 = this.f150964o0;
    }

    @Override // q6.a
    public final q6.a k(int i14) {
        this.f150964o0 = i14;
        return this;
    }

    @Override // q6.a
    public final q6.a l(Float f14) {
        this.f150964o0 = this.f143080k0.d(f14);
        return this;
    }

    @Override // q6.d
    public final t6.i s() {
        if (this.f150965p0 == null) {
            this.f150965p0 = new t6.a();
        }
        return this.f150965p0;
    }
}
