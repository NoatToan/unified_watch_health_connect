package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28207d;

    public /* synthetic */ f(Context context, int i14, String str, String str2) {
        this.f28204a = i14;
        this.f28205b = context;
        this.f28206c = str;
        this.f28207d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f28204a) {
            case 0:
                return LottieCompositionFactory.fromAssetSync(this.f28205b, this.f28206c, this.f28207d);
            default:
                return LottieCompositionFactory.lambda$fromUrl$0(this.f28205b, this.f28206c, this.f28207d);
        }
    }
}
