package com.huawei.openalliance.ad;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f19499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    NotificationManager f19500b;

    abstract int a();

    abstract void a(Notification.Builder builder);

    abstract String c();

    abstract String e();

    abstract PendingIntent f();

    protected String d() {
        return "BaseNotification";
    }

    public void b() {
        Notification.Builder builderG = g();
        a(builderG);
        NotificationChannel notificationChannel = new NotificationChannel(h(), d(), 3);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableLights(false);
        builderG.setChannelId(h());
        this.f19500b.createNotificationChannel(notificationChannel);
        this.f19500b.notify(a(), builderG.build());
    }

    private String h() {
        return "hwpps";
    }

    private Notification.Builder g() {
        Notification.Builder builder = new Notification.Builder(this.f19499a);
        builder.setContentTitle(c());
        builder.setContentText(e());
        builder.setWhen(System.currentTimeMillis());
        builder.setShowWhen(true);
        builder.setContentIntent(f());
        builder.setAutoCancel(true);
        ApplicationInfo applicationInfo = this.f19499a.getApplicationInfo();
        if (applicationInfo != null) {
            builder.setSmallIcon(applicationInfo.icon);
        }
        return builder;
    }

    protected lr(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f19499a = applicationContext;
        this.f19500b = (NotificationManager) applicationContext.getSystemService(RemoteMessageConst.NOTIFICATION);
    }
}
