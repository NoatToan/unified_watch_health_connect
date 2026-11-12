package wx1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(int i14, int i15, i53.c<dy1.a> cVar, e23.p<? super mx1.a, ? super Boolean, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i16) {
        cVar.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1086880234);
        int i17 = i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            int i18 = i17 >> 12;
            og2.k.g(y.Q(o0VarE, R.string.lbl_stp_equipment_preference), aVar2, aVar3, false, null, z3.f.c(182861735, new an1.d(i14, i15, aVar, cVar, pVar, 26), o0VarE), o0VarE, (i18 & 112) | 196608 | (i18 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(i14, i15, cVar, pVar, aVar, aVar2, aVar3, i16, 0);
        }
    }
}
