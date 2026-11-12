package com.huawei.updatesdk.sdk.service.secure;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a extends BroadcastReceiver {
    public abstract void a(Context context, b bVar);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, b.a(intent));
    }
}
