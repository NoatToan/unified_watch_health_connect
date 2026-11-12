package xx1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import gl1.y;
import og2.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static final void a(int i14, int i15, mx1.e eVar, l<? super mx1.e, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i16) {
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1289708402);
        int i17 = i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = n.f135158a;
            int i18 = i17 >> 12;
            k.g(y.Q(o0VarE, R.string.lbl_set_rep_range), aVar2, aVar3, false, null, z3.f.c(-1386966305, new an1.d(i14, i15, eVar, aVar, lVar, 28), o0VarE), o0VarE, (i18 & 112) | 196608 | (i18 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wx1.i(i14, i15, eVar, lVar, aVar, aVar2, aVar3, i16, 2);
        }
    }
}
