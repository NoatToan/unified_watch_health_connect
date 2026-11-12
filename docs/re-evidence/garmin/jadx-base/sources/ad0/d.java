package ad0;

import a03.n0;
import a03.t0;
import b.u;
import gl1.y;
import lc.m0;
import lc.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    public static final void a(String str, zc0.c cVar, p3.m mVar, int i14) {
        o0 o0Var;
        cVar.getClass();
        o0 o0VarE = mVar.E(-514949495);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(cVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            u uVar = (u) o0VarE.A(g02.d.f74342a);
            ad0.a.c cVar2 = ad0.a.c.INSTANCE;
            boolean zR = o0VarE.r(cVar) | ((i15 & 14) == 4) | o0VarE.r(uVar) | o0VarE.r(m0VarI);
            Object objQ = o0VarE.q();
            if (zR) {
                n0 n0Var = new n0(cVar, str, uVar, m0VarI, 2);
                o0VarE.K(n0Var);
                objQ = n0Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    n0 n0Var2 = new n0(cVar, str, uVar, m0VarI, 2);
                    o0VarE.K(n0Var2);
                    objQ = n0Var2;
                }
            }
            o0Var = o0VarE;
            nc.y.a(m0VarI, cVar2, null, null, null, null, null, null, null, (e23.l) objQ, o0Var, 48, 2044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t0(str, cVar, i14, 3);
        }
    }
}
