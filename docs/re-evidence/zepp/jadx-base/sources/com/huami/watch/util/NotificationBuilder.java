package com.huami.watch.util;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;

/* JADX INFO: loaded from: classes11.dex */
public class NotificationBuilder {
    public static final String CHANNEL_ID_DEFAULT = "AmazfitWatch";
    public static final String CHANNEL_ID_FOREGROUND = "ForegroundService";
    public static final String CHANNEL_ID_PIN = "Pin";
    public static final int FLAG_NOT_TO_WATCH = -1879048192;
    private static final String a = "Noti-Builder";

    public static NotificationCompat.Builder buildNotification(Context context, CharSequence charSequence, CharSequence charSequence2, int i) {
        return buildNotification(context, CHANNEL_ID_DEFAULT, charSequence, charSequence2, i);
    }

    @TargetApi(26)
    public static void createChannel(@NonNull Context context, String str, CharSequence charSequence) {
        createChannel(context, str, charSequence, importanceDefault(), true, true);
    }

    @TargetApi(26)
    public static int importanceDefault() {
        DeviceCompatibility.isO();
        return 3;
    }

    @TargetApi(26)
    public static int importanceHigh() {
        DeviceCompatibility.isO();
        return 4;
    }

    @TargetApi(26)
    public static int importanceLow() {
        DeviceCompatibility.isO();
        return 2;
    }

    public static void notify(Context context, int i, Notification notification) {
        Log.d(a, "Notify : " + notification, new Object[0]);
        NotificationManagerCompat.from(context).notify(i, notification);
    }

    public static NotificationCompat.Builder buildNotification(Context context, String str, CharSequence charSequence, CharSequence charSequence2, int i) {
        return buildNotification(context, str, charSequence, charSequence2, 0, i);
    }

    @TargetApi(26)
    public static void createChannel(@NonNull Context context, String str, CharSequence charSequence, boolean z, boolean z2) {
        createChannel(context, str, charSequence, importanceDefault(), z, z2);
    }

    public static NotificationCompat.Builder buildNotification(Context context, String str, CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        return new NotificationCompat.Builder(context, str).setSmallIcon(i2).setContentTitle(charSequence).setContentText(charSequence2).setPriority(i);
    }

    @TargetApi(26)
    public static void createChannel(@NonNull Context context, String str, CharSequence charSequence, int i, boolean z, boolean z2) {
        if (DeviceCompatibility.isO()) {
            Log.d(a, "CreateChannel : " + str + ", " + ((Object) charSequence), new Object[0]);
            NotificationChannel notificationChannel = new NotificationChannel(str, charSequence, i);
            if (z) {
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(new long[]{0, 500});
            } else {
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(new long[]{0});
            }
            if (!z2) {
                notificationChannel.setSound(null, null);
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                Log.w(a, "CreateChannel Fail : No NotificationManager!!", new Object[0]);
            }
        }
    }

    public static NotificationCompat.Builder buildNotification(Context context) {
        return new NotificationCompat.Builder(context, CHANNEL_ID_DEFAULT);
    }

    public static NotificationCompat.Builder buildNotification(Context context, String str) {
        return new NotificationCompat.Builder(context, str);
    }
}
