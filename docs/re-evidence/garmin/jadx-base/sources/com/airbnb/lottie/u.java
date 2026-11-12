package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f28248b;

    public /* synthetic */ u(LottieDrawable lottieDrawable, int i14) {
        this.f28247a = i14;
        this.f28248b = lottieDrawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f28247a) {
            case 0:
                this.f28248b.lambda$resumeAnimation$4(lottieComposition);
                break;
            default:
                this.f28248b.lambda$playAnimation$3(lottieComposition);
                break;
        }
    }
}
