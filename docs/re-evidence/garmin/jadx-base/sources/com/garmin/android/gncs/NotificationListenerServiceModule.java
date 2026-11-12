package com.garmin.android.gncs;

import android.content.Context;
import android.os.Handler;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class NotificationListenerServiceModule {
    protected final Context appContext;
    protected final Handler handler;
    private final WeakReference<GNCSListenerService> notificationService;

    public NotificationListenerServiceModule(GNCSListenerService gNCSListenerService, Handler handler) {
        this.notificationService = new WeakReference<>(gNCSListenerService);
        this.appContext = gNCSListenerService.getApplicationContext();
        this.handler = handler;
    }

    public GNCSListenerService getNotificationService() {
        if (GNCSListenerService.isServiceConnected()) {
            return this.notificationService.get();
        }
        return null;
    }

    public void onListenerConnected(List<SmartNotifOSServiceLifecycleCallback> list) {
    }

    public void onListenerDisconnected(List<SmartNotifOSServiceLifecycleCallback> list) {
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.Ranking ranking) {
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
    }
}
