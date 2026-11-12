package r20;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import qx1.p;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static final void a(r rVar, m mVar, int i14) {
        r rVar2;
        o0 o0VarE = mVar.E(-1121299059);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            rVar2 = rVar;
            b82.n.c(null, y.Q(o0VarE, R.string.msg_no_data_available), y.Q(o0VarE, R.string.no_cycling_ability_data_message), rVar2, null, o0VarE, (i15 << 9) & 7168, 17);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar2, i14, 15);
        }
    }

    public static final void b(m mVar, int i14) {
        o0 o0VarE = mVar.E(1927968850);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            u4.d.b bVar = u4.d.f168373k;
            b82.n.c(n5.e.b(R.drawable.bike, o0VarE, 6), y.Q(o0VarE, R.string.msg_no_data_available), y.Q(o0VarE, R.string.no_cycling_ability_data_message), null, null, o0VarE, 0, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, 14);
        }
    }

    public static final void c(m mVar, int i14) {
        o0 o0VarE = mVar.E(74826648);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            u4.d.b bVar = u4.d.f168373k;
            b82.n.c(n5.e.b(R.drawable.bike, o0VarE, 6), y.Q(o0VarE, R.string.msg_not_enough_data), y.Q(o0VarE, R.string.not_enough_cycling_ability_data_message), null, null, o0VarE, 0, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, 15);
        }
    }
}
