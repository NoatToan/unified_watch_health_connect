package s70;

import com.garmin.android.apps.connectmobile.R;
import p3.p2;
import v62.j6;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 {
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        p3.o0 o0VarE = mVar.E(-161848131);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.ALERT;
            s62.a.f157643a.getClass();
            sVar.d(rVar, bVar, j6.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.lbl_finish_inReach_setup), gl1.y.Q(o0VarE, R.string.msg_finish_inReach_setup_description), gl1.y.Q(o0VarE, R.string.lbl_review_emergency_info), null, aVar, o0VarE, (i15 & 14) | 48 | ((i15 << 21) & 234881024), 192);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w(rVar, aVar, i14, 7);
        }
    }
}
