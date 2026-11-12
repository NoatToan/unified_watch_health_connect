package com.xiaomi.mipush.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
final class f0 implements Runnable {
    public final /* synthetic */ Context a;

    public f0(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageHandleService.c(this.a);
    }
}
