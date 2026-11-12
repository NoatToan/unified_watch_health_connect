package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class k77 extends mfh.a implements lx9.b {
    public fy9 w;
    public q7o x;
    public lx9 y;
    public b z;

    public class a implements b.InterfaceC0988b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23545b;
        public final /* synthetic */ int c;

        public a(int i, int i2, int i3) {
            this.f23544a = i;
            this.f23545b = i2;
            this.c = i3;
        }

        @Override // k77.b.InterfaceC0988b
        public boolean a(float f, float f2) {
            lfh.b("fling finished: value(%f), velocity(%f), scroller boundary(%d, %d)", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(this.f23544a), Integer.valueOf(this.f23545b));
            k77.this.y.n(k77.this.z.f);
            k77.this.y.o(k77.this.z.e);
            float fV = k77.this.y.v();
            if (((int) f) == 0 || (fV <= this.f23545b && fV >= this.f23544a)) {
                lfh.a("fling finished, no more work.");
                return false;
            }
            lfh.a("fling destination beyound boundary, start spring");
            k77.this.P();
            k77 k77Var = k77.this;
            k77Var.O(2, k77Var.o(), k77.this.n(), k77.this.p(), this.c);
            return true;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a77<?> f23546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23547b;
        public final int c;
        public final int d;
        public float e;
        public int f;
        public InterfaceC0988b g;
        public float h;
        public float i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public a f23548k = new a(this, null);

        public class a implements a77.r {
            public a() {
            }

            @Override // a77.r
            public void a(a77 a77Var, float f, float f2) {
                b bVar = b.this;
                bVar.e = f2;
                bVar.f = bVar.f23547b + ((int) f);
                lfh.d("%s updating value(%f), velocity(%f), min(%f), max(%f)", a77Var.getClass().getSimpleName(), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(b.this.h), Float.valueOf(b.this.i));
            }

            public /* synthetic */ a(b bVar, a aVar) {
                this();
            }
        }

        /* JADX INFO: renamed from: k77$b$b, reason: collision with other inner class name */
        public interface InterfaceC0988b {
            boolean a(float f, float f2);
        }

        public b(a77<?> a77Var, int i, float f) {
            this.f23546a = a77Var;
            a77Var.k(-3.4028235E38f);
            this.f23546a.j(Float.MAX_VALUE);
            this.f23547b = i;
            this.e = f;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            if (i > 0) {
                i3 = Integer.MIN_VALUE + i;
            } else if (i < 0) {
                i2 = Integer.MAX_VALUE + i;
            }
            this.c = i3;
            this.d = i2;
            this.f23546a.n(0.0f);
            this.f23546a.o(f);
        }

        public void c() {
            this.j = 0L;
            this.f23546a.b();
            this.f23546a.removeUpdateListener(this.f23548k);
        }

        public boolean d() {
            InterfaceC0988b interfaceC0988b = this.g;
            if (interfaceC0988b != null) {
                return interfaceC0988b.a(this.f, this.e);
            }
            return false;
        }

        public a77<?> e() {
            return this.f23546a;
        }

        public int f(int i) {
            return i - this.f23547b;
        }

        public void g(int i) {
            int i2 = this.d;
            if (i > i2) {
                i = i2;
            }
            float fMax = Math.max(i - this.f23547b, 0);
            this.f23546a.j(fMax);
            this.i = fMax;
        }

        public void h(int i) {
            int i2 = this.c;
            if (i < i2) {
                i = i2;
            }
            float fMin = Math.min(i - this.f23547b, 0);
            this.f23546a.k(fMin);
            this.h = fMin;
        }

        public void i() {
            this.f23546a.a(this.f23548k);
            this.f23546a.q(true);
            this.j = 0L;
        }

        public boolean j() {
            long j = this.j;
            long jA = vc1.a();
            if (jA == j) {
                lfh.c("update done in this frame, dropping current update request");
                return !this.f23546a.g();
            }
            boolean zDoAnimationFrame = this.f23546a.doAnimationFrame(jA);
            if (zDoAnimationFrame) {
                lfh.d("%s finishing value(%d) velocity(%f)", this.f23546a.getClass().getSimpleName(), Integer.valueOf(this.f), Float.valueOf(this.e));
                this.f23546a.removeUpdateListener(this.f23548k);
            }
            this.j = jA;
            return zDoAnimationFrame;
        }

        public void setOnFinishedListener(InterfaceC0988b interfaceC0988b) {
            this.g = interfaceC0988b;
        }
    }

    public k77(Context context) {
        super(context);
        this.w = new fy9();
        q7o q7oVar = new q7o(this.w);
        this.x = q7oVar;
        q7oVar.v(new t7o());
        this.x.l(0.5f);
        this.x.t().d(0.97f);
        this.x.t().f(130.5f);
        this.x.t().g(1000.0d);
        lx9 lx9Var = new lx9(this.w, this);
        this.y = lx9Var;
        lx9Var.l(0.5f);
        this.y.y(0.4761905f);
    }

    @Override // mfh.a
    public boolean E(int i, int i2, int i3) {
        lfh.b("SPRING_BACK start(%d) boundary(%d, %d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (this.z != null) {
            P();
        }
        if (i < i2) {
            O(1, i, 0.0f, i2, 0);
        } else if (i > i3) {
            O(1, i, 0.0f, i3, 0);
        } else {
            w(i);
            B(i);
            y(i);
            x(0);
            A(true);
        }
        return !t();
    }

    @Override // mfh.a
    public boolean H() {
        b bVar = this.z;
        if (bVar == null) {
            lfh.a("no handler found, aborting");
            return false;
        }
        boolean zJ = bVar.j();
        w(this.z.f);
        v(this.z.e);
        if (r() == 2 && Math.signum(this.z.f) * Math.signum(this.z.e) < 0.0f) {
            lfh.a("State Changed: BALLISTIC -> CUBIC");
            D(1);
        }
        return !zJ;
    }

    public final void N(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int iU;
        this.y.n(0.0f);
        float f = i2;
        this.y.o(f);
        long jV = ((long) i) + ((long) this.y.v());
        if (jV > i4) {
            iU = (int) this.y.w(i4 - i);
            i6 = i4;
        } else if (jV < i3) {
            iU = (int) this.y.w(i3 - i);
            i6 = i3;
        } else {
            i6 = (int) jV;
            iU = (int) this.y.u();
        }
        A(false);
        v(f);
        C(vc1.a());
        w(i);
        B(i);
        x(iU);
        y(i6);
        D(0);
        int iMin = Math.min(i3, i);
        int iMax = Math.max(i4, i);
        b bVar = new b(this.y, i, f);
        this.z = bVar;
        bVar.setOnFinishedListener(new a(i3, i4, i5));
        this.z.h(iMin);
        this.z.g(iMax);
        this.z.i();
    }

    public final void O(int i, int i2, float f, int i3, int i4) {
        if (f > 8000.0f) {
            lfh.b("%f is too fast for spring, slow down", Float.valueOf(f));
            f = 8000.0f;
        }
        A(false);
        v(f);
        C(vc1.a());
        w(i2);
        B(i2);
        x(Integer.MAX_VALUE);
        y(i3);
        D(i);
        this.z = new b(this.x, i2, f);
        this.x.t().e(this.z.f(i3));
        if (i4 != 0) {
            if (f < 0.0f) {
                this.z.h(i3 - i4);
                this.z.g(Math.max(i3, i2));
            } else {
                this.z.h(Math.min(i3, i2));
                this.z.g(i3 + i4);
            }
        }
        this.z.i();
    }

    public final void P() {
        if (this.z != null) {
            lfh.b("resetting current handler: state(%d), anim(%s), value(%d), velocity(%f)", Integer.valueOf(r()), this.z.e().getClass().getSimpleName(), Integer.valueOf(this.z.f), Float.valueOf(this.z.e));
            this.z.c();
            this.z = null;
        }
    }

    public final void Q(int i, int i2, int i3, int i4, int i5) {
        lfh.b("startAfterEdge: start(%d) velocity(%d) boundary(%d, %d) over(%d)", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5));
        if (i > i2 && i < i3) {
            A(true);
            return;
        }
        boolean z = i > i3;
        int i6 = z ? i3 : i2;
        int i7 = i - i6;
        if (i4 != 0 && Integer.signum(i7) * i4 >= 0) {
            lfh.a("spring forward");
            O(2, i, i4, i6, i5);
            return;
        }
        this.y.n(i);
        float f = i4;
        this.y.o(f);
        float fV = this.y.v();
        if ((!z || fV >= i3) && (z || fV <= i2)) {
            lfh.a("spring backward");
            O(1, i, f, i6, i5);
        } else {
            lfh.a("fling to content");
            N(i, i4, i2, i3, i5);
        }
    }

    public void R(double d) {
        if (Math.abs(d) <= 5000.0d) {
            this.x.t().f(246.7f);
        } else {
            this.x.t().f(130.5f);
        }
    }

    @Override // lx9.b
    public void a(int i) {
        z(q() + i);
    }

    @Override // mfh.a
    public boolean k() {
        b bVar = this.z;
        if (bVar == null || !bVar.d()) {
            return false;
        }
        lfh.a("checking have more work when finish");
        H();
        return true;
    }

    @Override // mfh.a
    public void l() {
        lfh.a("finish scroller");
        w(p());
        A(true);
        P();
    }

    @Override // mfh.a
    public void m(int i, int i2, int i3, int i4, int i5) {
        lfh.b("FLING: start(%d) velocity(%d) boundary(%d, %d) over(%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        P();
        if (i2 == 0) {
            w(i);
            B(i);
            y(i);
            x(0);
            A(true);
            return;
        }
        R(i2);
        if (i > i4 || i < i3) {
            Q(i, i3, i4, i2, i5);
        } else {
            N(i, i2, i3, i4, i5);
        }
    }

    @Override // mfh.a
    public void u(int i, int i2, int i3) {
        if (r() == 0) {
            if (this.z != null) {
                P();
            }
            Q(i, i2, i2, (int) n(), i3);
        }
    }

    @Override // mfh.a
    public void z(int i) {
        super.z(i);
    }
}
