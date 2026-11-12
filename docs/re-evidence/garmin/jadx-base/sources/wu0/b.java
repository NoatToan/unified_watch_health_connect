package wu0;

import as.q;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(int i14, hl.a aVar, e23.a aVar2, e23.a aVar3, m mVar, int i15) {
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, -283062438);
        int i16 = i15 | (o0VarP.k(i14) ? 4 : 2) | (o0VarP.B(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128) | (o0VarP.r(aVar3) ? 2048 : 1024);
        if (o0VarP.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            gl1.d.b(y.Q(o0VarP, R.string.title_consent_livetrack), aVar3, false, null, null, null, z3.f.c(9450216, new q(aVar instanceof hl.a.b ? (hl.a.b) aVar : null, i14, aVar2, 9), o0VarP), o0VarP, ((i16 >> 6) & 112) | 1572864, 60);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k0(i14, aVar, aVar2, aVar3, i15);
        }
    }
}
