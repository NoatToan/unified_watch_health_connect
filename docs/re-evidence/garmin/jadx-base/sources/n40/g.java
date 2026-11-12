package n40;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import java.util.List;
import l72.r1;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import qw0.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final void a(m40.a aVar, p<? super v, ? super Boolean, Unit> pVar, e23.l<? super List<? extends fn0.c>, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, e23.l<? super com.garmin.android.apps.connectmobile.courses.model.c, Unit> lVar3, p<? super com.garmin.android.apps.connectmobile.courses.model.b, ? super com.garmin.android.apps.connectmobile.courses.model.b, Unit> pVar2, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        pVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar2.getClass();
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, -1796682131);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(pVar) ? 32 : 16) | (o0VarP.r(lVar) ? 256 : 128) | (o0VarP.r(lVar2) ? 2048 : 1024) | (o0VarP.r(lVar3) ? 16384 : 8192) | (o0VarP.r(pVar2) ? 131072 : 65536) | (o0VarP.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarP.r(aVar3) ? 8388608 : 4194304);
        if (o0VarP.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            r1.b(y.Q(o0VarP, R.string.lbl_course_elements), z3.f.c(-751825016, new e(aVar, pVar, aVar3, lVar, lVar2, lVar3, pVar2, aVar2), o0VarP), o0VarP, 48, 0);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(aVar, pVar, lVar, lVar2, lVar3, pVar2, aVar2, aVar3, i14);
        }
    }
}
