package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.huawei.haf.common.base.BaseNotification;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.NotificationUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class lsb {
    public static BaseNotification b() {
        if (!EnvironmentInfo.g()) {
            return NotificationUtils.e();
        }
        return lsi.a();
    }

    public static BaseNotification d() {
        return NotificationUtils.e();
    }

    public static BaseNotification a() {
        return lse.e();
    }

    public static PendingIntent a(Context context) {
        return NotificationUtils.e(context);
    }

    public static boolean b(int i) {
        StatusBarNotification[] activeNotifications;
        NotificationManager notificationManagerL = CommonUtil.l();
        if (notificationManagerL != null && (activeNotifications = notificationManagerL.getActiveNotifications()) != null && activeNotifications.length != 0) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification != null && statusBarNotification.getId() == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
