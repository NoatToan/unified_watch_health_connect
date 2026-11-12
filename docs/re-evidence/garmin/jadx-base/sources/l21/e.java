package l21;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Map;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;
import yc.v2;
import yc.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    public static final void a(h4.r rVar, m21.e eVar, v21.e eVar2, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i14) {
        o0 o0Var;
        zc.d dVarA;
        eVar.getClass();
        eVar2.getClass();
        o0 o0VarE = mVar.E(-1936719779);
        int i15 = i14 | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(eVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Map<k21.a, r53.i<v2<g01.n>>> map = eVar.f116098o;
            k21.a aVar2 = k21.a.FAVORITES;
            r53.i<v2<g01.n>> iVar = map.get(aVar2);
            if (iVar == null) {
                o0VarE.C(1772120842);
                o0VarE.g0(false);
                dVarA = null;
            } else {
                o0VarE.C(-1466855465);
                dVarA = zc.g.a(iVar, o0VarE);
                o0VarE.g0(false);
            }
            Boolean bool = eVar.f116097n.get(aVar2);
            int i16 = i15 & 7168;
            boolean zR = o0VarE.r(eVar) | o0VarE.r(dVarA) | (i16 == 2048);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new d(eVar, dVarA, aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d(eVar, dVarA, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, bool, o0VarE);
            if (dVarA != null) {
                o0VarE.C(1772461564);
                boolean z14 = dVarA.d().f196385a instanceof z0.b;
                boolean z15 = true;
                m3.s sVarE = m3.l.e(o0VarE);
                boolean zR2 = o0VarE.r(dVarA);
                if (i16 != 2048) {
                    z15 = false;
                }
                boolean z16 = zR2 | z15;
                Object objQ2 = o0VarE.q();
                if (z16) {
                    objQ2 = new fo.h(dVarA, aVar, 2);
                    o0VarE.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new fo.h(dVarA, aVar, 2);
                        o0VarE.K(objQ2);
                    }
                }
                m3.l.b(z14, (e23.a) objQ2, rVar, sVarE, null, z3.f.c(247842385, new p003ji0.e(z14, sVarE, 2), o0VarE), z3.f.c(325963474, new ak0.h(dVarA, eVar, lVar3, eVar2, lVar, lVar2, 14), o0VarE), o0VarE, 1769856, 16);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(1774991877);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(i14, 18, rVar, eVar, eVar2, aVar, lVar, lVar2, lVar3);
        }
    }
}
