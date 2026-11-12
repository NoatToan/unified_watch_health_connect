package com.huawei.haf.application;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class DebugSwitchReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.b("HAF_SwitchReceiver", "onReceive ", intent);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }
}
