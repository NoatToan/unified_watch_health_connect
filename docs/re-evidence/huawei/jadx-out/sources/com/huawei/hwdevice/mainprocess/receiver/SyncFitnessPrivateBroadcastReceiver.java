package com.huawei.hwdevice.mainprocess.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class SyncFitnessPrivateBroadcastReceiver extends BroadcastReceiver {
    private static boolean e = false;

    public static boolean d() {
        return e;
    }

    public static void d(boolean z) {
        e = z;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!CommonUtil.ck()) {
            LogUtil.j("SyncFitnessPrivateBroadcastReceiver", "onReceive: Not Support WearProduct.");
            return;
        }
        if (intent == null || context == null) {
            LogUtil.j("SyncFitnessPrivateBroadcastReceiver", "onReceive: Context or Intent Is Null.");
            return;
        }
        String action = intent.getAction();
        LogUtil.a("SyncFitnessPrivateBroadcastReceiver", "onReceive: action: ", action);
        if ("com.huawei.bone.action.open_gps".equals(action)) {
            d(true);
        } else {
            LogUtil.j("SyncFitnessPrivateBroadcastReceiver", "onReceive: unknown action, no need to handle.");
        }
    }
}
