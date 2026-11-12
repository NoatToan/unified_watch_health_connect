package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements LottieDrawable.LazyCompositionTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f28243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f28244c;

    public /* synthetic */ s(LottieDrawable lottieDrawable, float f14, int i14) {
        this.f28242a = i14;
        this.f28243b = lottieDrawable;
        this.f28244c = f14;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f28242a) {
            case 0:
                this.f28243b.lambda$setMaxProgress$8(this.f28244c, lottieComposition);
                break;
            case 1:
                this.f28243b.lambda$setMinProgress$6(this.f28244c, lottieComposition);
                break;
            default:
                this.f28243b.lambda$setProgress$16(this.f28244c, lottieComposition);
                break;
        }
    }
}
