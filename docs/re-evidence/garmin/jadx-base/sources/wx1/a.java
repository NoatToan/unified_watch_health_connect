package wx1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import ta0.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(i53.c<? extends mx1.c> cVar, mx1.c cVar2, e23.l<? super mx1.c, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(355669827);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.k(cVar2 == null ? -1 : cVar2.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 9;
            og2.k.g(y.Q(o0VarE, R.string.lbl_stp_choose_equipment), aVar2, aVar3, false, null, z3.f.c(-848216300, new w21.d(cVar2, aVar, cVar, lVar, 13), o0VarE), o0VarE, (i16 & 896) | (i16 & 112) | 196608, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0((i53.c) cVar, cVar2, (e23.l) lVar, (e23.a) aVar, (e23.a) aVar2, (e23.a) aVar3, i14);
        }
    }
}
