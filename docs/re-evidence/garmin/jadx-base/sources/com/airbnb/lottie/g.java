package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f28210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28211d;

    public /* synthetic */ g(Context context, ZipInputStream zipInputStream, String str, int i14) {
        this.f28208a = i14;
        this.f28209b = context;
        this.f28210c = zipInputStream;
        this.f28211d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f28208a) {
            case 0:
                return LottieCompositionFactory.fromZipStreamSync(this.f28209b, this.f28210c, this.f28211d);
            default:
                return LottieCompositionFactory.fromZipStreamSync(this.f28209b, this.f28210c, this.f28211d);
        }
    }
}
