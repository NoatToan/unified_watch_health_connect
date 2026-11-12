package gt1;

import androidx.room.a0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:79:0x013c  */
    public static final void a(pt1.p pVar, h4.r rVar, boolean z14, e23.l lVar, e23.a aVar, e23.l lVar2, e23.p pVar2, e23.a aVar2, e23.l lVar3, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        pVar2.getClass();
        o0 o0VarO = a0.o(aVar2, lVar3, mVar, -1925412612);
        int i16 = i14 | (o0VarO.B(pVar) ? 4 : 2) | (o0VarO.B(rVar) ? 32 : 16) | (o0VarO.h(z14) ? 256 : 128) | (o0VarO.r(lVar) ? 2048 : 1024) | (o0VarO.r(aVar) ? 16384 : 8192) | (o0VarO.r(lVar2) ? 131072 : 65536) | (o0VarO.r(pVar2) ? 1048576 : 524288) | (o0VarO.r(aVar2) ? 8388608 : 4194304) | (o0VarO.r(lVar3) ? 67108864 : 33554432);
        if (o0VarO.n(i16 & 1, (i16 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            boolean z15 = ((i16 & 14) == 4) | ((i16 & 896) == 256) | ((3670016 & i16) == 1048576) | ((i16 & 7168) == 2048) | ((29360128 & i16) == 8388608) | ((458752 & i16) == 131072) | ((234881024 & i16) == 67108864) | ((57344 & i16) == 16384);
            Object objQ = o0VarO.q();
            if (z15) {
                i15 = i16;
                j jVar2 = new j(pVar, z14, pVar2, lVar, aVar2, lVar2, lVar3, aVar);
                o0VarO.K(jVar2);
                objQ = jVar2;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i15 = i16;
                    j jVar3 = new j(pVar, z14, pVar2, lVar, aVar2, lVar2, lVar3, aVar);
                    o0VarO.K(jVar3);
                    objQ = jVar3;
                } else {
                    i15 = i16;
                }
            }
            e2.c.c(rVar, null, null, iVarI, null, null, false, null, (e23.l) objQ, o0VarO, (i15 >> 3) & 14, 494);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.r(pVar, rVar, z14, lVar, aVar, lVar2, pVar2, aVar2, lVar3, i14);
        }
    }
}
