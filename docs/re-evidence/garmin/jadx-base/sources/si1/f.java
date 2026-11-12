package si1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(-388153576);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.ALERT;
            s62.a.f157643a.getClass();
            rVar2 = rVar;
            sVar.d(rVar2, bVar, g0.a(t62.b.f162798a), y.Q(o0VarE, R.string.find_my_watch_device_not_connected_title), null, null, null, null, o0VarE, (i15 & 14) | 48, 496);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 18);
        }
    }
}
