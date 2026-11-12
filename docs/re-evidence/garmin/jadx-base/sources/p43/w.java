package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends y implements u, t43.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f135930d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f135931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135932c;

    private w(v0 v0Var, boolean z14) {
        this.f135931b = v0Var;
        this.f135932c = z14;
    }

    @Override // p43.y, p43.n0
    public final boolean G0() {
        return false;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        return z14 ? this.f135931b.J0(z14) : this;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return new w(this.f135931b.L0(k1Var), this.f135932c);
    }

    @Override // p43.y
    public final v0 O0() {
        return this.f135931b;
    }

    @Override // p43.y
    public final y Q0(v0 v0Var) {
        return new w(v0Var, this.f135932c);
    }

    @Override // p43.u
    public final boolean T() {
        v0 v0Var = this.f135931b;
        return (v0Var.F0() instanceof q43.p) || (v0Var.F0().t() instanceof t23.d1);
    }

    @Override // p43.v0
    public final String toString() {
        return this.f135931b + " & Any";
    }

    @Override // p43.u
    public final f2 y(n0 n0Var) {
        n0Var.getClass();
        return z0.a(n0Var.I0(), this.f135932c);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static w a(a aVar, f2 f2Var, boolean z14) {
            boolean zG;
            aVar.getClass();
            f2Var.getClass();
            if (f2Var instanceof w) {
                return (w) f2Var;
            }
            p005kotlin.jvm.internal.j jVar = null;
            if (!(f2Var.F0() instanceof q43.p) && !(f2Var.F0().t() instanceof t23.d1) && !(f2Var instanceof q43.h) && !(f2Var instanceof e1)) {
                zG = false;
            } else if (f2Var instanceof e1) {
                zG = d2.g(f2Var);
            } else {
                t23.h hVarT = f2Var.F0().t();
                w23.w0 w0Var = hVarT instanceof w23.w0 ? (w23.w0) hVarT : null;
                if (w0Var != null && !w0Var.f181722m) {
                    zG = true;
                } else if (z14 && (f2Var.F0().t() instanceof t23.d1)) {
                    zG = d2.g(f2Var);
                } else {
                    q43.q.f142812a.getClass();
                    c cVar = c.f135803a;
                    q43.s sVar = q43.s.f142813a;
                    sVar.getClass();
                    l1 l1VarA = q43.a.a(false, sVar, null, null, 24);
                    v0 v0VarQ = oi0.c.Q(f2Var);
                    l1.c.b bVar = l1.c.b.f135881a;
                    cVar.getClass();
                    zG = !c.a(l1VarA, v0VarQ, bVar);
                }
            }
            if (!zG) {
                return null;
            }
            if (f2Var instanceof f0) {
                f0 f0Var = (f0) f2Var;
                p005kotlin.jvm.internal.s.g(f0Var.f135829b.F0(), f0Var.f135830c.F0());
            }
            return new w(oi0.c.Q(f2Var).J0(false), z14, jVar);
        }

        private a() {
        }
    }

    public /* synthetic */ w(v0 v0Var, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(v0Var, z14);
    }
}
