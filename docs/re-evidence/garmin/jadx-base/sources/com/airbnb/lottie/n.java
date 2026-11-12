package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f28230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28231c;

    public /* synthetic */ n(LottieDrawable lottieDrawable, int i14, int i15) {
        this.f28229a = i15;
        this.f28230b = lottieDrawable;
        this.f28231c = i14;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f28229a) {
            case 0:
                this.f28230b.lambda$setFrame$15(this.f28231c, lottieComposition);
                break;
            case 1:
                this.f28230b.lambda$setMaxFrame$7(this.f28231c, lottieComposition);
                break;
            default:
                this.f28230b.lambda$setMinFrame$5(this.f28231c, lottieComposition);
                break;
        }
    }
}
