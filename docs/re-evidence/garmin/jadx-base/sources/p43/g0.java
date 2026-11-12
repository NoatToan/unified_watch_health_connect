package p43;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends f0 implements u {
    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(v0 v0Var, v0 v0Var2) {
        super(v0Var, v0Var2);
        v0Var.getClass();
        v0Var2.getClass();
    }

    @Override // p43.f2
    public final f2 J0(boolean z14) {
        return q0.b(this.f135829b.J0(z14), this.f135830c.J0(z14));
    }

    @Override // p43.f2
    public final f2 L0(k1 k1Var) {
        k1Var.getClass();
        return q0.b(this.f135829b.L0(k1Var), this.f135830c.L0(k1Var));
    }

    @Override // p43.f0
    public final v0 M0() {
        return this.f135829b;
    }

    @Override // p43.f0
    public final String N0(a43.w wVar, a43.w wVar2) {
        boolean zN = wVar2.f1180e.n();
        v0 v0Var = this.f135830c;
        v0 v0Var2 = this.f135829b;
        if (!zN) {
            return wVar.F(wVar.W(v0Var2), wVar.W(v0Var), o72.t.D(this));
        }
        return "(" + wVar.W(v0Var2) + CallerDataConverter.DEFAULT_RANGE_DELIMITER + wVar.W(v0Var) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final f0 H0(q43.f fVar) {
        fVar.getClass();
        return new g0((v0) fVar.f(this.f135829b), (v0) fVar.f(this.f135830c));
    }

    @Override // p43.u
    public final boolean T() {
        v0 v0Var = this.f135829b;
        return (v0Var.F0().t() instanceof t23.d1) && p005kotlin.jvm.internal.s.g(v0Var.F0(), this.f135830c.F0());
    }

    @Override // p43.f0
    public final String toString() {
        return "(" + this.f135829b + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f135830c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p43.u
    public final f2 y(n0 n0Var) {
        f2 f2VarB;
        n0Var.getClass();
        f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof f0) {
            f2VarB = f2VarI0;
        } else {
            if (!(f2VarI0 instanceof v0)) {
                lc.u0.r();
                return null;
            }
            v0 v0Var = (v0) f2VarI0;
            f2VarB = q0.b(v0Var, v0Var.J0(true));
        }
        return og.a.P(f2VarB, f2VarI0);
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
