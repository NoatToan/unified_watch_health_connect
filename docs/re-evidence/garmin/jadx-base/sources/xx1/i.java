package xx1;

import b82.z1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import dy1.l;
import gl1.y;
import og2.k;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    public static final void a(int i14, int i15, int i16, int i17, mx1.b bVar, l lVar, e23.l<? super mx1.a, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i18) {
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(1022146387);
        int i19 = i18 | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.k(i16) ? 256 : 128) | (o0VarE.k(i17) ? 2048 : 1024) | (o0VarE.k(bVar.ordinal()) ? 16384 : 8192) | (o0VarE.B(lVar) ? 131072 : 65536) | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
        if (o0VarE.n(i19 & 1, (306783379 & i19) != 306783378)) {
            x1 x1Var = n.f135158a;
            int i24 = i19 >> 21;
            k.g(y.Q(o0VarE, R.string.lbl_set_primary_lifts), aVar2, aVar3, false, null, z3.f.c(401562404, new tr1.b(i14, i15, lVar, aVar, bVar, i16, i17, lVar2), o0VarE), o0VarE, (i24 & 112) | 196608 | (i24 & 896), 24);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, i15, i16, i17, bVar, lVar, lVar2, aVar, aVar2, aVar3, i18);
        }
    }
}
