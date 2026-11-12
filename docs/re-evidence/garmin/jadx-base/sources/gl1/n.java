package gl1;

import androidx.lifecycle.j1;
import lc.k0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import vn2.b1;
import vv0.e0;
import vv0.f0;
import vv0.h0;
import vv0.i0;
import vv0.l0;
import vv0.m0;
import vv0.n0;
import vv0.o0;
import vv0.p0;
import vv0.q0;
import vv0.r0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.y f77854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f77855c;

    public /* synthetic */ n(int i14, e23.a aVar, lc.y yVar) {
        this.f77853a = i14;
        this.f77854b = yVar;
        this.f77855c = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        j1 j1VarA;
        j1 j1VarA2;
        j1 j1VarA3;
        j1 j1VarA4;
        j1 j1VarA5;
        switch (this.f77853a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                lc.v vVarF = this.f77854b.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(bool, "REFRESH_DATA");
                }
                this.f77855c.invoke();
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                lc.v vVarF2 = this.f77854b.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(bool2, "REFRESH_DATA");
                }
                this.f77855c.invoke();
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                lc.v vVarF3 = this.f77854b.f();
                if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                    j1VarA3.f(bool3, "REFRESH_DATA");
                }
                this.f77855c.invoke();
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    this.f77854b.h(new b1(18), vv0.y.INSTANCE);
                } else {
                    this.f77855c.invoke();
                }
                break;
            case 4:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                lc.y yVar = this.f77854b;
                e23.a aVar = this.f77855c;
                z3.e eVar = new z3.e(545043575, true, new qw.b(yVar, aVar, new gk1.b(yVar, 13), new gk1.b(yVar, 14), 8));
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                m0 m0Var = m0.f180464a;
                n0 n0Var = n0.f180468a;
                o0 o0Var = o0.f180470a;
                p0 p0Var = p0.f180472a;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                nc.n.a(k0Var, t0Var.b(h0.class), k0Var2, j0Var, m0Var, n0Var, o0Var, p0Var, eVar);
                nc.n.a(k0Var, t0Var.b(f0.class), k0Var2, j0Var, q0.f180474a, r0.f180476a, vv0.s0.f180480a, vv0.t0.f180482a, new z3.e(-73211094, true, new vv0.m(2, aVar, yVar)));
                nc.n.a(k0Var, t0Var.b(e0.class), k0Var2, j0Var, i0.f180454a, vv0.j0.f180456a, vv0.k0.f180458a, l0.f180460a, new z3.e(995166437, true, new vv0.m(3, aVar, yVar)));
                break;
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                lc.v vVarF4 = this.f77854b.f();
                if (vVarF4 != null && (j1VarA4 = vVarF4.a()) != null) {
                    j1VarA4.f(bool4, "REFRESH_DATA");
                }
                this.f77855c.invoke();
                break;
            default:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                lc.v vVarF5 = this.f77854b.f();
                if (vVarF5 != null && (j1VarA5 = vVarF5.a()) != null) {
                    j1VarA5.f(bool5, "REFRESH_DATA");
                }
                this.f77855c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
