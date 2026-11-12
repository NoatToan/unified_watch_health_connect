package com.huawei.health.manager.receiver;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.PreDaemonService;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.manager.util.DelayStartHelper;
import com.huawei.plugindaemon.R;
import defpackage.lsb;
import health.compact.a.AuthorizationUtils;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.DeviceUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HarmonyBuild;
import health.compact.a.LogUtil;
import health.compact.a.ProcessAliveMonitor;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.StepCounterSupportUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DaemonStaticBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (intent == null || context == null) {
            return;
        }
        String action = intent.getAction();
        ReleaseLogUtil.c("Step_StaticReceiver", "onReceive action: ", action);
        if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
            SharedPerferenceUtils.a(context, 0L);
            if (SharedPerferenceUtils.af(context)) {
                ProcessAliveMonitor.c(context).e();
                intent2 = new Intent(context, (Class<?>) DaemonService.class);
            } else {
                intent2 = new Intent(context, (Class<?>) PreDaemonService.class);
            }
            intent2.setPackage(context.getPackageName());
            try {
                context.startService(intent2);
                c(context);
                b(context);
                return;
            } catch (IllegalStateException | SecurityException e) {
                LogUtil.e("Step_StaticReceiver", "ACTION_BOOT_COMPLETED IllegalStateException", e.getMessage());
                new DelayStartHelper(context).a(intent2);
                return;
            }
        }
        if ("android.intent.action.ACTION_SHUTDOWN".equals(action)) {
            SharedPerferenceUtils.a(context, System.currentTimeMillis());
            ProcessAliveMonitor processAliveMonitorC = ProcessAliveMonitor.c(context);
            if (processAliveMonitorC != null) {
                processAliveMonitorC.a();
            } else {
                LogUtil.e("Step_StaticReceiver", "onReceive processAliveMonitor == null");
            }
            if (SharedPerferenceUtils.af(context)) {
                Intent intent3 = new Intent(context, (Class<?>) DaemonService.class);
                intent3.setPackage(context.getPackageName());
                intent3.setAction("android.intent.action.ACTION_SHUTDOWN");
                try {
                    context.startService(intent3);
                    return;
                } catch (IllegalStateException | SecurityException e2) {
                    LogUtil.e("Step_StaticReceiver", "ACTION_SHUTDOWN IllegalStateException", e2.getMessage());
                    return;
                }
            }
            return;
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action)) {
            LogUtil.b("Step_StaticReceiver", "onReceive() update package.");
            h(context);
            i(context);
            DeviceUtil.d(context, true, null);
            d(context);
            b(context);
            return;
        }
        LogUtil.e("Step_StaticReceiver", "onReceive() no action deal.");
    }

    private void d(Context context) {
        boolean zC = AuthorizationUtils.c(context);
        ReleaseLogUtil.c("Step_StaticReceiver", "checkShowNotificationOnHarmony4 hasAuth:", Boolean.valueOf(zC));
        if (!zC || Build.VERSION.SDK_INT <= 28 || EmuiBuild.f36544b || HarmonyBuild.e || EmuiBuild.b()) {
            return;
        }
        e(context, R.string.IDS_step_remind_open_permission);
    }

    private void b(Context context) {
        boolean zC = AuthorizationUtils.c(context);
        ReleaseLogUtil.c("Step_StaticReceiver", "checkShowNotificationOnHarmony4 hasAuth:", Boolean.valueOf(zC));
        if (zC) {
            if (EnvironmentInfo.g() && !DaemonServiceSpUtils.b(context)) {
                e(context, R.string.IDS_step_open_permission_harmony);
            } else if (DaemonServiceSpUtils.b(context) && StepCounterSupportUtils.a(context)) {
                e(context, R.string.IDS_step_open_permission_harmony);
            }
        }
    }

    private void e(Context context, int i) {
        boolean z = ContextCompat.checkSelfPermission(context, "android.permission.ACTIVITY_RECOGNITION") == 0;
        LogUtil.b("Step_StaticReceiver", " permission is granted ", Boolean.valueOf(z));
        lsb.d().e(20220112);
        if (z) {
            return;
        }
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setContentTitle(context.getString(i));
        builderC.setContentIntent(lsb.a(context));
        builderC.setAutoCancel(true);
        builderC.setDefaults(1);
        builderC.setOngoing(false);
        builderC.setOnlyAlertOnce(true);
        lsb.d().c(20220112, builderC.build());
    }

    private void h(Context context) {
        Intent intent = new Intent(context, (Class<?>) DaemonService.class);
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException e) {
            LogUtil.e("Step_StaticReceiver", "ACTION_MY_PACKAGE_REPLACED IllegalStateException", e.getMessage());
        }
    }

    private void i(Context context) {
        if (!DeviceUtil.b()) {
            ReleaseLogUtil.c("Step_StaticReceiver", "handleUpdateModules no device.");
            return;
        }
        Intent intent = new Intent("com.huawei.health.track.broadcast");
        intent.setPackage(context.getPackageName());
        intent.putExtra("command_type", "MY_PACKAGE_REPLACED_UPDATE_MODULES");
        context.sendBroadcast(intent, Consts.d);
        ReleaseLogUtil.c("Step_StaticReceiver", "handleUpdateModules goto.");
    }

    private void c(Context context) {
        LogUtil.b("Step_StaticReceiver", "check notification");
        if (a(context)) {
            LogUtil.b("Step_StaticReceiver", "check notification is enable ");
        } else {
            LogUtil.b("Step_StaticReceiver", "check notification is disabled ");
            e(context);
        }
    }

    public static void e(Context context) {
        if (context == null) {
            LogUtil.e("Step_StaticReceiver", "toggleNotificationListenerService null");
            return;
        }
        LogUtil.b("Step_StaticReceiver", "toggleNotificationListenerService enter");
        PackageManager packageManager = context.getPackageManager();
        packageManager.setComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"), 2, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(context, "com.huawei.bone.ui.setting.NotificationPushListener"), 1, 1);
    }

    public static boolean a(Context context) {
        if (context == null) {
            LogUtil.e("Step_StaticReceiver", "isNotificationListenerRunning null");
            return false;
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(30);
        if (runningServices != null) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                LogUtil.b("Step_StaticReceiver", "serivce is :", runningServiceInfo.service.getClassName());
                if ("com.huawei.bone.ui.setting.NotificationPushListener".equals(runningServiceInfo.service.getClassName())) {
                    LogUtil.b("Step_StaticReceiver", "serivce is running!!!");
                    return true;
                }
            }
        }
        return false;
    }
}
