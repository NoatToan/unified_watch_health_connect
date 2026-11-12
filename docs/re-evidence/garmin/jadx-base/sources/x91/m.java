package x91;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import w51.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        e23.a<Unit> aVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(1787801586);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            aVar2 = aVar;
            b82.n.d(null, y.Q(o0VarE, R.string.loading_error), g22.n.a(y.Q(o0VarE, R.string.lets_try_again)), c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97923h, 0.0f, 0.0f, 13), y.Q(o0VarE, R.string.lbl_retry), aVar2, null, null, o0VarE, (i15 << 15) & 458752, 193);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(aVar2, i14, 14);
        }
    }
}
