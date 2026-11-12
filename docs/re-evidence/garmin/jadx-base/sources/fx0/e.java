package fx0;

import com.airbnb.lottie.compose.LottieAnimationState;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieAnimationState f73793b;

    public /* synthetic */ e(LottieAnimationState lottieAnimationState, int i14) {
        this.f73792a = i14;
        this.f73793b = lottieAnimationState;
    }

    @Override // e23.a
    public final Object invoke() {
        float fFloatValue;
        switch (this.f73792a) {
            case 0:
                fFloatValue = this.f73793b.getValue().floatValue();
                break;
            case 1:
                fFloatValue = this.f73793b.getProgress();
                break;
            default:
                fFloatValue = this.f73793b.getValue().floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
