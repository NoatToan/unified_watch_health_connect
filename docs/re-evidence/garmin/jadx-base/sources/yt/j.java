package yt;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class j extends p005kotlin.jvm.internal.q implements e23.p<Integer, tt.m, Unit> {
    public j(Object obj) {
        super(2, obj, h.class, "onPageChanged", "onPageChanged(ILcom/garmin/android/apps/connectmobile/annual_report/data/model/ChapterColors;)V", 0);
    }

    @Override // e23.p
    public final Unit invoke(Integer num, tt.m mVar) {
        int iIntValue = num.intValue();
        tt.m mVar2 = mVar;
        mVar2.getClass();
        LottieDrawable lottieDrawable = ((h) this.receiver).f199306e;
        if (lottieDrawable != null) {
            lottieDrawable.addValueCallback(new KeyPath("Dark BG", "Rectangle 1", "Gradient Fill 1"), LottieProperty.GRADIENT_COLOR, new l(iIntValue, mVar2));
        }
        return Unit.INSTANCE;
    }
}
