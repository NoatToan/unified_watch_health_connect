package com.huawei.hianalytics.visual;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes33.dex */
public final class r0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11688a;

    public r0(Context context) {
        this.f11688a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f11688a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("com.huawei.hianalytics.v1_" + context.getPackageName(), 0);
    }
}
