package s70;

import com.garmin.android.apps.connectmobile.R;
import p3.p2;
import v62.ja;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 {
    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(-78094839);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.ALERT;
            s62.a.f157643a.getClass();
            rVar2 = rVar;
            sVar.d(rVar2, bVar, ja.a(t62.b.f162798a), gl1.y.Q(o0VarE, R.string.txt_no_internet_connection), null, null, null, null, o0VarE, (i15 & 14) | 48, 496);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 17);
        }
    }
}
