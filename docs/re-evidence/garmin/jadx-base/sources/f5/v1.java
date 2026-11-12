package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lf5/v1;", "Lf5/c1;", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class v1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f69146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f69147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f69148e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/v1$a;", "Lg6/c;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a implements g6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f69149a;

        public static void B(a aVar, v1 v1Var, int i14, int i15) {
            aVar.getClass();
            long j8 = (((long) i14) << 32) | (((long) i15) & 4294967295L);
            g6.k.a aVar2 = g6.k.f76003b;
            if (aVar.getF68958c() == g6.o.Ltr || aVar.getF68957b() == 0) {
                e(aVar, v1Var);
                v1Var.u0(0.0f, g6.k.e(j8, v1Var.f69148e), null);
            } else {
                int iP = (aVar.getF68957b() - v1Var.f69144a) - ((int) (j8 >> 32));
                e(aVar, v1Var);
                v1Var.u0(0.0f, g6.k.e((((long) iP) << 32) | (((long) ((int) (j8 & 4294967295L))) & 4294967295L), v1Var.f69148e), null);
            }
        }

        public static void E(a aVar, v1 v1Var, int i14, int i15) {
            w1.a aVar2 = w1.f69151a;
            aVar.getClass();
            long j8 = (((long) i14) << 32) | (((long) i15) & 4294967295L);
            g6.k.a aVar3 = g6.k.f76003b;
            if (aVar.getF68958c() == g6.o.Ltr || aVar.getF68957b() == 0) {
                e(aVar, v1Var);
                v1Var.u0(0.0f, g6.k.e(j8, v1Var.f69148e), aVar2);
            } else {
                int iP = (aVar.getF68957b() - v1Var.f69144a) - ((int) (j8 >> 32));
                e(aVar, v1Var);
                v1Var.u0(0.0f, g6.k.e((((long) iP) << 32) | (((long) ((int) (j8 & 4294967295L))) & 4294967295L), v1Var.f69148e), aVar2);
            }
        }

        public static void F(a aVar, v1 v1Var, long j8) {
            w1.a aVar2 = w1.f69151a;
            if (aVar.getF68958c() == g6.o.Ltr || aVar.getF68957b() == 0) {
                e(aVar, v1Var);
                v1Var.u0(0.0f, g6.k.e(j8, v1Var.f69148e), aVar2);
                return;
            }
            int iP = aVar.getF68957b() - v1Var.f69144a;
            g6.k.a aVar3 = g6.k.f76003b;
            int i14 = iP - ((int) (j8 >> 32));
            e(aVar, v1Var);
            v1Var.u0(0.0f, g6.k.e((((long) ((int) (j8 & 4294967295L))) & 4294967295L) | (((long) i14) << 32), v1Var.f69148e), aVar2);
        }

        public static void G(a aVar, v1 v1Var, long j8, r4.c cVar) {
            if (aVar.getF68958c() == g6.o.Ltr || aVar.getF68957b() == 0) {
                e(aVar, v1Var);
                v1Var.z0(g6.k.e(j8, v1Var.f69148e), 0.0f, cVar);
                return;
            }
            int iP = aVar.getF68957b() - v1Var.f69144a;
            g6.k.a aVar2 = g6.k.f76003b;
            int i14 = iP - ((int) (j8 >> 32));
            e(aVar, v1Var);
            v1Var.z0(g6.k.e((((long) ((int) (j8 & 4294967295L))) & 4294967295L) | (((long) i14) << 32), v1Var.f69148e), 0.0f, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void K(a aVar, v1 v1Var, int i14, int i15, e23.l lVar, int i16) {
            if ((i16 & 8) != 0) {
                lVar = w1.f69151a;
            }
            aVar.J(v1Var, i14, i15, 0.0f, lVar);
        }

        public static void O(a aVar, v1 v1Var, long j8) {
            w1.a aVar2 = w1.f69151a;
            aVar.getClass();
            e(aVar, v1Var);
            v1Var.u0(0.0f, g6.k.e(j8, v1Var.f69148e), aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final void e(a aVar, v1 v1Var) {
            aVar.getClass();
            if (v1Var instanceof h5.y0) {
                ((h5.y0) v1Var).r(aVar.f69149a);
            }
        }

        public static void y(a aVar, v1 v1Var, long j8) {
            aVar.getClass();
            e(aVar, v1Var);
            v1Var.u0(0.0f, g6.k.e(j8, v1Var.f69148e), null);
        }

        public final void J(v1 v1Var, int i14, int i15, float f14, e23.l<? super o4.t0, Unit> lVar) {
            long j8 = (((long) i15) & 4294967295L) | (((long) i14) << 32);
            g6.k.a aVar = g6.k.f76003b;
            e(this, v1Var);
            v1Var.u0(f14, g6.k.e(j8, v1Var.f69148e), lVar);
        }

        public float f(c2 c2Var) {
            return Float.NaN;
        }

        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public float getF94881a() {
            return 1.0f;
        }

        /* JADX INFO: renamed from: o */
        public abstract g6.o getF68958c();

        /* JADX INFO: renamed from: p */
        public abstract int getF68957b();

        public final void r(v1 v1Var, int i14, int i15, float f14) {
            long j8 = (((long) i15) & 4294967295L) | (((long) i14) << 32);
            g6.k.a aVar = g6.k.f76003b;
            e(this, v1Var);
            v1Var.u0(f14, g6.k.e(j8, v1Var.f69148e), null);
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public float getF94882b() {
            return 1.0f;
        }
    }

    public v1() {
        long j8 = 0;
        g6.m.a aVar = g6.m.f76012b;
        this.f69146c = (j8 & 4294967295L) | (j8 << 32);
        this.f69147d = w1.f69152b;
        g6.k.f76003b.getClass();
        this.f69148e = 0L;
    }

    public final void D0(long j8) {
        if (g6.m.c(this.f69146c, j8)) {
            return;
        }
        this.f69146c = j8;
        p0();
    }

    public final void E0(long j8) {
        if (g6.a.d(this.f69147d, j8)) {
            return;
        }
        this.f69147d = j8;
        p0();
    }

    public int m0() {
        return (int) (this.f69146c & 4294967295L);
    }

    public int n0() {
        return (int) (this.f69146c >> 32);
    }

    public final void p0() {
        this.f69144a = j23.t.e((int) (this.f69146c >> 32), g6.a.l(this.f69147d), g6.a.j(this.f69147d));
        int iE = j23.t.e((int) (this.f69146c & 4294967295L), g6.a.k(this.f69147d), g6.a.i(this.f69147d));
        this.f69145b = iE;
        int i14 = this.f69144a;
        long j8 = this.f69146c;
        g6.k.a aVar = g6.k.f76003b;
        this.f69148e = (((long) ((i14 - ((int) (j8 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iE - ((int) (j8 & 4294967295L))) / 2)));
    }

    public abstract void u0(float f14, long j8, e23.l lVar);

    public void z0(long j8, float f14, r4.c cVar) {
        u0(f14, j8, null);
    }
}
