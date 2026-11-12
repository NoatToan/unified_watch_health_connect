package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes22.dex */
final class h implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    public h(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.b(this.a, this.b);
    }
}
