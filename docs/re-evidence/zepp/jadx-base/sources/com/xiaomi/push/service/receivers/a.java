package com.xiaomi.push.service.receivers;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
class a implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ NetworkStatusReceiver b;

    public a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.b = networkStatusReceiver;
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.a);
    }
}
