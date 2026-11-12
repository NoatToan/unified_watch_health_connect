package com.liulishuo.filedownloader.services;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import com.liulishuo.filedownloader.R;
import com.liulishuo.filedownloader.util.FileDownloadLog;

/* JADX INFO: loaded from: classes18.dex */
@TargetApi(26)
public class ForegroundServiceConfig {
    private static final String f = "filedownloader_channel";
    private static final String g = "Filedownloader";
    private static final int h = 17301506;
    private int a;
    private String b;
    private String c;
    private Notification d;
    private boolean e;

    public static class Builder {
        private int a;
        private String b;
        private String c;
        private Notification d;
        private boolean e;

        public ForegroundServiceConfig build() {
            ForegroundServiceConfig foregroundServiceConfig = new ForegroundServiceConfig();
            String str = this.b;
            if (str == null) {
                str = ForegroundServiceConfig.f;
            }
            foregroundServiceConfig.setNotificationChannelId(str);
            String str2 = this.c;
            if (str2 == null) {
                str2 = ForegroundServiceConfig.g;
            }
            foregroundServiceConfig.setNotificationChannelName(str2);
            int i = this.a;
            if (i == 0) {
                i = 17301506;
            }
            foregroundServiceConfig.setNotificationId(i);
            foregroundServiceConfig.setNeedRecreateChannelId(this.e);
            foregroundServiceConfig.setNotification(this.d);
            return foregroundServiceConfig;
        }

        public Builder needRecreateChannelId(boolean z) {
            this.e = z;
            return this;
        }

        public Builder notification(Notification notification) {
            this.d = notification;
            return this;
        }

        public Builder notificationChannelId(String str) {
            this.b = str;
            return this;
        }

        public Builder notificationChannelName(String str) {
            this.c = str;
            return this;
        }

        public Builder notificationId(int i) {
            this.a = i;
            return this;
        }
    }

    private Notification a(Context context) {
        String string = context.getString(R.string.default_filedownloader_notification_title);
        String string2 = context.getString(R.string.default_filedownloader_notification_content);
        Notification.Builder builder = new Notification.Builder(context, this.b);
        builder.setContentTitle(string).setContentText(string2).setSmallIcon(17301506);
        return builder.build();
    }

    public Notification getNotification(Context context) {
        if (this.d == null) {
            if (FileDownloadLog.NEED_LOG) {
                FileDownloadLog.d(this, "build default notification", new Object[0]);
            }
            this.d = a(context);
        }
        return this.d;
    }

    public String getNotificationChannelId() {
        return this.b;
    }

    public String getNotificationChannelName() {
        return this.c;
    }

    public int getNotificationId() {
        return this.a;
    }

    public boolean isNeedRecreateChannelId() {
        return this.e;
    }

    public void setNeedRecreateChannelId(boolean z) {
        this.e = z;
    }

    public void setNotification(Notification notification) {
        this.d = notification;
    }

    public void setNotificationChannelId(String str) {
        this.b = str;
    }

    public void setNotificationChannelName(String str) {
        this.c = str;
    }

    public void setNotificationId(int i) {
        this.a = i;
    }

    public String toString() {
        return "ForegroundServiceConfig{notificationId=" + this.a + ", notificationChannelId='" + this.b + "', notificationChannelName='" + this.c + "', notification=" + this.d + ", needRecreateChannelId=" + this.e + '}';
    }

    private ForegroundServiceConfig() {
    }
}
