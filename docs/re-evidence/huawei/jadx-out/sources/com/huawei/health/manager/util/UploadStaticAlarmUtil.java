package com.huawei.health.manager.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.xjk;
import health.compact.a.ReleaseLogUtil;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class UploadStaticAlarmUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8153c = new SecureRandom().nextInt(270000);
    public static final long d = new SecureRandom().nextInt(Constants.HALF_HOUR);

    private UploadStaticAlarmUtil() {
    }

    public static void c(Context context, long j) {
        if (context == null) {
            LogUtil.a("Step_UploadStaticAlarmUtil", "setActionRestartSensorPreAlarm context is null");
            return;
        }
        LogUtil.a("Step_UploadStaticAlarmUtil", "setActionRestartSensorPreAlarm=", Long.valueOf(j));
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.UPLOAD_STATICS");
        intent.setPackage(context.getPackageName());
        intent.putExtra("extra_user_intent", "extra_user_intent_pre_alarm");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 2018, intent, 201326592);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (!(systemService instanceof AlarmManager)) {
            ReleaseLogUtil.d("Step_UploadStaticAlarmUtil", "setActionRestartSensorPreAlarm object ", systemService);
            return;
        }
        AlarmManager alarmManager = (AlarmManager) systemService;
        alarmManager.cancel(broadcast);
        try {
            alarmManager.set(0, j, broadcast);
        } catch (IllegalStateException e) {
            ReleaseLogUtil.b("Step_UploadStaticAlarmUtil", "setActionRestartSensorPreAlarm exception ", ExceptionUtils.c(e));
        }
    }

    public static void d(Context context, long j) {
        if (context == null) {
            LogUtil.a("Step_UploadStaticAlarmUtil", "setActionRestartSensorAlarm context is null");
            return;
        }
        LogUtil.a("Step_UploadStaticAlarmUtil", "setActionRestartSensorAlarm=", Long.valueOf(j));
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.health.action.UPLOAD_STATICS");
            intent.setPackage(context.getPackageName());
            intent.putExtra("extra_user_intent", "extra_user_intent_alarm");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 2017, intent, 201326592);
            Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (!(systemService instanceof AlarmManager)) {
                LogUtil.a("Step_UploadStaticAlarmUtil", "setActionRestartSensorAlarm object is not instanceof AlarmManager");
                return;
            }
            AlarmManager alarmManager = (AlarmManager) systemService;
            alarmManager.cancel(broadcast);
            xjk.d(alarmManager, 0, j, broadcast, "Step_UploadStaticAlarmUtilsetActionRestartSensorAlarm");
        } catch (IllegalStateException e) {
            ReleaseLogUtil.b("Step_UploadStaticAlarmUtil", "setActionRestartSensorAlarm exception:", ExceptionUtils.c(e));
        }
    }
}
