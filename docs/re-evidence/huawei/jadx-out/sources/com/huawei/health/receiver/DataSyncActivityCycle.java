package com.huawei.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.nvx;
import defpackage.uce;
import defpackage.uwa;

/* JADX INFO: loaded from: classes8.dex */
public class DataSyncActivityCycle {
    private final BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.health.receiver.DataSyncActivityCycle.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("DataSyncActivityCycle", "Sleep action ", action);
            if (!"com.huawei.health.DataSyncActivityCycle.Sleep".equals(action)) {
                LogUtil.j("DataSyncActivityCycle", "onReceive intent action is not Sleep");
                return;
            }
            long longExtra = intent.getLongExtra("fallAsleepTime", 0L);
            long longExtra2 = intent.getLongExtra("wakeTime", 0L);
            int intExtra = intent.getIntExtra(JsUtil.SCORE, 0);
            if (longExtra > 0 && longExtra2 > 0) {
                LogUtil.a("DataSyncActivityCycle", "handleSleepEvent Start!");
                uce.b(longExtra, longExtra2, intExtra);
                uwa.d(longExtra, longExtra2);
                LogUtil.a("DataSyncActivityCycle", "handleSleepEvent Stop!");
            }
            nvx.a(this);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f8649b = new BroadcastReceiver() { // from class: com.huawei.health.receiver.DataSyncActivityCycle.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("DataSyncActivityCycle", "Exercise action ", action);
            if (!"com.huawei.health.DataSyncActivityCycle.Exercise".equals(action)) {
                LogUtil.j("DataSyncActivityCycle", "onReceive intent action is not Exercise");
                return;
            }
            LogUtil.a("DataSyncActivityCycle", "handleSportBloodSugarEvent Start!");
            uwa.d();
            LogUtil.a("DataSyncActivityCycle", "handleSportBloodSugarEvent Stop!");
            nvx.c(this);
        }
    };

    public void registerDataSyncReceiver(int i) {
        LogUtil.a("DataSyncActivityCycle", "registerDataSyncReceiver type:", Integer.valueOf(i));
        if (i == 1) {
            nvx.d(this.d);
        } else if (i == 2) {
            nvx.b(this.f8649b);
        } else {
            LogUtil.a("DataSyncActivityCycle", "registerDataSyncReceiver unknown action");
        }
    }
}
