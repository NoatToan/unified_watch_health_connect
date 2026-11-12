package s2;

import e23.l;
import e23.s;
import f5.c0;
import h4.r;
import o2.h;
import ot1.i;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.h0;
import p3.l0;
import p3.m;
import p3.m2;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.t1;
import p3.v;
import p3.x1;
import qw0.y;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"s2/d$a", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements h0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f156001a;

        public a(b bVar) {
            this.f156001a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p3.h0
        public final void dispose() {
            b.a aVar = (b.a) this.f156001a.f155995c.getF182175a();
            if (aVar != null) {
                aVar.close();
            }
        }
    }

    public static final void a(r rVar, m2 m2Var, s sVar, z3.e eVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-714464401);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(m2Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                t1 t1Var = t1.f135313a;
                t1Var.getClass();
                c2 c2Var = new c2(null, t1Var);
                o0VarE.K(c2Var);
                objQ = c2Var;
            }
            b bVarB = b(sVar, o0VarE, (i15 >> 6) & 14);
            v.a(m2Var.c(bVarB), z3.f.c(274270255, new qy0.d(rVar, (p1) objQ, eVar, bVarB, 21), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(rVar, m2Var, sVar, eVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    public static final b b(s<? super h, ? super e, ? super e23.a<? extends c0>, ? super m, ? super Integer, Unit> sVar, m mVar, int i14) {
        x1 x1Var = n.f135158a;
        boolean z14 = (((i14 & 14) ^ 6) > 4 && mVar.B(sVar)) || (i14 & 6) == 4;
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (z14) {
            objQ = new b(sVar);
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new b(sVar);
                mVar.K(objQ);
            }
        }
        b bVar = (b) objQ;
        boolean zB = mVar.B(bVar);
        Object objQ2 = mVar.q();
        if (zB) {
            objQ2 = new y(bVar, 27);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = new y(bVar, 27);
                mVar.K(objQ2);
            }
        }
        l0.a(bVar, (l) objQ2, mVar);
        return bVar;
    }
}
