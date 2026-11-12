package com.huawei.health.ui.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes32.dex */
public class RovEventReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.e("Step_RovEventReceiver", "intent is null");
            return;
        }
        String action = intent.getAction();
        if (action == null || !action.equals("com.huawei.systemmamanger.action.KILL_ROGAPP_END")) {
            return;
        }
        HealthSportWidget.b(context);
        HonorWidgetProvider.e(context);
    }
}
