package com.huawei.health.functionsetcard.dailymoment.operation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ewm;

/* JADX INFO: loaded from: classes7.dex */
public class TimeTickReceiver extends BroadcastReceiver {
    private ewm d;

    public TimeTickReceiver(ewm ewmVar) {
        this.d = ewmVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || intent.getAction() == null || !"android.intent.action.TIME_TICK".equals(intent.getAction())) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) / 60;
        long j = jCurrentTimeMillis / 60;
        if (this.d != null) {
            long j2 = jCurrentTimeMillis % 60;
            if (j2 == 0 && (j + 8) % 24 == 0) {
                LogUtil.a("TimeTickReceiver", "another day");
                this.d.i();
            } else if (j2 == 0) {
                LogUtil.a("TimeTickReceiver", "another hour");
                this.d.k();
            }
        }
    }
}
