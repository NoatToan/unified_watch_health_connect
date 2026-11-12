package wx1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class u {
    public static final void a(boolean z14, i53.c<? extends mx1.d> cVar, mx1.d dVar, e23.l<? super mx1.d, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-246853708);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.k(dVar == null ? -1 : dVar.ordinal()) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 12;
            og2.k.g(y.Q(o0VarE, R.string.lbl_set_your_goal), aVar2, aVar3, z14, null, z3.f.c(1504954691, new w21.d(dVar, aVar, cVar, lVar, 17), o0VarE), o0VarE, ((i15 << 9) & 7168) | (i16 & 896) | (i16 & 112) | 196608, 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(z14, cVar, dVar, lVar, aVar, aVar2, aVar3, i14);
        }
    }
}
