package com.xiaomi.hm.health.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseMessage {
    public static final int LOCAL_MSG_TYPE = 0;
    public static final int PUSH_MSG_TYPE = 1;
    private final long a;
    private final long b;
    public Context context;
    public int fromType;
    private String d = "";
    private int e = -1;
    private final int c = getNotificationId();

    public BaseMessage(Context context, long j, long j2, JSONObject jSONObject) {
        this.a = j2;
        this.b = j;
        this.context = context;
    }

    public boolean checkUriAvailable(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage(this.context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = this.context.getPackageManager().queryIntentActivities(intent, 0);
        return listQueryIntentActivities != null && listQueryIntentActivities.size() > 0;
    }

    public abstract void doWork();

    public String getMessageType() {
        return this.d;
    }

    public abstract int getNotificationId();

    public int getSubtype() {
        return this.e;
    }

    public void notify(String str, String str2, PendingIntent pendingIntent) {
        NotificationManager notificationManager = (NotificationManager) this.context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        String simpleName = BaseMessage.class.getSimpleName();
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(simpleName, str, 3);
            notificationChannel.setDescription(str2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        notificationManager.notify(this.c, new NotificationCompat.Builder(this.context, simpleName).setContentTitle(str).setContentText(str2).setTicker(str2).setContentIntent(pendingIntent).setChannelId(simpleName).setSmallIcon(R.drawable.push_notification).setColor(-16777216).setAutoCancel(true).build());
    }

    public void setMessageType(String str) {
        this.d = str;
    }

    public void setSubtype(int i) {
        this.e = i;
    }

    public abstract void show();
}
