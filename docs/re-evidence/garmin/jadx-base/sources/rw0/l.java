package rw0;

import c2.a0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.q;
import gl1.y;
import i3.mc;
import l72.w;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import p40.r;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public static final void a(mc mcVar, final int i14, final com.garmin.android.library.mapsdkadapter.i.d dVar, final boolean z14, final boolean z15, final e23.l<? super Integer, Unit> lVar, final e23.l<? super com.garmin.android.library.mapsdkadapter.i.d, Unit> lVar2, final e23.l<? super Boolean, Unit> lVar3, e23.a<Unit> aVar, p3.m mVar, int i15) {
        o0 o0Var;
        mcVar.getClass();
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-219299071);
        int i16 = (o0VarE.B(mcVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(dVar.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        int i17 = i16 | (o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar3) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            o0Var = o0VarE;
            w.f111301a.f(y.Q(o0VarE, R.string.lbl_map_settings), null, null, z3.f.c(1261829280, new r(aVar, 29), o0VarE), aVar, mcVar, true, null, z3.f.c(1501817162, new q() { // from class: rw0.k
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((a0) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        o.a(null, i14, dVar, z14, z15, lVar, lVar2, lVar3, mVar2, 0, 97);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, 806906880 | ((i17 << 15) & 458752), 390);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix0.g(mcVar, i14, dVar, z14, z15, lVar, lVar2, lVar3, aVar, i15);
        }
    }
}
