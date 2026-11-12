package health.compact.a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.base.BaseNotification;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationUtils extends BaseNotification {
    private static volatile NotificationUtils e;

    private NotificationUtils() {
    }

    public static NotificationUtils e() {
        if (e == null) {
            synchronized (NotificationUtils.class) {
                if (e == null) {
                    NotificationUtils notificationUtils = new NotificationUtils();
                    notificationUtils.e(null, e("IDS_hw_app_name", "IDS_app_name_health"), 3);
                    e = notificationUtils;
                }
            }
        }
        return e;
    }

    @Override // com.huawei.haf.common.base.BaseNotification
    public void e(NotificationChannel notificationChannel) {
        super.e(notificationChannel);
        c(notificationChannel, 3);
    }

    public static void c(NotificationChannel notificationChannel, int i) {
        if (!EnvironmentInfo.g() || notificationChannel == null) {
            return;
        }
        try {
            ReflectionUtils.e((Class<?>) NotificationChannel.class, "setChannelType", (Class<?>[]) new Class[]{Integer.TYPE}).invoke(notificationChannel, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            LogUtil.e("TimeEat_NotificationUtils", "setChannelType fail.", LogUtil.c(e2));
        }
    }

    public static PendingIntent e(Context context) {
        Intent intentB;
        if (context == null) {
            context = BaseApplication.b();
        }
        try {
            intentB = b(context);
            try {
                return PendingIntent.getActivity(context, 0, intentB, 201326592);
            } catch (IllegalStateException e2) {
                e = e2;
                LogUtil.d("TimeEat_NotificationUtils", "getPendingIntent() Exception:", e.getMessage());
                return PendingIntent.getActivity(context, 0, intentB, 201326592);
            }
        } catch (IllegalStateException e3) {
            e = e3;
            intentB = null;
        }
    }

    private static Intent b(Context context) {
        Intent intent = new Intent();
        try {
            intent.setClassName(context.getPackageName(), context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            return intent;
        } catch (IllegalStateException e2) {
            LogUtil.d("TimeEat_NotificationUtils", "getHealthAPPIntent() exception：", e2.getMessage());
            return intent;
        }
    }

    @Override // com.huawei.haf.common.base.BaseNotification
    public void e(NotificationManager notificationManager) {
        notificationManager.deleteNotificationChannel("servertoken");
        notificationManager.deleteNotificationChannel(ParsedFieldTag.GOAL);
        notificationManager.deleteNotificationChannel("step");
        notificationManager.deleteNotificationChannel("sportdata");
        notificationManager.deleteNotificationChannel("device_data_receiver");
        notificationManager.deleteNotificationChannel("health_device_data_receiver_id");
    }
}
