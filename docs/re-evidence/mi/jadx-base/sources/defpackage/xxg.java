package defpackage;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"InlinedApi"})
public final class xxg {
    public static void a(Context context, String str, int i, int i2, int i3) {
        if (wlq.f38110a >= 26) {
            NotificationManager notificationManager = (NotificationManager) rk1.e((NotificationManager) context.getSystemService("notification"));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i), i3);
            if (i2 != 0) {
                notificationChannel.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}
