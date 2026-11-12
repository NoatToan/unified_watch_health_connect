package com.huawei.hwdevice.phoneprocess.mgr.notification;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.service.notification.NotificationListenerService;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mir;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class PushListenerWatchdogWorker extends Worker {
    public PushListenerWatchdogWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ReleaseLogUtil.d("R_PushListenerWatchdogWorker", "doWork start");
        Context context = BaseApplication.getContext();
        if (!mir.a()) {
            LogUtil.a("PushListenerWatchdogWorker", "isAuthorizeEnabled is false.");
            return ListenableWorker.Result.success();
        }
        String strB = SharedPreferenceManager.b("notifyModuleId", "onListenerStatus", String.valueOf(HwNotificationConstant.ListenerStatus.DEFAULT_VALUE));
        ReleaseLogUtil.d("R_PushListenerWatchdogWorker", "onListenerStaus is ", strB);
        boolean zEquals = String.valueOf(HwNotificationConstant.ListenerStatus.ON_LISTENER_DICONNECTED).equals(strB);
        if (!d(context, strB)) {
            d(context);
            return ListenableWorker.Result.retry();
        }
        if (zEquals) {
            ReleaseLogUtil.d("R_PushListenerWatchdogWorker", "RequestRebind NotificationListenerService enter");
            NotificationListenerService.requestRebind(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"));
            return ListenableWorker.Result.retry();
        }
        return ListenableWorker.Result.success();
    }

    private boolean d(Context context, String str) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"));
        boolean zAg = CommonUtil.ag(BaseApplication.getContext());
        ReleaseLogUtil.d("R_PushListenerWatchdogWorker", "NotificationPushListener component status: ", Integer.valueOf(componentEnabledSetting), ", isRunning: ", Boolean.valueOf(zAg));
        c(zAg ? 1 : 0, str);
        return zAg;
    }

    private void d(Context context) {
        ReleaseLogUtil.d("R_PushListenerWatchdogWorker", "toggleNotificationListenerService enter");
        try {
            PackageManager packageManager = context.getPackageManager();
            ReleaseLogUtil.d("R_PushListenerWatchdogWorker", "toggleNotificationListenerService component status: ", Integer.valueOf(packageManager.getComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"))));
            packageManager.setComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"), 2, 1);
            packageManager.setComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"), 1, 1);
        } catch (SecurityException e) {
            ReleaseLogUtil.a("R_PushListenerWatchdogWorker", "toggleNotificationListenerService Exception", ExceptionUtils.c(e));
        }
    }

    private void c(int i, String str) {
        LogUtil.a("PushListenerWatchdogWorker", "enter reportBi() runningStatus: ", Integer.valueOf(i));
        Intent intent = new Intent("com.huawei.health.nitification_service_bi_change");
        intent.putExtra("listenerRunning", i);
        intent.putExtra("onListenerStaus", str);
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }
}
