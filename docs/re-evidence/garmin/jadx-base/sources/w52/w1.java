package w52;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class w1 {
    public static final void a(e23.a aVar, r53.i iVar, r53.i iVar2, List list, r52.b bVar, List list2, r52.b bVar2, r52.g gVar, e23.a aVar2, e23.l lVar, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.l lVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        Unit unit;
        p3.p1 p1Var;
        aVar.getClass();
        list.getClass();
        bVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(1726796954);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(iVar) ? 32 : 16) | (o0VarE.r(iVar2) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.B(bVar) ? 16384 : 8192) | (o0VarE.r(list2) ? 131072 : 65536) | (o0VarE.B(bVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.B(gVar) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        int i16 = (o0VarE.r(aVar3) ? (char) 4 : (char) 2) | (o0VarE.r(aVar4) ? ' ' : (char) 16) | (o0VarE.r(aVar5) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 1171) == 1170) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarB = s9.c.b(iVar2, v52.c.b.f175759a, o0VarE, ((i15 >> 6) & 14) | 48);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Unit unit2 = Unit.INSTANCE;
            boolean zR = o0VarE.r(iVar) | ((i15 & 1879048192) == 536870912) | ((i16 & 14) == 4) | o0VarE.r(iVar2) | ((i15 & 234881024) == 67108864);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                unit = unit2;
                p1Var = p1Var2;
                s1 s1Var = new s1(aVar2, iVar, p1Var, lVar, aVar3, iVar2, null);
                o0VarE.K(s1Var);
                objQ2 = s1Var;
            } else {
                p1Var = p1Var2;
                unit = unit2;
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, z3.f.c(397052880, new bv0.h(p1VarB, p1Var, list, aVar, aVar4, aVar5, lVar2, bVar, gVar, i15, bVar2, list2), o0VarE), o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o50.b(aVar, iVar, iVar2, list, bVar, list2, bVar2, gVar, aVar2, lVar, aVar3, aVar4, aVar5, lVar2, i14, 3);
        }
    }
}
