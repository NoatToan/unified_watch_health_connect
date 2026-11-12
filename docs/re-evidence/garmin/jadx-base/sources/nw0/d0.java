package nw0;

import com.garmin.android.apps.connectmobile.R;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 {
    public static final void a(e23.a aVar, gk1.b bVar, gk1.b bVar2, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(2124589310);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(bVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(778437827, new ao1.g(gl1.y.Q(o0VarE, R.string.action_settings), aVar, 22), o0VarE), null, null, null, z3.f.c(1346408903, new mw0.i(13, bVar, bVar2), o0VarE), o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(aVar, bVar, bVar2, i14, 12);
        }
    }
}
