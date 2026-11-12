package zq0;

import e23.l;
import lc.m0;
import nc.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import zo1.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, m0.class, "popBackStack", "popBackStack()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((m0) this.receiver).n();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.a implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, m0.class, "popBackStack", "popBackStack()Z", 8);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((m0) this.receiver).n();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    public static final void a(m0 m0Var, e eVar, e23.a<Unit> aVar, m mVar, int i14) {
        m0Var.getClass();
        eVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(316043696);
        int i15 = i14 | (o0VarE.r(m0Var) ? 4 : 2) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(m0Var) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new jl0.b(m0Var, aVar, 1);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new jl0.b(m0Var, aVar, 1);
                    o0VarE.K(objQ);
                }
            }
            y.a(m0Var, eVar, null, null, null, null, null, null, null, (l) objQ, o0VarE, i15 & 126, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(m0Var, eVar, aVar, i14, 1);
        }
    }
}
