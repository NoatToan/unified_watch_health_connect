package ad0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(int i14, e23.l lVar, r rVar, p3.m mVar, boolean z14) {
        rVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(339612134);
        int i15 = (o0VarE.h(z14) ? 32 : 16) | i14 | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.audio_note_play);
            b82.c.b(rVar, null, z3.f.c(-1530132815, new g(z14, lVar, y.Q(o0VarE, R.string.lbl_pause), strQ, 0), o0VarE), null, am.j.A(d92.b.f58623a, o0VarE), o0VarE, 390, 10);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, z14, lVar, i14, 0);
        }
    }
}
