package jv0;

import bv0.q;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static final void a(gv0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1674308056);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            gl1.d.b(y.Q(o0VarE, R.string.lbl_extend_session_visibility), aVar2, false, null, null, null, z3.f.c(-847515510, new q(dVar, aVar, 1), o0VarE), o0VarE, ((i15 >> 3) & 112) | 1572864, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(dVar, aVar, false, aVar2, i14, 1);
        }
    }
}
