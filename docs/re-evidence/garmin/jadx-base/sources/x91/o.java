package x91;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import p3.l1;
import p3.o0;
import p3.o1;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    public static final void a(aa1.e eVar, fe feVar, e23.l lVar, e23.p pVar, e23.a aVar, e23.a aVar2, e23.p pVar2, e23.l lVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, p3.m mVar, int i14, int i15) {
        e23.a aVar6;
        e23.p pVar3;
        e23.a aVar7;
        int i16;
        int i17;
        char c14;
        o0 o0Var;
        e23.a aVar8;
        e23.a aVar9;
        e23.a aVar10;
        e23.a aVar11;
        eVar.getClass();
        feVar.getClass();
        lVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        pVar2.getClass();
        lVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1600916872);
        int i18 = (o0VarE.B(eVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i18 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i18 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i18 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i18 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar6 = aVar2;
            i18 |= o0VarE.r(aVar6) ? 131072 : 65536;
        } else {
            aVar6 = aVar2;
        }
        if ((1572864 & i14) == 0) {
            pVar3 = pVar2;
            i18 |= o0VarE.r(pVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            pVar3 = pVar2;
        }
        if ((12582912 & i14) == 0) {
            i18 |= o0VarE.r(lVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            aVar7 = aVar3;
            i18 |= o0VarE.r(aVar7) ? 67108864 : 33554432;
        } else {
            aVar7 = aVar3;
        }
        int i19 = i15 & 512;
        if (i19 != 0) {
            i16 = i18 | C.ENCODING_PCM_32BIT;
        } else {
            i16 = i18 | (o0VarE.r(aVar4) ? 536870912 : 268435456);
        }
        int i24 = i15 & 1024;
        if (i24 != 0) {
            c14 = 6;
            i17 = i16;
        } else {
            i17 = i16;
            c14 = o0VarE.r(aVar5) ? (char) 4 : (char) 2;
        }
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            p3.m.a aVar12 = p3.m.f135153a;
            if (i19 != 0) {
                Object objQ = o0VarE.q();
                aVar12.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new x1.b(27);
                    o0VarE.K(objQ);
                }
                aVar10 = (e23.a) objQ;
            } else {
                aVar10 = aVar4;
            }
            if (i24 != 0) {
                Object objQ2 = o0VarE.q();
                aVar12.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new x1.b(28);
                    o0VarE.K(objQ2);
                }
                aVar11 = (e23.a) objQ2;
            } else {
                aVar11 = aVar5;
            }
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ3 = o0VarE.q();
            aVar12.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new x1.b(22);
                o0VarE.K(objQ3);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ4 = o0VarE.q();
            int i25 = 23;
            if (objQ4 == c2565a) {
                objQ4 = new x1.b(i25);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ4, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new x1.b(24);
                o0VarE.K(objQ5);
            }
            o1 o1Var = (o1) d4.a.e(objArr3, (e23.a) objQ5, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new x1.b(25);
                o0VarE.K(objQ6);
            }
            z02.d.a(eVar.f2259a, z3.f.c(733011859, new vx1.b(eVar, 23, aVar11, aVar10), o0VarE), z3.f.c(-1138849870, new f(feVar, 2), o0VarE), null, null, z3.f.c(1835499535, new dj0.j(eVar, pVar, (l1) d4.a.e(objArr4, (e23.a) objQ6, o0VarE, 48), aVar, aVar6, p1Var, pVar3, o1Var, p1Var2, lVar2, aVar7, lVar), o0VarE), o0VarE, 197040, 24);
            o0Var = o0VarE;
            aVar8 = aVar10;
            aVar9 = aVar11;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar8 = aVar4;
            aVar9 = aVar5;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new go.a(eVar, feVar, lVar, pVar, aVar, aVar2, pVar2, lVar2, aVar3, aVar8, aVar9, i14, i15, 3);
        }
    }
}
