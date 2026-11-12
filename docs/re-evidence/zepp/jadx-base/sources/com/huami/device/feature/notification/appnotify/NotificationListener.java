package com.huami.device.feature.notification.appnotify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.device.feature.notification.appnotify.NotificationListener;
import com.huami.device.feature.notification.module.INotificationListener;
import com.huami.device.feature.notification.utils.AppsHelper;
import com.huami.tools.log.HMLog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class NotificationListener implements INotificationListener {
    public static final String ACTION_NOTIFICATION = "action_notification";
    public static final int DELETE_NOTIFICATION = 0;
    public static final String EXTRA_NOTIFICATION_KEY = "key_notification";
    public static final String EXTRA_WHAT = "extra_what";
    private static final String c = "Noti-Listener";
    private final NotificationListenerService a;
    private final BroadcastReceiver b = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "delete on phone failed, because service is not running";
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra(NotificationListener.EXTRA_WHAT, -1);
            if (!(!NotificationManager.getInstance().isServiceNotRunning(context)) || intExtra != 0) {
                HMLog.info(NotificationListener.c, new Function0() { // from class: com.huami.device.feature.notification.appnotify.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationListener.a.b();
                    }
                });
                return;
            }
            String stringExtra = intent.getStringExtra(NotificationListener.EXTRA_NOTIFICATION_KEY);
            HMLog.d(NotificationListener.c, "onReceive, delete key: " + stringExtra, new Object[0]);
            if (LinkageNotificationCenter.useNotificationKey()) {
                try {
                    NotificationListener.this.a.cancelNotification(stringExtra);
                    return;
                } catch (Exception e) {
                    HMLog.info(new Function0() { // from class: vg5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return e.getLocalizedMessage();
                        }
                    });
                    return;
                }
            }
            if (stringExtra == null) {
                return;
            }
            String[] strArrSplit = stringExtra.split("\\|");
            NotificationListener.this.a.cancelNotification(TextUtils.equals("null", strArrSplit[0]) ? null : strArrSplit[0], TextUtils.equals("null", strArrSplit[1]) ? null : strArrSplit[1], Integer.parseInt(strArrSplit[2]));
        }
    }

    public NotificationListener(NotificationListenerService notificationListenerService) {
        this.a = notificationListenerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(StatusBarNotification statusBarNotification) {
        return "onNotificationPosted: " + statusBarNotification;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(StatusBarNotification statusBarNotification) {
        return "onNotificationRemoved: " + statusBarNotification;
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onDeInit() {
        LocalBroadcastManager.getInstance(this.a.getApplicationContext()).unregisterReceiver(this.b);
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onInit() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_NOTIFICATION);
        LocalBroadcastManager.getInstance(this.a.getApplicationContext()).registerReceiver(this.b, intentFilter);
        AppsHelper.INSTANCE.checkSmsDefaultApp(this.a.getApplicationContext());
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    @RequiresApi(api = 21)
    public void onNotificationPosted(final StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        if (statusBarNotification != null) {
            if (NotificationManager.getInstance().getAppsRepo().hasApp(statusBarNotification.getPackageName())) {
                HMLog.info(c, new Function0() { // from class: tg5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationListener.d(statusBarNotification);
                    }
                });
            }
            NotificationManager.getInstance().dispatchNotification(this.a, statusBarNotification);
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onNotificationRemoved(final StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        if (statusBarNotification != null) {
            if (NotificationManager.getInstance().getAppsRepo().hasApp(statusBarNotification.getPackageName())) {
                HMLog.info(c, new Function0() { // from class: ug5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotificationListener.e(statusBarNotification);
                    }
                });
            }
            if (LinkageNotificationCenter.supportLinkageNotification()) {
                LinkageNotificationCenter.handleNotificationRemoved(statusBarNotification);
            }
            NotificationManager.getInstance().handleNotificationRemoved(statusBarNotification);
        }
    }
}
