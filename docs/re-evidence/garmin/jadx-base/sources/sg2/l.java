package sg2;

import c2.x2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import p3.o0;
import p3.p2;
import p3.x1;
import u1.w;
import yg2.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class l {
    public static final void a(h4.r rVar, Map map, h0 h0Var, e23.a aVar, p3.m mVar, int i14) {
        Float f14;
        lt2.a duration;
        map.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1309861395);
        int i15 = i14 | (o0VarE.r(map) ? 32 : 16) | (o0VarE.r(h0Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(R.raw.meditation_lottie_animation)), null, null, null, null, null, o0VarE, 0, 62);
            ah2.e eVar = (ah2.e) map.get(ag2.c.a.TIMER);
            Float fValueOf = null;
            if (eVar != null && (f14 = eVar.f3290b) != null) {
                float fFloatValue = f14.floatValue();
                if (h0Var != null && (duration = h0Var.getDuration()) != null) {
                    float f15 = (float) duration.f114867b;
                    fValueOf = Float.valueOf((f15 - fFloatValue) / f15);
                }
            }
            f.a(w.d(x2.d(rVar, 1.0f), false, null, null, aVar, 15), am.j.B(d92.b.f58623a, o0VarE), z3.f.c(117050143, new ry0.g(9, fValueOf, lottieCompositionResultRememberLottieComposition), o0VarE), o0VarE, 384, 0);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(rVar, map, h0Var, aVar, i14, 27);
        }
    }
}
