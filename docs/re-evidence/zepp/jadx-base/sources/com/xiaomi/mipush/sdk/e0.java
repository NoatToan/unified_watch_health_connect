package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes22.dex */
final class e0 implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    public e0(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.startService(this.b);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a(e.getMessage());
        }
    }
}
