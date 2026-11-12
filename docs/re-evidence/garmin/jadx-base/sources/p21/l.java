package p21;

import am.j1;
import c.w;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import i3.fe;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import q21.q;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q qVar, fe feVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, e23.a aVar7, e23.l lVar, e23.a aVar8, m mVar, int i14) {
        int i15;
        e23.a aVar9;
        e23.a aVar10;
        e23.a aVar11;
        e23.l lVar2;
        o0 o0Var;
        qVar.getClass();
        feVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        lVar.getClass();
        aVar8.getClass();
        o0 o0VarE = mVar.E(-37370020);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(qVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            aVar9 = aVar5;
            i15 |= o0VarE.r(aVar9) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            aVar9 = aVar5;
        }
        if ((12582912 & i14) == 0) {
            aVar10 = aVar6;
            i15 |= o0VarE.r(aVar10) ? 8388608 : 4194304;
        } else {
            aVar10 = aVar6;
        }
        if ((100663296 & i14) == 0) {
            aVar11 = aVar7;
            i15 |= o0VarE.r(aVar11) ? 67108864 : 33554432;
        } else {
            aVar11 = aVar7;
        }
        if ((805306368 & i14) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 536870912 : 268435456;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && ((o0VarE.r(aVar8) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new j1(p1Var, p1Var2, 20);
                o0VarE.K(objQ3);
            }
            w.a(48, 0, (e23.a) objQ3, o0VarE, zBooleanValue);
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.getClass();
            boolean z14 = (i15 & 896) == 256;
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new k(aVar, p1Var2, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, bool, o0VarE);
            o0Var = o0VarE;
            z02.d.a(qVar.f142282e, z3.f.c(1005013473, new ll1.g(aVar, 28), o0VarE), z3.f.c(-710585118, new b(feVar, 4), o0VarE), null, null, z3.f.c(-1562413595, new c42.d(qVar, aVar8, aVar2, aVar3, aVar4, aVar11, aVar9, aVar10, lVar2), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bv0.h(qVar, feVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, lVar, aVar8, i14);
        }
    }
}
