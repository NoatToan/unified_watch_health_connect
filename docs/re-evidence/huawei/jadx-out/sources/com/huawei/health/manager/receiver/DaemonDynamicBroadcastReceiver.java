package com.huawei.health.manager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class DaemonDynamicBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    WeakReference<LogicalStepCounter> f8108c;

    public DaemonDynamicBroadcastReceiver(LogicalStepCounter logicalStepCounter) {
        this.f8108c = new WeakReference<>(logicalStepCounter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            LogUtil.e("Step_DynamicReceiver", "onReceive() intent or context null");
            return;
        }
        LogUtil.a("Step_DynamicReceiver", "onReceive action: ", intent.getAction());
        LogicalStepCounter logicalStepCounter = this.f8108c.get();
        if (logicalStepCounter == null) {
            ReleaseLogUtil.e("Step_DynamicReceiver", "DaemonDynamicBroadcastReceiver stepCounter null");
        } else {
            logicalStepCounter.b(intent);
        }
    }
}
