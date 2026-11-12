package kh0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1753559978);
        int i15 = (o0VarP.r(aVar) ? 4 : 2) | i14 | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            sVar.c(c2.l.y(aVar3, j92.b.f97899b.f97920e), null, null, null, y.Q(o0VarP, R.string.lbl_update_data), y.Q(o0VarP, R.string.msg_refresh_for_updated_fitness_age), y.Q(o0VarP, R.string.lbl_refresh), false, aVar, aVar2, o0VarP, (i15 << 27) & 1879048192, (i15 >> 3) & 14, 398);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 25);
        }
    }
}
