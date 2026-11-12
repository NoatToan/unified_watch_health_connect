package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f28226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28227c;

    public /* synthetic */ m(LottieDrawable lottieDrawable, String str, int i14) {
        this.f28225a = i14;
        this.f28226b = lottieDrawable;
        this.f28227c = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f28225a) {
            case 0:
                this.f28226b.lambda$setMinAndMaxFrame$11(this.f28227c, lottieComposition);
                break;
            case 1:
                this.f28226b.lambda$setMaxFrame$10(this.f28227c, lottieComposition);
                break;
            default:
                this.f28226b.lambda$setMinFrame$9(this.f28227c, lottieComposition);
                break;
        }
    }
}
