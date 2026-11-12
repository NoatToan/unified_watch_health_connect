package com.huawei.secure.android.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes42.dex */
@Deprecated
public abstract class SafeBroadcastReceiver extends BroadcastReceiver {
    private boolean a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        try {
            intent.getStringExtra("TestIntent");
            return intent.getAction() != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    @Deprecated
    public final void onReceive(Context context, Intent intent) {
        if (a(context, intent)) {
            onReceiveMsg(context, new SafeIntent(intent));
        }
    }

    @Deprecated
    public abstract void onReceiveMsg(Context context, Intent intent);
}
