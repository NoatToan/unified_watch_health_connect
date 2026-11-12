package com.huawei.health.manager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.PowerManager;
import androidx.media3.common.C;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.util.UploadStaticAlarmUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsl;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes2.dex */
public class DaemonStaticLogicalReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (context == null || intent == null || intent.getAction() == null || !"com.huawei.health.action.UPLOAD_STATICS".equals(intent.getAction())) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("extra_user_intent");
        } catch (BadParcelableException e) {
            LogUtil.j("Step_DaemonStaticLogicalReceiver", e.getMessage());
            stringExtra = null;
        }
        if (stringExtra == null) {
            LogUtil.j("Step_DaemonStaticLogicalReceiver", "userIntent null,return");
        } else {
            b(context, stringExtra);
        }
    }

    private void b(Context context, String str) {
        if ("extra_user_intent_pre_alarm".equals(str)) {
            LogUtil.a("Step_DaemonStaticLogicalReceiver", "userIntent EXTRA_USER_INTENT_PRE_ALARM");
            b(context);
            UploadStaticAlarmUtil.c(context, lsl.w(System.currentTimeMillis()) + 84000000 + UploadStaticAlarmUtil.d);
            Intent intent = new Intent(context, (Class<?>) DaemonService.class);
            intent.setPackage(context.getPackageName());
            intent.setAction("com.huawei.health.action.UPLOAD_STATICS");
            intent.putExtra("extra_user_intent", "extra_user_intent_pre_alarm");
            try {
                context.startService(intent);
                return;
            } catch (IllegalStateException | SecurityException e) {
                LogUtil.j("Step_DaemonStaticLogicalReceiver", "dealRestartSensorMSG", LogAnonymous.b(e));
                return;
            }
        }
        if (str.equals("extra_user_intent_alarm")) {
            LogUtil.a("Step_DaemonStaticLogicalReceiver", "userIntent EXTRA_USER_INTENT_ALARM");
            b(context);
            UploadStaticAlarmUtil.d(context, lsl.w(System.currentTimeMillis()) + 86100000 + UploadStaticAlarmUtil.f8153c);
            Intent intent2 = new Intent(context, (Class<?>) DaemonService.class);
            intent2.setPackage(context.getPackageName());
            intent2.setAction("com.huawei.health.action.UPLOAD_STATICS");
            intent2.putExtra("extra_user_intent", "extra_user_intent_alarm");
            try {
                context.startService(intent2);
                return;
            } catch (IllegalStateException | SecurityException e2) {
                LogUtil.j("Step_DaemonStaticLogicalReceiver", "extra_user_intent_alarm", LogAnonymous.b(e2));
                return;
            }
        }
        LogUtil.j("Step_DaemonStaticLogicalReceiver", "userIntent unknown");
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("Step_DaemonStaticLogicalReceiver", "acquireWakelock context is null.");
            return;
        }
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager != null ? powerManager.newWakeLock(1, "Step_DaemonStaticLogicalReceiver") : null;
        if (wakeLockNewWakeLock == null || wakeLockNewWakeLock.isHeld()) {
            return;
        }
        LogUtil.a("Step_DaemonStaticLogicalReceiver", "acquireWakelock");
        wakeLockNewWakeLock.acquire(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }
}
