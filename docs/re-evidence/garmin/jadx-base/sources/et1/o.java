package et1;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    public static final void a(pt1.h hVar, fe feVar, e23.a aVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.p pVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        e23.p pVar2;
        e23.a aVar3;
        p3.o0 o0Var;
        hVar.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-430685849);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(hVar) ? 4 : 2) | i14;
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
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            pVar2 = pVar;
            i15 |= o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            pVar2 = pVar;
        }
        if ((12582912 & i14) == 0) {
            aVar3 = aVar2;
            i15 |= o0VarE.r(aVar3) ? 8388608 : 4194304;
        } else {
            aVar3 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new e40.d(hVar, 6);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e40.d(hVar, 6);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            z02.d.a(hVar.f140850a, z3.f.c(235599724, new et.p(hVar, aVar, (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0), pVar2, aVar3), o0VarE), z3.f.c(313720813, new ak0.o(feVar, 7), o0VarE), null, null, z3.f.c(548084080, new d50.i((Object) hVar, (Object) lVar3, (Object) lVar, (o13.h) lVar2, 14), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(hVar, feVar, aVar, lVar, lVar2, lVar3, pVar, aVar2, i14);
        }
    }
}
