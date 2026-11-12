package o4;

import com.garmin.proto.generated.GDIInReachMessaging;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/o1;", "Lo4/t0;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f128903b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f128904c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f128905d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f128906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f128907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f128908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f128909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f128910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f128911j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f128912k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f128913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f128914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f128915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r1 f128916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f128917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f128918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f128919r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g6.c f128920t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g6.o f128921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n1 f128922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e0 f128923x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f128924y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b1 f128925z;

    public o1() {
        long j8 = u0.f129009a;
        this.f128909h = j8;
        this.f128910i = j8;
        this.f128914m = 8.0f;
        z1.f129046b.getClass();
        this.f128915n = z1.f129047c;
        this.f128916o = m1.f128891a;
        n0.f128892b.getClass();
        this.f128918q = 0;
        n4.g.f123559b.getClass();
        this.f128919r = n4.g.f123560c;
        this.f128920t = zf.b.c();
        this.f128921v = g6.o.Ltr;
        q.f128930b.getClass();
        this.f128924y = q.f128933e;
    }

    @Override // o4.t0
    public final void K0(int i14) {
        int i15 = this.f128918q;
        n0.a aVar = n0.f128892b;
        if (i15 == i14) {
            return;
        }
        this.f128902a |= 32768;
        this.f128918q = i14;
    }

    @Override // o4.t0
    public final void T0(long j8) {
        if (z1.b(this.f128915n, j8)) {
            return;
        }
        this.f128902a |= 4096;
        this.f128915n = j8;
    }

    @Override // o4.t0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF128919r() {
        return this.f128919r;
    }

    @Override // o4.t0
    public final void c(float f14) {
        if (this.f128905d == f14) {
            return;
        }
        this.f128902a |= 4;
        this.f128905d = f14;
    }

    @Override // o4.t0
    public final void d(e0 e0Var) {
        if (p005kotlin.jvm.internal.s.g(this.f128923x, e0Var)) {
            return;
        }
        this.f128902a |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
        this.f128923x = e0Var;
    }

    public final void e() {
        v(1.0f);
        w(1.0f);
        c(1.0f);
        x(0.0f);
        q(0.0f);
        j(0.0f);
        long j8 = u0.f129009a;
        m(j8);
        n(j8);
        h(0.0f);
        i(0.0f);
        k(0.0f);
        s(8.0f);
        z1.f129046b.getClass();
        T0(z1.f129047c);
        e1(m1.f128891a);
        g(false);
        t(null);
        d(null);
        q.f128930b.getClass();
        l(q.f128933e);
        n0.f128892b.getClass();
        K0(0);
        n4.g.f123559b.getClass();
        this.f128919r = n4.g.f123560c;
        this.f128925z = null;
        this.f128902a = 0;
    }

    @Override // o4.t0
    public final void e1(r1 r1Var) {
        if (p005kotlin.jvm.internal.s.g(this.f128916o, r1Var)) {
            return;
        }
        this.f128902a |= 8192;
        this.f128916o = r1Var;
    }

    @Override // o4.t0
    public final void g(boolean z14) {
        if (this.f128917p != z14) {
            this.f128902a |= 16384;
            this.f128917p = z14;
        }
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f128920t.getF75991a();
    }

    @Override // o4.t0
    public final void h(float f14) {
        if (this.f128911j == f14) {
            return;
        }
        this.f128902a |= 256;
        this.f128911j = f14;
    }

    @Override // o4.t0
    public final void i(float f14) {
        if (this.f128912k == f14) {
            return;
        }
        this.f128902a |= 512;
        this.f128912k = f14;
    }

    @Override // o4.t0
    public final void j(float f14) {
        if (this.f128908g == f14) {
            return;
        }
        this.f128902a |= 32;
        this.f128908g = f14;
    }

    @Override // o4.t0
    public final void k(float f14) {
        if (this.f128913l == f14) {
            return;
        }
        this.f128902a |= 1024;
        this.f128913l = f14;
    }

    @Override // o4.t0
    public final void l(int i14) {
        int i15 = this.f128924y;
        q.a aVar = q.f128930b;
        if (i15 == i14) {
            return;
        }
        this.f128902a |= 524288;
        this.f128924y = i14;
    }

    @Override // o4.t0
    public final void m(long j8) {
        if (d0.d(this.f128909h, j8)) {
            return;
        }
        this.f128902a |= 64;
        this.f128909h = j8;
    }

    @Override // o4.t0
    public final void n(long j8) {
        if (d0.d(this.f128910i, j8)) {
            return;
        }
        this.f128902a |= 128;
        this.f128910i = j8;
    }

    @Override // o4.t0
    public final void q(float f14) {
        if (this.f128907f == f14) {
            return;
        }
        this.f128902a |= 16;
        this.f128907f = f14;
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f128920t.getF75992b();
    }

    @Override // o4.t0
    public final void s(float f14) {
        if (this.f128914m == f14) {
            return;
        }
        this.f128902a |= 2048;
        this.f128914m = f14;
    }

    @Override // o4.t0
    public final void t(n1 n1Var) {
        if (p005kotlin.jvm.internal.s.g(this.f128922w, n1Var)) {
            return;
        }
        this.f128902a |= 131072;
        this.f128922w = n1Var;
    }

    @Override // o4.t0
    public final void v(float f14) {
        if (this.f128903b == f14) {
            return;
        }
        this.f128902a |= 1;
        this.f128903b = f14;
    }

    @Override // o4.t0
    public final void w(float f14) {
        if (this.f128904c == f14) {
            return;
        }
        this.f128902a |= 2;
        this.f128904c = f14;
    }

    @Override // o4.t0
    public final void x(float f14) {
        if (this.f128906e == f14) {
            return;
        }
        this.f128902a |= 8;
        this.f128906e = f14;
    }
}
