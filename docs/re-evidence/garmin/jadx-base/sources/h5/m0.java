package h5;

import i3.e5;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh5/m0;", "Lf5/y0;", "Lh5/l0;", "Lh5/c1;", "coordinator", "<init>", "(Lh5/c1;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m0 extends l0 implements f5.y0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1 f81889p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f81890q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashMap f81891r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f5.x0 f81892t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f5.a1 f81893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p1.p0<f5.a> f81894w;

    public m0(c1 c1Var) {
        this.f81889p = c1Var;
        g6.k.f76003b.getClass();
        this.f81890q = 0L;
        this.f81892t = new f5.x0(this);
        this.f81894w = p1.z0.a();
    }

    public static final void g1(m0 m0Var, f5.a1 a1Var) {
        LinkedHashMap linkedHashMap;
        if (a1Var != null) {
            long f68898b = (((long) a1Var.getF69054b()) & 4294967295L) | (((long) a1Var.getF69053a()) << 32);
            g6.m.a aVar = g6.m.f76012b;
            m0Var.D0(f68898b);
        } else {
            g6.m.f76012b.getClass();
            m0Var.D0(0L);
        }
        if (!p005kotlin.jvm.internal.s.g(m0Var.f81893v, a1Var) && a1Var != null && ((((linkedHashMap = m0Var.f81891r) != null && !linkedHashMap.isEmpty()) || !a1Var.p().isEmpty()) && !p005kotlin.jvm.internal.s.g(a1Var.p(), m0Var.f81891r))) {
            n0 n0Var = m0Var.f81889p.f81711p.T.f81854q;
            n0Var.getClass();
            n0Var.f81911t.g();
            LinkedHashMap linkedHashMap2 = m0Var.f81891r;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                m0Var.f81891r = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(a1Var.p());
        }
        m0Var.f81893v = a1Var;
    }

    public int O(int i14) {
        c1 c1Var = this.f81889p.f81714t;
        c1Var.getClass();
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        return m0VarD1.O(i14);
    }

    @Override // h5.l0
    public final l0 O0() {
        c1 c1Var = this.f81889p.f81714t;
        if (c1Var != null) {
            return c1Var.D1();
        }
        return null;
    }

    @Override // h5.l0
    public final boolean P0() {
        return this.f81893v != null;
    }

    @Override // h5.l0
    public final f5.a1 Q0() {
        f5.a1 a1Var = this.f81893v;
        if (a1Var != null) {
            return a1Var;
        }
        throw e5.m("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // h5.l0
    public final l0 S0() {
        c1 c1Var = this.f81889p.f81715v;
        if (c1Var != null) {
            return c1Var.D1();
        }
        return null;
    }

    @Override // h5.l0
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final long getE() {
        return this.f81890q;
    }

    @Override // h5.l0
    public final f5.c0 Y0() {
        return this.f81892t;
    }

    public int a0(int i14) {
        c1 c1Var = this.f81889p.f81714t;
        c1Var.getClass();
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        return m0VarD1.a0(i14);
    }

    @Override // f5.c1, f5.w
    /* JADX INFO: renamed from: e */
    public final Object getA() {
        return this.f81889p.getA();
    }

    public int e0(int i14) {
        c1 c1Var = this.f81889p.f81714t;
        c1Var.getClass();
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        return m0VarD1.e0(i14);
    }

    @Override // h5.l0
    public final void f1() {
        u0(0.0f, this.f81890q, null);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF69050b() {
        return this.f81889p.getF69050b();
    }

    @Override // f5.x
    /* JADX INFO: renamed from: getLayoutDirection */
    public final g6.o getF69049a() {
        return this.f81889p.f81711p.B;
    }

    @Override // h5.l0, h5.u0
    /* JADX INFO: renamed from: j1 */
    public final e0 getF81711p() {
        return this.f81889p.f81711p;
    }

    public int l0(int i14) {
        c1 c1Var = this.f81889p.f81714t;
        c1Var.getClass();
        m0 m0VarD1 = c1Var.D1();
        m0VarD1.getClass();
        return m0VarD1.l0(i14);
    }

    public final long l1() {
        long j8 = (((long) this.f69145b) & 4294967295L) | (((long) this.f69144a) << 32);
        g6.m.a aVar = g6.m.f76012b;
        return j8;
    }

    public void n1() {
        Q0().q();
    }

    public final void o1(long j8) {
        if (!g6.k.c(this.f81890q, j8)) {
            this.f81890q = j8;
            c1 c1Var = this.f81889p;
            n0 n0Var = c1Var.f81711p.T.f81854q;
            if (n0Var != null) {
                n0Var.N0();
            }
            l0.a1(c1Var);
        }
        if (this.f81865k) {
            return;
        }
        N0(Q0());
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF69051c() {
        return this.f81889p.getF69051c();
    }

    public final long s1(m0 m0Var, boolean z14) {
        g6.k.f76003b.getClass();
        long jE = 0;
        m0 m0VarD1 = this;
        while (!m0VarD1.equals(m0Var)) {
            if (!m0VarD1.f81863i || !z14) {
                jE = g6.k.e(jE, m0VarD1.f81890q);
            }
            c1 c1Var = m0VarD1.f81889p.f81715v;
            c1Var.getClass();
            m0VarD1 = c1Var.D1();
            m0VarD1.getClass();
        }
        return jE;
    }

    @Override // h5.l0, f5.x
    public final boolean t1() {
        return true;
    }

    @Override // f5.v1
    public final void u0(float f14, long j8, e23.l lVar) {
        o1(j8);
        if (this.f81864j) {
            return;
        }
        n1();
    }
}
