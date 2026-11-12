package com.google.androidbrowserhelper.trusted;

import android.app.NotificationChannel;
import android.content.Context;
import java.util.Locale;
import z6.a0;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationUtils {
    private NotificationUtils() {
    }

    public static boolean areNotificationsEnabled(Context context, String str) {
        if (!a0.a(context).f202582b.areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannel = a0.a(context).f202582b.getNotificationChannel(channelNameToId(str));
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }

    private static String channelNameToId(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public static void createNotificationChannel(Context context, String str) {
        a0.a(context).f202582b.createNotificationChannel(new NotificationChannel(channelNameToId(str), str, 3));
    }
}
