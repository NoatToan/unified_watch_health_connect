package hl1;

import g02.q0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, v.class, "loadWorkouts", "loadWorkouts()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((v) this.receiver).x4();
            return Unit.INSTANCE;
        }
    }

    public static final void a(u uVar, e23.a<Unit> aVar, e23.p<? super zf2.i, ? super String, Unit> pVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(724443926);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(uVar) : o0VarE.r(uVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            u00.a aVar3 = new u00.a(a0.s(o0VarE));
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            z02.d.a(uVar.f84463a, z3.f.c(1096661681, new i(aVar2, 1), o0VarE), null, z3.f.c(-833840145, new e11.m(p1Var, pVar, 4), o0VarE), null, z3.f.c(1530625325, new et.p(uVar, aVar, aVar2, p1Var, aVar3, 19), o0VarE), o0VarE, 199728, 20);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(uVar, aVar, pVar, aVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(v vVar, e23.p<? super zf2.i, ? super String, Unit> pVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        vVar.getClass();
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-627504101);
        int i15 = i14 | (o0VarE.r(vVar) ? 4 : 2) | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            u uVar = (u) p0.c(vVar.f84469d, o0VarE, 0).getF182175a();
            boolean zR = o0VarE.r(vVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new a(vVar);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(vVar);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) ((k23.g) objQ);
            boolean z14 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new a3.d(pVar, 16);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a3.d(pVar, 16);
                    o0VarE.K(objQ2);
                }
            }
            a(uVar, aVar3, (e23.p) objQ2, aVar, o0VarE, (i15 << 3) & 7168);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(vVar, pVar, aVar, i14, 4);
        }
    }
}
