package a51;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    public static final void a(o51.f fVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        fVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-699930754);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strP = y.P(R.string.pacepro_lbl_new_goal_time, new Object[]{fVar.f129251p}, o0VarE);
            c1.f110940a.a(false, y.Q(o0VarE, R.string.pacepro_lbl_pacepro_updated_title), null, z3.f.c(792583330, new h(y.P(R.string.pacepro_lbl_new_goal_time, new Object[]{fVar.f129252q}, o0VarE), strP, y.P(R.string.pacepro_lbl_new_goal_pace, new Object[]{fVar.f129257v, ""}, o0VarE), y.P(R.string.pacepro_lbl_new_goal_pace, new Object[]{fVar.f129256u, ""}, o0VarE), 0, (byte) 0), o0VarE), null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 21) & 234881024) | 3078, 0, 1748);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(fVar, aVar, i14, 0);
        }
    }
}
