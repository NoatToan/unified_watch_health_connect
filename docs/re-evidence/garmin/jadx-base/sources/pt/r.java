package pt;

import android.graphics.PointF;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpt/r;", "Lcom/airbnb/lottie/value/LottieValueCallback;", "Landroid/graphics/PointF;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends LottieValueCallback<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<Float> f140603a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r0<Float> r0Var, PointF pointF) {
        super(pointF);
        this.f140603a = r0Var;
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public final PointF getValue(LottieFrameInfo<PointF> lottieFrameInfo) {
        PointF startValue;
        if (lottieFrameInfo != null && (startValue = lottieFrameInfo.getStartValue()) != null) {
            float f14 = startValue.x;
            Float f15 = this.f140603a.f105810a;
            if (f15 != null) {
                return new PointF(f14, f15.floatValue());
            }
        }
        if (lottieFrameInfo != null) {
            return lottieFrameInfo.getStartValue();
        }
        return null;
    }
}
