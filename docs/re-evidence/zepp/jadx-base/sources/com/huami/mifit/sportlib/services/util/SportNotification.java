package com.huami.mifit.sportlib.services.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.mifit.sportlib.GPSSportApplication;
import com.huami.mifit.sportlib.R;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class SportNotification {
    private static volatile SportNotification b;
    private NotificationInfoInitializer a;

    public static final class ID {
        public static final int a = 98888;
        public static final String b = "sport_channel_01";
    }

    public interface NotificationInfoInitializer {
        Notification initNotification(Context context);
    }

    private SportNotification() {
    }

    public static SportNotification getInstance() {
        if (b == null) {
            synchronized (SportNotification.class) {
                if (b == null) {
                    b = new SportNotification();
                }
            }
        }
        return b;
    }

    @SuppressLint({"NewApi"})
    public void cancelForgroundRunning(Service service) {
        if (service == null) {
            LogKit.w2f("IllegalArgumentException", "SportNotification cancelForgroundRunning");
            throw new IllegalArgumentException();
        }
        NotificationManager notificationManager = (NotificationManager) service.getApplicationContext().getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.cancel(ID.a);
        }
        service.stopForeground(true);
    }

    @SuppressLint({"NewApi"})
    public void notifyRunningInfo(Context context, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        if (notificationManager != null) {
            notificationManager.notify(ID.a, notification);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean setForegroundRunning(Service service) {
        if (service == null) {
            LogKit.w2f("IllegalArgumentException", "SportNotification setForegroundRunning");
            throw new IllegalArgumentException();
        }
        Context applicationContext = service.getApplicationContext();
        NotificationInfoInitializer notificationInfoInitializer = this.a;
        if (notificationInfoInitializer != null) {
            service.startForeground(ID.a, notificationInfoInitializer.initNotification(applicationContext));
        } else {
            Intent intent = new Intent(applicationContext, (Class<?>) GPSSportApplication.getSportMainClass());
            intent.setFlags(268435456);
            int i = Build.VERSION.SDK_INT;
            Notification.Builder when = new Notification.Builder(applicationContext).setContentIntent(PendingIntent.getActivity(applicationContext, 0, intent, i >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH)).setContentText("Sporting go go go!").setContentTitle("Sport-lib").setOngoing(true).setWhen(System.currentTimeMillis());
            if (i >= 21) {
                when.setColor(Color.argb(255, 241, 116, 86));
            }
            when.setSmallIcon(R.drawable.run_icon);
            if (i >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(ID.b, "sporting-noti", 3);
                NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                when.setChannelId(ID.b);
            }
            service.startForeground(ID.a, when.build());
        }
        return true;
    }

    public void setNotificationInitializer(NotificationInfoInitializer notificationInfoInitializer) {
        this.a = notificationInfoInitializer;
    }
}
