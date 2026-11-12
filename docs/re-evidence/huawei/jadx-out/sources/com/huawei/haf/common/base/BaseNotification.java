package com.huawei.haf.common.base;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class BaseNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5854a;
    private int d;
    private int e;

    protected void e(NotificationManager notificationManager) {
    }

    class LocaleChangedReceiver extends BroadcastReceiver {
        private LocaleChangedReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BaseNotification.this.e();
        }
    }

    public void e(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            str = "channel_common_id";
        }
        this.f5854a = str;
        this.d = i;
        this.e = i2;
        BroadcastManager.c(new LocaleChangedReceiver());
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        NotificationManager notificationManagerL = CommonUtils.l();
        if (notificationManagerL == null) {
            return;
        }
        try {
            b(notificationManagerL);
        } catch (Exception e) {
            LogUtil.b("HAF_Notification", "createNotificationChannel ex=", LogUtil.c(e));
        }
        try {
            e(notificationManagerL);
        } catch (Exception e2) {
            LogUtil.b("HAF_Notification", "deleteAllOldNotificationChannel ex=", LogUtil.c(e2));
        }
    }

    private void b(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel(this.f5854a, d(), this.e);
        e(notificationChannel);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private String d() {
        try {
            return BaseApplication.b().getString(this.d);
        } catch (Resources.NotFoundException e) {
            LogUtil.b("HAF_Notification", "getChannelName ex=", LogUtil.c(e));
            return "channel_common_name";
        }
    }

    public void e(NotificationChannel notificationChannel) {
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
    }

    public static int e(String str, String str2) {
        Resources resources = BaseApplication.b().getResources();
        int identifier = resources.getIdentifier(str, "string", BaseApplication.d());
        boolean z = identifier != 0;
        if (!z) {
            identifier = resources.getIdentifier(str2, "string", BaseApplication.d());
        }
        LogUtil.b("HAF_Notification", "channelResId=", Integer.valueOf(identifier), ", isFirstName=", Boolean.valueOf(z));
        return identifier;
    }

    public void c(Notification.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hw_disable_ntf_delete_menu", true);
        builder.addExtras(bundle);
    }

    public Notification.Builder c() {
        return new Notification.Builder(BaseApplication.b(), this.f5854a);
    }

    public void c(int i, Notification notification) {
        NotificationManager notificationManagerL = CommonUtils.l();
        if (notificationManagerL != null) {
            notificationManagerL.notify(i, notification);
        }
    }

    public void e(int i) {
        NotificationManager notificationManagerL = CommonUtils.l();
        LogUtil.b("HAF_Notification", "manager = ", notificationManagerL, "id = ", Integer.valueOf(i));
        if (notificationManagerL != null) {
            notificationManagerL.cancel(i);
        }
    }

    public void b() {
        NotificationManager notificationManagerL = CommonUtils.l();
        if (notificationManagerL != null) {
            notificationManagerL.cancelAll();
        }
    }
}
