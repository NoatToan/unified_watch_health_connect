package com.huawei.ui.thirdpartservice.syncdata.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.xan;

/* JADX INFO: loaded from: classes20.dex */
public class SyncBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
            LogUtil.a("SyncBroadcastReceiver", "SyncThirdReceiver ACTION_LOGIN_SUCCESSFUL");
            xan.a().c();
        } else if ("com.huawei.sync_activity_to_third_platform".equals(intent.getAction())) {
            LogUtil.a("SyncBroadcastReceiver", "SyncThirdReceiver Manual triggering");
            xan.a().c();
        } else {
            LogUtil.j("SyncBroadcastReceiver", "SyncThirdReceiver unknown action:", intent.getAction());
        }
    }
}
