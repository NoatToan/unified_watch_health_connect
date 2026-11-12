package com.xiaomi.ai.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes18.dex */
class j extends BroadcastReceiver {
    public final /* synthetic */ i a;

    public j(i iVar) {
        this.a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
