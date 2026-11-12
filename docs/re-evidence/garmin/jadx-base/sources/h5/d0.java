package h5;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lh5/d0;", "Lh5/c1;", "Lh5/e0;", "layoutNode", "Lh5/c0;", "measureNode", "<init>", "(Lh5/e0;Lh5/c0;)V", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 extends c1 {
    public static final o4.h Y0;
    public c0 U0;
    public g6.a V0;
    public b W0;
    public f5.f X0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/d0$b;", "Lh5/m0;", "<init>", "(Lh5/d0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends m0 {
        public b() {
            super(d0.this);
        }

        @Override // h5.l0
        public final int I0(f5.a aVar) {
            int iL = gg.b.l(this, aVar);
            this.f81894w.h(aVar, iL);
            return iL;
        }

        @Override // h5.m0, f5.w
        public final int O(int i14) {
            d0 d0Var = d0.this;
            c0 c0Var = d0Var.U0;
            c1 c1Var = d0Var.f81714t;
            c1Var.getClass();
            m0 m0VarD1 = c1Var.D1();
            m0VarD1.getClass();
            return c0Var.minIntrinsicWidth(this, m0VarD1, i14);
        }

        @Override // f5.y0
        public final f5.v1 Q(long j8) {
            E0(j8);
            g6.a aVarA = g6.a.a(j8);
            d0 d0Var = d0.this;
            d0Var.V0 = aVarA;
            c0 c0Var = d0Var.U0;
            c1 c1Var = d0Var.f81714t;
            c1Var.getClass();
            m0 m0VarD1 = c1Var.D1();
            m0VarD1.getClass();
            m0.g1(this, c0Var.mo5measure3p2s80s(this, m0VarD1, j8));
            return this;
        }

        @Override // h5.m0, f5.w
        public final int a0(int i14) {
            d0 d0Var = d0.this;
            c0 c0Var = d0Var.U0;
            c1 c1Var = d0Var.f81714t;
            c1Var.getClass();
            m0 m0VarD1 = c1Var.D1();
            m0VarD1.getClass();
            return c0Var.maxIntrinsicHeight(this, m0VarD1, i14);
        }

        @Override // h5.m0, f5.w
        public final int e0(int i14) {
            d0 d0Var = d0.this;
            c0 c0Var = d0Var.U0;
            c1 c1Var = d0Var.f81714t;
            c1Var.getClass();
            m0 m0VarD1 = c1Var.D1();
            m0VarD1.getClass();
            return c0Var.minIntrinsicHeight(this, m0VarD1, i14);
        }

        @Override // h5.m0, f5.w
        public final int l0(int i14) {
            d0 d0Var = d0.this;
            c0 c0Var = d0Var.U0;
            c1 c1Var = d0Var.f81714t;
            c1Var.getClass();
            m0 m0VarD1 = c1Var.D1();
            m0VarD1.getClass();
            return c0Var.maxIntrinsicWidth(this, m0VarD1, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/d0$c", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements f5.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.a1 f81747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81749c;

        public c(f5.a1 a1Var, d0 d0Var) {
            this.f81747a = a1Var;
            b bVar = d0Var.W0;
            bVar.getClass();
            this.f81748b = bVar.f69144a;
            b bVar2 = d0Var.W0;
            bVar2.getClass();
            this.f81749c = bVar2.f69145b;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public final int getF68935b() {
            return this.f81749c;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public final int getF68934a() {
            return this.f81748b;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f81747a.p();
        }

        @Override // f5.a1
        public final void q() {
            this.f81747a.q();
        }

        @Override // f5.a1
        public final e23.l<f5.e2, Unit> r() {
            return this.f81747a.r();
        }
    }

    static {
        new a(null);
        o4.h hVar = new o4.h();
        o4.d0.f128823b.getClass();
        hVar.e(o4.d0.f128828g);
        hVar.q(1.0f);
        o4.e1.f128845b.getClass();
        hVar.r(o4.e1.f128846c);
        Y0 = hVar;
    }

    public d0(e0 e0Var, c0 c0Var) {
        super(e0Var);
        this.U0 = c0Var;
        this.W0 = e0Var.f81767h != null ? new b() : null;
        this.X0 = (c0Var.getNode().getKindSet() & 512) != 0 ? new f5.f(this, (f5.e) c0Var) : null;
    }

    @Override // h5.c1
    public final m0 D1() {
        return this.W0;
    }

    @Override // h5.c1
    public final h4.r.c F1() {
        return this.U0.getNode();
    }

    @Override // h5.l0
    public final int I0(f5.a aVar) {
        b bVar = this.W0;
        if (bVar == null) {
            return gg.b.l(this, aVar);
        }
        p1.p0<f5.a> p0Var = bVar.f81894w;
        int iA = p0Var.a(aVar);
        if (iA >= 0) {
            return p0Var.f134875c[iA];
        }
        return Integer.MIN_VALUE;
    }

    @Override // f5.w
    public final int O(int i14) {
        f5.f fVar = this.X0;
        if (fVar != null) {
            f5.e eVar = fVar.f68932b;
            c1 c1Var = this.f81714t;
            c1Var.getClass();
            return eVar.g1(fVar, c1Var, i14);
        }
        c0 c0Var = this.U0;
        c1 c1Var2 = this.f81714t;
        c1Var2.getClass();
        return c0Var.minIntrinsicWidth(this, c1Var2, i14);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // f5.y0
    public final f5.v1 Q(long j8) {
        f5.a1 a1VarMo5measure3p2s80s;
        boolean z14;
        g6.a aVar;
        if (this.f81713r) {
            g6.a aVar2 = this.V0;
            if (aVar2 == null) {
                vb.h.s("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j8 = aVar2.f75988a;
        }
        E0(j8);
        f5.f fVar = this.X0;
        if (fVar != null) {
            f5.e eVar = fVar.f68932b;
            b bVar = fVar.f68931a.W0;
            bVar.getClass();
            f5.a1 a1VarQ0 = bVar.Q0();
            a1VarQ0.getF68934a();
            a1VarQ0.getF68935b();
            g6.m.a aVar3 = g6.m.f76012b;
            boolean z15 = eVar.N1() || (aVar = this.V0) == null || j8 != aVar.f75988a;
            fVar.f68933c = z15;
            if (!z15) {
                c1 c1Var = this.f81714t;
                c1Var.getClass();
                c1Var.f81713r = true;
            }
            this.f81714t.getClass();
            a1VarMo5measure3p2s80s = eVar.c0();
            c1 c1Var2 = this.f81714t;
            c1Var2.getClass();
            c1Var2.f81713r = false;
            int f81748b = a1VarMo5measure3p2s80s.getF68934a();
            b bVar2 = this.W0;
            bVar2.getClass();
            if (f81748b == bVar2.f69144a) {
                int f81749c = a1VarMo5measure3p2s80s.getF68935b();
                b bVar3 = this.W0;
                bVar3.getClass();
                z14 = f81749c == bVar3.f69145b;
            }
            if (!fVar.f68933c) {
                c1 c1Var3 = this.f81714t;
                c1Var3.getClass();
                long j14 = c1Var3.f69146c;
                c1 c1Var4 = this.f81714t;
                c1Var4.getClass();
                m0 m0VarD1 = c1Var4.D1();
                if (g6.m.b(j14, m0VarD1 != null ? g6.m.a(m0VarD1.l1()) : null) && !z14) {
                    a1VarMo5measure3p2s80s = new c(a1VarMo5measure3p2s80s, this);
                }
            }
        } else {
            c0 c0Var = this.U0;
            c1 c1Var5 = this.f81714t;
            c1Var5.getClass();
            a1VarMo5measure3p2s80s = c0Var.mo5measure3p2s80s(this, c1Var5, j8);
        }
        d2(a1VarMo5measure3p2s80s);
        U1();
        return this;
    }

    @Override // h5.c1
    public final void Z1(o4.y yVar, r4.c cVar) {
        c1 c1Var;
        c1 c1Var2 = this.f81714t;
        c1Var2.getClass();
        c1Var2.s1(yVar, cVar);
        if (!i0.a(this.f81711p).getShowLayoutBounds() || (c1Var = this.f81714t) == null) {
            return;
        }
        if (g6.m.c(this.f69146c, c1Var.f69146c)) {
            long j8 = c1Var.E;
            g6.k.f76003b.getClass();
            if (g6.k.c(j8, 0L)) {
                return;
            }
        }
        long j14 = this.f69146c;
        yVar.k(0.5f, 0.5f, ((int) (j14 >> 32)) - 0.5f, ((int) (j14 & 4294967295L)) - 0.5f, Y0);
    }

    @Override // f5.w
    public final int a0(int i14) {
        f5.f fVar = this.X0;
        if (fVar != null) {
            f5.e eVar = fVar.f68932b;
            c1 c1Var = this.f81714t;
            c1Var.getClass();
            return eVar.S0(fVar, c1Var, i14);
        }
        c0 c0Var = this.U0;
        c1 c1Var2 = this.f81714t;
        c1Var2.getClass();
        return c0Var.maxIntrinsicHeight(this, c1Var2, i14);
    }

    @Override // f5.w
    public final int e0(int i14) {
        f5.f fVar = this.X0;
        if (fVar != null) {
            f5.e eVar = fVar.f68932b;
            c1 c1Var = this.f81714t;
            c1Var.getClass();
            return eVar.O(fVar, c1Var, i14);
        }
        c0 c0Var = this.U0;
        c1 c1Var2 = this.f81714t;
        c1Var2.getClass();
        return c0Var.minIntrinsicHeight(this, c1Var2, i14);
    }

    @Override // f5.w
    public final int l0(int i14) {
        f5.f fVar = this.X0;
        if (fVar != null) {
            f5.e eVar = fVar.f68932b;
            c1 c1Var = this.f81714t;
            c1Var.getClass();
            return eVar.U0(fVar, c1Var, i14);
        }
        c0 c0Var = this.U0;
        c1 c1Var2 = this.f81714t;
        c1Var2.getClass();
        return c0Var.maxIntrinsicWidth(this, c1Var2, i14);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    public final void n2() {
        boolean z14;
        if (this.f81864j) {
            return;
        }
        V1();
        c1 c1Var = this.f81714t;
        c1Var.getClass();
        f5.f fVar = this.X0;
        if (fVar != null) {
            f5.e eVar = fVar.f68932b;
            this.W0.getClass();
            eVar.getClass();
            if (fVar.f68933c) {
                z14 = false;
            } else {
                long j8 = this.f69146c;
                b bVar = this.W0;
                if (g6.m.b(j8, bVar != null ? g6.m.a(bVar.l1()) : null)) {
                    long j14 = c1Var.f69146c;
                    m0 m0VarD1 = c1Var.D1();
                    if (g6.m.b(j14, m0VarD1 != null ? g6.m.a(m0VarD1.l1()) : null)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
            }
            c1Var.f81712q = z14;
        }
        c1Var.f81865k = this.f81865k;
        Q0().q();
        c1Var.f81865k = false;
        c1Var.f81712q = false;
    }

    public final void o2(c0 c0Var) {
        if (!c0Var.equals(this.U0)) {
            if ((c0Var.getNode().getKindSet() & 512) != 0) {
                f5.e eVar = (f5.e) c0Var;
                f5.f fVar = this.X0;
                if (fVar != null) {
                    fVar.f68932b = eVar;
                } else {
                    fVar = new f5.f(this, eVar);
                }
                this.X0 = fVar;
            } else {
                this.X0 = null;
            }
        }
        this.U0 = c0Var;
    }

    @Override // h5.c1, f5.v1
    public final void u0(float f14, long j8, e23.l lVar) {
        super.u0(f14, j8, lVar);
        n2();
    }

    @Override // h5.c1
    public final void v1() {
        if (this.W0 == null) {
            this.W0 = new b();
        }
    }

    @Override // h5.c1, f5.v1
    public final void z0(long j8, float f14, r4.c cVar) {
        super.z0(j8, f14, cVar);
        n2();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/d0$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
