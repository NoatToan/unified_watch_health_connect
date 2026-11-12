package ua0;

import e23.l;
import l72.p2;
import l90.i;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import tb0.d;
import tr2.o;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    public static final void a(l90.b bVar, l<? super l90.b, Unit> lVar, m mVar, int i14) {
        e eVar;
        bVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1757442683);
        int i15 = 4;
        int i16 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p2 p2Var = p2.f111205a;
            String str = bVar.f111521f;
            e eVarC = f.c(1718093489, new o(bVar, i15), o0VarE);
            i iVar = bVar.f111529n;
            if (iVar == i.GOLF_APP_DEVICE_SETUP || iVar == i.DIVE_APP_DEVICE_SETUP) {
                a.f169596a.getClass();
                eVar = a.f169597b;
            } else {
                eVar = null;
            }
            boolean zR = o0VarE.r(bVar) | ((i16 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d(25, lVar, bVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d(25, lVar, bVar);
                    o0VarE.K(objQ);
                }
            }
            p2Var.g(str, null, null, eVarC, eVar, false, false, (e23.a) objQ, o0VarE, 3072, 230);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u91.i(bVar, lVar, i14, z14);
        }
    }
}
