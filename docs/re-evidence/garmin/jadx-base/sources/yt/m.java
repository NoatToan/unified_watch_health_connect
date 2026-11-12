package yt;

import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class m extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
    public m(Object obj) {
        super(0, obj, h.class, "playIntroAsPlaceholder", "playIntroAsPlaceholder()V", 0);
    }

    @Override // e23.a
    public final Unit invoke() {
        h hVar = (h) this.receiver;
        int i14 = h.f199301x;
        ot.r rVar = hVar.w6().f199351l;
        if (rVar != null) {
            String str = "playIntroFirstFrameAsPlaceholder current view state = " + hVar.w6().y4() + ", chapter = " + ot.r.class;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportPlayerFragment", str);
            hVar.z6(rVar);
            LottieDrawable lottieDrawable = hVar.f199306e;
            if (lottieDrawable != null) {
                lottieDrawable.playAnimation();
            }
        }
        return Unit.INSTANCE;
    }
}
