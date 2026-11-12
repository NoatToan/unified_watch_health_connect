package wx1;

import b82.f0;
import b82.u0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static final void a(int i14, int i15, Boolean bool, e23.l<? super Boolean, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i16) {
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-2105810827);
        int i17 = i16 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.B(bool) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar4) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            int i18 = i17 >> 15;
            og2.k.g(y.Q(o0VarE, R.string.lbl_stp_benchmarks), aVar3, aVar4, false, null, z3.f.c(-836068858, new f0(i14, i15, bool, aVar2, aVar, lVar), o0VarE), o0VarE, (i18 & 896) | (i18 & 112) | 196608, 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(i14, i15, bool, lVar, aVar, aVar2, aVar3, aVar4, i16);
        }
    }
}
