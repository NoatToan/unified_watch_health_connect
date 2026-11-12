package s70;

import com.garmin.android.apps.connectmobile.R;
import f72.a3;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class f1 {
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-1591697371);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.INFO;
            s62.a.f157643a.getClass();
            rVar2 = rVar;
            sVar.d(rVar2, bVar, a3.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.live_track_in_progress_notification_bar_title), gl1.y.Q(o0VarE, R.string.msg_livetrack_active), null, null, null, o0VarE, (i15 & 14) | 48, 480);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 16);
        }
    }
}
