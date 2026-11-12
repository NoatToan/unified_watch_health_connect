package com.huawei.health.manager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class DaemonBrowseModeReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8107a = 0;
    WeakReference<LogicalStepCounter> d;

    public DaemonBrowseModeReceiver(LogicalStepCounter logicalStepCounter) {
        this.d = new WeakReference<>(logicalStepCounter);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            LogUtil.e("Step_BrowseModeRcv", "onReceive() intent or context null");
            return;
        }
        String action = intent.getAction();
        LogicalStepCounter logicalStepCounter = this.d.get();
        if (logicalStepCounter == null) {
            LogUtil.a("Step_BrowseModeRcv", "stepCounter == null");
            return;
        }
        if ("com.huawei.plugin.account.login".equals(action)) {
            logicalStepCounter.e(false);
            return;
        }
        if ("com.huawei.plugin.account.logout".equals(action)) {
            logicalStepCounter.e(true);
            return;
        }
        if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
            long jA = LogUtil.a(300000, this.f8107a);
            if (jA != -1) {
                try {
                    DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                    if (deviceInfo == null) {
                        LogUtil.j("Step_BrowseModeRcv", "onReceive deviceInfo == null ");
                        return;
                    }
                    int deviceConnectState = deviceInfo.getDeviceConnectState();
                    ReleaseLogUtil.c("Step_BrowseModeRcv", "onReceive ACTION_CONNECTION_STATE_CHANGED connectState ", Integer.valueOf(deviceConnectState));
                    if (deviceConnectState == 2) {
                        logicalStepCounter.b((ISimpleResultCallback) null);
                        this.f8107a = jA;
                    }
                } catch (RuntimeException e) {
                    LogUtil.e("Step_BrowseModeRcv", "onReceive exception:", LogAnonymous.b(e));
                }
            }
        }
    }
}
