package com.huami.watch.companion.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class NotificationUtils {
    public static Notification createNotificationForQ(Context context, Intent intent, String str, String str2) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getText(R.string.app_name), 4);
            notificationChannel.setSound(null, null);
            notificationChannel.setDescription(context.getString(R.string.input_wifi_pwd_title));
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return new NotificationCompat.Builder(context, str).setSmallIcon(R.drawable.ic_notification).setContentTitle(context.getText(R.string.app_name)).setContentText(str2).setPriority(1).setFullScreenIntent(PendingIntent.getActivity(context, 0, intent, i >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH), true).setDefaults(2).setOngoing(true).setAutoCancel(true).build();
    }
}
