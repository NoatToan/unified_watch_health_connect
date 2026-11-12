package wx1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    public static final void a(dy1.p pVar, e23.l<? super mx1.f, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-560924636);
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 3;
            og2.k.g(y.Q(o0VarE, R.string.lbl_select_plan), aVar, aVar2, false, null, z3.f.c(-2022173515, new wb1.i(15, pVar, lVar), o0VarE), o0VarE, (i16 & 112) | 196608 | (i16 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(pVar, lVar, aVar, aVar2, i14, 14);
        }
    }
}
