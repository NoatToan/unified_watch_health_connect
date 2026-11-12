package com.huami.watch.companion.sport;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.notification.NotificationManager;
import com.huami.watch.util.NotificationBuilder;

/* JADX INFO: loaded from: classes16.dex */
public class SportNotificationUtil {
    private static final String a = "com.huami.watch.companion.show.sport";
    private static final int b = 2222;
    public static boolean sAppForeground;

    public static void onSportSyncSuccess(Context context) {
        if (sAppForeground || !NotificationManager.getManager(context).IsSportSyncSuccessON()) {
            return;
        }
        Intent intent = new Intent(a);
        intent.addFlags(335577088);
        Notification notificationBuild = NotificationBuilder.buildNotification(context, context.getString(R.string.app_name), context.getString(R.string.notificatin_sport_sync_success_text), R.drawable.ic_app_notification).setContentIntent(PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH)).setAutoCancel(true).build();
        notificationBuild.flags |= NotificationBuilder.FLAG_NOT_TO_WATCH;
        NotificationBuilder.notify(context, b, notificationBuild);
    }
}
