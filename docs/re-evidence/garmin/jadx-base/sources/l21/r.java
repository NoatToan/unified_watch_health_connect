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
public final class r {
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    public static final void a(int i14, e23.a aVar, e23.a aVar2, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, h4.r rVar, m21.e eVar, p3.m mVar, v21.e eVar2) {
        o0 o0Var;
        zc.d dVarA;
        int i15;
        eVar.getClass();
        eVar2.getClass();
        o0 o0VarE = mVar.E(1754183006);
        int i16 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(eVar2) ? 32 : 16) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.r(lVar2) ? 131072 : 65536) | (o0VarE.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar4) ? 67108864 : 33554432);
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Map<k21.a, r53.i<v2<g01.n>>> map = eVar.f116098o;
            k21.a aVar3 = k21.a.MY_MEALS;
            r53.i<v2<g01.n>> iVar = map.get(aVar3);
            if (iVar == null) {
                o0VarE.C(1999338121);
                o0VarE.g0(false);
                dVarA = null;
            } else {
                o0VarE.C(2142704760);
                dVarA = zc.g.a(iVar, o0VarE);
                o0VarE.g0(false);
            }
            Boolean bool = eVar.f116097n.get(aVar3);
            int i17 = i16 & 7168;
            boolean zR = o0VarE.r(eVar) | o0VarE.r(dVarA) | (i17 == 2048);
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zR) {
                objQ = new q(eVar, dVarA, aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q(eVar, dVarA, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, bool, o0VarE);
            if (dVarA != null) {
                o0VarE.C(1999721530);
                boolean z14 = dVarA.d().f196385a instanceof z0.b;
                m3.s sVarE = m3.l.e(o0VarE);
                boolean zR2 = o0VarE.r(dVarA) | (i17 == 2048);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    i15 = 4;
                    objQ2 = new fo.h(dVarA, aVar, 4);
                    o0VarE.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        i15 = 4;
                        objQ2 = new fo.h(dVarA, aVar, 4);
                        o0VarE.K(objQ2);
                    } else {
                        i15 = 4;
                    }
                }
                o0Var = o0VarE;
                m3.l.b(z14, (e23.a) objQ2, rVar, sVarE, null, z3.f.c(2055344978, new p003ji0.e(z14, sVarE, i15), o0VarE), z3.f.c(598931923, new j(1, aVar2, lVar4, lVar, lVar2, lVar3, eVar, eVar2, dVarA), o0VarE), o0Var, 1769856, 16);
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(2003636644);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(eVar, eVar2, rVar, aVar, lVar, lVar2, lVar3, aVar2, lVar4, i14, 1);
        }
    }
}
