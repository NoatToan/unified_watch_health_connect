package f40;

import as.p;
import b82.g0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.r1;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final void a(int i14, String str, m mVar, boolean z14) {
        o0 o0VarE = mVar.E(-307323541);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (!z14 || str == null) {
                o0VarE.C(1396199767);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1395133057);
                r1.b(y.Q(o0VarE, R.string.activities_activity_source), z3.f.c(-787570891, new p(str, 26), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(z14, str, i14);
        }
    }
}
