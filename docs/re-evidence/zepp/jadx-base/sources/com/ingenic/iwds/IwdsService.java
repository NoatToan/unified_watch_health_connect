package com.ingenic.iwds;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class IwdsService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IwdsLog.d(this, "onCreate()");
        CharSequence charSequenceLoadLabel = getApplication().getApplicationInfo().loadLabel(getPackageManager());
        Notification notification = new Notification(getApplication().getApplicationInfo().icon, charSequenceLoadLabel, System.currentTimeMillis());
        Intent intent = new Intent(ServiceManagerContext.ACTION_NOTIFICATION_CLICKED);
        intent.setFlags(intent.getFlags() | 32768);
        notification.setLatestEventInfo(this, charSequenceLoadLabel, "", PendingIntent.getActivity(this, 0, intent, 0));
        notification.flags |= 2;
        startForeground(9999, notification);
    }
}
