package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.base.BaseNotification;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class imr extends BaseNotification {
    private imr() {
    }

    private static void b(NotificationManager notificationManager) {
        LogUtil.a("TwsNotificationManager", "addTwsNotificationChannel() in");
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.huawei.health");
        if (notificationChannel == null || notificationChannel.getImportance() != 4) {
            new imr().e("com.huawei.health", e("IDS_device_transfer_data_notification_title", "IDS_app_name_health"), 4);
        }
    }

    public static void b(int i, Notification.Builder builder, String str) {
        Object systemService = BaseApplication.b().getSystemService(RemoteMessageConst.NOTIFICATION);
        if (systemService instanceof NotificationManager) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            b(notificationManager);
            HashMap map = new HashMap();
            map.put("isPlay", true);
            map.put("playContent", str);
            Bundle bundle = new Bundle();
            bundle.putString("com.huawei.audioaccessorymanager.NOTIFICATION_PLAY", new Gson().toJson(map));
            builder.setChannelId("com.huawei.health").setOngoing(false).setTicker("ticketTws").setExtras(bundle);
            try {
                notificationManager.notify(i, builder.build());
                ReleaseLogUtil.c("R_TwsNotificationManager", "createTwsNotification notificationId ", Integer.valueOf(i), " twsContent ", str);
                return;
            } catch (SecurityException e) {
                LogUtil.e("TwsNotificationManager", "createTwsNotification securityException: ", ExceptionUtils.c(e));
                return;
            }
        }
        ReleaseLogUtil.d("R_TwsNotificationManager", "createTwsNotification notificationObject ", systemService);
    }
}
