package com.ximalaya.ting.android.opensdk.player.service;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class NotificationChannelUtils {
    private static String sPlayerChannelVersion = "#1";
    public static String sPlayerChannelId = "player" + sPlayerChannelVersion;
    public static String sPlayerChannelName = "通知栏";
    public static int sPlayerChannelImportance = 2;
    private static boolean hasCreatedChannel = false;

    @TargetApi(26)
    private static void createPlayerNotificationChannel(Context context) {
        NotificationManager notificationManager;
        NotificationChannel next;
        if (context == null || hasCreatedChannel || (notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION)) == null) {
            return;
        }
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        if (notificationChannels != null && !notificationChannels.isEmpty()) {
            Iterator<NotificationChannel> it2 = notificationChannels.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next == null) {
                        return;
                    }
                }
            } while (!TextUtils.equals(sPlayerChannelName, next.getName()));
        } else {
            next = null;
            break;
        }
        if (next == null || !TextUtils.equals(sPlayerChannelId, next.getId())) {
            if (next != null && !TextUtils.equals(sPlayerChannelId, next.getId())) {
                notificationManager.deleteNotificationChannel(next.getId());
            }
            NotificationChannel notificationChannel = new NotificationChannel(sPlayerChannelId, sPlayerChannelName, sPlayerChannelImportance);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[]{0});
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
            hasCreatedChannel = true;
        }
    }

    public static NotificationCompat.Builder newNotificationBuilder(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return new NotificationCompat.Builder(context);
        }
        createPlayerNotificationChannel(context);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, sPlayerChannelId);
        builder.setVibrate(new long[]{0});
        builder.setSound(null);
        builder.setDefaults(0);
        return builder;
    }
}
