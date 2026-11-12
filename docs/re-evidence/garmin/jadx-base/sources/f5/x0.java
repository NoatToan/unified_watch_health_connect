package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf5/x0;", "Lf5/c0;", "Lh5/m0;", "lookaheadDelegate", "<init>", "(Lh5/m0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5.m0 f69154a;

    public x0(h5.m0 m0Var) {
        this.f69154a = m0Var;
    }

    @Override // f5.c0
    public final long B(long j8) {
        return this.f69154a.f81889p.B(n4.c.j(j8, b()));
    }

    @Override // f5.c0
    public final long F(long j8) {
        return n4.c.j(this.f69154a.f81889p.F(j8), b());
    }

    @Override // f5.c0
    public final void G(c0 c0Var, float[] fArr) {
        this.f69154a.f81889p.G(c0Var, fArr);
    }

    @Override // f5.c0
    public final long W(long j8) {
        return this.f69154a.f81889p.W(n4.c.j(j8, b()));
    }

    @Override // f5.c0
    public final long X(c0 c0Var, long j8) {
        boolean z14 = c0Var instanceof x0;
        h5.m0 m0Var = this.f69154a;
        if (!z14) {
            h5.m0 m0VarC = g0.c(m0Var);
            c0 c0Var2 = m0VarC.f81889p;
            long jX = X(m0VarC.f81892t, j8);
            long j14 = m0VarC.f81890q;
            g6.k.a aVar = g6.k.f76003b;
            long jI = n4.c.i(jX, (4294967295L & ((long) Float.floatToRawIntBits((int) (j14 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j14 >> 32)) << 32));
            c0 c0VarC0 = c0Var2.c0();
            if (c0VarC0 != null) {
                c0Var2 = c0VarC0;
            }
            n4.c.f123541b.getClass();
            return n4.c.j(jI, ((h5.c1) c0Var2).X(c0Var, 0L));
        }
        h5.m0 m0Var2 = ((x0) c0Var).f69154a;
        m0Var2.f81889p.T1();
        h5.m0 m0VarD1 = m0Var.f81889p.x1(m0Var2.f81889p).D1();
        if (m0VarD1 != null) {
            long jD = g6.k.d(g6.k.e(m0Var2.s1(m0VarD1, false), jg.b.N(j8)), m0Var.s1(m0VarD1, false));
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (jD >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jD & 4294967295L))) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            return jFloatToRawIntBits;
        }
        h5.m0 m0VarC2 = g0.c(m0Var2);
        long jE = g6.k.e(g6.k.e(m0Var2.s1(m0VarC2, false), m0VarC2.f81890q), jg.b.N(j8));
        h5.m0 m0VarC3 = g0.c(m0Var);
        long jD2 = g6.k.d(jE, g6.k.e(m0Var.s1(m0VarC3, false), m0VarC3.f81890q));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (jD2 >> 32));
        long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits((int) (jD2 & 4294967295L))) & 4294967295L;
        n4.c.a aVar3 = n4.c.f123541b;
        h5.c1 c1Var = m0VarC3.f81889p.f81715v;
        c1Var.getClass();
        h5.c1 c1Var2 = m0VarC2.f81889p.f81715v;
        c1Var2.getClass();
        return c1Var.X(c1Var2, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
    }

    @Override // f5.c0
    public final long a() {
        h5.m0 m0Var = this.f69154a;
        long j8 = (((long) m0Var.f69144a) << 32) | (((long) m0Var.f69145b) & 4294967295L);
        g6.m.a aVar = g6.m.f76012b;
        return j8;
    }

    public final long b() {
        h5.m0 m0Var = this.f69154a;
        h5.m0 m0VarC = g0.c(m0Var);
        x0 x0Var = m0VarC.f81892t;
        n4.c.f123541b.getClass();
        return n4.c.i(X(x0Var, 0L), m0Var.f81889p.X(m0VarC.f81889p, 0L));
    }

    @Override // f5.c0
    public final long b0(c0 c0Var, long j8) {
        return X(c0Var, j8);
    }

    @Override // f5.c0
    public final c0 c0() {
        h5.m0 m0VarD1;
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        h5.c1 c1Var = this.f69154a.f81889p.f81715v;
        if (c1Var == null || (m0VarD1 = c1Var.D1()) == null) {
            return null;
        }
        return m0VarD1.f81892t;
    }

    @Override // f5.c0
    public final long f(long j8) {
        return this.f69154a.f81889p.f(n4.c.j(0L, b()));
    }

    @Override // f5.c0
    public final void i0(float[] fArr) {
        this.f69154a.f81889p.i0(fArr);
    }

    @Override // f5.c0
    public final boolean isAttached() {
        return this.f69154a.f81889p.isAttached();
    }

    @Override // f5.c0
    public final n4.d j0(c0 c0Var, boolean z14) {
        return this.f69154a.f81889p.j0(c0Var, z14);
    }

    @Override // f5.c0
    public final long o(long j8) {
        return n4.c.j(this.f69154a.f81889p.o(j8), b());
    }

    @Override // f5.c0
    public final c0 y() {
        h5.m0 m0VarD1;
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        h5.c1 c1Var = this.f69154a.f81889p.f81711p.P.f81683d.f81715v;
        if (c1Var == null || (m0VarD1 = c1Var.D1()) == null) {
            return null;
        }
        return m0VarD1.f81892t;
    }
}
