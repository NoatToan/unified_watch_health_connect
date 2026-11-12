package jv0;

import ak0.p;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        e23.a<Unit> aVar3;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1269771156);
        int i15 = (o0VarP.r(aVar) ? 4 : 2) | i14 | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            aVar3 = aVar2;
            gl1.d.b(y.Q(o0VarP, R.string.title_live_track), aVar3, false, null, null, null, z3.f.c(-675448198, new p(aVar, 12), o0VarP), o0VarP, (i15 & 112) | 1572864, 60);
        } else {
            aVar3 = aVar2;
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar3, i14, 24);
        }
    }
}
