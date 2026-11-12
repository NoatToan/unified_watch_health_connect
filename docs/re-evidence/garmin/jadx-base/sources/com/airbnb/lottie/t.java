package com.airbnb.lottie;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LottieDrawable f28246b;

    public /* synthetic */ t(LottieDrawable lottieDrawable, int i14) {
        this.f28245a = i14;
        this.f28246b = lottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28245a) {
            case 0:
                this.f28246b.lambda$new$1();
                break;
            default:
                this.f28246b.lambda$new$2();
                break;
        }
    }
}
